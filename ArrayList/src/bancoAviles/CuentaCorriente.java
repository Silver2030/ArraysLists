package bancoAviles;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CuentaCorriente {
	private Titular titular;
	private String numCuenta;
	private Double saldo;
	
	public CuentaCorriente() {
		super();
	}

	public CuentaCorriente(Titular titular, String numCuenta, Double saldo) {
		super();
		this.titular = titular;
		this.numCuenta = numCuenta;
		this.saldo = saldo;
	}
	
	public void sumarSaldo() {
		Scanner in = new Scanner(System.in);
		
		System.out.println();
		System.out.print("Ingreso (Saldo actual: " + this.saldo + "): ");
		this.saldo += in.nextDouble();
		System.out.println();
		System.out.println("Nuevo saldo: " + this.saldo);
		System.out.println();
	}
	
	public void restarSaldo() {
		Scanner in = new Scanner(System.in);
		Double saldoRestar = 0.0;
		
		System.out.println();
		System.out.print("Retiro (Saldo actual: " + this.saldo + "): ");
		saldoRestar = in.nextDouble();
		while(saldoRestar > this.saldo) {
			System.out.print("Retiro superior a cantidad en la cuenta, introduce el saldo (Saldo actual: " + this.saldo + "): ");
			saldoRestar = in.nextDouble();
		}
		this.saldo -= saldoRestar;
		System.out.println();
		System.out.println("Nuevo saldo: " + this.saldo);
		System.out.println();
	}

	public Titular getTitular() {
		return titular;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#.00");
		return 	"Nombre: " + this.titular.getNombre()+ "\n" +
				"Apellidos: " + this.titular.getApellidos() + "\n" +
				"Edad: " + this.titular.getEdad() + "\n" +
				"Numero cuenta: " + this.numCuenta + "\n" +
				"Saldo: " + df.format(this.saldo);
	}

}
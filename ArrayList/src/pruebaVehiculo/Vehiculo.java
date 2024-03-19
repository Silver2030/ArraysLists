package pruebaVehiculo;

import java.util.Scanner;

public class Vehiculo {
	public String matricula;
	public String color;
	public int numRuedas;
	public int cilindrada;
	public int potencia;
	
	public Vehiculo() {
		super();
	}

	public Vehiculo(String matricula, String color, int numRuedas) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.numRuedas = numRuedas;
	}

	public Vehiculo(String matricula, String color, int numRuedas, int cilindrada) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.numRuedas = numRuedas;
		this.cilindrada = cilindrada;
	}

	public Vehiculo(String matricula, String color, int numRuedas, int cilindrada, int potencia) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.numRuedas = numRuedas;
		this.cilindrada = cilindrada;
		this.potencia = potencia;
	}
	
	public void asignarCilindrada() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Introduce la cilindrada (cc): ");
		setCilindrada(in.nextInt());
		System.out.println();
	}
	
	public void asignarPotencia() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Introduce la potencia (CV): ");
		setPotencia(in.nextInt());
		System.out.println();
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return 	"Vehiculo \n" +
				"Matricula: " + this.matricula + "\n" +
				"Color: " + this.color + "\n" +
				"Número Ruedas: " + this.numRuedas + "\n" +
				"Cilindrada (cc): " + this.cilindrada + "\n" +
				"Potencia (CV): " + this.potencia;
	}
	
}

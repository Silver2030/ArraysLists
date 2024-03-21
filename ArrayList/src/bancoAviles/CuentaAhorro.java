package bancoAviles;

import java.text.DecimalFormat;

public class CuentaAhorro extends CuentaCorriente {
	private Double interes;

	public CuentaAhorro() {
		super();
	}

	public CuentaAhorro(Titular titular, String numCuenta, Double saldo, Double interes) {
		super(titular, numCuenta, saldo);
		this.interes = interes;
	}
	
	public void intereses() {
		DecimalFormat df = new DecimalFormat("#.00");
		Double interesesGenerados = calcularIntereses();
		System.out.println();
		System.out.println("Intereses generados: " + df.format(interesesGenerados));
		System.out.println();
		sumarIntereses(interesesGenerados);
		System.out.println("Intereses añadidos, nuevo saldo de la cuenta: " + df.format(this.getSaldo()));
		System.out.println();
	}
	
	public Double calcularIntereses() {
		Double interesesGenerados;
		
		interesesGenerados = this.getSaldo() * this.interes;
		
		return interesesGenerados;
	}
	
	public void sumarIntereses(Double intereses) {
		this.setSaldo(this.getSaldo() + intereses);
	}

	public Double getInteres() {
		return interes;
	}

	public void setInteres(Double interes) {
		this.interes = interes;
	}

	@Override
	public String toString() {
		return 	"CUENTA AHORRO \n" +
				super.toString() + "\n" +
				"Intereses (%): " + (this.interes*100) + "%";
	}
	
}
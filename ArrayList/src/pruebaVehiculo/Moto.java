package pruebaVehiculo;

public class Moto extends Vehiculo {
	public int numPlazas;
	
	public Moto(String matricula, String color) {
		super(matricula, color, 2);
	}
	
	public Moto(String matricula, String color, int cilindrada) {
		super(matricula, color, 2, cilindrada);
	}
	
	public Moto(String matricula, String color, int cilindrada, int potencia) {
		super(matricula, color, 2, cilindrada, potencia);
	}
	
	public Moto(String matricula, String color, int cilindrada, int potencia, int numPlazas) {
		super(matricula, color, 2, cilindrada, potencia);
		this.numPlazas = numPlazas;
	}

	public int getNumPlazas() {
		return numPlazas;
	}

	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}
	
	@Override
	public String toString() {
		return 	"Moto \n" +
				"Matricula: " + getMatricula() + "\n" +
				"Color: " + getColor() + "\n" +
				"Número Ruedas: " + getNumRuedas() + "\n" +
				"Cilindrada (cc): " + getCilindrada() + "\n" +
				"Potencia (CV): " + getPotencia() + "\n" +
				"Número Plazas: " + this.numPlazas + "\n";
	}

}

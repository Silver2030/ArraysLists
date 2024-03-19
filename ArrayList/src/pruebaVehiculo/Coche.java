package pruebaVehiculo;

public class Coche extends Vehiculo{
	public int numPuertas;

	public Coche() {
		super();
	}

	public Coche(String matricula, String color) {
		super(matricula, color, 4);
	}
	
	public Coche(String matricula, String color, int cilindrada) {
		super(matricula, color, 4, cilindrada);
	}
	
	public Coche(String matricula, String color, int cilindrada, int potencia) {
		super(matricula, color, 4, cilindrada, potencia);
	}
	
	public Coche(String matricula, String color, int cilindrada, int potencia, int numPuertas) {
		super(matricula, color, 4, cilindrada, potencia);
		this.numPuertas = numPuertas;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	@Override
	public String toString() {
		return 	"Coche \n" +
				"Matricula: " + getMatricula() + "\n" +
				"Color: " + getColor() + "\n" +
				"Número Ruedas: " + getNumRuedas() + "\n" +
				"Cilindrada (cc): " + getCilindrada() + "\n" +
				"Potencia (CV): " + getPotencia() + "\n" +
				"Número Puertas: " + this.numPuertas + "\n";
	}

}
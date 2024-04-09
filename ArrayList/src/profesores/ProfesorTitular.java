package profesores;

public class ProfesorTitular extends Profesor {
	public int complementoDestino;
	public int antig�edad;
	
	public ProfesorTitular() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProfesorTitular(String idProfesor, String nombre, String apellidos, Double sueldoBase, int antig�edad) {
		super(idProfesor, nombre, apellidos, sueldoBase);
		this.complementoDestino = 500;
		this.antig�edad = antig�edad;
		
	}
	
	public double bonificacionAntiguedad() {
		double bonificacion = 0.0;
		switch(this.antig�edad) {
		case 1:
			bonificacion = 1.01;
			break;
		case 2:
			bonificacion = 1.02;
			break;
		case 3:
			bonificacion = 1.05;
			break;
		case 4:
			bonificacion = 1.06;
			break;
		case 5:
			bonificacion = 1.07;
			break;
		case 6:
			bonificacion = 1.08;
			break;
		}
		return bonificacion;
	}
	
	
	public int getComplementoDestino() {
		return complementoDestino;
	}
	public void setComplementoDestino(int complementoDestino) {
		this.complementoDestino = complementoDestino;
	}
	public int getAntig�edad() {
		return antig�edad;
	}
	public void setAntig�edad(int antig�edad) {
		this.antig�edad = antig�edad;
	}
	
	@Override
	public String toString() {
		return 	super.toString() + "\n" +
				"Complemento: " + this.complementoDestino + "\n" +
				"Antig�edad (trienios): " + this.antig�edad;
	}

}

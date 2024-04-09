package profesores;

public class ProfesorTitular extends Profesor {
	public int complementoDestino;
	public int antigüedad;
	
	public ProfesorTitular() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProfesorTitular(String idProfesor, String nombre, String apellidos, Double sueldoBase, int antigüedad) {
		super(idProfesor, nombre, apellidos, sueldoBase);
		this.complementoDestino = 500;
		this.antigüedad = antigüedad;
		
	}
	
	public double bonificacionAntiguedad() {
		double bonificacion = 0.0;
		switch(this.antigüedad) {
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
	public int getAntigüedad() {
		return antigüedad;
	}
	public void setAntigüedad(int antigüedad) {
		this.antigüedad = antigüedad;
	}
	
	@Override
	public String toString() {
		return 	super.toString() + "\n" +
				"Complemento: " + this.complementoDestino + "\n" +
				"Antigüedad (trienios): " + this.antigüedad;
	}

}

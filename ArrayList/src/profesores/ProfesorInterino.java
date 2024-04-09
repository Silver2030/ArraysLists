package profesores;

public class ProfesorInterino extends Profesor {
	public int complementoEspecifico;

	public ProfesorInterino() {
		super();
	}

	public ProfesorInterino(String idProfesor, String nombre, String apellidos, Double sueldoBase) {
		super(idProfesor, nombre, apellidos, sueldoBase);
		this.complementoEspecifico = 600;
	}

	public int getComplementoEspecifico() {
		return complementoEspecifico;
	}

	public void setComplementoEspecifico(int complementoEspecifico) {
		this.complementoEspecifico = complementoEspecifico;
	}
	
	@Override
	public String toString() {
		return 	super.toString() + "\n" +
				"Complemento: " + this.complementoEspecifico;
	}

}
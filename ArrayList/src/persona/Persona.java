package persona;

public class Persona {
	private String primerNombre;
	private String apellido;
	private int nacimiento;
	
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Persona(String primerNombre, String segundoNombre, int nacimiento) {
		super();
		this.primerNombre = primerNombre;
		this.apellido = segundoNombre;
		this.nacimiento = nacimiento;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(int nacimiento) {
		this.nacimiento = nacimiento;
	}

	@Override
	public String toString() {
		return "Nombre: " + primerNombre + " " + apellido + "\n" +
				"Fecha Nacimiento: " + nacimiento;
	}
	
}

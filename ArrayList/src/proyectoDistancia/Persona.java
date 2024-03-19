package proyectoDistancia;

public class Persona {
	public String nombre;
	public String apellidos;
	public int fechaNacimiento;
	
	public Persona() {
		super();
	}

	public Persona(String nombre, String apellidos, int fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
	}

	public void imprime() {
		System.out.println("--------------------------------------------");
		System.out.println("DATOS PERSONALES");
		System.out.println();
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Apellidos: " + this.apellidos);
		System.out.println("Año de nacimiento: " + this.fechaNacimiento);
		System.out.println();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(int fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
}
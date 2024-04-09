package profesores;

public class Profesor {
	public String idProfesor;
	public String nombre;
	public String apellidos;
	public Double sueldoBase;
	
	public Profesor() {
		super();
	}
	public Profesor(String idProfesor, String nombre, String apellidos, Double sueldoBase) {
		super();
		this.idProfesor = idProfesor;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sueldoBase = sueldoBase;
	}
	public String getIdProfesor() {
		return idProfesor;
	}
	public void setIdProfesor(String idProfesor) {
		this.idProfesor = idProfesor;
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
	public Double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(Double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	@Override
	public String toString() {
		return 	"Id Profesor: " + this.idProfesor + "\n" +
				"Nombre: " + this.nombre + "\n" +
				"Apellidos: " + this.apellidos + "\n" +
				"Sueldo Base: " + this.sueldoBase;
	}

}
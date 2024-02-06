package hotel;

public class Hotel {
	private int numHabitación;
	private String nombre;
	private int diasEstancia;
	private String tipoHabitacion;
	
	public Hotel() {
		super();
	}

	public Hotel(int numHabitación, String nombre, int diasEstancia, String tipoHabitacion) {
		super();
		this.numHabitación = numHabitación;
		this.nombre = nombre;
		this.diasEstancia = diasEstancia;
		this.tipoHabitacion = tipoHabitacion;
	}

	public int getNumHabitación() {
		return numHabitación;
	}

	public void setNumHabitación(int numHabitación) {
		this.numHabitación = numHabitación;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDiasEstancia() {
		return diasEstancia;
	}

	public void setDiasEstancia(int diasEstancia) {
		this.diasEstancia = diasEstancia;
	}

	public String getTipoHabitacion() {
		return tipoHabitacion;
	}

	public void setTipoHabitacion(String tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}
	
	@Override
	public String toString() {
		return "HOTEL \n" + 
				"Número de habitación: " + numHabitación + "\n" +
				"Tipo habitación: " + tipoHabitacion + "\n" +
				"Cliente: " + nombre + "\n" +
				"Num. Dias: " + diasEstancia + "\n" +
				"Precio Hab/día: ";
	}

}

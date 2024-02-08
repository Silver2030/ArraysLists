package hotel;

public class Hotel {
	private int numHabitacion;
	private String nombre;
	private int diasEstancia;
	private String tipoHabitacion;
	
	public Hotel() {
		super();
	}

	public Hotel(int numHabitacion, String nombre, int diasEstancia, String tipoHabitacion) {
		super();
		this.numHabitacion = numHabitacion;
		this.nombre = nombre;
		this.diasEstancia = diasEstancia;
		this.tipoHabitacion = tipoHabitacion;
	}

	public int getnumHabitacion() {
		return numHabitacion;
	}

	public void setnumHabitacion(int numHabitacion) {
		this.numHabitacion = numHabitacion;
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
				"N�mero de habitaci�n: " + numHabitacion + "\n" +
				"Tipo habitaci�n: " + tipoHabitacion + "\n" +
				"Cliente: " + nombre + "\n" +
				"Num. Dias: " + diasEstancia + "\n" +
				"Precio Hab/d�a: ";
	}

}

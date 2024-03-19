package tienda;

public class Dvd extends Articulo{
	public int duracion;
	public String realizador;
	
	public Dvd() {
		super();
	}
	
	public Dvd(int referencia, String nombre, int precio, int duracion, String realizador) {
		super(referencia, nombre, precio);
		this.duracion = duracion;
		this.realizador = realizador;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getRealizador() {
		return realizador;
	}

	public void setRealizador(String realizador) {
		this.realizador = realizador;
	}

	@Override
	public String toString() {
		return "Dvd [duracion=" + duracion + ", realizador=" + realizador + "]";
	}

}
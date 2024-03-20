package tienda;

public class Articulo {
	public int referencia;
	public String nombre;
	public double precio;
	
	public Articulo() {
		super();
	}

	public Articulo(int referencia, String nombre, double precio) {
		super();
		this.referencia = referencia;
		this.nombre = nombre;
		this.precio = precio;
	}

	public int getReferencia() {
		return referencia;
	}

	public void setReferencia(int referencia) {
		this.referencia = referencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return 	"Libro \n" +
				"Referencia: " + this.referencia + "\n" +
				"Nombre: " + this.nombre + "\n" +
				"Precio: " + this.precio + "\n";
	}
	
	

}
package productos;

import java.io.Serializable;

public class Productos implements Serializable{
	public String nombre;
	public String codigo;
	public double precio;
	
	public Productos() {
		super();
	}

	public Productos(String nombre, String codigo, double precio) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return 	"Nombre: " + this.nombre + "\n" +
				"Codigo: " + this.codigo + "\n" +
				"Precio: " + this.precio;
	}

}

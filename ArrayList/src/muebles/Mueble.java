package muebles;

import java.io.Serializable;

public class Mueble implements Serializable {
	public String idProducto;
	public String material;
	public Double precio;
	public Integer stock;
	
	public Mueble() {
		super();
	}
	
	public Mueble(String idProducto, Double precio, Integer stock) {
		super();
		this.idProducto = idProducto;
		this.precio = precio;
		this.stock = stock;
	}
	
	public Mueble(String idProducto, String material, Double precio, Integer stock) {
		super();
		this.idProducto = idProducto;
		this.material = material;
		this.precio = precio;
		this.stock = stock;
	}

	public String getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return 	"Id Producto: " + this.idProducto + "\n" + 
				"Material: " + this.material + "\n" + 
				"Precio: " + this.precio + "\n" +
				"Stock: " + this.stock;
	}

}

package articulos;

import java.text.DecimalFormat;

public class Articulo {
	
	private String codigo;
	private String descripcion;
	private Double precioDeCompra;
	private Double precioDeVenta;
	private Integer stock;
	
	public Articulo() {
		super();
	}

	public Articulo(String codigo, String descripcion, Double precioDeCompra, Double precioDeVenta, Integer stock) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precioDeCompra = precioDeCompra;
		this.precioDeVenta = precioDeVenta;
		this.stock = stock;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPrecioDeCompra() {
		return precioDeCompra;
	}

	public void setPrecioDeCompra(Double precioDeCompra) {
		this.precioDeCompra = precioDeCompra;
	}

	public Double getPrecioDeVenta() {
		return precioDeVenta;
	}

	public void setPrecioDeVenta(Double precioDeVenta) {
		this.precioDeVenta = precioDeVenta;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#.00");
		return 	"Articulo: " + descripcion + "\n" +
				"Codigo: " + codigo + "\n" +
				"Precio de Compra: " + df.format(precioDeCompra) + "\n" +
				"Precio de Venta: " + df.format(precioDeVenta) + "\n" +
				"Stock: " + stock;
	}
	
}
package libreria;

import java.text.DecimalFormat;

public class Libreria {
	private String isbn;
	private int fechaPub;
	private double precioBase;
	private double precioPremiun;
	
	public Libreria() {
		super();
	}

	public Libreria(String isbn, int fechaPub, double precioBase, double precioPremiun) {
		super();
		this.isbn = isbn;
		this.fechaPub = fechaPub;
		this.precioBase = precioBase;
		this.precioPremiun = precioPremiun;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getFechaPub() {
		return fechaPub;
	}

	public void setFechaPub(int fechaPub) {
		this.fechaPub = fechaPub;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public double getPrecioPremiun() {
		return precioPremiun;
	}

	public void setPrecioPremiun(double precioPremiun) {
		this.precioPremiun = precioPremiun;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#.00");
		return "ISBN: " + isbn + "\n" +
				"Fecha publicacion: " + fechaPub + "\n" +
				"Precio version base: " + precioBase + "\n" +
				"Precio version deluxe: " + df.format(precioPremiun) + "\n";
	}

}

package hoteles;

public abstract class Reserva {
	private String codigoCliente;
	private int numeroDias;
	private double precioBase;
	private int numeroPersonas;
	
	public Reserva() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reserva(String codigoCliente, int numeroDias, double precioBase, int numeroPersonas) {
		super();
		this.codigoCliente = codigoCliente;
		this.numeroDias = numeroDias;
		this.precioBase = precioBase;
		this.numeroPersonas = numeroPersonas;
	}

	public String getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public int getNumeroDias() {
		return numeroDias;
	}

	public void setNumeroDias(int numeroDias) {
		this.numeroDias = numeroDias;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public int getNumeroPersonas() {
		return numeroPersonas;
	}

	public void setNumeroPersonas(int numeroPersonas) {
		this.numeroPersonas = numeroPersonas;
	}

	
	
}

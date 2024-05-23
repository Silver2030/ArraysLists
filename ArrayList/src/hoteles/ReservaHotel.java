package hoteles;

public class ReservaHotel extends Reserva{
	private String nombreHotel;
	private String ubicacionHotel;
	
	public ReservaHotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReservaHotel(String codigoCliente, int numeroDias, double precioBase, int numeroPersonas) {
		super(codigoCliente, numeroDias, precioBase, numeroPersonas);
		// TODO Auto-generated constructor stub
	}
	public String getNombreHotel() {
		return nombreHotel;
	}
	public void setNombreHotel(String nombreHotel) {
		this.nombreHotel = nombreHotel;
	}
	public String getUbicacionHotel() {
		return ubicacionHotel;
	}
	public void setUbicacionHotel(String ubicacionHotel) {
		this.ubicacionHotel = ubicacionHotel;
	}
	
}

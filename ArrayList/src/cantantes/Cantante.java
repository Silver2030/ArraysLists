package cantantes;

public class Cantante {
	private String id;
	private String nombre;
	private Integer fecha;
	private String discoVendido;
	private Integer ventas;
	
	public Cantante() {
		
		super();
	}
	
	public Cantante(String id, String nombre, Integer fecha, String discoVendido, Integer ventas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fecha = fecha;
		this.discoVendido = discoVendido;
		this.ventas = ventas;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Integer getFecha() {
		return fecha;
	}
	
	public void setFecha(Integer fecha) {
		this.fecha = fecha;
	}
	
	public String getDiscoVendido() {
		return discoVendido;
	}
	
	public void setDiscoVendido(String discoVendido) {
		this.discoVendido = discoVendido;
	}
	
	public Integer getVentas() {
		return ventas;
	}
	
	public void setVentas(Integer ventas) {
		this.ventas = ventas;
	}
	
	@Override
	public String toString() {
		return 	"Cantante: " + nombre + "\n" + 
				"Disco más Vendido: " + discoVendido + "\n" +
				"Año: " + fecha + "\n" +
				"Certificacion: ";
	}
	
	

}

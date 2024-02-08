package peliculas2;

public class Pelicula {
	private int codigo;
	private String titulo;
	private String productora;
	private int fechaEstreno;
	private int numEspectadores;
	
	public Pelicula() {
		super();
	}
	
	
	
	public Pelicula(int codigo, String titulo, String productora, int fechaEstreno, int numEspectadores) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.productora = productora;
		this.fechaEstreno = fechaEstreno;
		this.numEspectadores = numEspectadores;
	}



	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getProductora() {
		return productora;
	}

	public void setProductora(String productora) {
		this.productora = productora;
	}

	public int getfechaEstreno() {
		return fechaEstreno;
	}

	public void setfechaEstreno(int fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}

	public int getNumEspectadores() {
		return numEspectadores;
	}

	public void setNumEspectadores(int numEspectadores) {
		this.numEspectadores = numEspectadores;
	}

	@Override
	public String toString() {
		return "Codigo: " + codigo +
			"\n Titulo: " + titulo + 
			"\n Productora: " + productora + 
			"\n Espectadores: " + numEspectadores +
			"\n Estrellas: ";
	}
	
}

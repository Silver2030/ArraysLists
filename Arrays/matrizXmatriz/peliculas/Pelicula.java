package peliculas;

public class Pelicula {
	private int codigo;
	private String titulo;
	private String productora;
	private int añoEstreno;
	private int numEspectadores;
	
	public Pelicula() {
		super();
	}

	public Pelicula(int codigo, String titulo, String productora, int añoEstreno, int numEspectadores) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.productora = productora;
		this.añoEstreno = añoEstreno;
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

	public int getAñoEstreno() {
		return añoEstreno;
	}

	public void setAñoEstreno(int añoEstreno) {
		this.añoEstreno = añoEstreno;
	}

	public int getNumEspectadores() {
		return numEspectadores;
	}

	public void setNumEspectadores(int numEspectadores) {
		this.numEspectadores = numEspectadores;
	}

	@Override
	public String toString() {
		return "Pelicula [codigo=" + codigo + ", titulo=" + titulo + ", productora=" + productora + ", añoEstreno="
				+ añoEstreno + ", numEspectadores=" + numEspectadores + "]";
	}
	
}

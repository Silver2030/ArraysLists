package peliculas;

import java.util.Scanner;

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

	public void actualizarDatos() {
		Scanner in = new Scanner(System.in);
		/* Actualizar los datos del array exceptuando el codigo */
		System.out.print("Introduce el titulo de la pelicula: ");
		this.titulo = in.nextLine();
		
		System.out.print("Introduce la productora pelicula: ");
		this.productora = in.nextLine();
		
		System.out.print("Introduce el año de estreno de la pelicula: ");
		this.fechaEstreno = in.nextInt();
		
		System.out.print("Introduce los espectadores totales de la pelicula: ");
		this.numEspectadores = in.nextInt();
	}
	
	public int compararCodigos(int codigo, int indice) {
		int indiceDevolver = -1;
		/* Comparo el codigo introducido por teclado con los del array y guardo el indice correspondiente en caso de que sean iguales */
		if(codigo == this.codigo) indiceDevolver = indice;
		
		return indiceDevolver;
	}
	
	public static Pelicula[] borrarPelicula(Pelicula[] peliculas, int indiceBorrar) {
		Pelicula[] nuevoArray = new Pelicula[peliculas.length - 1];
		System.arraycopy(peliculas, 0, nuevoArray, 0, indiceBorrar); /* Creo un array de apoyo copiando el original exceptuando el indice del cual debo eliminar */
		System.arraycopy(peliculas, indiceBorrar + 1, nuevoArray, indiceBorrar, peliculas.length - indiceBorrar - 1);
		return nuevoArray;
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
		return "Titulo: " + titulo + 
			"\n Productora: " + productora + 
			"\n Espectadores: " + numEspectadores +
			"\n Estrellas: ";
	}
	
}

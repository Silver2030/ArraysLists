package tienda;

import java.util.Scanner;

public class Libro extends Articulo{
	public String isbn;
	public int numPag;
	public String autor;
	
	public Libro() {
		super();
	}
	public Libro(int referencia, String nombre, double precio, String isbn, int numPag, String autor) {
		super(referencia, nombre, precio);
		this.isbn = isbn;
		this.numPag = numPag;
		this.autor = autor;
		
	}
	
	public Libro pedirDatosLibro(int referencia) {
		Scanner in = new Scanner(System.in);
		Libro libro = new Libro();
		
		libro.setReferencia(referencia);
		System.out.print("Nombre: ");
		libro.setNombre(in.nextLine());
		System.out.print("Precio: ");
		libro.setPrecio(in.nextInt());
		in.nextLine();
		System.out.print("ISBN: ");
		libro.setIsbn(in.nextLine());
		System.out.print("Numero de Paginas: ");
		libro.setNumPag(in.nextInt());
		in.nextLine();
		System.out.print("Autor: ");
		libro.setAutor(in.nextLine());
		System.out.println();
		
		return libro;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getNumPag() {
		return numPag;
	}
	public void setNumPag(int numPag) {
		this.numPag = numPag;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	@Override
	public String toString() {
		return 	"Libro\n" +
				super.toString() + "\n" +
				"ISBN: " + this.isbn + "\n" +
				"Numero de Paginas: " + this.numPag + "\n" +
				"Autor: " + this.autor + "\n";
	}
	
}
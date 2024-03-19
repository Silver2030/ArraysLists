package tienda;

public class Libro extends Articulo{
	public String isbn;
	public int numPag;
	public String autor;
	
	public Libro() {
		super();
	}
	
	public Libro(int referencia, String nombre, int precio, String isbn, int numPag, String autor) {
		super(referencia, nombre, precio);
		this.isbn = isbn;
		this.numPag = numPag;
		this.autor = autor;
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
		return "Libro [isbn=" + isbn + ", numPag=" + numPag + ", autor=" + autor + "]";
	}

}
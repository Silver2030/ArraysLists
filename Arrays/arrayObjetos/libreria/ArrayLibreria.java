package libreria;

public class ArrayLibreria {
	private Libreria[] libreria;

	public ArrayLibreria() {
		super();
	}

	public ArrayLibreria(Libreria[] libreria) {
		super();
		this.libreria = libreria;
	}
	
	public void mostrarLibros() { // Muestra todos los libros usando el to string de libreria
		for(int i = 0; i < this.libreria.length; i++) {
			System.out.println(this.libreria[i].toString());
		}
	}
	
	public void preciosDeluxe() { // Aumento de precios a las versiones deluxe
		for(int i = 0; i < this.libreria.length; i++) {
			if((this.libreria[i].getFechaPub() == 2022)||(this.libreria[i].getFechaPub() == 2023)) this.libreria[i].setPrecioPremiun(this.libreria[i].getPrecioPremiun() * 1.1);
			else if(this.libreria[i].getFechaPub() < 2022) this.libreria[i].setPrecioPremiun(this.libreria[i].getPrecioPremiun() * 1.2);
		}
	}
	
	public void consulta(int fecha) {
		boolean mostrar = false;
		for(int i = 0; i < this.libreria.length; i++) {
			if(fecha == this.libreria[i].getFechaPub()) {
				System.out.println("ISBN: " + this.libreria[i].getIsbn() + "\n" +
									"Antigüedad: " + (2024 - fecha) + " años");
				mostrar = true;
			}
		}
		if(mostrar == false) System.out.println("No existen libros registrados con esa fecha");
		System.out.println();
	}

	public Libreria[] getLibreria() {
		return libreria;
	}

	public void setLibreria(Libreria[] libreria) {
		this.libreria = libreria;
	}
	
	

}

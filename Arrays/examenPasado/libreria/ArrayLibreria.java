package libreria;

import java.time.Year;

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
		for(int i = 0; i < this.libreria.length; i++) { // Si fecha == 2022&&2023 10% de aumento precio version deluxe, si es más viejo 20% aumento 
			if((this.libreria[i].getFechaPub() == 2022)||(this.libreria[i].getFechaPub() == 2023)) this.libreria[i].setPrecioPremiun(this.libreria[i].getPrecioPremiun() * 1.1);
			else if(this.libreria[i].getFechaPub() < 2022) this.libreria[i].setPrecioPremiun(this.libreria[i].getPrecioPremiun() * 1.2);
		}
	}
	
	public void consulta(int fecha) {
		int fechaActual = Year.now().getValue();
		boolean mostrar = false; // Compara la fecha introducida con todas las existentes, en caso de coincidir muestra el ISBN y antigüedad
		for(int i = 0; i < this.libreria.length; i++) {
			if(fecha == this.libreria[i].getFechaPub()) {
				System.out.println("ISBN: " + this.libreria[i].getIsbn() + "\n" +
									"Antigüedad: " + (fechaActual - fecha) + " años");
				System.out.println();
				mostrar = true;
			}
		} // Si no encuentra ninguno mostrara un mensaje informando de ello
		if(mostrar == false) {
			System.out.println("No existen libros registrados con esa fecha");
			System.out.println();
		}
	}

	public Libreria[] getLibreria() {
		return libreria;
	}

	public void setLibreria(Libreria[] libreria) {
		this.libreria = libreria;
	}
	
	

}

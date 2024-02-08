package peliculas2;

import java.util.Scanner;

public class ArrayPeliculas {
	private Pelicula[] peliculas;

	public ArrayPeliculas() {
		super();
	}

	public ArrayPeliculas(Pelicula[] peliculas) {
		super();
		this.peliculas = peliculas;
	}
	
	public void borrarPelicula(int indiceBorrar) {
		Pelicula[] nuevoArray = new Pelicula[this.peliculas.length - 1];
		System.arraycopy(this.peliculas, 0, nuevoArray, 0, indiceBorrar); /* Creo un array de apoyo copiando el original exceptuando el indice del cual debo eliminar */
		System.arraycopy(this.peliculas, indiceBorrar + 1, nuevoArray, indiceBorrar, this.peliculas.length - indiceBorrar - 1);
		
		for(int i = 0; i < nuevoArray.length; i++) {
		this.peliculas[i] = nuevoArray[i];
		}
		
	}

	public void actualizarDatos(int indice) {
		Scanner in = new Scanner(System.in);
		/* Actualizar los datos del array exceptuando el codigo */
		System.out.print("Introduce el titulo de la pelicula: ");
		peliculas[indice].setTitulo(in.nextLine());
		
		System.out.print("Introduce la productora pelicula: ");
		peliculas[indice].setProductora(in.nextLine());
		
		System.out.print("Introduce el año de estreno de la pelicula: ");
		peliculas[indice].setañoEstreno(in.nextInt());
		
		System.out.print("Introduce los espectadores totales de la pelicula: ");
		peliculas[indice].setNumEspectadores(in.nextInt());
	}
	
	public int compararCodigos(int codigo) {
		int indiceDevolver = -1;
		/* Comparo el codigo introducido por teclado con los del array y guardo el indice correspondiente en caso de que sean iguales */
		for(int i = 0; i < peliculas.length; i++) {
		if(codigo == peliculas[i].getCodigo()) indiceDevolver = i;
		}
		
		return indiceDevolver;
	}

	public Pelicula[] getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(Pelicula[] peliculas) {
		this.peliculas = peliculas;
	}
	
}

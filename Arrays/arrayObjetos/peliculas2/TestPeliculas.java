package peliculas2;

import java.util.Scanner;

public class TestPeliculas {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Pelicula[] obj = {
				new Pelicula(333, "Dunkerque", "Syncopy Inc", 2017, 2000000),
				new Pelicula(213, "It", "Warner Bros.", 2017, 1000000),
				new Pelicula(111, "Star Wars: Episodio VIII", "Walt Disney Studios", 2017, 4000000),
				new Pelicula(564, "D�jame salir", "Blumhouse Prod.", 2017, 500000),
				new Pelicula(987, "Coco", "Walt Disney Studios", 2017, 2000000),
				new Pelicula(444, "Logan", "20th Century Fox", 2017, 500000)
		};
		ArrayPeliculas lla = new ArrayPeliculas(obj);
		char resp = 'A', modificarSeguir = 'S', programaSeguir = 'S', borrarSeguir = 'S';
		int ingresos[] = new int [6];
		int codigo = 0, indice = -1, borrados = 0; 
		
		do{
			System.out.println("A: Modificar datos Pelicula");
			System.out.println("B: Borrar pelicula");
			System.out.println("C: Ver datos peliculas \n");
			System.out.print("Que desea realizar: ");
			resp = Character.toUpperCase(in.next().charAt(0)); /* Seleccionar y validar que se quiere realizar */
			while((resp != 'A')&&(resp != 'B')&&(resp != 'C')) {
				System.out.println("A: Modificar datos Pelicula");
				System.out.println("B: Borrar pelicula");
				System.out.println("C: Ver datos peliculas");
				System.out.print("Respuesta introducida erronea, que desea realizar: ");
				resp = Character.toUpperCase(in.next().charAt(0));
			}
			System.out.println();
			if(resp == 'A') {
				while(modificarSeguir == 'S') {
					System.out.print("Introduce el c�digo de la pel�cula que quieras modificar: ");
					codigo = in.nextInt();
					
					indice = lla.compararCodigos(codigo); /* Comparador del codigo introducido con aquellos registrados */
					
					System.out.println();
					
					if(indice == -1) {
						System.out.println("Codigo no encontrado/incorrecto");
					}else {
						lla.actualizarDatos(indice); /* Al encontrar un codigo en el array igual al introducido permite modificar los datos de este elemento excepto codigo */
					}
					System.out.println();
					System.out.print("Desea continuar modificando peliculas (S/N)?: "); /* Validar si se quieren modificar mas peliculas o volver al menu */
					modificarSeguir = Character.toUpperCase(in.next().charAt(0));
					System.out.println();
					while(modificarSeguir != 'N' && modificarSeguir !='S') {
						System.out.println("Respuesta invalida, por favor vuelta a intentarlo");
						System.out.print("Desea continuar modificando peliculas (S/N)?: ");
						modificarSeguir = Character.toUpperCase(in.next().charAt(0));
						System.out.println();
					}
				}
			modificarSeguir = 'S'; /* Permitir el reingreso en caso de volver al metodo modificar mas tarde */
			}else if(resp == 'B') {
				while(borrarSeguir == 'S') {
					System.out.print("Introduce el c�digo de la pel�cula que quieras borrar: "); /* Comparador del codigo introducido con aquellos registrados */
					codigo = in.nextInt();
					
					indice = lla.compararCodigos(codigo); /* Comparador del codigo introducido con aquellos registrados */
	
					System.out.println();
					
					if(indice == -1) {
						System.out.println("Codigo no encontrado/incorrecto");
					}else {
						lla.borrarPelicula(indice); /* Al encontrar un codigo en el array igual al introducido actualiza el array excluyendo a ese codigo y sus elementos */
						borrados++;
					}
					
					System.out.print("Desea continuar borrando peliculas (S/N)?: "); /* Validar si se quieren modificar mas peliculas o volver al menu */
					borrarSeguir = Character.toUpperCase(in.next().charAt(0));
					System.out.println();
					while(borrarSeguir != 'N' && borrarSeguir !='S') {
						System.out.println("Respuesta invalida, por favor vuelta a intentarlo");
						System.out.print("Desea continuar borrando peliculas (S/N)?: ");
						borrarSeguir = Character.toUpperCase(in.next().charAt(0));
						System.out.println();
					}
				}
			borrarSeguir = 'S'; /* Permitir el reingreso en caso de volver al metodo borrar mas tarde */
			}else {
				cargarIngresos(lla.getPeliculas(), ingresos);
				for(int i = 0; i < lla.getPeliculas().length - borrados; i++) {
					System.out.println(lla.getPeliculas()[i].toString() + estrellas(lla.getPeliculas()[i].getNumEspectadores()) +
							"\n Ingresos: " + ingresos[i] + "�"+ "\n"); /* Muestra */
				}
				System.out.println("La pelicula con mayores ingresos es " + lla.getPeliculas()[ingresoMayor(ingresos, borrados)].getTitulo() + " con un total de " + ingresos[ingresoMayor(ingresos, borrados)] + "� \n");
			}
			System.out.print("Quiere continuar con el programa (S/N)?: "); /* Confirmar si acabar el programa o no */
			programaSeguir = Character.toUpperCase(in.next().charAt(0));
			System.out.println();
			while(programaSeguir != 'N' && programaSeguir !='S') {
				System.out.println("Respuesta invalida, por favor vuelta a intentarlo");
				System.out.print("Quiere continuar con el programa (S/N)?: ");
				programaSeguir = Character.toUpperCase(in.next().charAt(0));
				System.out.println();
			}
		}while(programaSeguir == 'S');
		System.out.print("FIN DE PROGRAMA");
	}
	
	public static String estrellas(int numEspectadores) {
		int[] espectadores = {90000, 500000, 1000000, 2000000, 4000000};
		String[] estrellas = {" * ", "* *", "* * *", "* * * *", "* * * * *"};
		int indice = 0;
		
		for(int i = 0; i < estrellas.length; i++) {
			if(numEspectadores >= espectadores[i]) indice = i;
		}
		return estrellas[indice];
	}
	
	public static void cargarIngresos(Pelicula[] peliculas, int []ingresos) {
		int espectadores = 0;
		for(int i = 0; i < peliculas.length; i++) {
			espectadores = peliculas[i].getNumEspectadores();
			ingresos[i] = espectadores * 8;
		}
	}
	
	public static int ingresoMayor(int []ingresos, int borrados) {
		int indice = 0, ingresoMayor = -1;
		for(int i = 0; i < ingresos.length - borrados; i++) {
			if(ingresos[i] > ingresoMayor) {
				indice = i;
				ingresoMayor = ingresos[i];
			}
		}
		return indice;
	}

}

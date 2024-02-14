package libreria;

import java.util.Scanner;

public class LibreriaApp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Libreria[] aux = {
				new Libreria("381-2-32-31686-0", 2015, 4.99, 14.99),
				new Libreria("312-5-85-48193-1", 2022, 5.99, 19.99),
				new Libreria("941-7-18-12823-0", 2015, 4.99, 14.99),
				new Libreria("864-1-11-93681-5", 2012, 9.99, 25.99),
				new Libreria("712-3-64-62137-7", 2024, 6.99, 19.99)
		};
		ArrayLibreria obj = new ArrayLibreria(aux);
		int resp = 0, fecha = 0;
		
		do { // Menu que permite elegir como gestionar el programa
			System.out.println("Menu Libreria, que desea hacer");
			System.out.println("1) Aumento de precios ediciones deluxe (Parametros ya prestablecidos)");
			System.out.println("2) Consultar libros de x fecha");
			System.out.println("3) Mostrar todos los libros");
			System.out.println("4) Finalizar programa");
			System.out.print("Opcion: ");
			resp = in.nextInt();
			System.out.println();
			
			switch (resp) {
			case 1:
				obj.preciosDeluxe(); // Metodo que aumenta precios deluxe en base a su fecha de publicación
				System.out.println("Aumentando precios deluxe...");
				System.out.println();
				break;
			case 2:
				System.out.print("Introduce la fecha deseada a consultar: ");
				fecha = in.nextInt(); // Metodo que compara la fecha introducida con todas las registradas y devuelve el ISBN y antigüedad
				System.out.println(); // de encontrar una fecha que coincida
				obj.consulta(fecha);
				break;
			case 3:
				obj.mostrarLibros(); // Muestra todos los objetos
				break;
			case 4:
				System.out.println("Finalizando programa..."); // Finaliza el programa
				break;
			default:
				System.out.println("Opcion introducida invalida, por favor vuelta a intentarlo");
				System.out.println();
				break;
			}
			
		}while(resp != 4);
		in.close();
	}

}

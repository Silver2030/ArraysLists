package libreria;

import java.util.Scanner;

public class LibreriaApp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Libreria[] aux = {
				new Libreria("381-2-32-31686-0", 2017, 4.99, 14.99),
				new Libreria("312-5-85-48193-1", 2022, 5.99, 19.99),
				new Libreria("941-7-18-12823-0", 2015, 4.99, 14.99),
				new Libreria("864-1-11-93681-5", 2012, 9.99, 25.99),
				new Libreria("712-3-64-62137-7", 2024, 6.99, 19.99)
		};
		ArrayLibreria obj = new ArrayLibreria(aux);
		int resp = 0, fecha = 0;
		
		do {
			System.out.println("Menu Libreria, que desea hacer");
			System.out.println("1) Aumento de precios ediciones deluxe (Parametros ya prestablecidos)");
			System.out.println("2) Consultar libros de x fecha");
			System.out.println("3) Finalizar programa");
			System.out.println("4) Mostrar todos los libros");
			System.out.print("Opcion: ");
			resp = in.nextInt();
			System.out.println();
			
			switch (resp) {
			case 1:
				obj.preciosDeluxe();
				System.out.println("Aumentando precios deluxe...");
				System.out.println();
				break;
			case 2:
				System.out.print("Introduce la fecha deseada a consultar: ");
				fecha = in.nextInt();
				System.out.println();
				obj.consulta(fecha);
				break;
			case 3:
				System.out.println("Finalizando programa...");
				break;
			case 4:
				obj.mostrarLibros();
				break;
			default:
				System.out.println("Opcion introducida invalida, por favor vuelta a intentarlo");
				System.out.println();
				break;
			}
		}while(resp != 3);
		in.close();
	}

}

package coche;

import java.util.Scanner;

public class CocheApp {
	
	public static void main(String[] args) {
		ArrayCoches obj = new ArrayCoches();
		Scanner in = new Scanner(System.in);
		int resp = 0;
		
		obj.cargarDatos();
		do {
			try {
				System.out.println("Menu Personas, que desea hacer");
				System.out.println("1) Mostrar todos los coches");
				System.out.println("2) Mostrar coches de x marca");
				System.out.println("3) Mostrar coches por debajo de x km");
				System.out.println("4) El coche con mayor cantidad de km");
				System.out.println("5) Coches ordenados por km");
				System.out.println("6) Finalizar programa");
				System.out.print("Opcion: ");
				resp = in.nextInt();
				System.out.println();
				
				switch (resp) {
				case 1:
					obj.mostrarDatos();
					System.out.println();
					break;
				case 2:
					obj.marcaCoche();
					System.out.println();
					break;
				case 3:
					obj.kmCoche();
					System.out.println();
					break;
				case 4:
					obj.maxKm();
					break;
				case 5:
					obj.ordenCoches();
					break;
				case 6:
					System.out.println("Finalizando programa...");
					break;
				default:
					System.out.println("Opcion introducida invalida, por favor vuelta a intentarlo");
					System.out.println();
					break;
				}
			}catch(java.util.InputMismatchException ex) {
				System.out.println();
				System.out.println("Error: " + ex.getMessage());
				System.out.println();
				in.nextLine();
			}
		}while(resp != 6);
		
	}
}
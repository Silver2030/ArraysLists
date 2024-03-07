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
				System.out.println("|---------------------------------------|");
				System.out.println("|		Menu Coches		|");
				System.out.println("|---------------------------------------|");
				System.out.println();
				System.out.println("1) Mostrar todos los Coches");
				System.out.println("2) Filtrar por Marcas");
				System.out.println("3) Coches por debajo del limite (KM)");
				System.out.println("4) Coche con mayor cantidad de KM");
				System.out.println("5) Coches de Menor a Mayor (KM)");
				System.out.println("6) Finalizar programa");
				System.out.print("Opcion: ");
				resp = in.nextInt();
				System.out.println();
				
				switch (resp) {
				case 1:
					obj.mostrarDatos(obj.getCocheArrayList());
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
					System.out.println();
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
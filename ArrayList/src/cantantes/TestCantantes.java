package cantantes;

import java.util.Scanner;

public class TestCantantes {

	public static void main(String[] args) {
		ListaCantantes obj = new ListaCantantes();
		Scanner in = new Scanner(System.in);
		int resp = 0;
		String id = "";
		boolean seguir = false;
		obj.cargarDatos();
		
		do {
			try {
				System.out.println("|-----------------------------------------------|");
				System.out.println("|		Menu Cantantes			|");
				System.out.println("|-----------------------------------------------|");
				System.out.println();
				System.out.println("1) Añadir cantante");
				System.out.println("2) Mostrar todos los cantantes");
				System.out.println("3) Disco más vendido de todo los tiempos");
				System.out.println("4) Finalizar programa");
				System.out.print("Opcion: ");
				resp = in.nextInt();
				System.out.println();
				
				switch (resp) {
				case 1:
					in.nextLine();
					do {
						System.out.print("Código: ");
						id = in.nextLine();
						System.out.println();
						seguir = obj.ingresarDatos(id);
					}while(seguir == true);
					break;
				case 2:
					obj.mostrarDatos();
					break;
				case 3:
					obj.masVendido();
					break;
				case 4:
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
			}
		}while(resp != 4);

	}

}

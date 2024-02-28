package persona;

import java.util.Scanner;

public class PersonaApp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayPersonas obj = new ArrayPersonas();
		int resp = 0, veces = 0;
		String apellido = "";
		
		do { // Menu que permite elegir como gestionar el programa
			System.out.println("Menu Personas, que desea hacer");
			System.out.println("1) Añadir datos");
			System.out.println("2) Borrar datos");
			System.out.println("3) Modificar datos");
			System.out.println("4) Visualizar datos (todos)");
			System.out.println("5) Visualizar datos (individual)");
			System.out.println("6) Finalizar programa");
			System.out.print("Opcion: ");
			resp = in.nextInt();
			System.out.println();
			
			switch (resp) {
			case 1:
				System.out.print("Cuantas personas desea añadir: ");
				veces = in.nextInt();
				System.out.println();
				for(int i = 0; i < veces; i++) {
					obj.ingresarDatos(); // Metodo que ingresa los datos al arrayList
					System.out.println();
				}
				break;
			case 2:
				in.nextLine();
				System.out.print("Introduce el apellido de la persona a borrar: ");
				apellido = in.nextLine();
				System.out.println();
				obj.borrarTexto(apellido); // Metodo que segun el apellido borrar el indice correspondiente
				System.out.println();
				break;
			case 3:
				in.nextLine();
				System.out.print("Introduce el apellido de la persona a modificar: ");
				apellido = in.nextLine();
				System.out.println();
				obj.modificar(apellido); // Metodo que segun el apellido modifica el indice correspondiente
				System.out.println();
				break;
			case 4:
				obj.mostrarDatos(); // Metodo que muestra todos los datos
				System.out.println();
				break;
			case 5:
				in.nextLine();
				System.out.print("Introduce el apellido de la persona a mostrar: ");
				apellido = in.nextLine();
				System.out.println();
				obj.mostrarDato(apellido); // Metodo que muestra datos segun el apellido
				System.out.println();
				break;
			case 6:
				System.out.println("Finalizando programa...");
				break;
			default:
				System.out.println("Opcion introducida invalida, por favor vuelta a intentarlo");
				System.out.println();
				break;
			}
			
		}while(resp != 6);

	}

}

package articulos;

import java.util.Scanner;

public class ArticuloApp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayArticulos obj = new ArrayArticulos();
		int resp = 0;
		String codigo = "";
		
		obj.cargarDatos();
		
		do { 
			try {
				System.out.println("1. Listado");
				System.out.println("2. Alta");
				System.out.println("3. Baja");
				System.out.println("4. Modificación");
				System.out.println("5. Entrada de mercancía");
				System.out.println("6. Venta");
				System.out.println("7. Salir");
				System.out.print("Introduzca una opción: ");
				resp = in.nextInt();
				System.out.println();
				
				switch (resp) {
				case 1:
					obj.visualizarDatos();
					break;
				case 2:
					codigo = obj.pedirCodigo();
					obj.agregarArticulo(codigo);
					break;
				case 3:
					codigo = obj.pedirCodigo();
					obj.borrarArticulo(codigo);
					break;
				case 4:
					codigo = obj.pedirCodigo();
					obj.modificarInterfaz(codigo);
					break;
				case 5:
					codigo = obj.pedirCodigo();
					obj.aumentarStockInterfaz(codigo);
					break;
				case 6:
					codigo = obj.pedirCodigo();
					obj.ventaStockInterfaz(codigo);
					break;
				case 7:
					System.out.println("Finalizando programa...");
					break;
				default:
					System.out.println("Opcion introducida invalida, por favor vuelta a intentarlo");
					System.out.println();
					break;
				}
			} catch(java.util.InputMismatchException ex) {
				System.out.println();
				System.out.println("Error: " + ex.getMessage());
				System.out.println();
				main(args);
			}
		}while(resp != 7);
	}
}
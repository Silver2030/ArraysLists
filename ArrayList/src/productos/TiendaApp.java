package productos;

import java.util.Scanner;

public class TiendaApp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ListaProductos obj = new ListaProductos();
		int resp = 0;
		String codigoBuscar = "";
		
		obj.cargarDatos();
		
		do {
			try {
				System.out.println("MENU TIENDA");
				System.out.println("1) Grabar Productos Fichero (Mantenimiento)");
				System.out.println("2) Añadir Producto");
				System.out.println("3) Calcular Importe");
				System.out.println("4) Mostrar todos los productos");
				System.out.println("5) Borrar producto");
				System.out.println("6) Finalizar programa");
				System.out.print("Introducir opcion deseada: ");
				resp = in.nextInt();
				System.out.println();
				switch(resp) {
					case 1:
						System.out.println("En mantenimiento...");
						System.out.println();
						break;
					
					case 2:
						System.out.print("Codigo: ");
						codigoBuscar = in.nextLine();
						obj.agregarProducto(codigoBuscar);
						break;
					
					case 3:

						break;
					
					case 4:
						obj.mostrarProductos();
						break;
					
					case 5:
						System.out.println("Finalizando programa...");
						break;
					
					case 6:
						System.out.println("Finalizando programa...");
						break;
					
					default:
						System.out.println("Opcion introducida erronea, por favor vuelva a intentarlo");
						System.out.println();
					break;
				}
			}catch(Exception ex){
				System.out.println();
				System.out.println("Error: " + ex.getMessage());
				System.out.println();
				main(args);
			}
		}while(resp != 5);

	}

}

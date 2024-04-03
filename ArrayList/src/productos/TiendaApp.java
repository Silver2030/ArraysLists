package productos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class TiendaApp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ListaProductos obj = new ListaProductos();
		int resp = 0, cantidadCompra = 0;
		String codigoBuscar = "", linea;
		
		obj.cargarDatos();
		
		do {
			try {
				System.out.println("MENU TIENDA");
				System.out.println("1) Grabar Productos Fichero");
				System.out.println("2) Añadir Producto");
				System.out.println("3) Realizar compra");
				System.out.println("4) Borrar producto");
				System.out.println("5) Mostrar productos");
				System.out.println("6) Finalizar programa");
				System.out.print("Introducir opcion deseada: ");
				resp = in.nextInt();
				in.nextLine();
				System.out.println();
				switch(resp) {
					case 1:
						obj.guardarFichero();
						System.out.println("Fichero actualizado.");
						System.out.println();
						break;
					
					case 2:
						System.out.print("Codigo: ");
						codigoBuscar = in.nextLine();
						obj.agregarProducto(codigoBuscar);
						break;
						
					case 3:
						System.out.print("Codigo: ");
						codigoBuscar = in.nextLine();
						System.out.print("Cantidad: ");
						cantidadCompra = in.nextInt();
						saldoNegativo(cantidadCompra);
						obj.factura(codigoBuscar, cantidadCompra);
						break;
					
					case 4:
						System.out.print("Codigo: ");
						codigoBuscar = in.nextLine();
						obj.borrarInterfaz(codigoBuscar);
						break;
					
					case 5:
						obj.mostrarProductos();
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
		}while(resp != 6);

	}
	
	public static void saldoNegativo(int cantidad) throws Compra_negativa{
		if(0 > cantidad) throw new Compra_negativa("No se permiten compras inferiores a 1");
	}

}

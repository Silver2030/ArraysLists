package tienda;

import java.util.Scanner;

public class TiendaApp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ListaArticulos obj = new ListaArticulos();
		int resp = 0, referenciaBuscar = 0;
		String artMod = "";
		
		obj.cargarDatos();
		
		do {
			try {
				System.out.println("MENU TIENDA");
				System.out.println("1) Introducir Libro");
				System.out.println("2) Introducir DvD");
				System.out.println("3) Quitar Articulo");
				System.out.println("4) Modificar Articulo");
				System.out.println("5) Mostrar Articulos");
				System.out.println("6) Finalizar programa");
				System.out.print("Introducir opcion deseada: ");
				resp = in.nextInt();
				System.out.println();
				switch(resp) {
					case 1:
						System.out.print("Referencia: ");
						referenciaBuscar = in.nextInt();
						obj.agregarLibro(referenciaBuscar);
					break;
					
					case 2:
						System.out.print("Referencia: ");
						referenciaBuscar = in.nextInt();
						obj.agregarDvd(referenciaBuscar);
					break;
					
					case 3:
						System.out.print("Referencia: ");
						referenciaBuscar = in.nextInt();
						obj.borrarInterfaz(referenciaBuscar);
					break;
					
					case 4:
						in.nextLine();
						System.out.print("Introduce articulo a modificar (dvd o libro): ");
						artMod = in.nextLine().toUpperCase();
						while(!artMod.equals("DVD")&&!artMod.equals("LIBRO")) {
							System.out.print("Articulo introducido erroneo, Introduce articulo a modificar (dvd o libro): ");
							artMod = in.nextLine().toUpperCase();
						}
						System.out.print("Referencia: ");
						referenciaBuscar = in.nextInt();
						obj.modificarInterfaz(referenciaBuscar, artMod);
					break;
					
					case 5:
						obj.mostrarArticulos();
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

}
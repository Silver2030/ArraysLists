package muebles;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MueblesApp {

	public static void main(String[] args) {
		ListaMuebles obj = new ListaMuebles();
		Scanner in = new Scanner(System.in);
		int resp = 0;
		
		try {
			obj.generarDatos();
			do {
				System.out.println("|-----------------------------------------------|");
				System.out.println("|		Menu Muebles			|");
				System.out.println("|-----------------------------------------------|");
				System.out.println();
				System.out.println("1) Añadir mueble");
				System.out.println("2) Borrar mueble");
				System.out.println("3) Modificar mueble");
				System.out.println("4) Mostrar muebles");
				System.out.println("5) Realizar venta");
				System.out.println("6) Realizar compra");
				System.out.println("7) Revisar muebles con bajo stock");
				System.out.println("8) Guardar/Actualizar fichero");
				System.out.println("9) Mostrar mueble mas caro");
				System.out.println("10) Finalizar programa");
				System.out.print("Opcion: ");
				
				switch(resp) {
					case 1:
						
						break;
					case 2:
						
						break;
					case 3:
						
						break;
					case 4:
						obj.imprimirDatos();
						break;
					case 5:
						
						break;
					case 6:
						
						break;
					case 7:
						
						break;
					case 8:
						obj.guardarFichero();
						break;
					case 9:
						obj.muebleMasCaro();
						break;
					case 10:
						System.out.println("Finalizando programa...");
						break;
					default:
						System.out.println("Opcion introducida invalida, por favor vuelta a intentarlo");
						System.out.println();
						break;
				}
			}while(resp != 10);
			
			}catch(FileNotFoundException ex) {
			ex.printStackTrace();
			}catch(IOException ex) {
			ex.printStackTrace();
			}catch (ClassNotFoundException ex) {
			ex.printStackTrace();
			}

	}
}

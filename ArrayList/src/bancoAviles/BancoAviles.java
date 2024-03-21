package bancoAviles;

import java.util.Scanner;

public class BancoAviles {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ListaCuentas obj = new ListaCuentas();
		int resp = 0;
		String numCuentaBuscar = "";
		
		obj.cargarDatos();
		
		do {
			try {
				System.out.println("MENU TIENDA");
				System.out.println("1) Hacer ingreso");
				System.out.println("2) Hacer retiro");
				System.out.println("3) Calcular y sumar Intereses");
				System.out.println("4) Mostrar Cuentas");
				System.out.println("5) Finalizar programa");
				System.out.print("Introducir opcion deseada: ");
				resp = in.nextInt();
				System.out.println();
				switch(resp) {
					case 1:
						in.nextLine();
						System.out.print("Numero de cuenta: ");
						numCuentaBuscar = in.nextLine();
						obj.ingresoInterfaz(numCuentaBuscar);
					break;
					
					case 2:
						in.nextLine();
						System.out.print("Numero de cuenta: ");
						numCuentaBuscar = in.nextLine();
						obj.retiroInterfaz(numCuentaBuscar);
					break;
					
					case 3:
						in.nextLine();
						System.out.print("Numero de cuenta: ");
						numCuentaBuscar = in.nextLine();
						obj.interesesInterfaz(numCuentaBuscar);
						
					break;
					
					case 4:
						obj.mostrarCuentas();
					break;
					
					case 5:
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
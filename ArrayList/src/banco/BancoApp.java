package banco;

import java.util.Scanner;

public class BancoApp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayBancos obj = new ArrayBancos();
		int resp = 0, cantidad = 0;
		String id = "";
		
		obj.cargarDatos();
		do {
			try {
				for(Banco cadena : obj.getBancoArrayList()) {
					System.out.println(cadena.toString());
				}
				System.out.println();
				System.out.println("1) Realizar ingreso");
				System.out.println("2) Realizar retiro");
				System.out.println("3) Finalizar programa");
				System.out.print("Introducir opción deseada: ");
				resp = in.nextInt();
				System.out.println();
				switch(resp) {
					case 1:
						in.nextLine();
						System.out.print("Ingrese el id de su cuenta: ");
						id = in.nextLine();
						System.out.print("Ingrese la cantidad a ingresar: ");
						cantidad = in.nextInt();
						System.out.println();
						obj.ingresarTexto(id, cantidad);
						System.out.println();
					break;
					
					case 2:
						in.nextLine();
						System.out.print("Ingrese el id de su cuenta: ");
						id = in.nextLine();
						System.out.print("Ingrese la cantidad a retirar: ");
						cantidad = in.nextInt();
						System.out.println();
						obj.retirarTexto(id, cantidad);
						System.out.println();
					break;
						
					case 3:
						System.out.println("Finalizando programa...");
					break;
					
					default:
						System.out.println("Opción introducida erronea, por favor vuelva a intentarlo");
						System.out.println();
					break;
				}
			}catch(Exception ex){
				System.out.println();
				System.out.println("Error: " + ex.getMessage());
				System.out.println();
			}finally {
				in.nextLine();
			}
		}while(resp != 3);
	}

}

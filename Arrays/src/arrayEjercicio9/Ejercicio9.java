package arrayEjercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [] num = {500, 200, 100, 50, 20, 10, 5, 2, 1};
		int cant;
		
		System.out.print("Introduce la cantidad de dinero que quieras cambiar: ");
		cant = in.nextInt();
		
		System.out.println();
		cambioOptimo(num, cant);

	}
	public static void cambioOptimo(int [] cambio, int cantidad) {
		int b = 0;
		for(int i = 0; i < cambio.length; i++) {
			if(cantidad >= cambio[i]) {
				b = cantidad / cambio[i];
				cantidad = cantidad % cambio[i];
				System.out.println(b + " billetes de " + cambio[i] + "€");
			}
		}
	}

}

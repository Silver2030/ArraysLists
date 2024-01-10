package arrayEjercicio11;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [] num = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28};
		char [] carac = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 
				'V', 'W', 'X', 'Y', 'Z', ' ', '.', ','};
		int res = 0;
		char respu = 'A';
		String codigo = "S";
		ArrayList<String> mensaje = new ArrayList<>();
		
		System.out.println("A: Descifrar Digitos");
		System.out.print("B: Descifrar Letras \n Que tipo de mensaje desea descifrar: ");
		respu = Character.toUpperCase(in.next().charAt(0));
		while ((respu != 'A')&&(respu != 'B')){
			System.out.println("A: Descifrar Digitos");
			System.out.print("B: Descifrar Letras \n Respuesta no valida, que tipo de mensaje desea descifrar: ");
			respu = Character.toUpperCase(in.next().charAt(0));
		}
		
		if (respu == 'A') {
			while (res != -1) {
				System.out.print("Introduce los digitos del codigo (-1 para finalizar): ");
				res = in.nextInt();
				while (((res<0)|(res>28))&&(res != -1)) {
					System.out.print("Valor erroneo, introduce los digitos del codigo (-1 para finalizar): ");
					res = in.nextInt();
				}
				if(res != -1) mensaje.add(String.valueOf(codigoDigito(carac, num, res)));
			}
		}else {
			
		}
		
		
		if(mensaje.size() > 0) System.out.println(mensaje);

	}
	public static char codigoDigito(char [] carac, int [] num, int res) {
		char resp = ' ';
		for(int i = 0; i < num.length; i++) {
			if (num[i] == res) resp = carac[i];
		}
		return resp;
	}
	
	public static int codigoLetra(char [] carac, int [] num, String respuesta) {
		int resp = 0;
		for(int i = 0; i < num.length; i++) {
			if (num[i] == resp) resp = carac[i];
		}
		return resp;
	}

}

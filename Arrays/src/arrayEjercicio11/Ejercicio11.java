package arrayEjercicio11;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [] num = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28};
		char [] carac = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 
				'V', 'W', 'X', 'Y', 'Z', ' ', '.', ','};
		int respuInt = 0;
		char respuChar = 'A';
		String mensaje = "A";
		ArrayList<String> mensajeLetra = new ArrayList<>();
		ArrayList<Integer> mensajeNum = new ArrayList<>();
		
		System.out.println("A: Descifrar Digitos");
		System.out.print("B: Descifrar Letras \n Que tipo de mensaje desea descifrar: ");
		respuChar = Character.toUpperCase(in.next().charAt(0));
		while ((respuChar != 'A')&&(respuChar != 'B')){
			System.out.println("A: Descifrar Digitos");
			System.out.print("B: Descifrar Letras \n Respuesta no valida, que tipo de mensaje desea descifrar: ");
			respuChar = Character.toUpperCase(in.next().charAt(0));
		}
		
		if (respuChar == 'A') {
			while (respuInt != -1) {
				System.out.print("Introduce los digitos del codigo (-1 para finalizar): ");
				respuInt = in.nextInt();
				while (((respuInt<0)|(respuInt>28))&&(respuInt != -1)) { /* Validar que no acepte valores no catalogados */
					System.out.print("Valor erroneo, introduce los digitos del codigo (-1 para finalizar): ");
					respuInt = in.nextInt();
				}
				if(respuInt != -1) mensajeLetra.add(String.valueOf(codigoDigito(carac, num, respuInt))); 
				/* Llamar al metodo que cambio el int por un char y añadir al array dinamico */
			}
		}else {
				in.nextLine();
				System.out.print("Introduce el mensaje a descifrar: ");
				mensaje = in.nextLine().toUpperCase();
				for (int i = 0; i < mensaje.length() ; i++) {
					while ((( (int)mensaje.charAt(i) <65)|((int)mensaje.charAt(i)>90))&&((int)mensaje.charAt(i) != 32)&&((int)mensaje.charAt(i) != 44)
							&&((int)mensaje.charAt(i) != 46)&&((int)mensaje.charAt(i) != 42)) { /* Validar que no acepte valores no catalogados */
						System.out.print("Valor erroneo, introduce el mensaje a descifrar: ");
						mensaje = in.nextLine().toUpperCase();
				}
					if(respuChar != '*') mensajeNum.add(codigoLetra(carac, num, mensaje.charAt(i))); 
				} /* Llamar al metodo que cambio el char por una int y añadir al array dinamico */
			}
		
		if(mensajeLetra.size() > 0) System.out.println(mensajeLetra);
		if(mensajeNum.size() > 0) System.out.println(mensajeNum);

	}
	public static char codigoDigito(char [] carac, int [] num, int respuInt) {
		char resp = ' '; /* Metodo que identifica el char correpondiente al int dado */
		for(int i = 0; i < num.length; i++) {
			if (num[i] == respuInt) resp = carac[i];
		}
		return resp;
	}
	
	public static int codigoLetra(char [] carac, int [] num, char respuChar) {
		int resp = 0; /* Metodo que identifica el int correpondiente al char dado */
		for(int i = 0; i < carac.length; i++) {
			if (carac[i] == respuChar) resp = num[i];
		}
		return resp;
	}

}

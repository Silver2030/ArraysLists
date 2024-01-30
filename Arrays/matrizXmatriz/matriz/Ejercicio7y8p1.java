package matriz;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7y8p1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String [] desencriptado = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", 
				"V", "W", "X", "Y", "Z", " "};
		String [] encriptado = {"N", "Z", "T", "Y", "L", "O", "G", "Ñ", "C", "F", "R", "U", "S", "W", "K", "V", "H", "P", "A", "D", "B", "E",
				"J", "M", "Q", "X", "I", " "};
		char respuChar = 'A';
		String mensaje = "", mensajeResp = "";
		ArrayList<Integer> mensajeNum = new ArrayList<>();
		
		System.out.println("A: Encriptar mensaje");
		System.out.print("B: Desencriptar mensaje");
		respuChar = Character.toUpperCase(in.next().charAt(0));
		while ((respuChar != 'A')&&(respuChar != 'B')){
			System.out.println("A: Encriptar mensaje");
			System.out.print("B: Desencriptar mensaje \n Respuesta no valida: ");
			respuChar = Character.toUpperCase(in.next().charAt(0));
		}
		
		if (respuChar == 'A') {
				System.out.print("Introduce el mensaje a encriptar: ");
				respuInt = in.nextInt();
				for (int i = 0; i < mensajeResp.length() ; i++) {
					while ((( (int)mensajeResp.charAt(i) <65)|((int)mensajeResp.charAt(i)>90))&&((int)mensajeResp.charAt(i) != 32)&&
							((int)mensajeResp.charAt(i) != 42)) { 
						/* Validar que no acepte valores no catalogados */
					}
						System.out.print("Valor erroneo, introduce el mensaje a encriptar: ");
						mensajeResp = in.nextLine().toUpperCase();
				if(respuInt != -1) mensaje += (encriptar(desencriptado, encriptado, mensajeResp.charAt(i)));
				}
				/* Llamar al metodo que cambio el int por un char y añadir al array dinamico */
		}else {
				in.nextLine();
				System.out.print("Introduce el mensaje a descifrar: ");
				mensajeResp = in.nextLine().toUpperCase();
				for (int i = 0; i < mensajeResp.length() ; i++) {
					while ((( (int)mensajeResp.charAt(i) <65)|((int)mensajeResp.charAt(i)>90))&&((int)mensajeResp.charAt(i) != 32)&&
							((int)mensajeResp.charAt(i) != 42)) { 
						/* Validar que no acepte valores no catalogados */
						System.out.print("Valor erroneo, introduce el mensaje a desencriptar: ");
						mensajeResp = in.nextLine().toUpperCase();
				}
					if(respuChar != '*') mensajeNum.add(codigoLetra(carac, num, mensajeResp.charAt(i))); 
				} /* Llamar al metodo que cambio el char por una int y añadir al array dinamico */
			}
		
		if(mensaje.length() > 0) System.out.println(mensaje);
		if(mensajeNum.size() > 0) System.out.println(mensajeNum);

	}
	public static String encriptar(String [] desencriptado, String [] encriptado, char mensajeResp) {
		String resp = ""; /* Metodo que identifica el int correpondiente al char dado */
		for(int i = 0; i < desencriptado.length; i++) {
			if (desencriptado[i].equals(String.valueOf(mensajeResp))) resp = encriptado[i];
		}
		return resp;
	}
	
	public static String desencriptar(String [] desencriptado, String [] encriptado, char mensajeResp) {
		String resp = ""; /* Metodo que identifica el int correpondiente al char dado */
		for(int i = 0; i < encriptado.length; i++) {
			if (encriptado[i].equals(String.valueOf(mensajeResp))) resp = desencriptado[i];
		}
		return resp;
	}

}

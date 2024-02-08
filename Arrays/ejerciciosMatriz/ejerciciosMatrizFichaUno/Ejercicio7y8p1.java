package ejerciciosMatrizFichaUno;

import java.util.Scanner;

public class Ejercicio7y8p1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String [] desencriptado = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q", "R", "S", "T", "U", 
				"V", "W", "X", "Y", "Z", " "};
		String [] encriptado = {"N", "Z", "T", "Y", "L", "O", "G", "Ñ", "C", "F", "R", "U", "S", "W", "K", "V", "H", "P", "A", "D", "B", "E",
				"J", "M", "Q", "X", "I", " "};
		char respuChar = 'A';
		String mensaje = "", mensajeDesencriptar = "", mensajeEncriptar = "";
		
		System.out.println("A: Encriptar mensaje");
		System.out.println("B: Desencriptar mensaje");
		respuChar = Character.toUpperCase(in.next().charAt(0));
		while ((respuChar != 'A')&&(respuChar != 'B')){
			System.out.println("A: Encriptar mensaje");
			System.out.print("B: Desencriptar mensaje \n Respuesta no valida: ");
			respuChar = Character.toUpperCase(in.next().charAt(0));
		}
		
		if (respuChar == 'A') {
				in.nextLine();
				System.out.print("Introduce el mensaje a encriptar: ");
				mensajeEncriptar = in.nextLine().toUpperCase();
				for (int i = 0; i < mensajeEncriptar.length() ; i++) {
					while ((( (int)mensajeEncriptar.charAt(i) <65)|((int)mensajeEncriptar.charAt(i)>90))&&((int)mensajeEncriptar.charAt(i) != 32)
							&&((int)mensajeEncriptar.charAt(i) != 42)) { 
						/* Validar que no acepte valores no catalogados en el array*/
						System.out.print("Valor erroneo, introduce el mensaje a encriptar: ");
						mensajeEncriptar = in.nextLine().toUpperCase();
					}
				mensaje += encriptar(desencriptado, encriptado, mensajeEncriptar.charAt(i)); 
				}
				/* Llamar al metodo que cambia los valores strings desencriptados por los encriptados */
		}else {
				in.nextLine();
				System.out.print("Introduce el mensaje a desencriptar: ");
				mensajeDesencriptar = in.nextLine().toUpperCase();
				for (int i = 0; i < mensajeDesencriptar.length() ; i++) {
					while ((( (int)mensajeDesencriptar.charAt(i) <65)|((int)mensajeDesencriptar.charAt(i)>90))&&((int)mensajeDesencriptar.charAt(i) != 32)
							&&((int)mensajeDesencriptar.charAt(i) != 42)) { 
						/* Validar que no acepte valores no catalogados en el array*/
						System.out.print("Valor erroneo, introduce el mensaje a desencriptar: ");
						mensajeDesencriptar = in.nextLine().toUpperCase();
				}
				mensaje += desencriptar(desencriptado, encriptado, mensajeDesencriptar.charAt(i)); 
				} /* Llamar al metodo que cambia los valores string encriptados por los desencriptados */
			}
		
		if(mensaje.length() > 0) System.out.println(mensaje);

	}
	public static String encriptar(String [] desencriptado, String [] encriptado, char mensajeResp) {
		String resp = ""; /* Metodo que identifica el valor string encriptado correspondiente al desencriptado */
		for(int i = 0; i < desencriptado.length; i++) {
			if (desencriptado[i].equals(String.valueOf(mensajeResp))) resp = encriptado[i];
		}
		return resp;
	}
	
	public static String desencriptar(String [] desencriptado, String [] encriptado, char mensajeResp) {
		String resp = ""; /* Metodo que identifica el valor string desencriptado correspondiente al encriptado */
		for(int i = 0; i < encriptado.length; i++) {
			if (encriptado[i].equals(String.valueOf(mensajeResp))) resp = desencriptado[i];
		}
		return resp;
	}
	
}

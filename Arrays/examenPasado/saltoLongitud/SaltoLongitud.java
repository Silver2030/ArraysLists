package saltoLongitud;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SaltoLongitud {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double [][] saltosMarca = {{12.45, 13.05, 13.09},{13.09, 12.09, 13.99},{12.95, 12.33, 12.12},{13.12, 13.15, 13.13},{13.33, 13.03, 12.99}};
		String [] fechas = {"M_2020", "M_2021", "M_2022"};
		String [] participante = {"D111", "D222", "D333", "D444", "D555"};
		String dorsal;
		int resp = 0;
		double[] medias;
		
		do { // Menu que permite elegir como gestionar el programa
			System.out.println("Menu Salto de longitud, que desea hacer");
			System.out.println("1) Ver la tabla");
			System.out.println("2) Consultar dorsal");
			System.out.println("3) Dorsal con la mayor media");
			System.out.println("4) Participantes por encima de la media");
			System.out.println("5) Finalizar programa");
			System.out.print("Opcion: ");
			resp = in.nextInt();
			System.out.println();
			switch(resp) {
			case 1:
				mostrarTabla(saltosMarca, fechas, participante);
				System.out.println();
				mejorMarcaParticipante(saltosMarca, fechas, participante);
				break;
				
			case 2:
				medias = calcularMedias(saltosMarca);
				in.nextLine();
				System.out.print("Introduce el dorsal del participante que deses visualizar: ");
				dorsal = in.nextLine().toUpperCase();
				mostrarMayorMediaDorsal(participante, saltosMarca, dorsal, medias);
				System.out.println();
				break;
				
			case 3:
				medias = calcularMedias(saltosMarca);
				mostrarMedias(saltosMarca, fechas, participante, medias);
				break;
				
			case 4:
				medias = calcularMedias(saltosMarca);
				masQueLaMedia(medias, participante);
				break;
				
			case 5:
				System.out.println("Finalizando programa...");
				break;
				
			default:
				System.out.println("Opcion no valida, vuelva a intentar");
				break;
			}
		}while(resp != 5);
		
	}
	
	public static void mostrarTabla(double[][] saltosMarca, String[] fechas, String[] participante) {
		System.out.print("\t");
		int limite = 1;  // Metodo que muestra la tabla
		for(int i = 0; i < fechas.length; i++) {
			System.out.print(fechas[i]);
			if(i != fechas.length) System.out.print("\t");
		}
		for(int z = 0; z < participante.length; z++) {
			System.out.println();
			System.out.print(participante[z] + ":\t");
		for(int j = limite - 1; j < limite; j++) {
			for(int x = 0; x < saltosMarca[0].length; x++) {
				System.out.print(saltosMarca[j][x]);
				if(x != saltosMarca.length) System.out.print("\t");
				}
			}
		limite++; /* Variable de apoyo que limita e indica como recorrer las filas del array matriz*/
		}
		System.out.println();
	}
	
	public static void mejorMarcaParticipante(double[][] saltosMarca, String[] fechas, String[] participante) {
		double aux = -1;
		int indice = 0;
		 // Muestra la mayor media de cada participante
		for(int j = 0; j < saltosMarca.length; j++) {
			for(int i = 0; i < saltosMarca[j].length; i++) {
				if(saltosMarca[j][i] > aux) aux = saltosMarca[j][i]; indice = i;
			}
			System.out.println("La mejor marca del participante " + participante[j] + " es la de " + fechas[indice] + " con un total de " + aux + "m");
			System.out.println();
			aux = -1;
		}
	}
	
	public static void mostrarMedias(double[][] saltosMarca, String[] fechas, String[] participante, double[] medias) {
		DecimalFormat df = new DecimalFormat("#.00");
		int indice = mayorMedia(medias);
		 // Muestra todos las media de los participantes remarcando el que tenga la media mayor
		for(int i = 0; i < medias.length; i++) {
			if(i == indice)  System.out.println(participante[i] + " tiene la mejor media de salto, que es de " + df.format(medias[i]));
			else System.out.println(participante[i] + " tiene una media de salto de " + df.format(medias[i]));
		}
		System.out.println();
	}
	
	public static double[] calcularMedias(double[][] saltosMarca) {
		double[] medias =  new double [5];
		 // Metodo que devuelve un array que contiene todas las medias de los participantes
		for(int j = 0; j < saltosMarca.length; j++) {
			for(int i = 0; i < saltosMarca[j].length; i++) {
				medias[j] += saltosMarca[j][i];
			}
			medias[j] = medias[j] / saltosMarca[j].length;
		}
		return medias;
	}
	
	public static int mayorMedia(double[] medias) {
		int indice = 0;
		double mayor = 0;
		 // Metodo que busca y devuelve el indice de la mayor media de todos los participantes
		for(int i = 0; i < medias.length; i++) {
			if(medias[i] > mayor) {
				mayor = medias[i]; 
				indice = i;
			}
		}
		return indice;
	}
	
	public static int buscarDorsal(String[] participante, String dorsal) {
		int coincide = -1;
		for(int j = 0; j < participante.length; j++) { // Metodo que busca el indice del dorsal introducido 
			if(dorsal.equals(participante[j])) coincide = j;
		}
		return coincide;
	}
	
	public static void mostrarMayorMediaDorsal(String[] participante, double[][] saltosMarca, String dorsal, double[] medias) {
		DecimalFormat df = new DecimalFormat("#.00");
		int indice = buscarDorsal(participante, dorsal);
		// Metodo que muestra la media del indice del valor introducido, si no existe el dorsal lo dice

		if (indice == -1) {
			System.out.println("El dorsal introducido no coincide con ninguno registrado");
		}else {
			System.out.println("La media de marcas del participante " + dorsal + " es de " + df.format(medias[indice]));
		}
	}
	
	public static double mediaGrupal(double[] medias) {
		double mediaGrupal = 0;
		
		for(int j = 0; j < medias.length; j++) {
			mediaGrupal += medias[j];
		}
		
		mediaGrupal = mediaGrupal / medias.length;
		
		return mediaGrupal;
	}
	
	public static void masQueLaMedia(double[] medias, String[] participante) {
		DecimalFormat df = new DecimalFormat("#.00");
		double mediaGrupal = mediaGrupal(medias);
		
		System.out.println("MEDIA GRUPAL " + df.format(mediaGrupal));
		for(int j = 0; j < medias.length; j++) {
			if(medias[j] > mediaGrupal) System.out.println(participante[j] + " esta por encima de la media, tiene una media de " + df.format(medias[j]));
			else;
		}
		System.out.println();
	}
}

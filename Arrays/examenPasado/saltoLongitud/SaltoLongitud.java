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
		
		mostrarTabla(saltosMarca, fechas, participante);
		System.out.println();
		mejorMarcaParticipante(saltosMarca, fechas, participante);
		System.out.print("Introduce el dorsal del participante que deses visualizar: ");
		dorsal = in.nextLine().toUpperCase();
		System.out.println();
		calcularMedia(participante, saltosMarca, dorsal);
		
	}
	
	public static void mostrarTabla(double[][] saltosMarca, String[] fechas, String[] participante) {
		System.out.print("\t");
		int limite = 1;
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
		
		for(int j = 0; j < saltosMarca.length; j++) {
			for(int i = 0; i < saltosMarca[j].length; i++) {
				if(saltosMarca[j][i] > aux) aux = saltosMarca[j][i]; indice = i;
			}
			System.out.println("La mejor marca del participante " + participante[j] + " es la de " + fechas[indice] + " con un total de " + aux + "m");
			System.out.println();
			aux = -1;
		}
	}
	
	public static boolean buscarDorsal(String[] participante, String dorsal) {
		boolean coincide = false;
		for(int j = 0; j < participante.length; j++) {
			if(dorsal.equals(participante[j])) coincide = true;
		}
		return coincide;
	}
	
	public static void calcularMedia(String[] participante, double[][] saltosMarca, String dorsal) {
		DecimalFormat df = new DecimalFormat("#.00");
		boolean coincide = buscarDorsal(participante, dorsal);
		int aux = 0;
		double media = 0;
		
		if (coincide == false) {
			System.out.println("El dorsal introducido no coincide con ninguno registrado");
		}else {
			for(int j = 0; j < participante.length; j++) {
				if(participante[j].equals(dorsal)) { 
					aux = j;
				}
			}
		}
			
			for(int i = 0; i < saltosMarca[aux].length; i++) {
				media += saltosMarca[aux][i]; 
				System.out.println(media);
			}
			
			media = media / saltosMarca[aux].length;
			
			System.out.println();
			System.out.println("La media de marcas del participante " + dorsal + " es de " + df.format(media));
		}
}
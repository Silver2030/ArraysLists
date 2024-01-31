package maderas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EjercicioMaderas {

	public static void main(String[] args) {
		double [][] matriz = new double [4][5];
		double [] preciosMedios = new double [5];
		String [] maderas = {"Caoba", "Cedro", "Roble", "Nogal", "Teca"};
		String [] grosor = {"3 mm", "5 mm", "7 mm", "10 mm"};
		
		cargarMatriz(matriz, maderas, grosor); /* Modulo que permite introducir los datos al array matriz*/
		mostrarTabla(matriz, maderas, grosor); /* Modulo que imprime los 3 arrays*/
		System.out.println();
		precioMedioMaderas(matriz, maderas, preciosMedios); /* Modulo que calcula e imprime el valor medio de cada madera*/
		System.out.println();
		maderaMasBarata(maderas, preciosMedios); /* Modulo que calcula e imprime unicamente la madera con menor valor medio*/

	}
	
	public static void cargarMatriz(double[][] matriz, String[] maderas, String[] grosor) {
		Scanner in = new Scanner(System.in);
		double precio = 0;
		for(int j = 0; j < matriz.length; j++) {
			for(int i = 0; i < matriz[j].length; i++) {
				System.out.print("Introduce el valor del tipo de madera " + maderas[i] + " de un grosor de " + grosor[j] + ": ");
				precio = in.nextDouble();
				matriz[j][i] = precio;
				}
			System.out.println();
			}
	}
	
	public static void mostrarTabla(double[][] matriz, String[] maderas, String[] grosor) {
		System.out.print("\t");
		int limite = 1;
		for(int i = 0; i < maderas.length; i++) {
			System.out.print(maderas[i]);
			if(i != maderas.length) System.out.print("\t");
		}
		for(int z = 0; z < grosor.length; z++) {
			System.out.println();
			System.out.print(grosor[z] + ":\t");
		for(int j = limite - 1; j < limite; j++) {
			for(int x = 0; x < matriz[0].length; x++) {
				System.out.print(matriz[j][x]);
				if(x != matriz.length) System.out.print("\t");
				}
			}
		limite++; /* Variable de apoyo que limita e indica como recorrer las filas del array matriz*/
		}
		System.out.println();
	}
	
	public static void precioMedioMaderas(double[][] matriz, String[] maderas, double[] preciosMedios) {
		DecimalFormat df = new DecimalFormat("#.00");
		double precioTotal = 0;
		
		for(int j = 0; j < matriz[0].length; j++) {
			for(int i = 0; i < matriz.length; i++) {
				preciosMedios[j] += matriz[i][j];
			}	
			preciosMedios[j] = preciosMedios[j] / matriz.length;
			System.out.println("El precio de la madera " + maderas[j] + " es de " + df.format(preciosMedios[j]));
		}
	}
	
	public static void maderaMasBarata(String[] maderas, double[] preciosMedios) {
		DecimalFormat df = new DecimalFormat("#.00");
		double precioMenor = 1000000;
		String maderaMenor = "";
		
		for(int j = 0; j < preciosMedios.length; j++) {
			if(preciosMedios[j] < precioMenor) {
				precioMenor = preciosMedios[j];
				maderaMenor = maderas[j];
			}
		}
		System.out.println("La madera con el precio medio menor es " + maderaMenor + " y su precio medio es de " + df.format(precioMenor));
	}

}

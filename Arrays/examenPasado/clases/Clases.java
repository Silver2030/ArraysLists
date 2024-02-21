package clases;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Clases {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int resp = 0;
		String[] clientes = {"Fernando Exposito","Enrique Rodriguez","Ernesto Molina","Sabela Vasquez","Sergio gordillo"};
		int[][] horasInicio = {{18,30},{18,00},{19,00},{20,30},{18,30}};
		int[][] horasFin = {{19,30},{19,30},{20,30},{22,00},{20,30}};
		int[] indice = new int [2];
		int[] tiempoPagar = new int [clientes.length];
		String[] esteMes = new String [clientes.length];
		String[] siguienteMes = new String [clientes.length];
		double[] dineroPagar = new double [clientes.length];
		
		dinero(tiempoPagar, horasFin, horasInicio, dineroPagar); // Multiplico los minutos por la constante del valor
		
		do { 
			System.out.println("Menu pago de clases, que desea hacer");
			System.out.println("1) Ver todas las facturas pendientes");
			System.out.println("2) Ver deuda total");
			System.out.println("3) Mostrar cuando debe pagar cada cliente");
			System.out.println("4) Finalizar programa");
			System.out.print("Opcion: ");
			resp = in.nextInt();
			System.out.println();
			switch(resp) {
			case 1:
				facturaIndividual(clientes, dineroPagar); // Muestro la factura por separado de cada cliente
				break;
				
			case 2:
				deudaTotal(dineroPagar); // Muestro cuanto debo cobrar en total sumando todas las facturas
				break;
				
			case 3:
				mostrarFechas(dineroPagar, clientes, indice, esteMes, siguienteMes); // Muestro que mes debe pagar cada cliente
				break;
				
			case 4:
				System.out.println("Finalizando programa...");
				break;

			default:
				System.out.println("Opcion no valida, vuelva a intentar");
				break;
			}
		}while(resp != 4);

	}

	public static void tiempo(int[] tiempoPagar, int[][] horasFin, int[][] horasInicio) {
		for(int i = 0; i < horasFin.length ; i++) {
			for(int j = 0; j < horasFin[i].length; j++) {
				if(j == 0) {
					tiempoPagar[i] +=  60 * (horasFin[i][j] - horasInicio[i][j]); // Columna hora de salida - columna hora de entrada
				}else {
					tiempoPagar[i] += horasFin[i][j] - horasInicio[i][j]; // Columna minuto de salida - columna minuto de entrada
				}
			}
		}
	}
	
	public static void dinero(int[] tiempoPagar, int[][] horasFin, int[][] horasInicio, double[] dineroPagar) {
		double VALORXMIN = 0.5;
		tiempo(tiempoPagar, horasFin, horasInicio); // Calculo cuantos minutos de clase ha tenido cada cliente
		
		for(int i = 0; i < tiempoPagar.length ; i++) {
			dineroPagar[i] = tiempoPagar[i] * VALORXMIN;
		}
	}
	
	public static void facturaIndividual(String[] clientes, double[] dineroPagar) {
		DecimalFormat df = new DecimalFormat("#.00");
		for(int i = 0; i < clientes.length ; i++) {
			System.out.println("El cliente " + clientes[i] + " tiene que pagar un total de " + df.format(dineroPagar[i]) + "€");
		}
		System.out.println();
	}
	
	public static void deudaTotal(double[] dineroPagar) {
		int deudaTotal = 0;
		for(int i = 0; i < dineroPagar.length ; i++) {
			deudaTotal += dineroPagar[i];
		}
		System.out.println("La deuda total es de " + deudaTotal + "€");
		System.out.println();
	}
	
	public static void fechasPago(double[] dineroPagar, String[] clientes, int[] indice, String[] esteMes, String[] siguienteMes) {
		int cont = 0, cont1 = 0;
		
		for(int i = 0; i < clientes.length ; i++) {
			if(dineroPagar[i] <= 30) {
				siguienteMes[cont] = clientes[i];
				cont++;
			}
			else {
				esteMes[cont1] = clientes[i];
				cont1++;
			}
		}
		indice[0] = cont; // Guardo los tamaños de cada array
		indice[1] = cont1;
	}
	
	public static void mostrarFechas(double[] dineroPagar, String[] clientes, int[] indice, String[] esteMes, String[] siguienteMes) {
		fechasPago(dineroPagar, clientes, indice, esteMes, siguienteMes); // Genero datos en los arrays esteMes, siguienteMes e indice
		
		System.out.println("Clientes que deben pagar este mes:");
		System.out.println();
		for(int i = 0; i < indice[1] ; i++) {
			System.out.print(esteMes[i] + " ");
			for(int j = 0; j < dineroPagar.length ; j++) { // Busco el cliente que coincide y uso su indice en el array dineroPagar
				if(esteMes[i].equals(clientes[j])) System.out.println(dineroPagar[j] + "€");
			}
		}
		System.out.println();
		System.out.println("Clientes que deben pagar el siguiente mes:");
		System.out.println();
		for(int i = 0; i < indice[0] ; i++) {
			System.out.print(siguienteMes[i] + " ");
			for(int j = 0; j < dineroPagar.length ; j++) { // Busco el cliente que coincide y uso su indice en el array dineroPagar
				if(siguienteMes[i].equals(clientes[j])) System.out.println(dineroPagar[j] + "€ + próximo mes");
			}
		}
		System.out.println();
	}
	
}
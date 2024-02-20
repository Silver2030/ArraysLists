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
		int[] tiempoPagar = new int [clientes.length];
		double[] dineroPagar = new double [clientes.length];
		
		dinero(tiempoPagar, horasFin, horasInicio, dineroPagar);
		
		do { // Menu que permite elegir como gestionar el programa
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
				facturaIndividual(clientes, dineroPagar);
				break;
				
			case 2:
				deudaTotal(dineroPagar);
				break;
				
			case 3:
				fechasPago(dineroPagar, clientes);
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
					tiempoPagar[i] +=  60 * (horasFin[i][j] - horasInicio[i][j]);
				}else {
					tiempoPagar[i] += horasFin[i][j] - horasInicio[i][j];
				}
			}
		}
	}
	
	public static void dinero(int[] tiempoPagar, int[][] horasFin, int[][] horasInicio, double[] dineroPagar) {
		double VALORXMIN = 0.5;
		tiempo(tiempoPagar, horasFin, horasInicio);
		
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
	
	public static void fechasPago(double[] dineroPagar, String[] clientes) {
		int cont = 0, cont1 = 0;
		String[] esteMes = new String [clientes.length];
		String[] siguienteMes = new String [clientes.length];
		
		for(int i = 0; i < clientes.length ; i++) {
			if(dineroPagar[i] <= 30) {
				siguienteMes[i] = clientes[i];
				cont++;
			}
			else {
				esteMes[i] = clientes[i];
				cont1++;
			}
		}
		
		System.out.println("Clientes que deben pagar este mes");
		for(int i = 0; i < cont1 ; i++) {
			System.out.println(esteMes[i]);
		}
		System.out.println();
		System.out.println("Clientes que deben pagar el siguiente mes");
		for(int i = 0; i < cont ; i++) {
			System.out.println(siguienteMes[i]);
		}
		System.out.println();
		
	}
}

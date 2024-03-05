package exceptionsPruebas;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int resp = 0, resultado = 0;
		while(resp != 5) {
			try {
				System.out.println("1) Sumar");
				System.out.println("2) Restar");
				System.out.println("3) Multiplicar");
				System.out.println("4) Dividir");
				System.out.println("5) Finalizar programa");
				System.out.print("Introducir opción deseada: ");
				resp = in.nextInt();
				System.out.println();
				
				switch(resp) {
					case 1:
						resultado = suma();
					break;
					
					case 2:
						resultado = resta();
						negativo(resultado);
					break;
						
					case 3:
						resultado = multiplicacion();
					break;
						
					case 4:
						resultado = division();
					break;
						
					case 5:
						System.out.println("Finalizando programa...");
					break;
						
					default:
						System.out.println("Opción introducida erronea, por favor vuelva a intentarlo");
						System.out.println();
					break;
				}
				if((resp > 0)&&(resp < 5)) {
					System.out.println();
					System.out.println("El resultado de la operación es " + resultado);
					System.out.println();
				}
			} catch(ArithmeticException ex) {
				System.out.println();
				System.out.println("Error: " + ex.getMessage());
				System.out.println();
			} catch(java.util.InputMismatchException ex) {
				System.out.println();
				System.out.println("Error: " + ex.getMessage());
				System.out.println();
			} catch(Exception ex) {
				System.out.println();
				System.out.println("Error: " + ex.getMessage());
				System.out.println();
			} finally {
				in.nextLine();
			}
		}
		
	}
	
	public static void negativo(int resultado) throws Resultado_Negativo{
		if(resultado < 0) throw new Resultado_Negativo("El sustraendo no puede ser superior al minuendo");
	}

	public static class Resultado_Negativo extends Exception {
		public Resultado_Negativo() {}
		
		public Resultado_Negativo(String msj_error) {
			super(msj_error);
		}
	}
	
	public static int suma() {
		Scanner in = new Scanner(System.in);
		int resultado = 0, sumando1 = 0, sumando2 = 0;
		System.out.print("Primer sumando: ");
		sumando1 = in.nextInt();
		System.out.print("Segundo sumando: ");
		sumando2 = in.nextInt();
		resultado = sumando1 + sumando2;
		return resultado;
	}
	
	public static int resta() {
		Scanner in = new Scanner(System.in);
		int resultado = 0, minuendo = 0, sustraendo = 0;
		System.out.print("Minuendo: ");
		minuendo = in.nextInt();
		System.out.print("Sustraendo: ");
		sustraendo = in.nextInt();
		resultado = minuendo - sustraendo;
		return resultado;
	}
	
	public static int multiplicacion() {
		Scanner in = new Scanner(System.in);
		int resultado = 0, multiplo1 = 0, multiplo2 = 0;
		System.out.print("Primer multiplo: ");
		multiplo1 = in.nextInt();
		System.out.print("Segundo multiplo: ");
		multiplo2 = in.nextInt();
		resultado = multiplo1 * multiplo2;
		return resultado;
	}
	
	public static int division() {
		Scanner in = new Scanner(System.in);
		int resultado = 0, dividendo = 0, divisor = 0;
		System.out.print("Dividendo: ");
		dividendo = in.nextInt();
		System.out.print("Divisor: ");
		divisor = in.nextInt();
		resultado = dividendo / divisor;
		return resultado;
	}
	
}
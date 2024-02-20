package notas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = 0, resp = 0;
		String id = "";
		String[] categoria = {"Práctica", "Problemas", "Teórica"};
		double[] porcentaje = {0.1, 0.5, 0.4};
		
		System.out.print("Introduce la cantidad de alumnos a regitrar: ");
		num = in.nextInt(); // Pido cantidad de alumnos y le doy el tamaño a todos los arrays que lo necesitan
		int [][] notasAlum = new int [num][3];
		String [] idAlum = new String [num];
		double notas[] = new double [num];
		String [] resultado = new String [num];
		
		generarDatos(notasAlum, idAlum); // Genero los datos en el array notaAlum
		notaAlumno(notasAlum, porcentaje, notas); // Genero las notas una vez aplicados los %
		notaTexto(resultado, notas); // Genero la respuesta en texto en base al array notaAlumno
		
		do {
			System.out.println();
			System.out.println("Menu notas, que desea hacer");
			System.out.println("1) Mostrar notas por categoria");
			System.out.println("2) Consultar resultado por id");
			System.out.println("3) Mostrar notas finales y resultados");
			System.out.println("4) Finalizar programa");
			System.out.print("Opcion: ");
			resp = in.nextInt();
			System.out.println();
			
			switch(resp) {
				case 1:
					mostrarTabla(notasAlum, categoria, idAlum); // Muestra los datos de todos los alumnos sin aplicar porcentaje
				break;
				case 2:
					in.nextLine();
					System.out.print("Introduce el id del alumno a buscar: ");
					id = in.nextLine().toUpperCase();
					mostrarNota(idAlum, id, notas, resultado); // Busco el id y de encontrar muestra los datos, de lo contrario infomra de ello
				break;
				case 3:
					todasNotas(idAlum, notas, resultado);
					System.out.println();
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
	
	public static int random(int min, int max) {
		int v=(int)Math.floor(Math.random()*(max-min+1)+(min));
		return v;
	}
	
	public static void generarDatos(int [][] notasAlum, String [] idAlum) {
		for(int i = 0; i < notasAlum.length ; i++) {
			for(int j = 0; j < notasAlum[0].length; j++) {
				notasAlum[i][j] = random(0, 10);
			}
			idAlum[i] = "8DAJP" + String.valueOf(i);
		}
	}
	
	public static void mostrarTabla(int[][] notasAlum, String[] categoria, String[] idAlum) {
		System.out.print("\t");
		int limite = 1;  // Metodo que muestra la tabla
		for(int i = 0; i < categoria.length; i++) {
			System.out.print("    " + categoria[i]);
			if(i != categoria.length) System.out.print("\t");
		}
		for(int z = 0; z < idAlum.length; z++) {
			System.out.println();
			System.out.print(idAlum[z] + "\t\t");
		for(int j = limite - 1; j < limite; j++) {
			for(int x = 0; x < notasAlum[0].length; x++) {
				System.out.print(notasAlum[j][x]);
				if(x != notasAlum.length) System.out.print("\t\t");
				}
			}
		limite++; /* Variable de apoyo que limita e indica como recorrer las filas del array matriz*/
		}
		System.out.println();
	}
	
	public static int buscarId(String[] idAlum, String id) {
		int coincide = -1;
		for(int j = 0; j < idAlum.length; j++) { // Metodo que busca el indice del dorsal introducido 
			if(id.equals(idAlum[j])) coincide = j;
		}
		return coincide;
	}
	
	public static void mostrarNota(String[] idAlum, String id, double notas[], String[] resultado) {
		DecimalFormat df = new DecimalFormat("#.00");
		int indice = buscarId(idAlum, id);
		// Metodo que muestra la media del indice del valor introducido, si no existe el dorsal lo dice

		if (indice == -1) {
			System.out.println("El id introducido no coincide con ninguno registrado");
		}else {
			System.out.println("El alumno con ID " + idAlum[indice] + " tiene una nota de " + df.format(notas[indice]) + ": " +  resultado[indice]);
		}
	}
	
	public static void notaTexto(String[] resultado, double notas[]) {
		for(int i = 0; i < resultado.length; i++) {
			if((0 <= notas[i])&&(notas[i] <= 4)){
				resultado[i] = "Insuficiente";
			}else if((5 <= notas[i])&&(notas[i] <= 6)){
				resultado[i] = "Aprobado";
			}else {
				resultado[i] = "Destacado";
			}
		}
	}
	
	public static void notaAlumno(int[][] notasAlum, double[] porcentaje, double notas[]) {
		for(int i = 0; i < notasAlum.length ; i++) {
			for(int j = 0; j < notasAlum[0].length; j++) {
				notas[i] += notasAlum[i][j] * porcentaje[j];
			}
		}
	}
	
	public static void todasNotas(String[] idAlum, double notas[], String [] resultado) {
		DecimalFormat df = new DecimalFormat("#0.00");
		System.out.println("\t\t Nota \t\t Resultado");
		System.out.print("--------------------------------------------");
		for(int z = 0; z < idAlum.length; z++) {
			System.out.println();
			System.out.print(idAlum[z] + "\t\t" + df.format(notas[z]) + "\t\t" + resultado[z]);
		}
	}

}

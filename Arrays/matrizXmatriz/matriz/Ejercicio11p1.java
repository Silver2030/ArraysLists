package matriz;

public class Ejercicio11p1 {

	public static void main(String[] args) {
		int alumnosTotal = 0;
		int [][] matriz = new int [6][5];
		String [] modulos = {"Programación", "Lenguaje de Marcas", "Sistemas Informaticos", "Entornos de Desarrollo", "Bases de Datos"};
		matriz = cargarMatriz(matriz); /*Llama al modulo que genera los datos dentro de la matriz*/
		System.out.println();
		alumnosTotal = alumnosCentro(matriz); /*Llama al modulo que suma el total de valores dentro del array*/
		System.out.println("En el centro hay un total de " + alumnosTotal + " alumnos");
		System.out.println();
		alumnosModulo(matriz, modulos); /*Llama al modulo que suma el total de valores dentro de cada modulo*/
		System.out.println();
		alumnosGrupo(matriz, modulos); /*Llama al modulo que suma el total de valores dentro de cada grupo*/
		System.out.println();
		moduloMayor(matriz, modulos); /*Llama al modulo que comprueba la suma total de todos los modulos y los compara mostrando quien tiene un valor mayor*/
	}
	
	public static int random() {
		int v=(int)Math.floor(Math.random()*(30-1+1)+(1));
		return v;
	}
	
	public static int[][] cargarMatriz(int[][] matriz) {
		for(int j = 0; j < matriz.length; j++) {
			for(int i = 0; i < matriz[j].length; i++) {
				matriz[j][i] = random(); /*Da un valor aleatorio entre 1 y 30 llamando al metodo random (1 y 30 incluidos)*/
				}
			}
		return matriz;
	}
	
	public static int alumnosCentro(int[][] matriz) {
		int alumnosTotal = 0;
		for(int j = 0; j < matriz.length; j++) {
			for(int i = 0; i < matriz[j].length; i++) {
				alumnosTotal += matriz[j][i];
			}	
		}
		return alumnosTotal;
	}
	
	public static void alumnosModulo(int[][] matriz, String[] nombreModulo) {
		int alumnosModulo = 0;
		for(int j = 0; j < matriz[0].length; j++) {
			for(int i = 0; i < matriz.length; i++) {
				alumnosModulo += matriz[i][j];
			}	
			System.out.println("El modulo " + nombreModulo[j] + " tiene un total de " + alumnosModulo + " alumnos");
			alumnosModulo = 0;
		}
	}
	
	public static void alumnosGrupo(int[][] matriz, String[] nombreModulo) {
		int alumnosGrupo = 0;
		for(int j = 0; j < matriz.length; j++) {
			for(int i = 0; i < matriz[j].length; i++) {
				alumnosGrupo += matriz[j][i];
			}	
			System.out.println("El grupo Nº" + j + " tiene un total de " + alumnosGrupo + " alumnos");
			alumnosGrupo = 0;
		}
	}
	
	public static void moduloMayor(int[][] matriz, String[] nombreModulo) {
		String modulo = "";
		int alumnosModulo = 0, max = -1;
		for(int j = 0; j < matriz[0].length; j++) {
			for(int i = 0; i < matriz.length; i++) {
				alumnosModulo += matriz[i][j];
			}	
			if(alumnosModulo > max) {
				max = alumnosModulo;
				modulo = nombreModulo[j];
			}
			alumnosModulo = 0;
		}
		System.out.println("El modulo con mayor número de alumnos es el de " + modulo + " con un total de " + max + " alumnos");
	}

}

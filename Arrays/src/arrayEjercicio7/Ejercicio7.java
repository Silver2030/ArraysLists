package arrayEjercicio7;

public class Ejercicio7 {

	public static void main(String[] args) {
		int [] resul = new int [100];
		for(int i = 0; i < resul.length; i++) {
			resul[i] = dado();
		}
		
		System.out.println("Salio uno un total de " + uno(resul) + " veces");
		System.out.println("Salio dos un total de " + dos(resul) + " veces");
		System.out.println("Salio tres un total de " + tres(resul) + " veces");
		System.out.println("Salio cuatro un total de " + cuatro(resul) + " veces");
		System.out.println("Salio cinco un total de " + cinco(resul) + " veces");
		System.out.println("Salio seis un total de " + seis(resul) + " veces");

	}
	
	public static int dado() {
		int v=(int)Math.floor(Math.random()*(6-1+1)+(1));
		return v;
	}
	
	public static int uno(int [] num) {
		int uno = 0;
		for(int i = 0; i < num.length; i++) {
			if (num[i] == 1) uno++;
		}
		return uno;
	}
	
	public static int dos(int [] num) {
		int dos = 0;
		for(int i = 0; i < num.length; i++) {
			if (num[i] == 2) dos++;
		}
		return dos;
	}
	
	public static int tres(int [] num) {
		int tres = 0;
		for(int i = 0; i < num.length; i++) {
			if (num[i] == 3) tres++;
		}
		return tres;
	}
	
	public static int cuatro(int [] num) {
		int cuatro = 0;
		for(int i = 0; i < num.length; i++) {
			if (num[i] == 4) cuatro++;
		}
		return cuatro;
	}
	
	public static int cinco(int [] num) {
		int cinco = 0;
		for(int i = 0; i < num.length; i++) {
			if (num[i] == 5) cinco++;
		}
		return cinco;
	}
	
	public static int seis(int [] num) {
		int seis = 0;
		for(int i = 0; i < num.length; i++) {
			if (num[i] == 6) seis++;
		}
		return seis;
	}

}

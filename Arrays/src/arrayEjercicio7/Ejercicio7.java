package arrayEjercicio7;

public class Ejercicio7 {

	public static void main(String[] args) {
		int [] resul = new int [100];
		for(int i = 0; i < resul.length; i++) {
			resul[i] = dado();
		}
		
		resultados(resul);

	}
	
	public static int dado() {
		int v=(int)Math.floor(Math.random()*(6-1+1)+(1));
		return v;
	}
	
	public static void resultados(int [] num) {
		int uno = 0, dos = 0, tres = 0, cuatro = 0, cinco = 0, seis = 0;
		for(int i = 0; i < num.length; i++) {
			if (num[i] == 1) uno++;
			else if (num[i] == 2) dos++;
			else if (num[i] == 3) tres++;
			else if (num[i] == 4) cuatro++;
			else if (num[i] == 5) cinco++;
			else if (num[i] == 6) seis++;
		}
		System.out.println("Salio uno un total de " + uno + " veces");
		System.out.println("Salio dos un total de " + dos + " veces");
		System.out.println("Salio tres un total de " + tres + " veces");
		System.out.println("Salio cuatro un total de " + cuatro + " veces");
		System.out.println("Salio cinco un total de " + cinco + " veces");
		System.out.println("Salio seis un total de " + seis + " veces");
	}
	
}

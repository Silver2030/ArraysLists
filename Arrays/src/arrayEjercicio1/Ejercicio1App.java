package arrayEjercicio1;

public class Ejercicio1App {

	public static void main(String[] args) {
		Ejercicio1 obj = new Ejercicio1();
		int par = 0, impar = 0;
		
		par = obj.par();
		impar = obj.impar();
		
		System.out.println("La suma de los números pares es " + par);
		System.out.println("La suma de los números impares es " + impar);

	}

}

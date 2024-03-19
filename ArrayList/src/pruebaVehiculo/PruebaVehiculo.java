package pruebaVehiculo;

public class PruebaVehiculo {
	
	public static void main(String[] args) {
		Coche cochePepe = new Coche("0000BBB", "gris plata", 0, 0, 3);
		Coche cocheMaria = new Coche("1111CCC", "Rojo", 0, 0, 5);
		Moto motoPepe = new Moto("2222BBB", "negro", 0, 0, 2);
		
		cochePepe.asignarCilindrada();
		cochePepe.asignarPotencia();
		
		cocheMaria.asignarCilindrada();
		cocheMaria.asignarPotencia();
		
		System.out.println(cochePepe.toString());
		System.out.println(cocheMaria.toString());
		
		motoPepe.asignarCilindrada();
		motoPepe.asignarPotencia();
		
		System.out.println(motoPepe.toString());
	}
}

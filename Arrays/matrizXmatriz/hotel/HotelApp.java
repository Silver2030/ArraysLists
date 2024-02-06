package hotel;

import java.util.Scanner;

public class HotelApp {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayHotel obj = new ArrayHotel();
		int indice = 0, numHabitacion = 1, num = 0;
		
		System.out.print("Buenas, introduzca el número de reservas a realizar (Maximo 20 por consulta): ");
		num = in.nextInt(); // Solicito el número de veces a realizar para crear el rango de datos del array así iniciandolo
		System.out.println();
		while((num < 1 )||(num > 20)) { // Valido que no trate de hacer más de 20 reservas por vez
			System.out.print("Cantidad introducida invalida, por favor introduzca el número de reservas a realizar (Maximo 20 por consulta): ");
			num = in.nextInt(); 
			System.out.println();
		}
		
		obj.inicializar(num); // Inicializo los datos del array
		
		for(int i = 0; i < num; i++) {
			obj.numHabitacion(indice, numHabitacion); // Seteo el valor a numHabitacion
			System.out.println("Bienvenido al hotel por favor rellene los siguientes datos para realiar su reserva");
			System.out.println();
			System.out.println("TIPOS DE HABITACIONES DISPONIBLES ACTUALMENTE (PRECIO POR DIA)");
			System.out.println("Individual = 60€ \t Doble = 90€ \t\t Triple = 110€ \n" +
							   "Quad = 120€ \t\t Queen = 70€ \t\t King = 80€ \n" +
							   "Twin = 90€ \t\t Doble-doble = 70€ \t Estudio = 120€");
			System.out.println();
			obj.pedirDatos(indice); // Solicito los datos de los atributos
			while(obj.precioFinal(indice) == 0) { 	// Si precioFinal = 0 quiere decir que el tipo de habitacion elegido es erroneo por lo tanto
				System.out.println();				// repite la peticion de datos hasta que eliga una habitacion que sea correcta
				System.out.println("Algún dato introducido en el tipo de habitación es erroneo, por favor reintente realizar su reserva.");
				System.out.println();
				System.out.println("TIPOS DE HABITACIONES DISPONIBLES ACTUALMENTE (PRECIO POR DIA)");
				System.out.println("Individual = 60€ \t Doble = 90€ \t\t Triple = 110€ \n" +
								   "Quad = 120€ \t\t Queen = 70€ \t\t King = 80€ \n" +
								   "Twin = 90€ \t\t Doble-doble = 70€ \t Estudio = 120€");
				System.out.println();
				obj.pedirDatos(indice);
			}
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------");
			System.out.println(obj.getHotel()[indice].toString() + obj.precioHabitacion(indice) + "€ \n" + // Muestro la factura correspondiente
								"El importe de la factura es: " + obj.precioFinal(indice) + "€");
			System.out.println("-----------------------------------------------------------------------------------");
			System.out.println();                                                                                 
			indice++;
			numHabitacion++;
		}
		System.out.println("FIN PROGRAMA");
		in.close();
	}
}

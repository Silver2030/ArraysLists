package hotel;

import java.util.Scanner;

public class ArrayHotel {
	private Hotel[] hotel = new Hotel[20];

	public ArrayHotel() {
		super();
	}

	public ArrayHotel(Hotel[] hotel) {
		super();
		this.hotel = hotel;
	}
	
	public void inicializar(int num) {
		for(int i = 0; i < num; i++) { // Inicializo con datos base el array
			this.hotel[i] = new Hotel(0, "", 0, "");
		}
	}
	
	public void numHabitacion(int indice, int numHab) {
		this.hotel[indice].setNumHabitación(numHab); // Seteo el valor de "numHabitacion"
	}
	
	public void pedirDatos(int indice) {
		Scanner in = new Scanner(System.in);
		// Solicito los datos de los atributos y los seteo
		System.out.print("Introduce el tipo de habitación que deseas: ");
		this.hotel[indice].setTipoHabitacion(in.nextLine().toUpperCase());
		
		System.out.print("Introduce nombre y apellido: ");
		this.hotel[indice].setNombre(in.nextLine());
		
		System.out.print("Introduce la duración de la estancia: ");
		this.hotel[indice].setDiasEstancia(in.nextInt());
		
	}
	
	public int precioHabitacion(int indice){
		String[] habs = {"INDIVIDUAL", "DOBLE", "TRIPLE", "QUAD", "QUEEN", "KING", "TWIN", "DOBLE-DOBLE", "ESTUDIO"};
		int[] preciosHabs = {60, 90, 110, 120, 70, 80, 90, 70, 120};
		int precioHab = 0; 							// Valido que el tipo de habitacion valide con uno de los del array "habs" y
		for(int i = 0; i < habs.length; i++) {		// devuelvo el valor de "preciosHabs" que comparte posicion
			if(habs[i].equals(this.hotel[indice].getTipoHabitacion())) precioHab = preciosHabs[i];
		}
		return precioHab;
	}
	
	public int precioFinal(int indice) {
		int precioFinal = 0;
		// Invoco el valor de "diasEstancia" y lo multiplico por lo que devuelva el metodo "precioHabitacion"
		precioFinal = this.hotel[indice].getDiasEstancia() * precioHabitacion(indice);
		
		return precioFinal;
	}

	public Hotel[] getHotel() {
		return hotel;
	}

	public void setHotel(Hotel[] hotel) {
		this.hotel = hotel;
	}			
}

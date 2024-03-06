package coche;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayCoches {
	
	private ArrayList<Coche> cocheArrayList = new ArrayList<Coche>();

	public ArrayCoches() {
		super();
	}

	public ArrayCoches(ArrayList<Coche> cocheArrayList) {
		super();
		this.cocheArrayList = cocheArrayList;
	}
	
	public void cargarDatos() {
		Coche coche1 = new Coche("9876GKM", "RENAULT", "MEGANE", 0);
		Coche coche2 = new Coche("1685BGT", "AUDI", "A3", 18000);
		Coche coche3 = new Coche("2709CXF", "AUDI", "A4", 5000);
		Coche coche4 = new Coche("1234BB", "AUDI", "A3", 44500);
		
		this.cocheArrayList.add(coche1);
		this.cocheArrayList.add(coche2);
		this.cocheArrayList.add(coche3);
		this.cocheArrayList.add(coche4);
	}
	
	public void mostrarDatos() {
		for(Coche cadena : this.cocheArrayList) {
			System.out.println(cadena.toString());
			System.out.println();
		}
	}
	
	public void marcaCoche() {
		Scanner in = new Scanner(System.in);
		String marca = "";
		
		System.out.print("Introduce la marca a buscar: ");
		marca = in.nextLine().toUpperCase();
		System.out.println();
		buscarMarca(marca);
	}
	
	public void buscarMarca(String marca) {
		boolean resultado = false;
		for(Coche cadena : this.cocheArrayList) {
			if(marca.equals(cadena.getMarca())) {
				System.out.println(cadena.toString());
				System.out.println();
				resultado = true;
			}
		}
		if(resultado == false) System.out.println("No se ha encontrado ning�n coche con esa marca.");
	}
	
	public void kmCoche(){
		Scanner in = new Scanner(System.in);
		Integer km = 0;
		
		System.out.print("Introduce el l�mite de km: ");
		km = in.nextInt();
		System.out.println();
		cochesKm(km);
	}
	
	public void cochesKm(int km) {
		for(Coche cadena : this.cocheArrayList) {
			if(km >= cadena.getKm()) {
				System.out.println(cadena.toString());
				System.out.println();
			}
		}
	}
	
	public void maxKm() {
		Coche valorMax = new Coche();
		valorMax = this.cocheArrayList.stream().max(Comparator.comparing(v -> v.getKm())).get();
		System.out.println(valorMax);
		System.out.println();
	}
	
	public void ordenCoches() {
		Collections.sort(this.cocheArrayList, (o1, o2) -> Integer.valueOf(o1.getKm()).compareTo(Integer.valueOf(o2.getKm())));
		mostrarDatos();
	}

	public ArrayList<Coche> getCocheArrayList() {
		return cocheArrayList;
	}

	public void setCocheArrayList(ArrayList<Coche> cocheArrayList) {
		this.cocheArrayList = cocheArrayList;
	}

}

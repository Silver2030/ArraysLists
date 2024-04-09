package muebles;

import java.util.Scanner;

public class Mesa extends Mueble {
	public Integer numPatas;
	
	public Mesa() {
		super();
	}
	
	public Mesa(String idProducto, Double precio, Integer stock) {
		super(idProducto, precio, stock);
		this.numPatas = 4;
	}
	
	public Mesa(String idProducto, String material, Double precio, Integer stock) {
		super(idProducto, material, precio, stock);
		this.numPatas = 4;
	}
	
	public Mesa pedirDatos(String idProducto) {
		Scanner in = new Scanner(System.in);
		Mesa mesaNueva = new Mesa();
		
		mesaNueva.setIdProducto(idProducto);
		System.out.print("Material de la mesa: ");
		mesaNueva.setMaterial(in.nextLine());
		System.out.println();
		System.out.print("Precio de la mesa: ");
		mesaNueva.setPrecio(in.nextDouble());
		System.out.println();
		System.out.print("Stock de la mesa: ");
		mesaNueva.setStock(in.nextInt());
		System.out.println();
		mesaNueva.setNumPatas(4);
		
		return mesaNueva;
	}
	
	public Integer getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(Integer numPatas) {
		this.numPatas = numPatas;
	}

	@Override
	public String toString() {
		return 	super.toString() + "\n" +
				"Numero de Patas: " + this.numPatas; 
	}

}

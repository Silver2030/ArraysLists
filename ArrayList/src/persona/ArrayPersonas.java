package persona;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayPersonas {

	private ArrayList<Persona> personaArraylist = new ArrayList<Persona>();

	public ArrayPersonas() {
		super();
	}

	public ArrayPersonas(ArrayList<Persona> personaArraylist) {
		super();
		this.personaArraylist = personaArraylist;
	}
	
	public void ingresarDatos(){
		Persona perso = pedirDatos();
		
		this.personaArraylist.add(perso);
	}
	
	public Persona pedirDatos(){
		Persona perso = new Persona();
		Scanner in = new Scanner(System.in);
		// Metodo que introduce los datos en un array persona que devuelve
		System.out.print("Introduce el primer nombre: ");
		perso.setPrimerNombre(in.nextLine());
		System.out.print("Introduce el apellido: ");
		perso.setApellido(in.nextLine());
		System.out.print("Introduce el año de nacimiento: ");
		perso.setNacimiento(in.nextInt());
		
		return perso;
	}
	
	public int buscarApellido(String apellido) {
		int indice = -1;
		// Metodo que busca el indice del apellido y devuvelve el indice
		for(int i = 0; i < this.personaArraylist.size(); i++) {
			if(apellido.equals(this.personaArraylist.get(i).getApellido())) indice = i;
		}
		
		return indice;
	}
	
	public void borrarTexto(String apellido) {
		int indice = buscarApellido(apellido); // Compara apellido con arraylist y devuelve indice
		
		if(indice != -1) {
			this.personaArraylist.remove(indice); // En caso de encontrar resultado llama a metodo que borra los datos del indice
			System.out.println("Datos borrados exitosamente.");
		}
		else System.out.println("Apellido introducido erroneo, por favor vuelta a intentarlo.");
	}
	
	public void modificar(String apellido) {
		int indice = buscarApellido(apellido); // Compara apellido con arraylist y devuelve indice
		
		if(indice != -1) modificarDatos(indice); // En caso de encontrar resultado llama a metodo que permite modificar datos
		else System.out.println("Apellido introducido erroneo, por favor vuelta a intentarlo.");
	}
	
	public void modificarDatos(int indice) {
		Persona perso = pedirDatos(); // Crea array con datos nuevos
		
		this.personaArraylist.set(indice, perso); // Setea los datos nuevo en el indice
	}
	
	public void mostrarDatos() {
		
		for(int i = 0; i < this.personaArraylist.size(); i++) { // Muestra todo el arraylist
			System.out.println(this.personaArraylist.toString());
			System.out.println();
		}
	}
	
	public void mostrarDato(String apellido) {
		int indice = buscarApellido(apellido); // Compara apellido con arraylist y devuelve indice
		
		System.out.println(this.personaArraylist.get(indice).toString()); // Muestra el indice correspondiente
	}

}

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
	
	public void generarDatos() {
		Persona persona1 = new Persona("John", "Wayne", 1907);
		Persona persona2 = new Persona("Steve", "McQueen", 1930);
		Persona persona3 = new Persona("John", "Lennon", 1940);
		Persona persona4 = new Persona("Mel", "Gibson", 1956);
		Persona persona5 = new Persona("Bruce", "Willis", 1955);
		
		this.personaArraylist.add(persona1);
		this.personaArraylist.add(persona2);
		this.personaArraylist.add(persona3);
		this.personaArraylist.add(persona4);
		this.personaArraylist.add(persona5);
	}
	
	public void ingresarDatos(){
		Persona perso = pedirDatos();
		
		this.personaArraylist.add(perso);
	}
	
	public Persona pedirDatos(){
		Persona persona = new Persona();
		Scanner in = new Scanner(System.in);
		// Metodo que introduce los datos en un array persona que devuelve
		System.out.print("Introduce el primer nombre: ");
		persona.setPrimerNombre(in.nextLine());
		System.out.print("Introduce el apellido: ");
		persona.setApellido(in.nextLine());
		System.out.print("Introduce el a�o del nacimiento: ");
		persona.setNacimiento(in.nextInt());
		
		return persona;
	}
	
	public void borrarInterfaz(String buscarApellido) {
		boolean encontrado = borrarBuscar(buscarApellido);
		
		if(encontrado == false) {
			System.out.println("Apellido introducido erroneo, por favor vuelta a intentarlo.");
			System.out.println();
		}
	}
	
	public boolean borrarBuscar(String buscarApellido) {
		boolean encontrado = false;
		Persona apellido;
		Iterator <Persona> persona = this.personaArraylist.iterator();
		while(persona.hasNext()) {
			apellido = persona.next();
			if(apellido.getApellido().toUpperCase().contains(buscarApellido.toUpperCase())) {
				persona.remove();
				encontrado = true;
			}
		}
		return encontrado;
	}
	
	public void modificarInterfaz(String buscarApellido) {
		boolean encontrado = modificarBuscar(buscarApellido);
		
		if(encontrado == false) {
			System.out.println("Apellido introducido erroneo, por favor vuelta a intentarlo.");
			System.out.println();
		}
	}
	
	public boolean modificarBuscar(String buscarApellido) {
		boolean encontrado = false;
		Persona apellido;
		Iterator <Persona> persona = this.personaArraylist.iterator();
		while(persona.hasNext()) {
			apellido = persona.next();
			if(apellido.getApellido().toUpperCase().contains(buscarApellido.toUpperCase())) {
				Persona nuevosDatos = pedirDatos();
				apellido.setPrimerNombre(nuevosDatos.getPrimerNombre());
				apellido.setApellido(nuevosDatos.getApellido());
				apellido.setNacimiento(nuevosDatos.getNacimiento());
				encontrado = true;
			}
		}
		return encontrado;
	}
	
	public void mostrarDatos() {
		
		for(Persona persona : this.personaArraylist) { // Muestra todo el arraylist
			System.out.println(persona.toString());
			System.out.println();
		}
	}
	
	public void mostrarDatoInterfaz(String buscarApellido) {
		boolean encontrado = mostrarDatoBuscar(buscarApellido); 
		
		if(encontrado == false) {
			System.out.println("Apellido introducido erroneo, por favor vuelta a intentarlo.");
			System.out.println();
		}
	}
	
	public boolean mostrarDatoBuscar(String buscarApellido) {
		boolean encontrado = false;
		for(Persona persona : this.personaArraylist) { // Muestra todo el arraylist
			if(persona.getApellido().toUpperCase().equals(buscarApellido.toUpperCase())) {
				System.out.println(persona.toString());
				System.out.println();
				encontrado = true;
			}
		}
		return encontrado;
	}

}

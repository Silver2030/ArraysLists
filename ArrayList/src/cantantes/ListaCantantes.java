package cantantes;

import java.util.ArrayList;
import java.util.Scanner;

import persona.Persona;

public class ListaCantantes {
	
	private ArrayList<Cantante> cantanteLista = new ArrayList<Cantante>();

	public ListaCantantes() {
		super();
	}

	public void cargarDatos() { // Genero y cargo datos en el arraylist
		Cantante cantante1 = new Cantante("M1", "Madonna", 1999, "All I want is you", 2000000);
		Cantante cantante2 = new Cantante("J3", "Jorge Negrete", 1970, "Jalisco", 200000);
		Cantante cantante3 = new Cantante("MJ1", "Michael Jackson", 2000, "Thriller", 3000000);
		Cantante cantante4 = new Cantante("E22", "Elvis Presley", 1956, "Hound Dog", 1000000);
		
		this.cantanteLista.add(cantante1);
		this.cantanteLista.add(cantante2);
		this.cantanteLista.add(cantante3);
		this.cantanteLista.add(cantante4);
	}
	
	public boolean ingresarDatos(String id){ // Ingreso el objeto creado al array o de exitir el codigo ya introducido informo de ello
		Scanner in = new Scanner(System.in);
		boolean encontrado = buscarCodigo(id), seguir = false;
		char resp = 'a';
		
		if(encontrado == false) {
			Cantante cantante = pedirDatos(id);
			this.cantanteLista.add(cantante);
			System.out.println();
			System.out.print("¿Desea añadir más cantantes? (S/N): ");
			resp = Character.toUpperCase(in.next().charAt(0));
			System.out.println();
			while((resp != 'N')&&(resp != 'S')) {
				System.out.print("Respuesta invalida, ¿Desea añadir más cantantes? (S/N): ");
				resp = Character.toUpperCase(in.next().charAt(0));
			}
			if(resp == 'S') seguir = true;
		}else {
			System.out.print("El codigo introducido ya se encuentra registrado.");
			System.out.println();
		}
		return seguir;
	}
	
	public Cantante pedirDatos(String id){ // Creo objeto y pido datos
		Cantante cantante = new Cantante();
		Scanner in = new Scanner(System.in);
		// Metodo que introduce los datos en un array persona que devuelve
		cantante.setId(id);
		System.out.print("Nombre del cantante: ");
		cantante.setNombre(in.nextLine());
		System.out.print("Introduce año del disco: ");
		cantante.setFecha(in.nextInt());
		in.nextLine();
		System.out.print("Introduce nombre del disco: ");
		cantante.setDiscoVendido(in.nextLine());
		System.out.print("Introduce ventas del disco: ");
		cantante.setVentas(in.nextInt());
		
		return cantante;
	}
	
	public boolean buscarCodigo(String id) { // Busco el codigo introducido en el arraylist por si ya existe
		boolean encontrado = false;
		
		for(Cantante cantante : this.cantanteLista) {
			if(cantante.getId().equals(id)) encontrado = true;
		}
		
		return encontrado;
	}
	
	public void mostrarDatos(){ // Muestro todos los datos del cantante/disco
		String certificado;
		for(Cantante cantante : this.cantanteLista) {
			certificado = buscarCertificado(cantante);
			System.out.println(cantante.toString() + certificado);
			System.out.println();
		}
	}
	
	public String buscarCertificado(Cantante cantante) { // En base a las ventas del disco devuelvo la certificacion que le corresponde
		String certificado = "";
		int[] rangos = {10000, 20000, 40000, 1000000, 5000000};
		String[] certificados = {"Disco de Plata", "Disco de Oro", "Disco de Platino", "Disco de Diamante", "Disco de Uranio"};
		for(int i = 0; i < rangos.length; i++) {
			if(cantante.getVentas() >= rangos[i]) certificado = certificados[i];
		}
		return certificado;
	}
	
	public void masVendido() { // Muestro los datos del disco más vendido y su cantante
		Cantante mejorDisco = masVendidoBuscar();
		
		System.out.println("Disco más vendido de todos los tiempos");
		System.out.println();
		System.out.println("Nombre del Disco: " + mejorDisco.getDiscoVendido());
		System.out.println("Cantante: " + mejorDisco.getNombre());
		System.out.println("Ventas: " + mejorDisco.getVentas());
		System.out.println();
	}
	
	public Cantante masVendidoBuscar() { // Busco el objeto con más ventas dentro del arraylist y lo devuelvo
		Cantante mejorDisco = new Cantante("", "", 0, "", -1);
		
		for(Cantante cantante : this.cantanteLista) {
			if(mejorDisco.getVentas() < cantante.getVentas()) mejorDisco = cantante;
		}
		
		return mejorDisco;
	}
	
	public ListaCantantes(ArrayList<Cantante> cantanteLista) {
		super();
		this.cantanteLista = cantanteLista;
	}

	public ArrayList<Cantante> getCantanteLista() {
		return cantanteLista;
	}

	public void setCantanteLista(ArrayList<Cantante> cantanteLista) {
		this.cantanteLista = cantanteLista;
	}
	
}

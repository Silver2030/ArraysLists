package proyectoDistancia;

import java.util.Scanner;

public class Profesor extends Persona {
	public String departamento;
	public int NRP;
	
	public Profesor() {
		super();
	}

	public Profesor(String nombre, String apellidos, int fechaNacimiento) {
		super(nombre, apellidos, fechaNacimiento);
		this.departamento = "Unknown";
		this.NRP = 0;
	}
	
	public Profesor(String nombre, String apellidos, int fechaNacimiento, String departamento, int nRP) {
		super(nombre, apellidos, fechaNacimiento);
		this.departamento = departamento;
		this.NRP = nRP;
	}
	
	public void pedirDatos() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("INTRODUCIR DATOS DOCENTE");
		System.out.print("Introduce el nombre: ");
		setNombre(in.nextLine());
		System.out.print("Introduce los apellidos: ");
		setApellidos(in.nextLine());
		System.out.print("Introduce la fecha de nacimiento: ");
		setFechaNacimiento(in.nextInt());
		in.nextLine();
		System.out.print("Introduce el departamento: ");
		setDepartamento(in.nextLine());
		System.out.print("Introduce el NRP: ");
		setNRP(in.nextInt());
		System.out.println();
	}

	public void datosProfesores() {
		System.out.println("DATOS DOCENTE");
		System.out.println();
		System.out.println("Departamento: " + this.departamento);
		System.out.println("NRP: " + this.NRP);
		System.out.println("--------------------------------------------");
		System.out.println();
	}
	
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public int getNRP() {
		return NRP;
	}
	public void setNRP(int nRP) {
		NRP = nRP;
	}
	
}
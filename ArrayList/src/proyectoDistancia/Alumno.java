package proyectoDistancia;

import java.util.Scanner;

public class Alumno extends Persona{
	protected String grupo;
	protected String horario;
	
	public Alumno() {
		super();
	}

	public Alumno(String nombre, String apellidos, int fechaNacimiento) {
		super(nombre, apellidos, fechaNacimiento);
		this.grupo = "Unknown";
		this.horario = "Unknown";
	}
	
	public Alumno(String nombre, String apellidos, int fechaNacimiento, String grupo, String horario) {
		super(nombre, apellidos, fechaNacimiento);
		this.grupo = grupo;
		this.horario = horario;
	}
	
	public void pedirDatos() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Introduce el nombre: ");
		setNombre(in.nextLine());
		System.out.print("Introduce los apellidos: ");
		setApellidos(in.nextLine());
		System.out.print("Introduce la fecha de nacimiento: ");
		setFechaNacimiento(in.nextInt());
		in.nextLine();
		System.out.print("Introduce el grupo: ");
		setGrupo(in.nextLine());
		System.out.print("Introduce el horario: ");
		setHorario(in.nextLine());
		System.out.println();
	}

	public void grupo_turno() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("INTRODUCIR DATOS ALUMNO");
		System.out.print("Introduce el grupo: ");
		setGrupo(in.nextLine());
		System.out.print("Introduce el horario: ");
		setHorario(in.nextLine());
		System.out.println();
	}
	
	public void datosAlumnos() {
		System.out.println("DATOS ALUMNO");
		System.out.println();
		System.out.println("Grupo: " + this.grupo);
		System.out.println("Horario: " + this.horario);
		System.out.println("--------------------------------------------");
		System.out.println();
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
	
}
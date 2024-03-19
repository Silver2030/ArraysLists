package proyectoDistancia;

public class Curso1 {

	public static void main(String[] args) {
		Alumno alum1 = new Alumno("Marcos", "Madera Suarez", 2003);
		Alumno alum2 = new Alumno("Pepito", "Álvarez Pérez", 1975, "Distancia", "Tarde");
		Profesor prof1 = new Profesor("Santos", "Garcia Menendez", 1983, "Filosofia", 9313);
		Profesor prof2 = new Profesor("Sandra", "Rodriguez Riesgo", 1985, "Matematicas", 31194);
		
		alum1.grupo_turno();
		alum1.imprime();
		alum1.datosAlumnos();
		alum2.imprime();
		alum2.datosAlumnos();
		prof1.imprime();
		prof1.datosProfesores();
		prof2.imprime();
		prof2.datosProfesores();
		
	}
}

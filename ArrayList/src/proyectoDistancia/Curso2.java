package proyectoDistancia;

public class Curso2 {

	public static void main(String[] args) {
		Alumno alum1 = new Alumno();
		Profesor prof1 = new Profesor();
		
		alum1.pedirDatos();
		alum1.imprime();
		alum1.datosAlumnos();

		prof1.pedirDatos();
		prof1.imprime();
		prof1.datosProfesores();
		
	}
}

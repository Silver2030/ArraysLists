package notas;

import java.io.Serializable;

public class Alumno implements Serializable {
	public String nombre;
	public float nota1;
	public float nota2;
	public float nota3;
	
	public Alumno() {
		super();
	}

	public Alumno(String nombre, float nota1, float nota2, float nota3) {
		super();
		this.nombre = nombre;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getNota1() {
		return nota1;
	}

	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}

	public float getNota2() {
		return nota2;
	}

	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}

	public float getNota3() {
		return nota3;
	}

	public void setNota3(float nota3) {
		this.nota3 = nota3;
	}

	@Override
	public String toString() {
		return 	"Nombre: " + this.nombre + "\n" +
				"Nota 1: " + this.nota1 + "\n" +
				"Nota 2: " + this.nota2 + "\n" +
				"Nota 3: " + this.nota3;
	}
	
}
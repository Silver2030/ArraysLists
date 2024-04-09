package notas;

import java.io.Serializable;

public class AlumnoNotaMedia implements Serializable {
	public String nombre;
	public float notaMedia;
	
	public AlumnoNotaMedia() {
		super();
	}

	public AlumnoNotaMedia(String nombre, float notaMedia) {
		super();
		this.nombre = nombre;
		this.notaMedia = notaMedia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(float notaMedia) {
		this.notaMedia = notaMedia;
	}
	
	@Override
	public String toString() {
		return 	"Nombre: " + this.nombre + "\n" +
				"Nota Media: " + this.notaMedia;
	}
}

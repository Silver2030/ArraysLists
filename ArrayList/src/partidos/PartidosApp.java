package partidos;

public class PartidosApp {

	public static void main(String[] args) {
		ArrayPartidos obj = new ArrayPartidos();
		
		obj.cargarDatos();
		obj.visualizarDatos();
		obj.ganadores();
		obj.empates();
		obj.clasificacion();

	}

}

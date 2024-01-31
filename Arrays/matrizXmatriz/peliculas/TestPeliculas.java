package peliculas;

import java.util.Scanner;

public class TestPeliculas {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Pelicula obj = new Pelicula();
		Pelicula pl1, pl2, pl3, pl4, pl5, pl6;
		pl1 = new Pelicula (333, "Dunkerque", "Syncopy", 2017, 2000000);
		pl2 = new Pelicula (213, "It", "Warner Bros", 2017, 1000000);
		pl3 = new Pelicula (111, "Star Wars: Episodio VIII", "Walt Disney Studios", 2017, 4000000);
		pl4 = new Pelicula (564, "Déjame salir", "Blumhouse", 2017, 500000);
		pl5 = new Pelicula (987, "Coco", "Walt Disney Studios", 2017, 2000000);
		pl6 = new Pelicula (444, "Logan", "20th Century Fox", 2017, 500000);
		char resp = 'A';
		
		
		System.out.println("A: Modificar datos Pelicula");
		System.out.println("B: Borrar pelicula");
		System.out.print("Que desea realizar: ");
		resp = Character.toUpperCase(in.next().charAt(0));
		while((resp != 'A')&&(resp != 'B')) {
			System.out.println("A: Modificar datos Pelicula");
			System.out.println("B: Borrar pelicula");
			System.out.print("Respuesta introducida erronea, que desea realizar: ");
		}
		if(resp == 'A') {
			
		}else {
			
		}
	}

}

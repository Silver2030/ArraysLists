package exception1;

import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] num = {"Hola", "Adios", null};
		int resp = 0;
		
		do {
			try {
				System.out.print("Posicion: ");
				resp = in.nextInt();
				System.out.println(num[resp]);
			}catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println();
				System.out.println("Error: " + ex.getMessage());
				System.out.println();
			}catch (ArithmeticException ex) {
				System.out.println();
				System.out.println("Error: " + ex.getMessage());
				System.out.println();
			}finally {
				main(args);
			}
		}while(resp != 10);

	}

}

package _02Ejemplos;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class _13BloqueFinally {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintStream f = null;
		try {
			// Crear fichero
			f = new PrintStream("resultados.txt");

			// Escribir en el fichero
			for (int i = 0; i <= 5; i++) {
				System.out.println("Dividendo: ");
				int dividendo = sc.nextInt();
				System.out.println("Divisor: ");
				int divisor = sc.nextInt();

				int cociente = dividendo / divisor;
				f.println(cociente);
			}
		} catch (FileNotFoundException e) {
			System.out.println("No se ha podido crear el fichero");
		} catch (InputMismatchException e) {
			System.out.println("No se ha podido crear el fichero");
		} finally {
			f.close();
		}

	}
}

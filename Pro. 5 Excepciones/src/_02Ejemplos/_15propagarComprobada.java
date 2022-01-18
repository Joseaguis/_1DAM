package _02Ejemplos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _15propagarComprobada {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombreFichero = "";
		do {
			try {
				System.out.println("Nombre de fichero");
				nombreFichero = sc.nextLine();
				if (!nombreFichero.equals("")) {
					System.out.println("Vamos a sumar los numeros de \"" + nombreFichero + "\"");
					int suma = sumaFichero(nombreFichero);
					System.out.println("Suma: " + suma);
					
				} else {
					System.out.println("Fin del programa");
				}
			} catch (FileNotFoundException e) {
				System.out.println("No se ha podido abrir el fichero");
			} finally {

			}

		} while (!nombreFichero.equals(""));

	}

	public static int sumaFichero(String nombreFichero) throws FileNotFoundException {
		Scanner f = null;
		int suma = 0;
		try {
			f = new Scanner(new File(nombreFichero));
			while (f.hasNextInt()) {
				int numero = f.nextInt();
				suma += numero;
			}
		} finally {
			if (f != null)
				f.close();
		}
		return suma;
	}
}

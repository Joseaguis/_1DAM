package _03Ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;

public class _06ContarPalabras {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner read = null;
		Map<String, Integer> m = new LinkedHashMap<String, Integer>();

		try {
			String texto = sc.nextLine();
			File doc = new File("src/_03Ejercicios/" + texto);
			read = new Scanner(doc);
			String frase = read.nextLine();

			// Descomponer frase en palabras
			String[] palabras = frase.split(" ");
			System.out.println(Arrays.toString(palabras));

			for (int i = 0; i < palabras.length; i++) {
				Integer veces = m.get(palabras[i]);
				if (veces == null) {
					// Es la primera vez que aparece
					m.put(palabras[i], 1);
				} else {
					// La palabra ha aparecido "varias" veces anteriormente
					m.put(palabras[i], veces + 1);
				}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			read.close();
			sc.close();
		}

		System.out.println(m.toString());
	}
}

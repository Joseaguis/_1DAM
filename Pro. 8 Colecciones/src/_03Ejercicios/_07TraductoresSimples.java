package _03Ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _07TraductoresSimples {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner read = null;
		Map<String, String> diccionario = new LinkedHashMap<String, String>();
		
		try {
			// Busqueda del archivo
			File doc = new File("src/_03Ejercicios/palabras.txt");
			read = new Scanner(doc);
			
			// Lectura del txt
			do {
				String text1 = read.next();
				String text2 = read.next();
				diccionario.put(text1, text2);	
			} while (read.hasNext());
			
			// Preguntar
			boolean seguir = false;
			do {
				System.out.println("Introduce una palabra o frase, 0 para salir");
				String text = sc.nextLine();
				if (text.equals("0")) {
					seguir = true;
				} else {
					String traduccion = traducir(diccionario, text);
					System.out.println(traduccion);
				}
			} while (!seguir);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			sc.close();
			read.close();
		}
		
	}
	public static String traducir(Map<String, String> m, String text) {
		String[] palabras = text.split(" ");
		String traduccion = "";
		for (int i = 0; i < palabras.length; i++) {
			traduccion += m.get(palabras[i]) + " ";
		}
		return traduccion;
	}
}

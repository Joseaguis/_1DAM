package _02Ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class _01Colecciones {
	public static void main(String[] args) {
		ArrayList<String> letras = new ArrayList<>();
		letras.add("a");
		letras.add("b");
		letras.add("c");
		letras.add("d");
		letras.add("e");
		letras.add("f");
		
		ArrayList<String> vocales = new ArrayList<>(Arrays.asList(new String[] {"a", "e", "i", "o", "u"}));
		
		LinkedList<String> consonantes = new LinkedList<>(Arrays.asList("b", "c", "d", "f"));
		
		System.out.println("Letras: " + letras);
		System.out.println("Vocales: " + vocales);
		System.out.println("Consonantes: " + consonantes);
		
		System.out.println("Letras contiene todas las vocales: " + letras.containsAll(vocales));
		System.out.println("Letras contiene todas las consonantes: " + letras.containsAll(consonantes));
		
		// Letras y vocales con duplicados
		ArrayList<String> letrasYVocales = new ArrayList<>();
		letrasYVocales.addAll(letras);
		letrasYVocales.addAll(vocales);
		System.out.println("Letras y vocales" + letrasYVocales);
		
		// Letras y vocales sin duplicados
		TreeSet<String> letrasYVocales2 = new TreeSet<>();
		letrasYVocales2.addAll(letras);
		letrasYVocales2.addAll(vocales);
		System.out.println("Letras y vocales" + letrasYVocales2);
		
		//Crear una coleccion a partir de un aray
		// Arayy --> asList --> constructor de la coleccion
		String [] nombres = {"pepe", "luis", "ana"};
		List<String> l = Arrays.asList(nombres);
		TreeSet<String> conjuntoNombres = new TreeSet<>(l);
		
		
	}
}

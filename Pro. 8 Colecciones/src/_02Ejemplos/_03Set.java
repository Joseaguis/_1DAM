package _02Ejemplos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _03Set {
	public static void main(String[] args) {
		
		TreeSet<Integer> s1 = new TreeSet<Integer>(Arrays.asList(20, 200, 1, 7, 7, 12, 3));
		// Observa como en el contenido no hay duplicados
		System.out.println(s1);
		
		// Los metodos que modifican, nos devuelven si la coleccion ha cambiado
		boolean haCambiado = s1.add(300);
		System.out.println(haCambiado);
		System.out.println(s1);
		
		haCambiado = s1.add(20);
		System.out.println(haCambiado);
		System.out.println(s1);
		
		// HashSet: Desordenado
		HashSet<Integer> s2 = new HashSet<>(Arrays.asList(20, 200, 1, 7, 7, 12, 3));
		System.out.println("HashSet: " + s2);
		
		// LinkedHashSet: Ordenado por introduccion
		LinkedHashSet<Integer> s3 = new LinkedHashSet<>(Arrays.asList(20, 200, 1, 7, 7, 12, 3));
		System.out.println("LinkedHashSet: " + s3);
		
	}
}

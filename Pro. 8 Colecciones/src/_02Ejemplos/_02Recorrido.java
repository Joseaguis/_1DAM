package _02Ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class _02Recorrido {
	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<>(Arrays.asList("casa", "perro", "asa"));
		TreeSet<String> t = new TreeSet<>(Arrays.asList("casa", "perro", "asa"));
		
		// Con foreach
		for (String s : l) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		// Con iterator
		Iterator<String> it = t.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.print(s + " ");
		}
		System.out.println();
		
		//Eliminar de t los elementos de 4 letras
		Iterator<String> it2 = l.iterator();
		while (it2.hasNext()) {
			String s = (String) it2.next();
			if (s.length() == 4) {
				it2.remove();
			}
		}
		
		
		
		
	}
}
package _02Ejemplos;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.TreeSet;

public class _04TestVelocidadSet {
	public static void main(String[] args) {
		final int ELEMENTOS = 200_000;
		Random r = new Random();
		LinkedList<Integer> l = new LinkedList<>();
		
		while (l.size() < ELEMENTOS) {
			int elemento = r.nextInt(ELEMENTOS * 100);
			if (!l.contains(elemento)) l.add(elemento);
		}
		
		TreeSet<Integer> ts = new TreeSet<Integer>(l);
		HashSet<Integer> hs = new HashSet<Integer>(l);
		
		// Vamos a buscar muchas veces algo que no esta y a ver cuanto tarda
		final int BUSQUEDAS = 100_000;
		int numeroBuscado = (ELEMENTOS * 100);
		
		long t1, t2;
		
		//ArrayList
		
//		System.out.println("Midiendo Lista...");
//		t1 = System.currentTimeMillis();
//		for (int i = 0; i < BUSQUEDAS; i++) {
//			if (l.contains(numeroBuscado)) {
//				System.out.println("Encontrado!!");
//			}
//		}
//		t2 = System.currentTimeMillis();
//		System.out.println("Lista: " + (t2 - t1));
		
		// TreeSet
		
		System.out.println("Midiendo TreeSet...");
		t1 = System.currentTimeMillis();
		for (int i = 0; i < BUSQUEDAS; i++) {
			if (ts.contains(numeroBuscado)) {
				System.out.println("Encontrado!!");
			}
		}
		t2 = System.currentTimeMillis();
		System.out.println("Lista: " + (t2 - t1));
		
		// HashSet
		
		System.out.println("Midiendo HashSet...");
		t1 = System.currentTimeMillis();
		for (int i = 0; i < BUSQUEDAS; i++) {
			if (hs.contains(numeroBuscado)) {
				System.out.println("Encontrado!!");
			}
		}
		t2 = System.currentTimeMillis();
		System.out.println("Lista: " + (t2 - t1));
		
		/*
		 * Una tabla Hash es una estructura en la que los elementos se almacenan
		 * en un array la posición que correspinde a un elemento dentro del array, se calcula
		 * a partir del dato que identifica al elemento
		 */
		
		
	}
}


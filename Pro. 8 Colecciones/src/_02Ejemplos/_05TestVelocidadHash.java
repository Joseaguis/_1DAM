package _02Ejemplos;

import java.util.HashSet;

public class _05TestVelocidadHash {
	public static void main(String[] args) {
		long t1, t2;
		final int ELEMENTOS = 100_000;
		
		HashSet<Integer> hs1 = new HashSet<>();
		t1 = System.currentTimeMillis();
		
		for (int i = 0; i < ELEMENTOS; i++) {
			hs1.add(i);
		}
		
		t2 = System.currentTimeMillis();
		System.out.println("Tiempo: " + (t2 - t1));
		
		HashSet<Entero> hs2 = new HashSet<>();
		t1 = System.currentTimeMillis();
		
		for (int i = 0; i < ELEMENTOS; i++) {
			hs2.add(new Entero(i));
		}
		
		t2 = System.currentTimeMillis();
		System.out.println("Tiempo: " + (t2 - t1));
	}
}




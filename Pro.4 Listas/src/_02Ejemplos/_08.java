package _02Ejemplos;

import java.util.LinkedList;

public class _08 {
	final static int INSERCIONES = 10_000;

	public static void main(String[] args) {

		System.out.println("Al final: " + insetarAlFinal());
		System.out.println("Al Principio: " + insetarAlPrincipio());

	}

	public static long insetarAlFinal() {
		LinkedList<Integer> l = new LinkedList<>();

		long t1 = System.currentTimeMillis();
		for (int i = 0; i < INSERCIONES; i++) {
			l.add(i);
		}
		long t2 = System.currentTimeMillis();
		return t2 - t1;
	}

	public static long insetarAlPrincipio() {
		LinkedList<Integer> l = new LinkedList<>();

		long t1 = System.currentTimeMillis();
		for (int i = 0; i < INSERCIONES; i++) {
			l.add(0, i);
		}
		long t2 = System.currentTimeMillis();
		return t2 - t1;
	}
	
}

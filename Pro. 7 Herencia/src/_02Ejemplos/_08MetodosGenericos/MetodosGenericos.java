package _02Ejemplos._08MetodosGenericos;

import _02Ejemplos._02Animales.Perro;
import _02Ejemplos._03Tiempo.Tiempo;

public class MetodosGenericos {

	public static void main(String[] args) {
		String v[] = { "a", "b", "a", "d", "e", "e", "a", "a" };
		System.out.println(contarVeces(v, "e"));
		System.out.println(MetodosGenericos.<String>contarVeces(v, "e"));
		System.out.println("-------------------");
		System.out.println(mayor(new Integer(5), new Integer(2)));
		System.out.println(mayor("aa", "aaa"));
		System.out.println(mayor(new Tiempo(1, 2, 3), new Tiempo(5, 6, 8)));
		
		// Si intentamos averiguar l mayor de dos perros
//		System.out.println(mayor(new Perro(), new Perro()));
	}

	// Devolver cuantas veces esta x en v
	public static int contarVeces(int[] v, int x) {
		int cont = 0;
		for (int i = 0; i < v.length; i++) {
			if (v[i] == x)
				cont++;
		}
		return cont;
	}

	public static int contarVeces(double[] v, int x) {
		int cont = 0;
		for (int i = 0; i < v.length; i++) {
			if (v[i] == x)
				cont++;
		}
		return cont;
	}

	// Devolver cuantas veces esta x en el array de Object x NUEVO
	public static <T> int contarVeces(T[] v, T x) {
		int cont = 0;
		for (int i = 0; i < v.length; i++) {
			if (v[i].equals(x))
				cont++;
		}
		return cont;
	}

	// Devolver el mayor de dos double
	public static int mayor(int a, int b) {
		if (a > b)
			return a;
		else
			return b;
	}

	// Devolver el mayor de dos double
	public static <T extends Comparable <T>> T mayor(T a, T b) {
		if ((a.compareTo(b) > 0))
			return a;
		else
			return b;
	}
}

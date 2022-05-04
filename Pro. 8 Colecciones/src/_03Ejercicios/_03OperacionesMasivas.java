package _03Ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class _03OperacionesMasivas {
	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3 };
		int[] a2 = { 12, 5, 6, 4, 20 };

		System.out.println(Arrays.toString(QuitarDuplicados(a1)));
		System.out.println(Arrays.toString(Union(a1, a2)));
		System.out.println(Arrays.toString(Interseccion(a1, a2)));
		System.out.println(Arrays.toString(Diferencia(a1, a2)));
	}

	public static int[] QuitarDuplicados(int[] v) {
		LinkedHashSet<Integer> s = new LinkedHashSet<>();
		for (int i = 0; i < v.length; i++) {
			s.add(v[i]);
		}
		// Volcamos el set a un array
		int[] result = new int[s.size()];
		int i = 0;
		for (Integer x : s) {
			result[i] = x;
			i++;
		}
		return result;
	}

	public static int[] Union(int[] v1, int[] v2) {
		LinkedHashSet<Integer> s1 = new LinkedHashSet<>();
		for (int i = 0; i < v1.length; i++) {
			s1.add(v1[i]);
		}

		LinkedHashSet<Integer> s2 = new LinkedHashSet<>();
		for (int i = 0; i < v2.length; i++) {
			s2.add(v2[i]);
		}
		s1.addAll(s2);

		// Volcamos el set a un array
		int[] result = new int[s1.size()];
		int i = 0;
		for (Integer x : s1) {
			result[i] = x;
			i++;
		}
		return result;
	}

	public static int[] Interseccion(int[] v1, int[] v2) {
		LinkedHashSet<Integer> s1 = new LinkedHashSet<>();
		for (int i = 0; i < v1.length; i++) {
			s1.add(v1[i]);
		}

		LinkedHashSet<Integer> s2 = new LinkedHashSet<>();
		for (int i = 0; i < v2.length; i++) {
			s2.add(v2[i]);
		}
		s1.retainAll(s2);

		// Volcamos el set a un array
		int[] result = new int[s1.size()];
		int i = 0;
		for (Integer x : s1) {
			result[i] = x;
			i++;
		}
		return result;
	}

	public static int[] Diferencia(int[] v1, int[] v2) {
		ArrayList<Integer> l1 = new ArrayList<>();
		for (int i = 0; i < v1.length; i++) {
			boolean coinciden = false;
			for (int j = 0; j < v2.length && !coinciden; j++) {
				if (v1[i] == v2[j])
					coinciden = true;
			}
			if (!coinciden)
				l1.add(v1[i]);
		}
		// Volcamos el set a un array
		int[] result = new int[l1.size()];
		int i = 0;
		for (Integer x : l1) {
			result[i] = x;
			i++;
		}
		return result;
	}
}

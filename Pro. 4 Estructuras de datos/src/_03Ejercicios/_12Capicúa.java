package _03Ejercicios;

import java.util.Arrays;

public class _12Capicúa {
	public static void main(String[] args) {

		String[] v = { "jose", "paco", "maria", "paco", "jose" };

		System.out.println(esCapicua(v));
	}

	public static boolean esCapicua(String[] v) {
		boolean esCapicua = true;
		for (int i = 0, j = v.length - 1; i < v.length / 2 && esCapicua; i++, j--) {

			if (v[i].equals(v[j])) {

			} else {
				esCapicua = false;
			}

		}
		return esCapicua;
	}
}

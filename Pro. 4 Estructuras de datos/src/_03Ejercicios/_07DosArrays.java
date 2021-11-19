package _03Ejercicios;

import java.util.Arrays;

public class _07DosArrays {
	public static void main(String[] args) {

		double[] a = { 1, 2, 3, 4, 5, 6 };
		double[] b = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println(a.length);
		System.out.println(b.length);
		System.out.println(Arrays.toString(sumaArrays(a, b)));
	}

	public static double[] sumaArraysIguales(double a[], double b[]) {
		double[] suma = new double[a.length];

		for (int i = 0; i < b.length; i++) {
			suma[i] = a[i] + b[i];
		}
		return suma;
	}

	public static double[] sumaArrays(double a[], double b[]) {
		double[] suma;
		if (a.length > b.length) {
			suma = Arrays.copyOf(a, a.length);
		} else {
			suma = Arrays.copyOf(b, b.length);
		}

		for (int i = 0; i < b.length && i < a.length && i < b.length; i++) {
			suma[i] = a[i] + b[i];
		}
		return suma;
	}
}

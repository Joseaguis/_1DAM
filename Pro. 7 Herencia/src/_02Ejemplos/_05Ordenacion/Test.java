package _02Ejemplos._05Ordenacion;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int[] v1 = { 5, 78, 32, 14, 56, 2, 3, 4, 85, 69, 48 };

		System.out.println(Arrays.toString(v1));
		Ordenacion.ordenar(v1);
		System.out.println(Arrays.toString(v1));

		System.out.println();

		double[] v2 = { 20.5, 12.3, 18.4 };
		System.out.println(Arrays.toString(v2));
		Ordenacion.ordenar(v2);
		System.out.println(Arrays.toString(v2));

		System.out.println();

		String[] v3 = { "casa", "coche", "armario" };
		System.out.println(Arrays.toString(v3));
		Ordenacion.ordenar(v3);
		System.out.println(Arrays.toString(v3));

		Vehiculo[] v4 = { 
				new Vehiculo("45321C", "Seat", "Ibiza"),
				new Vehiculo("78675H", "Volkswagen", "Golf"),
				new Vehiculo("84249Y", "Toyota", "Corolla") };
		System.out.println(Arrays.toString(v4));
		Ordenacion.ordenar(v4);
		System.out.println(Arrays.toString(v4));
	}
}

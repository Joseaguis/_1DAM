package _03Ejercicios;

import java.util.ArrayList;
import java.util.Arrays;

public class _12EjercicioSuma0 {

	/*
	 * Ej 1 Dado un array de int, averiguar entre que posiciones los elementos suman
	 * 0. Recorriendo una sola vez el array
	 */

	public static void main(String[] args) {
		int[] listaInts = { 20, 7, -12, 3, 30, -60, 20, 10, 150, 200, -3 };
		
		ArrayList<Integer> lNum = new ArrayList<>();
		
		boolean encontrado = false;
		int[] entre = new int[2];
		
		for (int i = 0; i < listaInts.length && !encontrado; i++) {
			lNum.add(listaInts[i]);
			
			for (int j = 0, k = 0; j < lNum.size() && !encontrado; j++) {
				int suma = 0;
				k = j;
				
				for (; k < lNum.size() && !encontrado; k++) {
					suma += lNum.get(k);
					if (suma == 0) {
						entre[0] = j;
						entre[1] = lNum.size() - 1;
						encontrado = true;
					}
				}
			}
		}
		
		System.out.println(encontrado);
		System.out.println(Arrays.toString(entre));
	}
}

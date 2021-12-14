package _02Ejemplos;

import java.util.Arrays;

public class _01Matrices {
	public static void main(String[] args) {
		// Crear una matriz enumerando sus elementos
		int[][] m = { {1,3,5,7},{2,4,6,8}};
		
		// Acceso a los elementos de un array
		System.out.println(m[0][0]);
		System.out.println(m[0][1]);
		
		// Imprimir la fila 0
		System.out.println(m[0]);
		System.out.println(Arrays.toString(m));
		System.out.println(Arrays.deepToString(m));
		
		// Recorrido de la matriz fila a fila
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		
		// Recorrido de la matriz columa a columa
		for (int j = 0; j < m[0].length; j++) {
			for (int i = 0; i < m.length; i++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}

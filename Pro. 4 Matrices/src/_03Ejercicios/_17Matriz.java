package _03Ejercicios;

import java.lang.reflect.Array;

public class _17Matriz {
	public static void main(String[] args) {
		int tamaño = 10;

		int[][] m = { 
				{ 11, 83, 12 },
				{ 21, 30, 15 },
				{ 98, 25, 33 } 
				};

	}

	public static void mostrarDiagonal(int m[][]) {
		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i][i]);
		}
	}

	public static int filaDelMayor(int m[][]) {
		int mayorNum = 0;
		int colMayor = 0;
		int filaMayor = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] > mayorNum) {
					mayorNum = m[i][j];
					colMayor = i;
					filaMayor = j;
				}
			}
		}
		
		return m[colMayor][filaMayor];
	}

	public static void intercambiarFilas(int[][] m, int f1, int f2) {
		for (int i = 0; i < m.length; i++) {
			
		}
		
	}
}

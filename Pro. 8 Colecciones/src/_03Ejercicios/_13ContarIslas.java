package _03Ejercicios;

import java.util.Arrays;

public class _13ContarIslas {
	/*
	 * Ej 2 Dado una matriz, que representa los pixeles de un mapa, averigua cantas
	 * islas hay
	 */

	public static void main(String[] args) {

		int[][] mapa = { { 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 }, { 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, };

		String texto = "";
		for (int i = 0; i < mapa.length; i++) {
			texto += String.format("%s%n", Arrays.toString(mapa[i]));
		}
		System.out.println(texto);
		
		int[][] islas = contarIslas(mapa);
		texto = "";
		for (int i = 0; i < islas.length; i++) {
			texto += String.format("%s%n", Arrays.toString(islas[i]));
		}
		System.out.println(texto);
		
		
	}

	public static int[][] contarIslas(int[][] mapa) {
		int[][] visitado = new int[mapa.length][mapa[0].length];
		int[][] islas = new int[mapa.length][mapa[0].length];

		int cont = 0;
		for (int i = 0; i < mapa.length; i++) {
			for (int j = 0; j < mapa[0].length; j++) {
				if (mapa[i][j] == 1) {
					cont++;
					buscar(i, j, mapa, visitado, islas, cont);
					
				}
			}
		}

		return islas;
	}

	static void buscar(int x, int y, int[][] mapa, int[][] visitado, int[][] islas, int cont) {

		if (visitado[x][y] != 1) {
			
			visitado[x][y] = 1;
			islas[x][y] = cont;
			
			try {
				if (mapa[x][y - 1] == 1) buscar(x, y - 1, mapa, visitado, islas, cont);
			} catch (IndexOutOfBoundsException e) {
				// TODO: handle exception
			}
			
			try {
				if (mapa[x + 1][y - 1] == 1) buscar(x + 1, y - 1, mapa, visitado, islas, cont);
			} catch (IndexOutOfBoundsException e) {
				// TODO: handle exception
			}
			
			try {
				if (mapa[x + 1][y] == 1) buscar(x + 1, y, mapa, visitado, islas, cont);
			} catch (IndexOutOfBoundsException e) {
				// TODO: handle exception
			}
			
			try {
				if (mapa[x + 1][y + 1] == 1) buscar(x + 1, y + 1, mapa, visitado, islas, cont);
			} catch (IndexOutOfBoundsException e) {
				// TODO: handle exception
			}
			
			try {
				if (mapa[x][y + 1] == 1) buscar(x, y + 1, mapa, visitado, islas, cont);
			} catch (IndexOutOfBoundsException e) {
				// TODO: handle exception
			}
			
			try {
				if (mapa[x - 1][y + 1] == 1) buscar(x - 1, y + 1, mapa, visitado, islas, cont);
			} catch (IndexOutOfBoundsException e) {
				// TODO: handle exception
			}
			
			try {
				if (mapa[x - 1][y] == 1) buscar(x - 1, y, mapa, visitado, islas, cont);
			} catch (IndexOutOfBoundsException e) {
				// TODO: handle exception
			}
		}

	}

}

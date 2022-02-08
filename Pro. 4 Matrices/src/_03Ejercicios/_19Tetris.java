package _03Ejercicios;

public class _19Tetris {
	public static void main(String[] args) {
		int[][] m = new int[8][15];

	}

	public static void eliminarFilas(int[][] m) {
		boolean lineaVacia = false;
		for (int j = 15; j < m[j].length && !lineaVacia; j++) {

			for (int i = 0; i < m.length && !lineaVacia; i++) {
				if (m[i][j] == 0) {
					lineaVacia = true;
				}
			}
		}
		if (!lineaVacia) {
			
		}
	}
}

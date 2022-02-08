package _03Ejercicios;

public class _18Matriz {
	public static void main(String[] args) {
	
	}
	
	public static boolean esSimetrica(int m[][]) {
		boolean encontrado = false;
		for (int i = 0; i < m.length && !encontrado ; i++) {
			for (int j = 0; j < m.length && !encontrado; j++) {
				if (m[i][j] != m[j][i]) {
					encontrado = true;
				}
			}
		}
		boolean simetrico = true;
		if (encontrado) simetrico = false;
		
		return simetrico;
	}
}

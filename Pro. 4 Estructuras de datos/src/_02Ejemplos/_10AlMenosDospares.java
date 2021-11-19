package _02Ejemplos;

public class _10AlMenosDospares {
	public static void main(String[] args) {
		int[] v = { 1, 3, 5, 8, 7 };
		// Averiguar si en v hay al menos dos numeros pares
		
		/*
			int numPares = 0;
			for (int i = 0; i < v.length; i++) {
				if (v[i] % 2 == 0) {
					numPares++;
				}
			}
		*/
		boolean encontrado = false;
		int numPares = 0;
		for (int i = 0; i < v.length && !encontrado; i++) {
			if (v[i] % 2 == 0) {
				numPares++;
				if (numPares== 2) {
					encontrado = true;
				}
			}
		}
	}
}

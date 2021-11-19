package _03Ejercicios;

public class _14ComprarArrays {
	public static void main(String[] args) {
		
		
		
	}
	public static boolean mismoValores (double v1[],double v2[]) {
		boolean encontrado = false;
		int i = 0;
		while (i<v1.length && !encontrado) {
			boolean encontrado2 = false;
			int j = 0;
			while (j<v2.length && !encontrado2) {
				if (v1[i] == v2[j])encontrado2 = true; 
				else encontrado2 = false;
				}
			if (encontrado2 == true) encontrado = true;
			else encontrado = false;
			}
		return encontrado;
		}
	}


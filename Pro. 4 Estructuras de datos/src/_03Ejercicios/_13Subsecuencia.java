package _03Ejercicios;

public class _13Subsecuencia {
	public static void main(String[] args) {

		int[] v = { 2, 3, 1, 0, 3 };
		if (subsecuencia(v) == -1) {
			System.out.println("Esta en la posición: " + (subsecuencia(v) + 1));
		}
		
	}

	public static int subsecuencia(int[] v) {
		int posicion = 0;
		boolean encontrado = false;
		for (int i = 0; i < v.length && !encontrado; i++) {
			int num1;
			int num2;

			if (i - 2 < 0) {

			} else {
				num1 = v[i - 2];
				num2 = v[i - 1];
				if (num1 + 1 == num2 && num2 + 1 == v[i]) {
					encontrado = true;
					posicion = i - 2;
				}
			}
		}
		if (!encontrado) {
			posicion = -1;
		}
		return posicion;
	}
}

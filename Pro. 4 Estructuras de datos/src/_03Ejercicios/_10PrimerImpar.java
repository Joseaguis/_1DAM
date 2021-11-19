package _03Ejercicios;

public class _10PrimerImpar {
	public static void main(String[] args) {

		int[] v = { 12, 14, 10, 8, 1, 2, 3 };
		System.out.println(primerImpar(v));
	}

	public static int primerImpar(int[] num) {
		int sumaTotal = 0;
		boolean encontrado = false;
		for (int i = 0; i < num.length && !encontrado; i++) {
			if (num[i] % 2 == 1) {
				for (int j = i; j < num.length; j++) {
					sumaTotal += num[j];
				}
				encontrado = true;
			}
		}
		return sumaTotal;
	}
}

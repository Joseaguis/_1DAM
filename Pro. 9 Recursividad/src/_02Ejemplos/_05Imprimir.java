package _02Ejemplos;

public class _05Imprimir {
	public static void main(String[] args) {
		imprimirHasta(5);
	}

	public static void imprimirHasta(int n) {
		if (n == 1) {
			System.out.println(1);
		} else {
			imprimirHasta(n - 1);
			System.out.println(n);
		}

	}
}

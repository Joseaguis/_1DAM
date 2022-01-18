package _02Ejemplos;

public class _14FinallyEjecutaSiempre {
	public static void main(String[] args) {
		int a = dividir(10, 0);

	}

	public static int dividir(int a, int b) {
		try {
			int cociente;
			cociente = a / b;
			return cociente;

		} finally {
			System.out.println("Hola soy la clausula finally");
		}
	}
}

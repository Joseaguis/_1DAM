package _02Ejemplos;

//Las variables a, b y resultado son variables locales a cada uno de los metodos (main, calcular1 y calcular2)

public class _17AmbitoVariables {
	public static void main(String[] args) {
		
		int a = 20;
		int b = 30;
		int c = 60;
		int resultado = calcular1(a, b);
		System.out.println(resultado);
		
		if (c > 0) {
			int d = 50; // Variable LOCAL a un bloque de codigo
			System.out.println(d);
		}
		//System.out.println(d);
	}
	public static int calcular1 (int a, int b) {
		int resultado = calcular2 (2 * a, 2 * b);
		return resultado;
	}
	public static int calcular2 (int a, int b) {
		int resultado = (a + b) / 3;
		return resultado;
	}
}

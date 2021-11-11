package _02Ejemplos;

public class _05ValorVSReferencia {
	public static void main(String[] args) {
		int numero = 20;
		incrementar1(numero);
		System.out.println(numero);
		
		int [] edad = {1,2,3};
		incrementar1(edad);
		System.out.println(edad[0]);
		System.out.println(edad[1]);
		System.out.println(edad[2]);
	}
	
	public static void incrementar1 (int numero) {
		numero++;
	}
	public static void incrementar1 (int[] numero) {
		numero[0]++;
		numero[1]++;
		numero[2]++;
	}
}

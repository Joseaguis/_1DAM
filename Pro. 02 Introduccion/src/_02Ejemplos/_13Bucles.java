package _02Ejemplos;

public class _13Bucles {
	public static void main(String[] args) throws InterruptedException {
		
		int numero = 1;
		while (numero <= 100) {
			System.out.println(numero);
			numero = numero + 1;
			Thread.sleep(200);
		}
		
	}
}

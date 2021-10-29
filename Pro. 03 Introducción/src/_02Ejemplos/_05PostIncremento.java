package _02Ejemplos;

public class _05PostIncremento {
	public static void main(String[] args) {
		//Mostrar numeros del 1 al 10
		int numero = 1;
		while (numero <= 10) {
			System.out.println(numero);
			numero++;
		}
		
		numero = 1;
		while (numero <= 10) {
			System.out.println(numero++);

		}
		
		numero = 0;
		while (numero < 10) {
			System.out.println(++numero);

		}
	}
}

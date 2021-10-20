package _02Ejemplos;

public class _15Sumador {
	public static void main(String[] args) {
		
		//Sumar los numeros que van del 1 al 10
		int numero = 1;
		int suma = 0;
		while (numero <= 10) {
			numero = numero + 1; //numero ++
			suma = suma + numero;
		}
		System.out.println("La suma es " + suma);
	}
}

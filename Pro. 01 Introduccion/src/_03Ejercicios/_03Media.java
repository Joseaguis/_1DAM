package _03Ejercicios;

import java.util.Scanner;

public class _03Media {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe el primer número: ");
		int numero_1 = sc.nextInt();
		
		System.out.println("Escribe el segundo número: ");
		int numero_2 = sc.nextInt();
		
		System.out.println("Escribe el tercer número: ");
		int numero_3 = sc.nextInt();
		
		double media = ((numero_1 + numero_2 + numero_3) / 3.0 );
		
		System.out.println("La media de " + numero_1 + ", " + numero_2 + " y " + numero_3 + " es igual a " + media);
		
	}
}

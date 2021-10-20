package _03Ejercicios;

import java.util.Scanner;

public class _15MenorDeDos2 {
	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer número: ");
		int primer_Numero = sc.nextInt();
		
		System.out.println("Introduce el segundo número: ");
		int segundo_Numero = sc.nextInt();
		
		if (primer_Numero == segundo_Numero) System.out.println("Los números introducidos son iguales");
		else if(primer_Numero < segundo_Numero) System.out.println("El número " + primer_Numero + " es menor que " + segundo_Numero);
		else System.out.println("El número " + segundo_Numero + " es menor que " + primer_Numero);
		
	}
}

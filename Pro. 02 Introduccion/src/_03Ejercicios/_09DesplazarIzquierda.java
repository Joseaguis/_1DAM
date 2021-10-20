package _03Ejercicios;

import java.util.Scanner;

public class _09DesplazarIzquierda {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una palabra: ");
		String palabra = sc.next();
		
		char primeraLetra = palabra.charAt(0);
		
		System.out.println("Texto desplazado: " + palabra.substring(1, palabra.length() - 1) + primeraLetra);
		
		
	}
}

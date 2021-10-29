package _03Ejercicios;

import java.util.Scanner;

public class _09DesplazarIzquierda {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una palabra: ");
		String palabra = sc.next();
		
		System.out.println("Texto desplazado: " + palabra.substring(1) + palabra.charAt(0));
		
		
	}
}

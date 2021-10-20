package _03Ejercicios;

import java.util.Scanner;

public class _05Nombre {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu Nombre: ");
		String nombre = sc.next();
		
		int num = (nombre.length() - 1);
		
		
		
		if (nombre.charAt(0) == nombre.charAt(num)) {
			System.out.println("La primera y ultima letra coincide");
		}else {
			System.out.println("No coinciden");
		}
		
	}
}

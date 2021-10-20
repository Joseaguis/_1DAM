package _02Ejemplos;

import java.util.Scanner;

public class _08SentenciaIf {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce tu edad: ");
		int edad = sc.nextInt();
				
		if (edad >= 18) {
			System.out.println("Tienes " + edad + " años");
			System.out.println("Eres mayor de edad");
			
		} else {
			System.out.println("Tienes " + edad + " años");
			System.out.println("Eres menor de edad");
		}
		
		sc.close();
		
	}
}

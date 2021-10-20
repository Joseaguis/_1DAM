package _03Ejercicios;

import java.util.Scanner;

public class _02Pitagoras {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el Cateto a y b ");
		double cat1 = sc.nextDouble();
		double cat2 = sc.nextDouble();
		
		double c = Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2));
		System.out.println(c);
	}
}

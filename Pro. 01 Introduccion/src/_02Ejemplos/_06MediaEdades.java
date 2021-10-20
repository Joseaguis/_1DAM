package _02Ejemplos;

import java.util.Scanner;

public class _06MediaEdades {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Edad persona 1: ");
		int edad1 = sc.nextInt();
		
		System.out.println("Edad persona 2: ");
		int edad2 = sc.nextInt();
		
		System.out.println("Media: " + (edad1 + edad2) / 2.0);
		
		sc.close();
	}
}

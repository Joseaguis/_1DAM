package _03Ejercicios;

import java.util.Scanner;

public class _04IndiceMasa {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tu peso: ");
		double peso = sc.nextDouble();
		
		System.out.println("Tu estatura: ");
		double estatura = sc.nextDouble();
		
		System.out.println("Tu masa corporal (IMC) es de " + (peso / estatura));
		
	}
}

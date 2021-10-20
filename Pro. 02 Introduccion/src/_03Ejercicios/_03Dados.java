package _03Ejercicios;

import java.util.Scanner;

public class _03Dados {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lanzamiento de 2 dados D6");
		
		int dado1 = (int) (Math.random() * 6 + 1);
		int dado2 = (int) (Math.random() * 6 + 1);
		System.out.println("Dado 1: " + dado1);
		System.out.println("Dado 2: " + dado2);
		
		System.out.println("Puntuación total: " + (dado1 + dado2));
		
	}
}

package _03Ejercicios;

import java.util.Scanner;

public class _08Pesetas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce pesetas");
		double pesetas = sc.nextDouble();
		
		double euros = pesetas / 166.386;
		System.out.println(pesetas + " pesetas son " + euros + " €" );
	}
}

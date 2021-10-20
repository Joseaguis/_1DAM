package _03Ejercicios;

import java.util.Scanner;

public class _09Euros {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce €");
		double euros = sc.nextDouble();
		
		double pesetas = euros * 166.386;
		System.out.println(euros + " € son " + pesetas + " pesetas" );
	}
}

package _03Ejercicios;

import java.util.Scanner;

public class _11Fuerza {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Masa 1 y 2:");
		double m1 = sc.nextDouble();
		double m2 = sc.nextDouble();
		
		System.out.println("distancia entre ellos: ");
		double d = sc.nextDouble();
		
		final double G = 6.693E-11;
		
		double f = (G*m1*m2) / (Math.pow(d, 2));
		
		System.out.println("F es igual a " + f);
		
	}
}

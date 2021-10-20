package _03Ejercicios;

import java.util.Scanner;

public class _01Circulo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el radio: ");
		double radio = sc.nextDouble();
		
		double longitud, area;
		
		longitud = (2 * Math.PI) * radio;
		area = Math.PI * (Math.pow(radio, 2));
		
		System.out.println("La longitud es: " + longitud);
		System.out.println("El area es: " + area);
	}
}
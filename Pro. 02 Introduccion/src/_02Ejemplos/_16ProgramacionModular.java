package _02Ejemplos;

import java.util.Scanner;

public class _16ProgramacionModular {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("longitud de una circunferencia");
		
		System.out.println("Introduce radio: ");
		double radio = sc.nextDouble();
		
		double longitud = longitudCirculo(radio);
		System.out.format("longitud: %.2f%n", longitud);
		
		System.out.println("Perimetro de un rectanguo de 2 x 3: " + perimetroRectangulo(2, 3));
		
	}
	
	public static double longitudCirculo (double radio) {
		double longitud = 2 * Math.PI * radio;
		return longitud;
	}
	
	public static double perimetroRectangulo(double lado1,double lado2) {
		double perimetro = lado1 * 2 + lado2 * 2;
		return perimetro;
	}
}

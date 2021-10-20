package _03Ejercicios;

import java.util.Scanner;

public class _23Circulo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el radio: ");
		double radio = sc.nextDouble();
		
		System.out.format("Longitud de una circunferencia: %.2f%n",longitudCircunferencia(radio));
		System.out.format("Area de un Circulo: %.2f%n",areaCirculo(radio));
		System.out.format("Volumen de una esfera: %.2f%n",volumenEsfera(radio));
	}
	public static double longitudCircunferencia (double radio) {
		double longitud = 2 * Math.PI * radio;
		return longitud;
	}
	public static double areaCirculo (double radio) {
		double area = Math.pow((Math.PI * radio ),2);
		return area;
	}
	public static double volumenEsfera(double radio) {
		double volumen = (4.0/3) * Math.PI * Math.pow(radio, 3);
		return volumen;
		
	}
}

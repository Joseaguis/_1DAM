package _02Ejemplos;

import java.util.Scanner;

public class _09IfEstatura {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Estatura: ");
		double estatura = sc.nextDouble();

		
	//Estas lineas de codigos son iguales
		if (estatura > 2) {
			System.out.println("Eres muy alto");
		} else {
			if (estatura > 1.7) {
				System.out.println("Eres alto");
			} else {
				if (estatura > 1.6) {
					System.out.println("Eres de estatura media");
				} else {
					System.out.println("Eres de estatura baja");
				}
			}
		}
		
	//Estas lineas de codigos son iguales
		if (estatura > 2 ) System.out.println("Muy alto");
		else if (estatura > 1.7) System.out.println("Alto");
		else if (estatura > 1.6) System.out.println("Estatura media");
		else System.out.println("Bajo");
		
		
		
	}
}

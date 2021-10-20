package _02Ejemplos;

import java.util.Scanner;

public class _03Media {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Media de edad de los alumnos");
		System.out.println("Cuantos alumnos hay?: ");
		int numAlumnos = sc.nextInt();
		
		System.out.println("Cuanto suman sus edades?: ");
		int sumaEdades = sc.nextInt();
		
		double media = (double)sumaEdades / (double)numAlumnos;
		System.out.println("Media " + media);
	}
}

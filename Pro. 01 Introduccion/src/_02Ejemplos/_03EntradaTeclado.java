package _02Ejemplos;

import java.util.Scanner;

public class _03EntradaTeclado {
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		System.out.println("¿Como te llamas? ");
		String nombre = tec.nextLine();
		
		System.out.println("Edad: ");
		int edad = tec.nextInt();
		
		System.out.println("Estatura (en metros): ");
		double estatura = tec.nextDouble();
		
		System.out.println("Hola " + nombre);
		System.out.println("Tienes " + edad + " años y mides " + estatura);
		
		tec.close();
	}
}

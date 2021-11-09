package _03Ejercicios;

import java.util.Scanner;

public class _05LeerEntero {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Introduce un número");
		int num = sc.nextInt();
		System.out.println(leePositivo(num));
		
		System.out.println("Introduce mensaje, maximo y minimo");
		String mensaje = "hola soy jose";
		System.out.println("Ahora numeros");
		int max = sc.nextInt();
		int min = sc.nextInt();
		System.out.println(leerEntero(mensaje, min, max));
		
	}
	
	public static int leePositivo(int num) {
		do {
			System.out.println("Introduce entero positivo: ");
			num = sc.nextInt();
			if (num <0) {
				System.out.println("Error, Número incorrecto");
			}
		} while (num < 0);
		return num;
	}
	/**
	 * Lee de teclado un entero mostrando previamente un mensaje. Si el entero 
	 * introducido no esta en determinado rango, lo vuelve a leer
	 * 
	 * 
	 * @param mensaje mensaje de texto que se mostrara antes de leer el entero
	 * @param minimo mínimo valor mas pequeño que se admite
	 * @param maximo minimo valor mas grande que se admite
	 * @return
	 */
	public static int leerEntero (String mensaje, int minimo , int maximo  ) {
		int num;
		do {
			System.out.println(mensaje);
			num = sc.nextInt();
			if (num < minimo || num > maximo) {
				System.out.print("ERROR. ");
			}
		} while (num < minimo || num > maximo);
		return num;
	}
	public static int leerEntero2 (String mensaje, int minimo , int maximo) {
		boolean incorrecto;
		int num;
		do {
			System.out.println(mensaje);
			num = sc.nextInt();
			incorrecto = num < minimo || num > maximo;
			if (incorrecto) {
				System.out.print("ERROR. ");
			}
		} while (incorrecto);
		return num;
	}
}

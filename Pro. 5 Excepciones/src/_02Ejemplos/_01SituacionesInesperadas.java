package _02Ejemplos;

import java.util.Arrays;
import java.util.Scanner;

public class _01SituacionesInesperadas {
	public static void main(String[] args) {
		int [] numeros = {50,10,2,0,1,5};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vamos a dividir dos elementos del array" + Arrays.toString(numeros));
		
		System.out.println("Posición del dividendo: ");
		int posDividendo = sc.nextInt();
		
		System.out.println("Posición del divisor: ");
		int posDivisor = sc.nextInt();
		
		int cociente = numeros[posDividendo] / numeros[posDivisor];
		System.out.println("Cociente: " + cociente);
		
		/*
		 * Al introducir texto aparece 		java.util.InputMismatchException
		 * Al salirse del array				java.lang.ArrayIndexOutOfBoundsException
		 * Al dividir entre 0				java.lang.ArithmeticException: / by zero
		 */
	}
}

package _02Ejemplos;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class _07CapturarVariasExcepciones {
	public static void main(String[] args) {
		int [] numeros = {50,10,2,0,1,5};
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Vamos a dividir dos elementos del array" + Arrays.toString(numeros));
		
		System.out.println("Posición del dividendo: ");
		int posDividendo = sc.nextInt();
		
		System.out.println("Posición del divisor: ");
		int posDivisor = sc.nextInt();
		
		int cociente = numeros[posDividendo] / numeros[posDivisor];
		System.out.println("Cociente: " + cociente);
		
		} catch (InputMismatchException e) {
			System.out.println("La posición tiene que ser un numero entero");
		} catch (ArithmeticException e) {
			System.out.println("No se puede dividir por 0");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Introduce una posicion dentro del array");
		}
		
		/*
		 * Al introducir texto aparece 		java.util.InputMismatchException
		 * Al salirse del array				java.lang.ArrayIndexOutOfBoundsException
		 * Al dividir entre 0				java.lang.ArithmeticException: / by zero
		 */
	}
}

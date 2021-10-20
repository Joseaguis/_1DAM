package _03Ejercicios;

import java.util.Scanner;

public class _12Calculadora {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce numeros y operacion");
		
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		String operacion = sc.next();
		
		System.out.println("Primer número: " + num1);
		System.out.println("Segundo número: " + num2);
		System.out.println("Operación: " + operacion);
		
		if (operacion.equals("+")) {
			System.out.print("Resultado: ");
			System.out.print(num1 + num2);
		}else if (operacion.equals("-")) {
			System.out.print("Resultado: ");
			System.out.print(num1 - num2);
		}else if (operacion.equals("*")) {
			System.out.print("Resultado: ");
			System.out.print(num1 * num2);
		}else if (operacion.equals("/")) {
			System.out.print("Resultado: ");
			System.out.print(num1 / num2);
		}else {
			System.out.println("Operacion mal introducida, introduce + - * /");
		}
			
	}
}

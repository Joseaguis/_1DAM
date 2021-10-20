package _03Ejercicios;

import java.util.Scanner;

public class _16NotasTexto {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe tu nota: ");
		int nota = sc.nextInt();
		
		if(nota <=0) System.out.println("Número introducido no aceptado");
		else if (nota <= 4) System.out.println("Insuficiente");
		else if (nota == 5) System.out.println("suficiente");
		else if (nota <= 6) System.out.println("Bien");
		else if (nota <= 8) System.out.println("Notable");
		else if (nota <= 10) System.out.println("Sobresaliente");
		else System.out.println("Número introducido no aceptado");
		
	}
}

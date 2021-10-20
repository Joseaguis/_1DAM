package _03Ejercicios;

import java.util.Scanner;

public class _08Partir {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un texto y luego la posicion: ");
		String texto = sc.nextLine();
		int posicion = sc.nextInt();
		
		if (posicion == texto.indexOf(" ")) {
			System.out.println(texto.substring(0, texto.indexOf(" ")));
			System.out.println(texto.substring(texto.indexOf(" ") + 1));
		}else {
			System.out.println("El texto no se puede partir");
		}
		
	}
}

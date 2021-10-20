package _03Ejercicios;

import java.util.Scanner;

public class _07Palabras {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un texto: ");
		String texto = sc.nextLine();

		System.out.println(texto.charAt(0));
		System.out.println(texto.charAt(texto.length() - 1));
		System.out.println(texto.substring(0, (texto.indexOf(" "))));
		if (texto.indexOf(' ') == -1) {
			System.out.println(texto.substring(0, (texto.indexOf(" "))));
			texto = texto.substring(0, (texto.indexOf(" ")));
		} else {

		}
		if (texto.indexOf(' ') == -1) {
			System.out.println(texto.substring(0, (texto.indexOf(" "))));
			texto = texto.substring(0, (texto.indexOf(" ")));
		} else {

		}
		if (texto.indexOf(' ') == -1) {
			System.out.println(texto.substring(0, (texto.indexOf(" "))));
			texto = texto.substring(0, (texto.indexOf(" ")));
		}
		System.out.println(texto.substring(texto.indexOf(" ") + 1, texto.indexOf(" ", texto.indexOf(" ") + 1)));
		System.out.println(texto.substring(texto.indexOf(" ", texto.indexOf(" ") + 1) + 1));
	}
}

package _03Ejercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class _01Esceitura {
	/*
	 * Palabras Letras -> Se escribre esa letra + -> Flecha derecha del cursor - ->
	 * Flecha izquierda * -> Tecla Suprimir
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Character> l = new ArrayList<>();

		System.out.println("Introduce palabra y extras: ");
		String texto = sc.next();
		for (int i = 0; i < texto.length(); i++) {
			l.add(texto.charAt(i));
		}
		
		ArrayList<Character> nombre = new ArrayList<>();
		int posicion = 0;
		for (int i = 0; i < args.length; i++) {
			char c = l.get(i);
			switch (c) {
			case '+':
				if (posicion <l.size()) {
					posicion++;
				}
				break;
			case '-':
				if (posicion > 0) {
					posicion++;
				}
				break;
			case '*':
				if (posicion < l.size()) {
					nombre.remove(posicion);
				}
				break;
			default:
				nombre.add(posicion,c);
				posicion++;
				break;
			}
		}
		System.out.println(nombre);
	}

}

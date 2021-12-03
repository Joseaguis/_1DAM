package _03Ejercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class _01Esceitura {
	/*
	 * Palabras 
	 * Letras -> Se escribre esa letra
	 * + -> Flecha derecha del cursor
	 * - -> Flecha izquierda 
	 * * -> Tecla Suprimir
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
		char indice;
		ArrayList<Character> nombre = new ArrayList<>();
		for (int i = 0, j = 0; i < l.size(); i++) {
			indice = l.get(i);
			if (indice == '-') {
				j--;
			}else if (indice == '+') {
				if (j + 1 < nombre.size()) {
					if (indice > nombre.size())
					j++;
				}
			}else if (indice == '*') {
				if (indice >= 0) nombre.remove(j);
			}else {
				nombre.add(j,indice);
				j++;
			}
		}
		System.out.println(nombre);
	}

}

package _03Ejercicios;

import java.util.Scanner;

public class _10QuitarBlancosSobrantes {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce dos palabras separadas por varios espacios");
		String texto = sc.nextLine();
		
		String primeraPalabra = texto.substring(0,(texto.indexOf(" ")));
		String segundaPalabra = texto.substring(texto.lastIndexOf(" "));
		
		System.out.println(primeraPalabra + segundaPalabra);
	}
}

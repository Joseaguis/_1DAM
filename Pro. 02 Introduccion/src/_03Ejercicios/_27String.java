package _03Ejercicios;

import java.util.Scanner;

public class _27String {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un texto, una letra y cantidad");
		String texto = sc.nextLine();
		String texto2 = sc.next();
		char letra = texto2.charAt(0);
		int cantidad = sc.nextInt();
		
		System.out.println(veces(texto, letra));
		repetir(texto, cantidad);
		
	}
	public static int veces(String texto, char letra) {
		int veces = 0;
		int con = 0;
		
		while (texto.indexOf(letra) != -1) {
			texto = texto.substring(texto.indexOf(letra) + 1,texto.length());
			veces++;
		}
		
		return veces;
	}
	public static void repetir(String texto, int veces) {
		int con = 0;
		
		while (con < veces) {
			System.out.println(texto);
			con++;
		}
		
	}
	
}

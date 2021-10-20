package _03Ejercicios;

import java.util.Scanner;

public class _24ReplicarCaracteres {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una letra y la cantidad de veces: ");
		
		char letra = sc.next().charAt(0);
		int veces = sc.nextInt();
		
		System.out.println(replicar(letra, veces));
		
	}
	public static String replicar (char letra, int veces) {
		int cont = 0;
		String texto = "";
		while (cont < veces) {
			texto = texto + letra;
			cont++;
		}
		return texto;
	}
}

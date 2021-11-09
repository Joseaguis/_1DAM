package _03Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class _09BlackJack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random ();
		System.out.println("Empieza el juego");
		int punt = 0;
		boolean cont = true;
		String texto = "";
		
		do {
			System.out.println("Quieres robar carta?");
			texto = sc.nextLine().toLowerCase();
			if (texto.equals("si")) {
				punt += (r.nextInt(10)) + 1;
			} else {
				cont = false;
			}
			System.out.println("Tu puntuación es: " + punt);
		} while (punt < 21 && cont == true);
		
		if (punt > 21) {
			System.out.println("Has perdido:");
		}else if(punt == 21) {
			System.out.println("Has ganado:");
		}else {
			System.out.println("No esta mal");
		}
		
	}
}

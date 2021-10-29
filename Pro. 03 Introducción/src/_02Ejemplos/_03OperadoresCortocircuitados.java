package _02Ejemplos;

import java.util.Scanner;

public class _03OperadoresCortocircuitados {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Dime una palabra que en 5º posicion tenga una a: ");
		String texto = sc.nextLine();
		
		if (texto.length() >= 5 && texto.charAt(4)== 'a') {
			System.out.println("Has ganado");
		} else {
			System.out.println("Has perdido");
		}
		

	}

}

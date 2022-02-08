package _02Ejemplos._04AtributoEstatico;

import java.util.Scanner;

public class Teclado {
	private static Scanner sc = new Scanner(System.in);
	public static Scanner getInstance() {
		return sc;
	}
}

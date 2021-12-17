package _02Ejercicios;

import java.util.Scanner;

public class _02HolaMundo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int con = 0;
		while (con < n) {
			System.out.println("Hola mundo.");
			con++;
		}
		
	}
}

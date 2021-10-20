package _03Ejercicios;

import java.util.Scanner;

public class _15Nimpares {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el número de impares");
		int veces = sc.nextInt();
		
		int con = 0;
		int con2 = 0;
		while (con < veces) {
			if (con2 % 2 == 1) {
				System.out.println(con2);
				}else {	
				}
			if (con2 % 2 == 1) {
				con++;
			}
			con2++;
		}
		
	}
}

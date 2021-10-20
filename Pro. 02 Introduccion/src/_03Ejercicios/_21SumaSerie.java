package _03Ejercicios;

import java.util.Scanner;

public class _21SumaSerie {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Da un numero");
		int num = sc.nextInt();
		
		double suma = 0;
		int con = 1;
		
		while (con <= num) {
			suma = 1 / ((double)con) + suma;
			con++;
		}
		System.out.println("El total es: " + suma);
	}
}

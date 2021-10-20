package _03Ejercicios;

import java.util.Scanner;

public class _18MostrarDivisoresN {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		int num = sc.nextInt();
		
		int con = 1;
		
		while (con <= num) {
			if (num % con == 0) {
				System.out.println(con);
			}else {
				
			}
			con++;
		}

	}
}

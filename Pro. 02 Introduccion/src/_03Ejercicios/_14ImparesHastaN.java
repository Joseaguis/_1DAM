package _03Ejercicios;

import java.util.Scanner;

public class _14ImparesHastaN {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce hasta que numero contar");
		int con= 0;
		int veces = sc.nextInt();
		
		while (con < veces) {
			if (con % 2 == 1) {
				System.out.println(con);
			}else {
				
			}
			con = con + 1;
		}
	}
}

package _02Ejercicios;

import java.util.Scanner;

public class _04DiaNavidad {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int veces = sc.nextInt();
		
		
		int con = 0;
		while (con < veces) {
			int dia = sc.nextInt();
			int mes = sc.nextInt();
			if (mes == 12 && dia == 25) {
				System.out.println("SI");
			}else {
				System.out.println("NO");
			}
			con++;
		}
	}
}
 	
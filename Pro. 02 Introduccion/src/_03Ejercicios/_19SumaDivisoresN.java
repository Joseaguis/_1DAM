package _03Ejercicios;

import java.util.Scanner;

public class _19SumaDivisoresN {
	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		int num = sc.nextInt();
		
		int suma = 0;
		int con = 1;
		
		while (con < num) {
			if (num % con == 0) {
				System.out.println(con);
				suma = suma + con;
			}else {
				
			}
			con++;
		}
		System.out.println("El total de los divisores son: " + suma);
	}
}

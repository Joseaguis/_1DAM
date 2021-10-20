package _03Ejercicios;

import java.util.Scanner;

public class _13PenultimaCifra {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce un número entero");
		int num = tec.nextInt();

		num = num % 100;

		if (num == 0) {
			System.out.println("La penúltima cifra es 0");
		} else {
			int resto = num;

			resto = resto % 10;
			num = num - resto;
			num = num / 10;
			System.out.println("La penúltima cifra es " + num);

		}
	}
}

package _03Ejercicios;

import java.util.Scanner;

public class _17LetraNif {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Inserta un NIF sin letra");
		int nif = tec.nextInt();
		nif = nif % 23;

		if (nif == 0)
			System.out.println("La letra de tu NIF es la T");
		else if (nif == 1)
			System.out.println("La letra de tu NIF es la R");
		else if (nif == 2)
			System.out.println("La letra de tu NIF es la W");
		else if (nif == 3)
			System.out.println("La letra de tu NIF es la A");
		else if (nif == 4)
			System.out.println("La letra de tu NIF es la G");
		else if (nif == 5)
			System.out.println("La letra de tu NIF es la M");
		else if (nif == 6)
			System.out.println("La letra de tu NIF es la Y");
		else if (nif == 7)
			System.out.println("La letra de tu NIF es la F");
		else if (nif == 8)
			System.out.println("La letra de tu NIF es la P");
		else if (nif == 9)
			System.out.println("La letra de tu NIF es la D");
		else if (nif == 10)
			System.out.println("La letra de tu NIF es la X");
		else if (nif == 11)
			System.out.println("La letra de tu NIF es la B");
		else if (nif == 12)
			System.out.println("La letra de tu NIF es la N");
		else if (nif == 13)
			System.out.println("La letra de tu NIF es la J");
		else if (nif == 14)
			System.out.println("La letra de tu NIF es la Z");
		else if (nif == 15)
			System.out.println("La letra de tu NIF es la S");
		else if (nif == 16)
			System.out.println("La letra de tu NIF es la Q");
		else if (nif == 17)
			System.out.println("La letra de tu NIF es la V");
		else if (nif == 18)
			System.out.println("La letra de tu NIF es la H");
		else if (nif == 19)
			System.out.println("La letra de tu NIF es la L");
		else if (nif == 20)
			System.out.println("La letra de tu NIF es la C");
		else if (nif == 21)
			System.out.println("La letra de tu NIF es la K");
		else
			System.out.println("La letra de tu NIF es la E");

	}
}

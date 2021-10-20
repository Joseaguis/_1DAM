package _03Ejercicios;

import java.util.Scanner;

public class _25LetraNif {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce los numeros de tu DNI: ");
		int dni = sc.nextInt();
		
		System.out.println(Integer.toString(dni) + calcularLetraNif(dni));
		
	}
	public static char calcularLetraNif(int nif) {
		char letra = 'x';
		nif = nif % 23;

		if (nif == 0)
			letra = 'T';
		else if (nif == 1)
			letra = 'R';
		else if (nif == 2)
			letra = 'W';
		else if (nif == 3)
			letra = 'A';
		else if (nif == 4)
			letra = 'G';
		else if (nif == 5)
			letra = 'M';
		else if (nif == 6)
			letra = 'Y';
		else if (nif == 7)
			letra = 'F';
		else if (nif == 8)
			letra = 'P';
		else if (nif == 9)
			letra = 'D';
		else if (nif == 10)
			letra = 'X';
		else if (nif == 11)
			letra = 'B';
		else if (nif == 12)
			letra = 'N';
		else if (nif == 13)
			letra = 'J';
		else if (nif == 14)
			letra = 'Z';
		else if (nif == 15)
			letra = 'S';
		else if (nif == 16)
			letra = 'Q';
		else if (nif == 17)
			letra = 'V';
		else if (nif == 18)
			letra = 'H';
		else if (nif == 19)
			letra = 'L';
		else if (nif == 20)
			letra = 'C';
		else if (nif == 21)
			letra = 'K';
		else
			letra = 'E';
		
		return letra;
	}
}

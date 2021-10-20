package _03Ejercicios;

import java.util.Scanner;

public class _19Fechas {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Dime una fecha separada en espacios");
		int dia1 = tec.nextInt();
		int mes1 = tec.nextInt();
		int ano1 = tec.nextInt();
		System.out.println("Dime otra");
		int dia2 = tec.nextInt();
		int mes2 = tec.nextInt();
		int ano2 = tec.nextInt();

		if (ano1 > ano2)
			System.out.println("La fecha más grande es " + dia1 + "/" + mes1 + "/" + ano1);
		if (ano2 > ano1)
			System.out.println("La fecha más grande es " + dia2 + "/" + mes2 + "/" + ano2);
		if (ano1 == ano2) {
			if (mes1 > mes2)
				System.out.println("La fecha más grande es " + dia1 + "/" + mes1 + "/" + ano1);
			if (mes2 > mes1)
				System.out.println("La fecha más grande es " + dia2 + "/" + mes2 + "/" + ano2);
			if (mes1 == mes2) {
				if (dia1 > dia2)
					System.out.println("La fecha más grande es " + dia1 + "/" + mes1 + "/" + ano1);
				if (dia2 > dia1)
					System.out.println("La fecha más grande es " + dia2 + "/" + mes2 + "/" + ano2);
				if (dia1 == dia2)
					System.out.println("Son la misma fecha");
			}
		}

	}

}

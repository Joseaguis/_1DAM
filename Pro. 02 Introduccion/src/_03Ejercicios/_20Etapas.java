package _03Ejercicios;

import java.util.Scanner;

public class _20Etapas {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int inf = 0;
		int pub = 0;
		int adol = 0;
		int adul = 0;
		int vejez = 0;
		int anci = 0;

		System.out.println("Introduce la cantidad de edad que introduciras: ");
		int veces = sc.nextInt();

		int edad = 0;
		int con = 0;
		
		while (con < veces) {
			con++;
			System.out.println("Edad " + con);
			edad = sc.nextInt();
			if (edad <= 10) {
				inf++;
			} else if (edad <= 14) {
				pub++;
			} else if (edad <= 21) {
				adol++;
			} else if (edad <= 55) {
				adul++;
			} else if (edad <= 70) {
				vejez++;
			} else if (edad > 71) {
				anci++;
			}
			
		}
		
		double infPor = ((double)inf / veces) * 100;
		double pubPor = ((double)pub / veces) * 100;
		double adolPor = ((double)adol / veces) * 100;
		double adulPor = ((double)adul / veces) * 100;
		double vejezPor = ((double)vejez / veces) * 100;
		double anciPor = ((double)anci / veces) * 100;
		
		
		System.out.format("%-15s:%6.2f%%%n","infancia", infPor);
		System.out.format("%-15s:%6.2f%%%n","Pubertad", pubPor);
		System.out.format("%-15s:%6.2f%%%n","Adolescencia", adolPor);
		System.out.format("%-15s:%6.2f%%%n","Adultez", adulPor);
		System.out.format("%-15s:%6.2f%%%n","Vejez",vejezPor);
		System.out.format("%-15s:%6.2f%%%n","Anciano", anciPor);
		
	}
}

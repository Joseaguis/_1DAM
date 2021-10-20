package _03Ejercicios;

import java.util.Scanner;

public class _06Horas {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Cantidad de segundos");
		int segs = tec.nextInt();
		
		int horas = segs / 3600;
		int resto = segs % 3600;
		if(horas == 0) System.out.println("Eso son " + resto + " segundos");
		else if (horas == 1) System.out.println("Eso son " + horas + " hora y " + resto + " segundos");
		else System.out.println("Eso son " + horas + " horas y " + resto + " segundos");
	}

}

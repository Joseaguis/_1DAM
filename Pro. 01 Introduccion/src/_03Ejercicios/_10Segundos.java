package _03Ejercicios;

import java.util.Scanner;

public class _10Segundos {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Segundos: ");
		int segundos = sc.nextInt();
		
		int dias, horas, minutos;
		
		dias = segundos / 86400;
		segundos = segundos % 86400;
		
		horas = segundos / 3600;
		segundos = segundos % 3600;
		
		minutos = segundos / 60;
		segundos = segundos % 60;
		
		System.out.println(dias + " dias");
		System.out.println(horas + " horas");
		System.out.println(minutos + " minutos");
		System.out.println(segundos + " segundos");
		
	}
}

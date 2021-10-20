package _03Ejercicios;

import java.util.Scanner;

public class _05Minutos {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una cantidad de segundos: ");
		int segundos_Totales = sc.nextInt();
		
		int minutos = segundos_Totales / 60;
		int segundos = segundos_Totales % minutos;
		
		System.out.println("Son " + minutos + " minutos " + segundos + " segundos");
	}
}

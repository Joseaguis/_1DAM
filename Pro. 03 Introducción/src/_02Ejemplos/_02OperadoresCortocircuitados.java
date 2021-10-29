package _02Ejemplos;

import java.util.Scanner;

public class _02OperadoresCortocircuitados {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		if (leerNotaTeoria() >= 5 & leerNotaPractica() >= 5) {
			System.out.println("Apto");
		} else {
			System.out.println("No Apto");
		}

	}

	public static double leerNotaTeoria() {
		System.out.println("Teoria: ");
		double teoria = sc.nextDouble();
		return teoria;
	}

	public static double leerNotaPractica() {
		System.out.println("Práctica 1: ");
		double p1 = sc.nextDouble();
		System.out.println("Práctica 2: ");
		double p2 = sc.nextDouble();

		return (p1 + p2) / 2;
	}
}

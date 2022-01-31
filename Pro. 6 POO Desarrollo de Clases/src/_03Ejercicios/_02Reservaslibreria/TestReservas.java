package _03Ejercicios._02Reservaslibreria;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestReservas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nif = null, nombre = null, tel = null;
		int codLib = 0, ejemplares = 0;
		
		boolean continuar = false;
		do {
			try {
				System.out.println("Introduzca datos para la reserva: ");
				System.out.println("Nif Cliente: ");
				nif = sc.nextLine();
				
				System.out.println("Nombre Cliente");
				nombre = sc.nextLine();
				
				System.out.println("Telefono Cliente");
				tel = sc.nextLine();
				
				System.out.println("Codigo Libro");
				codLib = sc.nextInt();
				
				System.out.println("Nº Ejemplares");
				ejemplares = sc.nextInt();
				continuar = true;
				
			} catch (InputMismatchException e) {
				// TODO: handle exception
			}
		} while (!continuar);
		
		Reserva r1 = new Reserva(nif,nombre,tel,codLib,ejemplares);
		
		continuar = false;
		do {
			try {
				System.out.println("Introduzca datos para la reserva: ");
				System.out.println("Nif Cliente: ");
				nif = sc.nextLine();
				
				System.out.println("Nombre Cliente");
				nombre = sc.nextLine();
				
				System.out.println("Telefono Cliente");
				tel = sc.nextLine();
				
				System.out.println("Codigo Libro");
				codLib = sc.nextInt();
				
				System.out.println("Nº Ejemplares");
				ejemplares = sc.nextInt();
				continuar = true;
				
			} catch (InputMismatchException e) {
				// TODO: handle exception
			}
		} while (!continuar);
		
		Reserva r2 = new Reserva(nif,nombre,tel,codLib,ejemplares);
		
		r1.setNumEjemplares(r1.getNumEjemplares() + 1);
		r2.setNumEjemplares(r2.getNumEjemplares() + 1);
		
		if (r1.compareTo(r2)  >= 0) {
			System.out.println(r1 + "" + r2);
		} else {
			System.out.println(r2 + "" + r1);
		}
		
		
	}
}

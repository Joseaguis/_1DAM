package _03Ejercicios._01Gestionempleados;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestEmpleado {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Empleado empleado1 = new Empleado("Paco", "12345678N", 2005, 14000);
		// Empleado empleado2 = new Empleado("Javier", "87965432N", 2012, 7000);
		
		boolean ok = false;
		String nombre = "", dni = "";
		int anyo = 0;
		double sueldo = 0;
		
		
		do {
			try {
				System.out.println("1º Empleado: ");
				
				System.out.println("Introduce el nombre");
				nombre = sc.next();
				
				System.out.println("Introduce el dni");
				dni = sc.next();
				
				System.out.println("Introduce el anyo de entrada");
				anyo = sc.nextInt();
				
				System.out.println("Introduce el sueldo");
				sueldo = sc.nextDouble();
				
				ok = true;
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.out.println("Introduce los datos correctos");
			}
		} while (!ok);
		
		Empleado empleado1 = new Empleado(nombre, dni, anyo, sueldo);
		
		ok = false;
		do {
			try {
				System.out.println("2º Empleado: ");
				
				System.out.println("Introduce el nombre");
				nombre = sc.next();
				
				System.out.println("Introduce el dni");
				dni = sc.next();
				
				System.out.println("Introduce el anyo de entrada");
				anyo = sc.nextInt();
				
				System.out.println("Introduce el sueldo");
				sueldo = sc.nextDouble();
				
				ok = true;
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.out.println("Introduce los datos correctos");
			}
		} while (!ok);
		
		Empleado empleado2 = new Empleado(nombre, dni, anyo, sueldo);
		
		System.out.println(empleado1 + "\n");
		System.out.println(empleado2 + "\n");
		
		empleado2.incrementarSueldo(20);
		empleado1.incrementarSueldo(10);
		
		System.out.println(empleado1 + "\n");
		System.out.println(empleado2 + "\n");
		
		System.out.println(Empleado.calcularIRPF(empleado1.getSueldo() / 12));
		System.out.println(Empleado.calcularIRPF(empleado2.getSueldo() / 12 ) + "\n");
		
		System.out.println(empleado1.getSueldo() - Empleado.calcularIRPF(empleado1.getSueldo()));
		System.out.println(empleado2.getSueldo() - Empleado.calcularIRPF(empleado2.getSueldo())+ "\n");
		
		
		Empleado empleado3 = new Empleado("Paco", "12345678N", 2005, 1400);
		System.out.println(empleado1.equals(empleado2));
		System.out.println(empleado1.equals(empleado3));
		
		System.out.println(empleado1.compareTo(empleado2));
		
	}
}

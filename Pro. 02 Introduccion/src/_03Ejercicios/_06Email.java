package _03Ejercicios;

import java.util.Scanner;

public class _06Email {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu correo electronico: ");
		String correo = sc.next();
		
		int primeraSeparacion = correo.indexOf('@');
		int segundaSeparacion = correo.indexOf('.');
		
		System.out.println("Nombre de usuario: " + (correo.substring(0, primeraSeparacion)));
		System.out.println("Subdominio: " + (correo.substring(primeraSeparacion + 1, segundaSeparacion)));
		System.out.println("Dominio: " + (correo.substring(segundaSeparacion + 1)));
	}
}

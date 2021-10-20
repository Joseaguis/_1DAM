package _02Ejemplos;

import java.util.Scanner;

public class _11CompararStrings {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Nombre1: ");
		String nombre1 = tec.next();
		System.out.println("Nombre2: ");
		String nombre2 = tec.next();
		
		if (nombre1 .equals (nombre2)) { //.equals para comparar No primitivos
			System.out.println("Bonito nombre!!");
		} else {
			System.out.println("Nombre distinto");
		}
		
		//Y entonces por que...
		String grupo1 = "primero DAM";
		
		String grupo2 = "primero DAM";
		if (grupo1 == grupo2) {          //Usar siempre .equals
			System.out.println("Mismo grupo");
		}else {
			System.out.println("Distinto grupo");
		}
		
		if (nombre1.equalsIgnoreCase(nombre2)){
			System.out.println("Coinciden, da igual mayuscula y minuscula");
		}
		
		//Mostrar los nombres introducidos ordenados
		
		System.out.println(nombre1.compareTo(nombre2));
		if(nombre1.compareTo(nombre2) < 0) {
			System.out.println(nombre1);
			System.out.println(nombre2);
		}else {
			System.out.println(nombre2);
			System.out.println(nombre1);
		}
			
		
	}
}
package utiles;

import java.util.Scanner;

public class _Prueba {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe fecha");
		String hola = sc.nextLine();
		
		System.out.println(Fechas.extraerDia(hola));
		System.out.println(Fechas.extraerMes(hola));
		System.out.println(Fechas.extraerAnyo(hola));
		
	}
}

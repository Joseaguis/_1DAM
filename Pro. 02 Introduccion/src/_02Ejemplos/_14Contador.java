package _02Ejemplos;

import java.util.Scanner;

public class _14Contador {
	public static void main(String[] args) {
		//Mostrar HOLA 10 veces
		//para ello usamos un CONTADOR. Un contador es una variable entera
		//que refleja el numero de veces que se ha hecho algo
		//Se inicializa a 0, y va incrementando su valor en 1 iteracion
		//iteracion del bucle
		
		int  con = 0;
		while (con < 10) {
			System.out.println("Hola");
			con = con + 1;
		}
		
		//Mostrar el mensaje "Hola que tal"
		//El numero de veces que se indica el usuario
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cuantas veces quieres que te saluden?");
		int veces = sc.nextInt();
		con = 0;
		while (con < veces ) {
			System.out.println("Hola!");
			con = con + 1;
		}
	}
}

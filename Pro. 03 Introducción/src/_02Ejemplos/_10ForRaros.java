package _02Ejemplos;

import java.util.Scanner;

public class _10ForRaros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pares hasta en el N: ");
		int n = sc.nextInt();
		
		// Con While
		int a = 2;
		while (a <= n) {
			System.out.println(a);
			a += 2; // a = a + 2
		}
		
		// Con For
		System.out.println("----------");
		for (int i = 2; i < n; i +=2) {
			System.out.println(i);
		}
		
		// Con for raro que no tiene la parte de inicialización
		
		System.out.println("----------");
		int c = 2;
		for (; c < n; c +=2) {
			System.out.println(c);
		}
		
		// Con for raro que no tiene la parte de inicialización ni la de avance
		
		System.out.println("----------");
		int d = 2;
		for (; d < n; ) {
			System.out.println(c);
			d +=2;
		}
		
		// Sumar los numeros entre 1 y n
		
		// Con while
		int suma = 0;
		int e = 1;
		while (e <= n) {
			suma =+e;
			System.out.println(suma);
			e++;
		}
		System.out.println("----------");
		
		// Con for
		int suma2 = 0;
		for (int i = 0; i < n; i++) {
			suma2 +=i;
			System.out.println(suma2);
		}
		
		// for raro que hace varias cosas en la inicialización
		for (int i = 0, suma3 = 0; i < n; i++) {
			suma2 =+i;
			System.out.println(suma2);
		}
		//For raro que hace varias cosas en el avance
		for (int i = 0, suma3 = 0; i < n; suma +=i, i++) {
			System.out.println(suma2);
		}
	}
}

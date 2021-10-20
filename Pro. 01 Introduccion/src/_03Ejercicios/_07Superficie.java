package _03Ejercicios;

import java.util.Scanner;

public class _07Superficie {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Escribe la logitud y la anchura de la habitación");
		double lon = tec.nextDouble();
		double anch = tec.nextDouble();
		System.out.println("La habitación mide " + (lon * anch) + " metros cuadrados");
	}

}

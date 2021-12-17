package _02Ejercicios;

import java.util.Scanner;

public class _01PersistenciaMultiplicativaDeLosNumeros {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce numero");
		int num = sc.nextInt();
		int veces = 0;
		
		while (num > 9) {
			int productos = 1;
			while (num != 0) {
				 int unidades = num % 10;
				 productos *= unidades;
				 num = (num-unidades)/10;
			}
			veces++;
			num = productos;
		}
		System.out.println(veces);
		
	}
}
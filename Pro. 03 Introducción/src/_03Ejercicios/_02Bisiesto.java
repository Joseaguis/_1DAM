package _03Ejercicios;

import java.util.Scanner;

public class _02Bisiesto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Este añlo es bisiesto?:");
		int anyo = sc.nextInt();
		
		System.out.println(esBisiesto(anyo));
		
		
		
	}

	public static boolean esBisiesto (int anyo) {
		boolean bisiesto;
		
		if (anyo % 100 == 0) {
			if (anyo % 400 == 0) {
				bisiesto = true;
			}else {
				bisiesto = false;
			} 
		}else {
			if (anyo % 4 == 0) {
				bisiesto = true;
			} else {
			bisiesto = false;
			}
		}
		return bisiesto;
	}
}

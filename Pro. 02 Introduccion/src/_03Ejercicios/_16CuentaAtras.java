package _03Ejercicios;

import java.util.Scanner;

public class _16CuentaAtras {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numero cuenta atras: ");
		int nCuenta = sc.nextInt();
		int cuenta = nCuenta;
		int con = 0;
		while (con <= nCuenta) {
			System.out.println(cuenta);
			cuenta--;
			con++;
		}
		
	}
}

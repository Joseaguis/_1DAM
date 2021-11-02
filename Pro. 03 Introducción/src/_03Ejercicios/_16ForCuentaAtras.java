package _03Ejercicios;

import java.util.Scanner;

public class _16ForCuentaAtras {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numero cuenta atras: ");
		int nCuenta = sc.nextInt();
		
		for (int i = 0; i < nCuenta; nCuenta--) {
			System.out.println(nCuenta);
		}
		
	}
}

package _03Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class _06Rotaciones {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] v = new int[5];
		
		System.out.println("Introduce " + v.length + " números");
		for (int i = 0; i < v.length; i++) {
			v[i] = sc.nextInt();
		}
			System.out.println(Arrays.toString(v));
			rotarDerecha(v);
	}
	public static void rotarDerecha(int v[]) {
		
		int[] vRotado = Arrays.copyOf(v, v.length);
		for (int i = 0; i < v.length - 1; i++) {
			
			int[] vAux = Arrays.copyOf(vRotado, vRotado.length);
			vRotado[0] = vAux[v.length - 1];
		
			for (int j = 1; j < vRotado.length; j++) {
				vRotado[j] = vAux[j - 1];
			}
			
			
			System.out.println("Rotación " + (i + 1) + ": " + Arrays.toString(vRotado));
		}
	}
}

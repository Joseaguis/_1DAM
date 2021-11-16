package _03Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class _05SumasParciales {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] v = new int[5];
		
		System.out.println("Introduce " + v.length + " números");
		for (int i = 0; i < v.length; i++) {
			v[i] = sc.nextInt();
		}
			System.out.println(Arrays.toString(v));
			v = sumaParcial(v);
			System.out.println(Arrays.toString(v));
		System.out.println();
		
	}
	public static int[] sumaParcial (int v[]) {
		int[] vSuma = new int[v.length];
		
		vSuma[0] = v[0];
		for (int i = 1; i < v.length;i++) {
			vSuma[i] = vSuma[i - 1] + v[i];
		}
		return vSuma;
	}
}

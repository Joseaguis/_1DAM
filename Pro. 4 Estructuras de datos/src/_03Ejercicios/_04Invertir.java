package _03Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class _04Invertir {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] v = new int[5];
	
	System.out.println("Introduce " + v.length + " números");
	for (int i = 0; i < v.length; i++) {
		v[i] = sc.nextInt();
	}
		System.out.println(Arrays.toString(v));
		v = invertirArray(v);
		System.out.println(Arrays.toString(v));
	}
	public static int[] invertirArray(int v[]) {
		int[] vI = new int[v.length];
		
		for (int i = 0; i < v.length; i++) {
			vI[v.length - i - 1] = v[i];
			
		}
		return vI;
	}
}

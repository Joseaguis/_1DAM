package _03Ejercicios;

import java.util.Arrays;
import java.util.Random;

public class _02Lluvias {
	final static int DIAS = 7;
	public static void main(String[] args) {
		Random r = new Random();
		
		double[] lluvias = new double[DIAS];
		
		for (int i = 0; i < lluvias.length; i++) {
			lluvias[i] = (r.nextDouble() * 100);
			lluvias [i] -= (lluvias[i] % 0.01);
		}
		System.out.println(Arrays.toString(lluvias));
	}
	
	public static double lluviaTotal (double p[]) {
		double total = 0;
		for (int i = 0; i < p.length; i++) {
			total += p[i];
		}
		return total;
	}
	
	public static double lluviaMedia (double p[]) {
		double total = 0;
		for (int i = 0; i < p.length; i++) {
			total += p[i];
		}
		return total / p.length;
		
	}
	
	public static double lluviaMaxima(double p[]) {
		double mayor = 0;
		for (int i = 0; i < p.length; i++) {
			if(p[i] > mayor) p[i] = mayor;
		}
		return mayor;
	}
	
	public static double lluviaMinima (double p[]) {
		double menor = 100;
		for (int i = 0; i < p.length; i++) {
			if(p[i] < menor) p[i] = menor;
		}
		return menor;
	}
	
	
	public static int diaMasLluvia (double p[]) {
		
	}
	
	public static int diaMenosLluvia (double p[]) {
		
	}
	public static int contarDiasLluviaX (double p[], double x) {
		
	}
	
	public static double lluviaTotalPeriodo (double p[], int ini, int fin) {
		
	}
	public static int contarDiasLluviaCreciente(double p[]) {
		
	}
}

package _03Ejercicios;

import java.util.Random;

public class _03Dados {
	
	final static int LANZAMIENTOS = 1_000_000;
	final static int MOSTRAR_CADA = 1_000;
	
	public static void main(String[] args) {
		Random r = new Random();
		int dado = 0;
		int[] veces = new int[7];
		
		for (int i = 0; i <= LANZAMIENTOS; i++) {
			dado = r.nextInt(6) + 1;
			veces[dado]++;
			
			if (i % MOSTRAR_CADA == 0) {
				System.out.format("Número de lanzamientos : %d%n", i);
				for (int j = 1; j < veces.length; j++) {
					System.out.format("%d: %05.2f %%%n", j, 100.0 * veces[j] / i);
				}
			}
		}
	}
}

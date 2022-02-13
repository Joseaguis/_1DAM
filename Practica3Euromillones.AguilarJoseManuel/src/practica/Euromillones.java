package practica;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Euromillones {
	public static void main(String[] args) throws FileNotFoundException {

		final int NUMMAX = 50;
		final int ESTRELLA_MAX = 12;
		final int COMB_NUMEROS = 5;
		final int COMB_ESTRELLAS = 2;
		int seed;
		Apuesta a = new Apuesta(COMB_NUMEROS, COMB_ESTRELLAS, NUMMAX, ESTRELLA_MAX);
		System.out.println(a);

		Boleto boleto = new Boleto(5, COMB_NUMEROS, COMB_ESTRELLAS, NUMMAX, ESTRELLA_MAX,5);

		System.out.println(boleto);
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		ArrayList<Integer> estrellas = new ArrayList<Integer>();
		
		leerCombGanadora("Ganadora", numeros, estrellas);
		System.out.println(boleto.resultadoPremio(numeros, estrellas));
	}
	
	public static void leerCombGanadora(String nombreFichero, ArrayList<Integer> numeros, ArrayList<Integer> estrellas) throws FileNotFoundException {
		Scanner f = new Scanner(new File(nombreFichero));
		int contador = 0;
		while (f.hasNext()) {
			if (contador < 5) {
				numeros.add(f.nextInt());
				contador++;
			} else {
				estrellas.add(f.nextInt());
			}
			
		}
	
	}
	
}

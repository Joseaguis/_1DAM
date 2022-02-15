package practica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Euromillones {
	public static void main(String[] args) throws FileNotFoundException {

		final int NUMMAX = 50;	
		final int ESTRELLA_MAX = 12;
		final int COMB_NUMEROS = 5;
		final int COMB_ESTRELLAS = 2;
		int seed;

		Boleto boleto = new Boleto(5, COMB_NUMEROS, COMB_ESTRELLAS, NUMMAX, ESTRELLA_MAX);

		System.out.println(boleto);
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		ArrayList<Integer> estrellas = new ArrayList<Integer>();
		
		leerCombGanadora("Ganadora", numeros, estrellas);
		System.out.println(resultadoPremio(numeros, estrellas,boleto));
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
		Collections.sort(numeros);
		Collections.sort(estrellas);
	
	}
	public static String resultadoPremio(ArrayList<Integer> numeros, ArrayList<Integer> estrellas, Boleto b) {
		int[] v = b.calcularPremios(numeros, estrellas);

		String text = "";
		boolean premio = false;

		text += "           Premios         \n";
		text += "===============================\n";
		for (int i = 1; i < v.length; i++) {
			if (v[i] != 0) {
				text += String.format("nª de apuestas con premio de %dª categoria: %d%n", i, v[i]);
				premio = true;
			}
		}
		if(!premio) text += "No hay premio\n";
		text += "===============================";
		return text;
	}
	
}

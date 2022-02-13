package practica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Boleto {
	private final static int MAXAPUESTAS = 5;

	private ArrayList<Apuesta> boleto;

	private static Scanner f;

	public Boleto(int numApuestas, int numNumeros, int numEstrellas, int maxValorNumeros, int maxValorEstrellas)
			throws IllegalArgumentException {
		boleto = new ArrayList<>();

		if (numApuestas > MAXAPUESTAS)
			throw new IllegalArgumentException("Se sobrepasa el maximo numero maximo de apuestas");

		for (int i = 0; i < numApuestas; i++) {
			boolean iguales = false;
			do {
				Apuesta a = new Apuesta(numNumeros, numEstrellas, maxValorNumeros, maxValorEstrellas);
				if (!boleto.contains(a)) {
					boleto.add(a);
					iguales = true;
				}
			} while (!iguales);

		}
	}

	public Boleto(int numApuestas, int numNumeros, int numEstrellas, int maxValorNumeros, int maxValorEstrellas,
			int seed) throws IllegalArgumentException {
		boleto = new ArrayList<>();

		if (numApuestas > MAXAPUESTAS)
			throw new IllegalArgumentException("Se sobrepasa el maximo numero maximo de apuestas");

		for (int i = 0; i < numApuestas; i++) {
			boolean iguales = false;
			do {
				Apuesta a = new Apuesta(numNumeros, numEstrellas, maxValorNumeros, maxValorEstrellas, seed++);
				if (!boleto.contains(a)) {
					boleto.add(a);
					iguales = true;
				}
			} while (!iguales);

		}
	}

	public String toString() {

		String text = "";

		text += "          EUROMILLONES         \n";
		text += boleto.size() + " apuesta (s)\n";
		text += "===============================\n";
		for (int i = 0; i < boleto.size(); i++) {
			text += String.format("  %d: %s%n", i + 1, boleto.get(i));
		}
		text += "===============================";
		return text;
	}

	private int[] calcularPremios(ArrayList<Integer> numeros, ArrayList<Integer> estrellas) {
		int[] listaPremio = new int[14];

		for (int i = 0; i < (boleto.size()); i++) {
			Apuesta p = this.boleto.get(i);
			int numAux = p.calcularPremio(numeros, estrellas);
			listaPremio[numAux]++;

		}
		return listaPremio;
	}

	public String resultadoPremio(ArrayList<Integer> numeros, ArrayList<Integer> estrellas) {
		int[] v = calcularPremios(numeros, estrellas);

		String text = "";
		boolean premio = false;

		text += "           Premios         \n";
		text += "===============================\n";
		for (int i = 1; i < boleto.size(); i++) {
			if (v[i] != 0) {
				text += String.format("nº de apuestas con premio de %dª categoria: %d%n", i, v[i]);
				premio = true;
				
			}
		}
		
		text += "===============================";
		return text;
	}

}

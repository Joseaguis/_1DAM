package practica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Apuesta {
	/**
	 * 
	 */

	ArrayList<Integer> numeros;
	ArrayList<Integer> estrellas;

	/**
	 * Crea una serie de numeros aleatorios con los cuales crea el objeto apuesta.
	 * La cantidad de numeros y estrellas ,y su valor maximo es variable.
	 * 
	 * @param numNumeros
	 * @param numEstrellas
	 * @param maxValorNumeros
	 * @param maxValorEstrellas
	 */
	public Apuesta(int numNumeros, int numEstrellas, int maxValorNumeros, int maxValorEstrellas) {
		numeros = new ArrayList<Integer>();
		estrellas = new ArrayList<Integer>();

		Random r = new Random();

		// Generacion de los numeros aleatorios
		for (int i = 0; i < numNumeros; i++) {
			boolean contiene = false;
			do {
				int numAux = r.nextInt(maxValorNumeros) + 1;
				if (!numeros.contains(numAux)) {
					numeros.add(numAux);
					contiene = true;
				}

			} while (!contiene);
		}

		Collections.sort(numeros);

		// Generacion de las estrellas aleatorios
		for (int i = 0; i < numEstrellas; i++) {
			
			boolean contiene = false;
			do {
				int numAux = r.nextInt(maxValorEstrellas) + 1;
				if (!estrellas.contains(numAux)) {
					estrellas.add(numAux);
					contiene = true;
				}

			} while (!contiene);
		}

		Collections.sort(estrellas);
	}

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (!(o instanceof Apuesta)) {
			return false;
		}
		Apuesta a = (Apuesta) o;


		if (this.numeros.equals(a.numeros) && this.estrellas.equals(a.estrellas)) {
			System.out.println("True");
			return true;
		} else {
			return false;
		}

	}

	public String toString() {
		// TODO
		String text = "";

		for (int i = 0; i < this.numeros.size(); i++) {
			text += String.format("%02d ", this.numeros.get(i));
		}
		
		text.trim();

		text += " - (";

		for (int i = 0; i < this.estrellas.size(); i++) {
			text += String.format("%02d ", this.estrellas.get(i));
		}
		
		text = text.substring(0, (text.length() - 1));
		text += ")";
		
		return text;
	}

}

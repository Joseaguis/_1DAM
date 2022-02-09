package practica;

import java.util.ArrayList;

public class Boleto {
	private final static int MAXAPUESTAS = 5;

	private ArrayList<Apuesta> boleto ;

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
}

package _02Ejemplos._05Ordenacion;

public class Ordenacion {
	/**
	 * Ordena un array de int siguiente el metodo de SELECCION DIRECTA
	 * 
	 * @param v
	 */
	public static void ordenar(int[] v) {
		for (int i = 0; i < v.length - 1; i++) {
			// Localizamos a partir de la posicion 1
			int posMin = i;
			for (int j = i + 1; j < v.length; j++) {
				if (v[j] < v[posMin]) {
					posMin = j;
				}
			}
			// Intercambia los elementos de las posiciones
			int numAux = v[i];
			v[i] = v[posMin];
			v[posMin] = numAux;
		}
	}

	public static void ordenar(double[] v) {
		for (int i = 0; i < v.length - 1; i++) {
			// Localizamos a partir de la posicion 1
			int posMin = i;
			for (int j = i + 1; j < v.length; j++) {
				if (v[j] < v[posMin]) {
					posMin = j;
				}
			}
			// Intercambia los elementos de las posiciones
			double numAux = v[i];
			v[i] = v[posMin];
			v[posMin] = numAux;
		}
	}
	
	public static void ordenar(Object[] v) {
		for (int i = 0; i < v.length - 1; i++) {
			// Localizamos a partir de la posicion 1
			int posMin = i;
			for (int j = i + 1; j < v.length; j++) {
				if (((Comparable)v[j]).compareTo(v[posMin])< 0 ) {
					posMin = j;
				}
			}
			// Intercambia los elementos de las posiciones
			Object aux = v[i];
			v[i] = v[posMin];
			v[posMin] = aux;
		}
	}
	
}

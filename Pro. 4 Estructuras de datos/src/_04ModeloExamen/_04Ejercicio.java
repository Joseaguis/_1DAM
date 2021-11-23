package _04ModeloExamen;

public class _04Ejercicio {
	public static void main(String[] args) {

		int[] bases = { 7, 8, 9, 6, 5, 7, 4, 8 };
		int[] alturas = { 3, 4, 5, 9, 7, 9 };
		areaMaxima(bases, alturas);

	}

	public static void areaMaxima(int bases[], int alturas[]) {
		int longitud = Math.min(bases.length, alturas.length);
		int maximo = -1;
		double areaMaximo = -1;

		for (int i = 0; i < longitud; i++) {
			double area = (bases[i] * alturas[i]) / 2.0;
			if (area > areaMaximo) {
				maximo = i;
				areaMaximo = area;
			}
		}
		System.out.println("Posición del triangulo con area maxima: " + maximo);
		System.out.println("Base " + bases[maximo]);
		System.out.println("altura " + alturas[maximo]);
		System.out.println("Area " + areaMaximo);
	}
}

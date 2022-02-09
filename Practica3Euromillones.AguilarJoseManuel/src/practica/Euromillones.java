package practica;

public class Euromillones {
	public static void main(String[] args) {

		final int NUMMAX = 50;
		final int ESTRELLA_MAX = 12;
		final int COMB_NUMEROS = 5;
		final int COMB_ESTRELLAS = 2;
		int seed;
		Apuesta a = new Apuesta(COMB_NUMEROS, COMB_ESTRELLAS, NUMMAX, ESTRELLA_MAX);
		System.out.println(a);
		
		Boleto boleto = new Boleto(4, COMB_NUMEROS, COMB_ESTRELLAS, NUMMAX, ESTRELLA_MAX);
		
		System.out.println(boleto);
	}
}

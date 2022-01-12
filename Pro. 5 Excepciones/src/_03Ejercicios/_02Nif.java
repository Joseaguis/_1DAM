package _03Ejercicios;

public class _02Nif {
	public static void main(String[] args) {
		System.out.println(nif("12345678N"));
		System.out.println(nif("12356678N"));
		System.out.println(nif("1234561238N"));
		System.out.println(nif("12345C676"));
		System.out.println(nif("12345678H"));
		System.out.println(nif("12345678Z"));
		System.out.println(nif("12345678z"));

	}

	public static boolean nif(String nif) {
		boolean correcto = false;
		int numNif;
		String letras[] = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V",
				"H", "L", "C", "K", "E" };
		try {

			if (nif.length() == 9) {
				numNif = Integer.parseInt(nif.substring(0, 8));
				int resto = numNif % 23;
				if (letras[resto].equals(nif.substring(8).toUpperCase())) {
					correcto = true;
				}
			}
		} catch (NumberFormatException e) {
			// TODO: handle exception
		}
		return correcto;
	}
}

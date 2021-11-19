package _03Ejercicios;

public class _09Tocayos {
	public static void main(String[] args) {

		String[] grupo1 = { "miguel", "jose", "ana", "juan" };
		String[] grupo2 = { "ana", "jose", "julian", "pepa", "sofia", "bartolo" };

		int tocayo = 0;
		for (int i = 0; i < grupo1.length; i++) {
			boolean encontrado = false;
			for (int j = 0; j < grupo2.length && !encontrado; j++) {
				if (grupo1[i].equals(grupo2[j])) {
					tocayo++;
					encontrado = true;
				}
			}
		}
		System.out.println("Hay unos " + tocayo + " de nombres repetidos");
	}
}

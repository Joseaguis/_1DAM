package _02Ejemplos._02Tiempo;

public class Test {
	public static void main(String[] args) {

		/**
		 * La version 1 tiene un problema: no tenemos control sobre que valores toman
		 * los atributos
		 * 
		 */

		Tiempo entrada = new Tiempo();

		entrada.setHora(7);
		entrada.setHora(entrada.getHora() + 1);

		System.out.println(entrada.getHora());

	}

}

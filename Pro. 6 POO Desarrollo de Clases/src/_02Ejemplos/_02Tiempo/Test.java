package _02Ejemplos._02Tiempo;

public class Test {
	public static void main(String[] args) {

		/**
		 * La version 1 tiene un problema: no tenemos control sobre que valores toman
		 * los atributos
		 * 
		 */

		Tiempo entrada = new Tiempo(7,55,0);
		System.out.println(entrada.toString());
		
		Tiempo prueba = new Tiempo(3661);
		System.out.println(prueba.toString());
		
		// entrada hora = entrada hora + 1
		entrada.setHora(entrada.getHora() + 1);

		System.out.println(entrada.toString());
		
		System.out.println();
		
		// Esta instruccion provoca una excepcion
		entrada.setHora(18869);

	}

}

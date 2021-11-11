package _02Ejemplos;

public class _08Recorrido {
	public static void main(String[] args) {
		int[] edad = { 2, 20, 18, 33, 12, 21, 55, 7, 4, 4, 8, 37, 8, 47, 4, 15, 91, 58 };

		// Si edad contiene las edaddes de una serie de personas
		// contar cuantas de ellas son mayores de edad
		int nMayorEdad = 0;
		for (int i = 0; i < edad.length; i++) {
			if (edad[i] >= 18)
				nMayorEdad++;
		}
		System.out.println("Hay " + nMayorEdad + " Personas que son mayor de edad");

		// Contar cuantos jubilados (>= 65) hay
		// Recorrido descendente
		int jubilados = 0;
		for (int i = edad.length - 1; i > 0; i--) {
			if (edad[i] >= 65) {
				jubilados++;
			}
		}
		System.out.println(jubilados);
	}
}

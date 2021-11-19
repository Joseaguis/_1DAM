package _02Ejemplos;

public class _09Recorrido {
	public static void main(String[] args) {

		int[] edad = { 2, 8, 16, 4, 21, 19, 4 };

		// Cuantos mayores de edad? RECORRIDO
		int mayores = 0;
		for (int i = 0; i < edad.length; i++) {
			if (edad[i] >= 18) {
				mayores++;
			}
		}
		System.out.println("Mayores de edad: " + (mayores));

		// Hay alguien en edad de estudair la ESO (12 a 16)?

		boolean encontrado = false;
		for (int i = 0; i < edad.length && !encontrado; i++) {
			if (edad[i] >= 12 && edad[i] <= 16) {
				encontrado = true;
			}
		}
		if (encontrado) {
			System.out.println("Hay alguien en edad de estudiar ESO");
		}else {
			System.out.println("NO HAY NADIE en edad de estudiar ESO");
		}
		// Hay alguien en edad de jubilación?
		int i = 0;
		while (i < edad.length && edad [i] < 65) {
			i++;
		}
		if (i < edad.length) {
			System.out.println("Hay alguien en edad de jubilación");
		}else {
			System.out.println("No hay alguien en edad de jubilación");
		}	
		
		
	}
}

package _02Ejemplos;

public class _04Caracteres {
	public static void main(String[] args) {
		
		//Los literales de tipo char se representan con comillas simples
		char inicial = 'J';
		System.out.println("La inicial de mi nombre es " + inicial);
		System.out.println("La inicial de mi nombre es " + (int)inicial + "\n" );
		
		if (inicial == 'A') {
			System.out.println("Tu nombre empieza por A");
		}else {
			System.out.println("Tu nombre no empieza por A" + "\n");
		}
		
		//hay una relacion entre caracteres y numeros
		System.out.println((int)'A');
		System.out.println((char)100);
		
		if (inicial >= 'A' && inicial <='Z') {
			System.out.println("Tu inicial esta en mayusula");
		}else {
			System.out.println("Tu inicial esta en minuscula");
		}
		
		//Secuencias de escape
		
		System.out.println("Hola\nque\ntal");
		System.out.println("Nombre\tApellido\tApellido2");
		System.out.println("Los tabuladores en java se ponen con \\t");
		System.out.println("El saludo diciendo \"hola\"");
		char comillaSimple = '\'';
		System.out.println("Hola que tal \b");
	}
}

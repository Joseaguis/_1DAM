package _02Ejemplos._03Polimorfismo;

import _03ejercicios._03Figuras.Circulo;
import _03ejercicios._03Figuras.Figura;
import _03ejercicios._03Figuras.Rectangulo;

public class _04Castings {
	public static void main(String[] args) {
		// Array de figuras
		Figura v1[] = { new Circulo(10, 10, "Rojo", 20), new Circulo(20, 30, "Azul", 30) };

		// Podemos recorrer el array y llamar al metodo toString, o area, pero no a get
		// Radio
		for (int i = 0; i < v1.length; i++) {
			System.out.println(v1[i].toString());
			System.out.println(v1[i].area());
			System.out.println(v1[i].getPosX());

			// Si estoy seguro de que los objetos de v1[] son Circulos
			// Puedo hacer un casting
			System.out.println(((Circulo) v1[i]).getRadio());
		}

		Figura v2[] = { new Circulo(10, 10, "Rojo", 20), new Rectangulo(20, 30, "Azul", 40, 50) };
		System.out.println("----------------");
		for (int i = 0; i < v2.length; i++) {
			// Esto compila, PERO producira un ERROR DE EJECUCION
			try {
				System.out.println(((Circulo) v2[i]).getRadio());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("----------------");
		for (int i = 0; i < v2.length; i++) {
			if(v2[i] instanceof Circulo) {
				System.out.println(((Circulo) v2[i]).getRadio());
			} else if (v2[i] instanceof Rectangulo) {
				System.out.println(((Rectangulo) v2[i]).getAltura());
			}
		}
		System.out.println("----------------");
		
		// Imposible que una variable tipo Integer tenga almacenado un objeto de tipo String
		
	}
}

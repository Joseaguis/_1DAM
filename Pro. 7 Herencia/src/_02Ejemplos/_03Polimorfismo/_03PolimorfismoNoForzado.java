package _02Ejemplos._03Polimorfismo;

import _02Ejemplos._01Alumnos.Persona;

public class _03PolimorfismoNoForzado {
	public static void main(String[] args) {
		Persona p1 = new Persona("11111A", "Pepe");
		Persona p2 = new Persona("11111A", "Jose");
		
		if (p1.equals(p2)) {
			System.out.println("Misma persona");
		} else {
			System.out.println("Distinta persona");
		}
		
	}
}

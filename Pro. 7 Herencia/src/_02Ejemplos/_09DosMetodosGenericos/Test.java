package _02Ejemplos._09DosMetodosGenericos;

import _02Ejemplos._02Animales.Gato;
import _02Ejemplos._02Animales.Perro;

public class Test {
	public static void main(String[] args) {
		Pareja<String, Integer> pareja = new Pareja<>("El Quijote", 450);
		
		Pareja<Perro, Gato> p2 = new Pareja<> (new Perro(), new Gato());
	}
}

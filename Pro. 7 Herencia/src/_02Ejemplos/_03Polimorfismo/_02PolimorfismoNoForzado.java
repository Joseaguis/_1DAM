package _02Ejemplos._03Polimorfismo;

import _02Ejemplos._02Animales.Animal;
import _02Ejemplos._02Animales.Gato;
import _02Ejemplos._02Animales.Lobo;
import _02Ejemplos._02Animales.Perro;

public class _02PolimorfismoNoForzado {
	public static void main(String[] args) {
		Animal [] animales = {new Perro(), new Gato(), new Lobo()};
	}
	
	public static void todosSaludan (Animal[] v) {
		for (int i = 0; i < v.length; i++) {
			Animal a = v[i]; // <<---- Polimorfismo
			a.saludar();
		}
	}
}

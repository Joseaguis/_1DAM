package _02Ejemplos._03Polimorfismo;

import _02Ejemplos._02Animales.Animal;
import _02Ejemplos._02Animales.Gato;
import _02Ejemplos._02Animales.Mascota;
import _02Ejemplos._02Animales.Perro;

public class _05CastingInterface {
	public static void main(String[] args) {
		Animal[] a = {new Perro(), new Gato()};
		
		for (int i = 0; i < a.length; i++) {
			a[i].saludar();
			((Mascota)a[i]).pasear();
		}
		
	}
}

package _02Ejemplos._03Polimorfismo;

import _02Ejemplos._02Animales.Animal;
import _02Ejemplos._02Animales.Canino;
import _02Ejemplos._02Animales.Felino;
import _02Ejemplos._02Animales.Perro;

public class _01PolimorfismoForzado {
	Animal a = new Perro();	// Puedo guardar un perro en la variable Animal
	Canino c = new Perro(); // Puedo guardar un perro en la variable canino
	Perro p = new Perro(); // Puedo guardar un perro en la variable perro
	
	//Felino f = new Perro(); No se puede hacer ya que perro no es un felino
	
	
	
}

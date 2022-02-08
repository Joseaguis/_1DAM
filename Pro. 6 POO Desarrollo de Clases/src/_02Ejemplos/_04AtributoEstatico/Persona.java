package _02Ejemplos._04AtributoEstatico;

import java.util.NoSuchElementException;

public class Persona {
	// Impedir que se creen mas de 5 objetos de la clase Persona

	private String dni;
	private String nombre;

	private static int numPersonas = 0;

	public Persona(String dni, String nombre) {
		if (numPersonas == 5) throw new NoSuchElementException();
		this.dni = dni;
		this.nombre = nombre;
		numPersonas++;

	}
	public static void main(String[] args) {
		Persona p1 = new Persona("1", "hola");
		Persona p2 = new Persona("1", "hola");
		Persona p3 = new Persona("1", "hola");
		Persona p4 = new Persona("1", "hola");
		Persona p5 = new Persona("1", "hola");
		Persona p6 = new Persona("1", "hola");
		
	}
}

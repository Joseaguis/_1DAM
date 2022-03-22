package _02Ejemplos._02Animales;

public class Perro extends Canino implements Mascota{
	@Override
	public void saludar() {
		System.out.println("Guau Guau!!");
	}

	@Override
	public void pasear() {
		System.out.println("Soy un perro paseando");
		
	}
}

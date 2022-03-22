package _02Ejemplos._02Animales;

public class Gato extends Felino implements Mascota{
	@Override
	public void saludar() {
		System.out.println("Miauu!!");
	}
	
	@Override
	public void trepar() {
		System.out.println("Soy un gato trepando");
	}
	
	@Override
	public void pasear() {
		System.out.println("Soy un gato paseando");
	}
	
}

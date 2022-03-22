package _03ejercicios._03Figuras;

public abstract class Figura {
	private int posX;
	private int posY;
	private String color;

	public Figura(int posX, int posY, String color) {
		this.posX = posX;
		this.posY = posY;
		this.color = color;
	}

	public String toString() {
		return String.format("(%d,%d) - %s - %.2f m2", posX, posY, color, area());
	}

	public abstract double area();
	public abstract double perimetro();
}

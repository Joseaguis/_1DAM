package _03ejercicios._03Figuras;

public class Rectangulo extends Figura {
	private int altura;
	private int anchura;

	public Rectangulo(int posX, int posY, String color, int altura, int anchura) {
		super(posX, posY, color);
		this.altura = altura;
		this.anchura = anchura;
	}

	@Override
	public String toString() {
		return super.toString() + String.format(" - Dimensiones (%d,%d)", this.altura,this.anchura);
	}

	
	public double area() {
		return altura * anchura;
	}

	public double perimetro() {
		return (altura * 2) + (anchura * 2);
	}
}

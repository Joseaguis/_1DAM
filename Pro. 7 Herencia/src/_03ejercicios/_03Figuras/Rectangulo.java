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

	public int getAltura() {
		return altura;
	}

	public int getAnchura() {
		return anchura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public void setAnchura(int anchura) {
		this.anchura = anchura;
	}
	
}

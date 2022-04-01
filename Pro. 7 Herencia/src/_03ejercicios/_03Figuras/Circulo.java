package _03ejercicios._03Figuras;

public class Circulo extends Figura {
	private int radio;

	public Circulo(int posX, int posY, String color, int radio) {
		super(posX, posY, color);
		this.radio = radio;
	}

	@Override
	public String toString() {
		return super.toString() + " - Radio: " + this.radio;
	}

	public double area() {
		return Math.PI * (radio * radio);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + radio;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Circulo))
			return false;
		Circulo other = (Circulo) obj;
		if (radio != other.radio)
			return false;
		return true;
	}

	public double perimetro() {
		return (Math.PI * 2) * radio;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

}

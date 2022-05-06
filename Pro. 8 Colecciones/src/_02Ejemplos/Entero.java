package _02Ejemplos;

public class Entero {
	private int number;

	public Entero(int num) {
		this.number = num;
	}
	
	public boolean equals(Object o) {
		return this == o || o instanceof Entero && this.number == ((Entero)o).number;
	}
	
	public int hashCode() {
		return this.number % 10;
	}
}

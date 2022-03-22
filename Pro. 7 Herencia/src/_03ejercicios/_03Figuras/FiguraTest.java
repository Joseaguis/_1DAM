package _03ejercicios._03Figuras;

public class FiguraTest {
	public static void main(String[] args) {
		Circulo c = new Circulo(0, 0, "verde", 3);
		Rectangulo r = new Rectangulo(1, 1, "Azul", 12, 8);
		
		System.out.println(c.toString());
		System.out.println(r.toString());
	}
}

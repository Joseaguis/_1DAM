package _02Ejemplos._02Animales;

public class Test {
	public static void main(String[] args) {
		Animal a1 = new Perro();
		
		
		Perro p1 = new Perro();
		p1.saludar();
		p1.pasear();
		
		Gato g1 = new Gato();
		g1.saludar();
		g1.pasear();
		
		Lobo l1 = new Lobo();
		l1.saludar();
		
		Tigre t1 = new Tigre();
		t1.saludar();
		
		Animal felinos[] = {g1,t1};
		System.out.println("Array Animales");
		for (int i = 0; i < felinos.length; i++) {
			felinos[i].saludar();
		}
		
		for (int i = 0; i < felinos.length; i++) {
			((Felino) felinos[i]).trepar();
		}
		
		System.out.println("Array de Mascotas");
		Mascota misAnimales[] = {p1,g1};
		for (int i = 0; i < misAnimales.length; i++) {
			misAnimales[i].pasear();
		}
		
	}
	
}

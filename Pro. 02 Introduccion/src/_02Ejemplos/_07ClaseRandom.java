package _02Ejemplos;

import java.util.Random;

public class _07ClaseRandom {
	public static void main(String[] args) {
		//La clase random se apoya en Math.random() para permitirnos hacer las cosas mas faciles
		
		Random r = new Random();
		
		System.out.println(r.nextInt());
		System.out.println(r.nextDouble());
		System.out.println(r.nextBoolean());
		
		System.out.println(1 + r.nextInt(6));
		
		//Tambien permite especificar una semilla
		Random r2 = new Random(100);
		
		System.out.println(r2.nextInt());
		System.out.println(r2.nextInt());
		System.out.println(r2.nextInt());
	}
}

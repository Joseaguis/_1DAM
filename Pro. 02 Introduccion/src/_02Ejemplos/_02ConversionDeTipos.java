package _02Ejemplos;

public class _02ConversionDeTipos {
	public static void main(String[] args) {
		
		byte b1 = 3; //se convierte implicitamente de int a byte
		
		//byte b2 = 1453; //no se convierte implicitamente de int a byte
		
		//Tambien se puede convertir de entero a real
		int edad = 30;
		double edad2 = edad;
		float edad3 = edad;
		
		//Pero no funciona al reves
		double estatura = 1.89;
		//int estatura2 = estatura
		
		
		//Conversiones de tipo explicita
		double peso = 85.5;
		int quilos = (int) peso;
		
		
		
	}
}

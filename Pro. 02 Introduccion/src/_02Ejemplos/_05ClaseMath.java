package _02Ejemplos;

public class _05ClaseMath {
	public static void main(String[] args) {
		//Constantes
		System.out.println(Math.PI);
		System.out.println(Math.E);
		
		//Funciones de redondeos
		System.out.println("Ceil " + Math.ceil(150.343));
		System.out.println("Floor " + Math.floor(189.846));
		System.out.println("Round " + Math.round(150.343));
		System.out.println("Round " + Math.round(189.846));
		
		//Raiz
		System.out.println("Raiz: " + Math.sqrt(4.7));
		System.out.println("Raiz: " + Math.sqrt(-10));
		
		//Pow
		System.out.println("Pow: " + Math.pow(10,3));
		System.out.println("Pow: " + Math.pow(10.5,3));
		System.out.println("Pow: " + Math.pow(10,3.5));
		System.out.println("Pow: " + Math.pow(-10,0.3));
		
		//Random
		System.out.println(Math.random()); //Numero aleatorio entre [0, 1[
		
	}
}

package _02Ejemplos;

import java.util.Scanner;

public class _04CalcularNota {
	public static void main(String[] args) {

		double nota_Primer_Examen;
		double nota_Segundo_Examen;
		double practicas_Hechas;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿que no ta sacaste en el primer examen?");
		nota_Primer_Examen = sc.nextDouble();
		
		System.out.println("¿que no ta sacaste en el segundo examen?");
		nota_Segundo_Examen = sc.nextDouble();
		
		System.out.println("¿cuantos trabajos has hecho?");
		practicas_Hechas = sc.nextDouble();
		
		double media_Examen = (nota_Primer_Examen + nota_Segundo_Examen) / 2;
		double parte_Examen = media_Examen * 0.8;
		
		Double parte_Practica = (practicas_Hechas / 10) * 2;
		
		System.out.println(parte_Examen + parte_Practica);
		
		sc.close();
	}
}

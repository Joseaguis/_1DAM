package _04ModeloExamen;

import java.util.Scanner;

public class _01Ejercicio {
	
	final int PRECIOFIJOCONTRATO = 5;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce datos consumidos: ");
		double mbConsumido = sc.nextDouble();
		
		System.out.println("Introduce minutos consumidos: ");
		int minutosConsumido = sc.nextInt();
		
		double costeDatos = 0;
		double costeLlamadas = 0;
		double precioPorMb = 0;
		
		if (minutosConsumido <= 1000)precioPorMb = 0.05;
		else if (minutosConsumido > 1000 && minutosConsumido <= 1500)precioPorMb = 0.03;
		else if (minutosConsumido > 1500 && minutosConsumido <= 5000)precioPorMb = 0.02;
		else precioPorMb = 0.01;
		
		costeDatos = mbConsumido * precioPorMb;
		
		if (mbConsumido < 5000) {
			//Coste Fijo de las llamadas
			costeLlamadas += 5; 
			if (minutosConsumido > 200) {
				minutosConsumido -= 200;
				costeLlamadas = minutosConsumido * 0.07;
			}
		}
		
		double costeTotal = costeDatos + costeLlamadas;
		double costeTotalIVA = calcularIVA(costeTotal, 21);
		
		
		System.out.print("\nFactura:");
		System.out.format("%n-Coste por datos:    %05.2f€", costeDatos);
		System.out.format("%n-Coste por llamadas: %05.2f€", costeLlamadas);
		System.out.format("%n-Total:              %05.2f€", costeTotal);
		System.out.format("%n-Total IVA INCLUIDO: %05.2f€", costeTotalIVA);
		
	}
	public static double calcularIVA (double importe, double iva) {
		return importe + (importe * (iva/100));
	}
}

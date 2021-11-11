package _02Ejemplos;

import java.util.Arrays;

public class _07ClaseArrays {
	public static void main(String[] args) {
		int[] v1 = {1,2,3,4,5};
		int[] v2 = {1,2,3,4,5};
		
		
		//Las operaciones con arrays COMPLETOS, generalmente no funcionan
		//Este codigo no funcionara
		if(v1.equals(v2)) {
			System.out.println("los arrays son iguales");
		}else {
			System.out.println("los arrays no son iguales");
		}
		
		System.out.println(v1);
		System.out.println(v2);
		
		//Disponesm os de una clase, llamada Arrays, que hace operaciones
		//con arrays completos
		
		//Imprimir un array
		System.out.println(Arrays.toString(v1));
		
		//Ordenar un array
		int[] v3 = {4,2,1,7,3,12,9};
		System.out.println(Arrays.toString(v3));
		Arrays.sort(v3);
		System.out.println(Arrays.toString(v3));
		
		//Comparar un array
		if(Arrays.equals(v1, v2)) {
			System.out.println("los arrays son iguales");
		}else {
			System.out.println("los arrays no son iguales");
		}
		
		//Rellenar un array
		double[] v5 = new double [10];
		Arrays.fill(v5, 4.67);
		System.out.println(Arrays.toString(v5));
		
	}
}

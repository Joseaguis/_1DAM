package _02Ejemplos._06Ordenacion;

import java.util.Arrays;
import java.util.Comparator;

import _02Ejemplos._05Ordenacion.Vehiculo;

public class OrdenarVariosCriterios {
	public static void main(String[] args) {
		// Vamos a ordenar un array de vehiculos usando
		// distintos criterios de ordenacion;
		Vehiculo[] v = { new Vehiculo("45321C", "Seat", "Ibiza"), new Vehiculo("78675H", "Volkswagen", "Golf"),
				new Vehiculo("84249Y", "Toyota", "Corolla") };

		// Ordenacion segun el criterio que indica el metodo
		// CompareTo de la clase Vehiculo (Ordenacion natural
		// u ordenacion por defecto)

		Arrays.sort(v);
		System.out.println(Arrays.toString(v));

		// Usnado una clase externa que implementa Comparator<Vehiculo>
		Arrays.sort(v, new ComparadorPorMarca());
		System.out.println(Arrays.toString(v));

		// Usando una clase interna(inner class) que implementa COmparator<Vehiculo>
//		Arrays.sort(v, new ComparadorLongitudModelo());
		System.out.println(Arrays.toString(v));

		// Usando una clase "al vuelo" o "anonima" (Anonymous)
		Arrays.sort(v, new Comparator<Vehiculo>() {
			public int compare(Vehiculo v1, Vehiculo v2) {
				return v1.getModelo().length() - v2.getModelo().length();
			}
		});
		System.out.println(Arrays.toString(v));
		
		// Usando una expresion lambda
		Arrays.sort(v, (v1,v2) -> v1.getModelo().length() - v2.getModelo().length());
		
		System.out.println(Arrays.toString(v));
	}
	
	class ComparadorLongitudModelo implements Comparator<Vehiculo> {

		@Override
		public int compare(Vehiculo o1, Vehiculo o2) {
			
			return o1.getModelo().length() - o2.getModelo().length();
		}
		
	}
}


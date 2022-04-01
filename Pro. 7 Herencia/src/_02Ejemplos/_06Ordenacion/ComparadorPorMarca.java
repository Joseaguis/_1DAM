package _02Ejemplos._06Ordenacion;

import java.util.Comparator;

import _02Ejemplos._05Ordenacion.Vehiculo;

public class ComparadorPorMarca implements Comparator<Vehiculo> {

	public int compare(Vehiculo v1, Vehiculo v2) {
		return v1.getMarca().compareTo(v2.getMarca());
	}






}

package _04EjerciciosInterfaces._04Ordenacion;

import java.util.Comparator;

import _04EjerciciosInterfaces._03Ejercicio.Publicacion;

public class ComparadorPorCodigo implements Comparator<Publicacion>{

	@Override
	public int compare(Publicacion o1, Publicacion o2) {
		return o1.getCodigo().compareTo(o2.getCodigo());	
	}

}

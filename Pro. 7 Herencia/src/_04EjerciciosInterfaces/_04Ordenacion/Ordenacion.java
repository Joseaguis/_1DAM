package _04EjerciciosInterfaces._04Ordenacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import _04EjerciciosInterfaces._03Ejercicio.Dvd;
import _04EjerciciosInterfaces._03Ejercicio.Libro;
import _04EjerciciosInterfaces._03Ejercicio.Prestable;
import _04EjerciciosInterfaces._03Ejercicio.Publicacion;

public class Ordenacion {
	public static void main(String[] args) {
		
		ArrayList<Publicacion> listaP = new ArrayList<>();
		listaP.add(new Libro("123", "El senyor", 1999));
		listaP.add(new Dvd("5123", "El padrino", 1995, 120));
		
		((Prestable)listaP.get(1)).prestar();
		
		for (Publicacion publicacion : listaP) {
			System.out.println(publicacion.titulo);
		}
		
		mostrarPorCodigo(listaP);
		mostrarPorTitulo(listaP);
		mostrarPorAnyo(listaP);
		mostrarAnyoDecreciente(listaP);
		
		
	}
	
	private static void mostrarPorCodigo(ArrayList<Publicacion> l) {
		System.out.println("Por codigo ----------------------------");
		Collections.sort(l, new ComparadorPorCodigo());
		for (Publicacion publicacion : l) {
			System.out.println(publicacion.titulo);
		}
	}
	
	private static void mostrarPorTitulo(ArrayList<Publicacion> l) {
		// Ordenad la lista usando una clase interna (inner class)
		System.out.println("Por titulo ----------------------------");
		Collections.sort(l, new ComparadorPorTitulo());
		for (Publicacion publicacion : l) {
			System.out.println(publicacion.titulo);
		}
	}
	
	private static void mostrarPorAnyo(ArrayList<Publicacion> l) {
		// Ordenar la lista usando una clase anonima que implementa COmparator
		System.out.println("Por anyo ----------------------------");
		Collections.sort(l, new Comparator<Publicacion>() {
			public int compare(Publicacion p1, Publicacion p2) {
				return p1.getAnyo() - p2.getAnyo();
			}
		});
		for (Publicacion publicacion : l) {
			System.out.println(publicacion.titulo);
		}
	}
	
	private static void mostrarAnyoDecreciente(ArrayList<Publicacion> l) {
		// Ordenad la lista usando una expresion lambda
				System.out.println("Por año decreciente ----------------------------");
				Collections.sort(l, (p1, p2) -> {
					return p1.getAnyo() + p2.getAnyo();
				});
				for (Publicacion publicacion : l) {
					System.out.println(publicacion.titulo);
				}
	}
	
	
	
}

class ComparadorPorTitulo implements Comparator<Publicacion> {

	@Override
	public int compare(Publicacion o1, Publicacion o2) {
		return o1.getTitulo().compareTo(o2.getTitulo());
	}
	
}

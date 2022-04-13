package _04EjerciciosInterfaces._05Filtrado;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import _04EjerciciosInterfaces._03Ejercicio.Dvd;
import _04EjerciciosInterfaces._03Ejercicio.Libro;
import _04EjerciciosInterfaces._03Ejercicio.Publicacion;

public class Filtrado {
	public static void main(String[] args) {
		ArrayList<Publicacion> listaP = new ArrayList<>();
		listaP.add(new Libro("123", "El senyor", 1998));
		listaP.add(new Dvd("5123", "Terminator", 2001, 120));
		listaP.add(new Libro("623", "Avatar", 2012));
		listaP.add(new Dvd("732", "Meep", 2016, 160));
		listaP.add(new Libro("823", "Spiderman", 2022));
		listaP.add(new Dvd("093", "Solo en casa", 2004, 120));

		filtrarPublicacion(listaP, (p) -> {
			return (p.getAnyo() % 2) == 0;
		});
		System.out.println("---------------------");
		
		filtrarPublicacion(listaP, (p) -> {
			return p.getTitulo().length() > 5;
		});
		
		System.out.println("---------------------");
		filtrarPublicacion(listaP, (p) -> {
			return p.getAnyo() == 2022;
		});
		System.out.println("---------------------");
		filtrarPublicacion(listaP, (p) -> {
			return (p.getAnyo() > 2000 && p.getAnyo() < 2005) && p.titulo.contains("casa");
		});
		System.out.println("---------------------");
		filtrarPublicacion(listaP, (p) -> {
			return  p instanceof Libro;
		});

	}


	private static void filtrarPublicacion(ArrayList<Publicacion> l, Predicate<Publicacion> predicado) {
		// TODO Auto-generated method stub
		for (Publicacion p : l) {
			if (predicado.test(p)) System.out.println(p);
		}
	}

}

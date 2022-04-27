package _04EjerciciosInterfaces._06Eliminar;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

import _04EjerciciosInterfaces._03Ejercicio.Dvd;
import _04EjerciciosInterfaces._03Ejercicio.Libro;
import _04EjerciciosInterfaces._03Ejercicio.Publicacion;

public class Eliminar {
	
	public static void main(String[] args) {
		ArrayList<Publicacion> listaP = new ArrayList<>();
		listaP.add(new Libro("123", "El senyor", 1998));
		listaP.add(new Dvd("5123", "Terminator", 2001, 120));
		listaP.add(new Libro("623", "Avatar", 2012));
		listaP.add(new Dvd("732", "Meep", 2016, 160));
		listaP.add(new Libro("823", "Spiderman", 2022));
		listaP.add(new Dvd("093", "Solo en casa", 2004, 120));
		
		System.out.println(listaP);
		eliminatTodos(listaP, (p) -> {
			return p instanceof Libro;
		});
		System.out.println(listaP);
		
		
	}
	
	// Implementar un metodo eliminatTodos que reciba una lista y un Predicate
	// y que elimine de la lista todos los elementos que pasan el test del predicate
	// Recordar que hay que recorrer con un Iterator y borrar con el metodo remove del iterator
	// 
	public static void eliminatTodos(ArrayList<Publicacion> l, Predicate<Publicacion> pred) {
		Iterator<Publicacion> it = l.iterator();
		while (it.hasNext()) {
			Publicacion publicacion = (Publicacion) it.next();
			if(pred.test(publicacion)) it.remove();
		}
	}
}

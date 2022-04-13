package _04EjerciciosInterfaces._03Ejercicio;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		
		ArrayList<Publicacion> listaP = new ArrayList<>();
		listaP.add(new Libro("123", "El senyor", 1999));
		listaP.add(new Dvd("5123", "El padrino", 1995, 120));
		
		((Prestable)listaP.get(1)).prestar();
		
		int cantidadPrestada = 0;
		for (Publicacion publicacion : listaP) {
			System.out.println(publicacion.titulo);
			if (((Prestable)publicacion).getPrestado() == true) cantidadPrestada++;
		}
		System.out.println(cantidadPrestada);
		
		
		
	}
}

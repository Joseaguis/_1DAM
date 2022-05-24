package _03Ejercicios._14OfertasHoteleras;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Rastreador {
	public static void main(String[] args) {
		List<Oferta> ofertas = new ArrayList<>();
		
		ofertas.add(new Oferta(new Hotel("Las arenas", "Valencia", 4),150));
		ofertas.add(new Oferta(new Hotel("Las arenas", "Valencia", 4),120));
		ofertas.add(new Oferta(new Hotel("Las arenas", "Valencia", 4),135));

		ofertas.add(new Oferta(new Hotel("Only you", "Valencia", 5),350));
		ofertas.add(new Oferta(new Hotel("Only you", "Valencia", 5),300));
		ofertas.add(new Oferta(new Hotel("Only you", "Valencia", 5),250));
		
		ofertas.add(new Oferta(new Hotel("Plaza", "Alacuas", 3),50));
		ofertas.add(new Oferta(new Hotel("Plaza", "Alacuas", 3),70));
		ofertas.add(new Oferta(new Hotel("Plaza", "Alacuas", 3),60));
		
		Map<Hotel, Double> ofertaMasBarata = new LinkedHashMap<>();
		for (Iterator<Oferta> it = ofertas.iterator(); it.hasNext();) {
			Oferta oferta = (Oferta) it.next();
			Double precio = ofertaMasBarata.get(oferta.getHotel());
			if (precio == null) {
				ofertaMasBarata.put(oferta.getHotel(), oferta.getPrecio());
			} else {
				if (precio > oferta.getPrecio()) ofertaMasBarata.put(oferta.getHotel(), oferta.getPrecio());
			}
		}
		
		System.out.println(ofertaMasBarata);
		
	}
	
	/*
	 * Se pide crear un Map<Hotel, Double> que contenga la oferta MAS BARATA
	 * de cada hotel de los que hay en la lista de ofertas
	 * Si fuera necesario modificar las clases Hotel y Oferta
	 * (equals, hashCode, toString, getters, setters, ...)
	 */
}

package _03Ejercicios._14OfertasHoteleras;

import java.util.Objects;

public class Hotel {
	private String nombre;
	private String ciudad;
	private int estrellas;
	
	public Hotel(String nombre, String ciudad, int estrellas) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.estrellas = estrellas;
	}
	
	@Override
	public String toString() {
		return nombre + " - " + ciudad + " - " + estrellas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ciudad, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Hotel))
			return false;
		Hotel other = (Hotel) obj;
		return Objects.equals(ciudad, other.ciudad) && Objects.equals(nombre, other.nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public int getEstrellas() {
		return estrellas;
	}
	
	
}

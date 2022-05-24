package _03Ejercicios._14OfertasHoteleras;

import java.util.Objects;

public class Oferta implements Comparable<Oferta>{
	private Hotel hotel;
	private double precio;
	
	public Oferta(Hotel hotel, double precio) {
		this.hotel = hotel;
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return hotel + " - Precio:" + precio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(hotel, precio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Oferta))
			return false;
		Oferta other = (Oferta) obj;
		return Objects.equals(hotel, other.hotel)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}

	public Hotel getHotel() {
		return this.hotel;
	}
	
	public double getPrecio() {
		return this.precio;
	}

	@Override
	public int compareTo(Oferta o) {
		return (int)(this.precio - ((Oferta)o).precio);
	}
	
	
	
}

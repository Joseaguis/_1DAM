package _03Ejercicios._02Reservaslibreria;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ListaReservas {
	private ArrayList<Reserva> listaReserva;

	public ListaReservas() {
		listaReserva = new ArrayList<Reserva>();
	}

	public void reservar(String nif, String nombre, String telefono, int libro, int ejemplares)
			throws IllegalArgumentException {
		Reserva nuevaReserva = new Reserva(nif, nombre, telefono, libro, ejemplares);
		if (!listaReserva.contains(nuevaReserva)) {
			listaReserva.add(nuevaReserva);
		} else {
			throw new IllegalArgumentException();
		}

	}

	public void cancelar(String nif, int libro) throws NoSuchElementException {
		Reserva reservaTemp = new Reserva(nif, "1", "1", libro);
		if (listaReserva.contains(reservaTemp)) {
			listaReserva.remove(reservaTemp);
		} else {
			throw new NoSuchElementException();
		}
	}

	public String toString() {
		String texto = "";
		Iterator<Reserva> it = listaReserva.iterator();
		while (it.hasNext()) {
			Reserva listaReservas = (Reserva) it.next();
			texto += listaReservas.toString();
		}
		return texto;
	}

	public int numEjemplaresReservadosLibro(int codigo) {
		Iterator<Reserva> it = listaReserva.iterator();
		int numEjemplares = 0;
		while (it.hasNext()) {
			Reserva reserva = (Reserva) it.next();
			if (reserva.getCodLibroReservado() == codigo) {
				numEjemplares++;
			}
		}
		return numEjemplares;
	}
	
	public String reservasLibro(int codigo) {
		Iterator<Reserva> it = listaReserva.iterator();
		String listaReserva = "";
		while (it.hasNext()) {
			Reserva reserva = (Reserva) it.next();
			if (reserva.getCodLibroReservado() == codigo) {
				listaReserva += "\nNombre cliente: " + reserva.getNombreCliente() + "\n" + "Telefono Cliente: " + reserva.getTelfCliente() + "\n";
			}
		}
		return listaReserva;
	}
}

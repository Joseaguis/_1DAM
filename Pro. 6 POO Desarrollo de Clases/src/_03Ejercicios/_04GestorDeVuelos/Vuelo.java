package _03Ejercicios._04GestorDeVuelos;

import _02Ejemplos._03Tiempo.Tiempo;

public class Vuelo {
	private String id;
	private String origen;
	private String destino;
	private Tiempo horaSalida;
	private Tiempo horaLlegada;
	private int capacidad;
	private int numReservas;
	private Pasajero[] pasaje;

	public Vuelo(String id, String origen, String destino, Tiempo horaSalida, Tiempo horaLlegada, int capacidad) {
		this.id = id;
		this.origen = origen;
		this.destino = destino;
		this.horaSalida = horaSalida;
		this.horaLlegada = horaLlegada;
		this.capacidad = capacidad;
		this.numReservas = 0;
		pasaje = new Pasajero[this.capacidad + 1];
	}

	public boolean hayLibres() {
		boolean encontrado = false;
		for (int i = 1; i < pasaje.length && !encontrado; i++) {
			Pasajero pasajero = pasaje[i];
			if (pasajero == null) {
				encontrado = true;
			}
		}

		return encontrado;
	}

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (!(o instanceof Vuelo)) {
			return false;
		}

		Vuelo v = (Vuelo) o;
		if (this.id.equals(v.id)) {
			return true;
		} else {
			return false;
		}
	}

	public int reservarAsiento(String nombrePasajero, String nifPasajero) throws IllegalArgumentException {
		int i;
		boolean encontrado = false;

		for (i = 1; i < pasaje.length && !encontrado; i++) {
			Pasajero p = pasaje[i];
			if (p != null) {
				if (p.getDni() == nifPasajero) {
					throw new IllegalArgumentException("pasajero duplicado");
				}
			} else {
				encontrado = true;
			}
		}
		if (!encontrado) {
			i = 0;
		} else {
			Pasajero pasajero = new Pasajero(nifPasajero, nombrePasajero);
			pasaje[i] = pasajero;
		}
		return i;
	}

	private int[] asientosLibres() {
		int[] libre = new int[pasaje.length];
		int numAsientosLibres = 0;
		for (int i = 1; i < pasaje.length; i++) {
			if (pasaje[i] == null) {
				libre[i] = i;
				numAsientosLibres++;
			}
		}
		int[] asientosLibres = new int[numAsientosLibres + 1];
		for (int i = 1; i < libre.length; i++) {
			int j = 1;
			if (libre[i] > 0) {
				asientosLibres[j] = libre[i];
			}
		}
		return asientosLibres;
	}
}

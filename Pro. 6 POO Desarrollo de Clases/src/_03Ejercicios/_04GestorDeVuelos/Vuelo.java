package _03Ejercicios._04GestorDeVuelos;

import java.util.Random;

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
		if (numReservas < capacidad) {
			return true;
		} else {
			return false;
		}
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
		if (!hayLibres()) {
			return 0;
		} else {
			// Creamos el pasajero que insertaremos en el array
			Pasajero p = new Pasajero(nifPasajero, nombrePasajero);
			// Comprobar que p no esta esta ya entre el pasaje

			for (int i = 1; i < pasaje.length; i++) {
				if (pasaje[i] != null && pasaje[i].equals(p)) {
					throw new IllegalArgumentException("El pasajero ya tiene una reserva");
				}
			}
			
			int posicion;
			do {
				posicion = (int) (Math.random() * capacidad) + 1;
			} while (pasaje[posicion] != null);
			
			// Guardamos al pasajero en pasaje
			pasaje[posicion] = p;
			this.numReservas++;
			return posicion;
		}
	}

	public int reservarAsiento(String nombrePasajero, String nifPasajero, char preferencia) throws IllegalArgumentException {
		if (!hayLibres()) {
			return 0;
		} else {
			// Creamos el pasajero que insertaremos en el array
			Pasajero p = new Pasajero(nifPasajero, nombrePasajero);
			// Comprobar que p no esta esta ya entre el pasaje
			for (int i = 1; i < pasaje.length; i++) {
				if (pasaje[i] != null && pasaje[i].equals(p)) {
					throw new IllegalArgumentException("El pasajero ya tiene una reserva");
				}
			}
			
			int posicion = 0;
			if (preferencia == 'V') {
				for (int i = 1; i < pasaje.length && posicion == 0; i += 2) {
					if (pasaje[i] == null) {
						posicion = i;
					}
				}
			} else if (preferencia == 'P') {
				for (int i = 2; i < pasaje.length && posicion == 0; i += 2) {
					if (pasaje[i] == null) {
						posicion = i;
					}
				}
			} else {
				throw new IllegalArgumentException("nombre preferencia de");
			}
			
			if (posicion == 0) {
				for (int i = 1; i < pasaje.length && posicion == 0; i++) {
					if (pasaje[i] == null) {
						posicion = i;
					}
				}
			}
			
			// Guardamos al pasajero en pasaje
			pasaje[posicion] = p;
			this.numReservas++;
			return posicion;
		}
	}
	
	public void cancelarReserva(int numAsiento) {
		if (pasaje[numAsiento] == null) {
			throw new IllegalArgumentException("El asiento no esta reservado");
		} else {
			pasaje[numAsiento] = null;
			numReservas--;
		}
	}
	
	public String toString() {
		String resultado = id + " - " + origen + " - " + destino + " - " + horaSalida + " - " + horaLlegada + "\nPasajeros:";
		for (int i = 0; i < pasaje.length; i++) {
			if (pasaje[i] != null) {
				resultado += "\nAsiento " + i + ": " + pasaje[i];
			}
			
		}
		return resultado;
	}
	
}

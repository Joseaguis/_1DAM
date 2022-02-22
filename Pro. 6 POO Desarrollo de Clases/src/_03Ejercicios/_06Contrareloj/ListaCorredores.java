package _03Ejercicios._06Contrareloj;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import _02Ejemplos._03Tiempo.Tiempo;

public class ListaCorredores {
	ArrayList<Corredor> lista;

	public ListaCorredores() {
		lista = new ArrayList<>();
	}

	public void anyadir(Corredor c) throws IllegalArgumentException {
		if (!lista.add(c)) {
			throw new IllegalArgumentException("Corredor ya en la lista");
		}
	}

	public void insertarOrdenador(Corredor c) {
		if (!lista.contains(c)) {
			lista.add(c.getDorsal(), c);
		} else {
			throw new IllegalArgumentException("Corredor ya en la lista");
		}
	}

	public Corredor quitar(int dorsal) throws NoSuchElementException {
		Tiempo tiempo = new Tiempo(1);
		Corredor corredor = new Corredor(dorsal, "21", tiempo);
		if (lista.remove(corredor)) {
			return corredor;
		} else {
			throw new NoSuchElementException("No existe el corredor");
		}
	}

	public String toString() {
		String text = "";
		
		for (int i = 0; i < lista.size(); i++) {
			text += "Posicion: " + (i + 1) + "\n";
			text += lista.get(i) + "\n";
		}
		return text;
	}
}

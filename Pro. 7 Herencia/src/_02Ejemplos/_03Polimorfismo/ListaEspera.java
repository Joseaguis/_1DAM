package _02Ejemplos._03Polimorfismo;

import java.util.ArrayList;

import _02Ejemplos._01Alumnos.Persona;

public class ListaEspera implements Cola {

	private ArrayList<Persona> lista;
	
	public ListaEspera() {
		lista = new ArrayList<Persona>();
	}
	
	@Override
	public void encolar(Object o) {
		lista.add((Persona)o);
		
	}

	@Override
	public Object desencolar() {
		Persona p = lista.get(0);
		lista.remove(0);
		return p;
	}

	@Override
	public int getTamanyo() {
		return lista.size();
	}
	
}

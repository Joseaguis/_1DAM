package _03Ejercicios._07GestorCorreoElectronico;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Carpeta {
	private String nombre;
	private ArrayList<Mensaje> lista;

	public Carpeta(String nombre) {
		this.nombre = nombre;
		this.lista = new ArrayList<>();
	}

	public void anyadir(Mensaje m) {
		this.lista.add(m);
	}

	public void borrar(Mensaje m) {
		if (!lista.remove(m)) {
			throw new NoSuchElementException("El mensaje no esta en la carpeta");
		}
	}

	public Mensaje buscar(int codigo) {
		for (Mensaje m : lista) {
			if (m.getCodigo() == codigo) {
				return m;
			}
		}
		return null;
	}
	
	public static void moverMensaje(Carpeta origen, Carpeta destino, int codigo) {
		Mensaje m = origen.buscar(codigo);
		if (m != null) {
			origen.borrar(m);
			destino.anyadir(m);
		}
	}
	
	public  String toString() {
		String result = "Carpeta " + nombre;
		for (Mensaje mensaje : lista) {
			result += "/n--------------/n";
			result += mensaje;
		}
		return result;
 	}
}

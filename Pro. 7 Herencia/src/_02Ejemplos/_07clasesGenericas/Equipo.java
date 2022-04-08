package _02Ejemplos._07clasesGenericas;

import java.util.ArrayList;

public class Equipo <T> {
	String nombre;
	ArrayList<T> plantilla;
	T capitan;

	public Equipo(String nombre) {
		this.nombre = nombre;
		plantilla = new ArrayList<>();
		capitan = null;
	}

	public boolean fichar(T f) {
		if (!plantilla.contains(f)) {
			plantilla.add(f);
			if (capitan == null) {
				capitan = f;
			}
			return true;
		}
		return false;
	}

	public boolean despedir(T f) {
		boolean estaba = plantilla.remove(f);
		if (estaba) {
			if (capitan.equals(capitan)) {
				if (plantilla.size() > 0) {
					capitan = plantilla.get(0);
				} else {
					capitan = null;
				}

			}

			return true;
		} else {
			return false;
		}

	}
	
	public T getCapitan() {
		return capitan;
	}
	
}

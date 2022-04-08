package _02Ejemplos._07clasesGenericas;

import java.util.ArrayList;
import java.util.Iterator;

public class EquipoFutbol {
	String nombre;
	ArrayList<Futbolista> plantilla;
	Futbolista capitan;

	public EquipoFutbol(String nombre) {
		this.nombre = nombre;
		plantilla = new ArrayList<>();
		capitan = null;
	}

	public boolean fichar(Futbolista f) {
		if (!plantilla.contains(f)) {
			plantilla.add(f);
			if (capitan == null) {
				capitan = f;
			}
			return true;
		}
		return false;
	}

	public boolean despedir(Futbolista f) {
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
	
	public Futbolista getCapitan() {
		return capitan;
	}
	
}

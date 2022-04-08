package _02Ejemplos._07clasesGenericas;

import java.util.ArrayList;
import java.util.Iterator;

public class EquipoObject {
	String nombre;
	ArrayList<Object> plantilla;
	Object capitan;

	public EquipoObject(String nombre) {
		this.nombre = nombre;
		plantilla = new ArrayList<>();
		capitan = null;
	}

	public boolean fichar(Object f) {
		if (!plantilla.contains(f)) {
			plantilla.add(f);
			if (capitan == null) {
				capitan = f;
			}
			return true;
		}
		return false;
	}

	public boolean despedir(Object f) {
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
	
	public Object getCapitan() {
		return capitan;
	}
	
}

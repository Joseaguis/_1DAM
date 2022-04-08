package _02Ejemplos._07clasesGenericas;

import java.util.ArrayList;
import java.util.Iterator;

public class EquipoProgramame {
	String nombre;
	ArrayList<Programador> plantilla;
	Programador capitan;

	public EquipoProgramame(String nombre) {
		this.nombre = nombre;
		plantilla = new ArrayList<>();
		capitan = null;
	}

	public boolean fichar(Programador f) {
		if (!plantilla.contains(f)) {
			plantilla.add(f);
			if (capitan == null) {
				capitan = f;
			}
			return true;
		}
		return false;
	}

	public boolean despedir(Programador f) {
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
	
	public Programador getCapitan() {
		return capitan;
	}
	
}

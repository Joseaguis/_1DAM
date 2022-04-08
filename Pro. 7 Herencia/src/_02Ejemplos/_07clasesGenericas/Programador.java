package _02Ejemplos._07clasesGenericas;

public class Programador {
	private String dni;
	private String nombre;
	private String lenguaje;
	
	public Programador(String dni, String nombre, String lenguaje) {
		this.dni = dni;
		this.nombre = nombre;
		this.lenguaje = lenguaje;
	}
	
	@Override
	public String toString() {
		return dni + " - " + nombre + " - " + lenguaje;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Programador))
			return false;
		Programador other = (Programador) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}
	
	public String getLenguaje() {
		return this.lenguaje;
	}
	
	
}

package _02Ejemplos.Alumnos;

public class Persona implements Comparable<Persona> {
	private String dni;
	private String nombre;

	public Persona(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}
	
	

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Persona))
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	public int compareTo(Persona p) {
		return this.dni.compareTo(p.dni);

	}
	
	public String toString() {
		return dni + " - " + nombre;
	}
	
}

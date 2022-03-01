package _02Ejemplos.Alumnos;

public class Persona implements Comparable<Persona> {
	private String dni;
	private String nombre;
	
	public Persona() {
		
	}

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

	public boolean equals(Object o) {
		if (this == o)
			return true;

		if (!(o instanceof Persona))
			return false;

		return this.dni.equals(((Persona) o).dni);

	}

	public int compareTo(Persona p) {
		return this.dni.compareTo(p.dni);

	}
	
	public String toString() {
		return dni + " - " + nombre;
	}
	
}

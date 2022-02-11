package _03Ejercicios._04GestorDeVuelos;

public class Pasajero {
	private String dni;
	private String nombre;

	public Pasajero(String dni, String nombre) {
		setDni(dni);
		setNombre(nombre);
	}

	public String toString() {

		return String.format("%s - %s", this.dni, this.nombre);
	}

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (!(o instanceof Pasajero)) {
			return false;
		}

		Pasajero p = (Pasajero) o;
		if (this.dni.equals(p.dni)) {
			return true;
		} else {
			return false;
		}
	}

	public String getDni() {
		return this.dni;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}

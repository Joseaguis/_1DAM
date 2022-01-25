package _03Ejercicios._01gestionempleados;

import java.util.Calendar;

public class Empleado {
	private String nombre;
	private String dni;
	private int anyo;
	private double sueldo;

	public Empleado(String nombre, String dni, int anyo, double sueldo) {
		this.setNombre(nombre);
		this.setDni(dni);
		this.setAnyo(anyo);
		this.setSueldo(sueldo);
	}

	public int antiguedad() {

		int anyoActual = Calendar.getInstance().get(Calendar.YEAR);
		int anyosAntiguedad = anyoActual - this.anyo;

		return anyosAntiguedad;
	}

	public void incrementarSueldo(double porcentaje) {
		double sueldoNuevo = this.sueldo * ((porcentaje / 100) + 1);
		setSueldo(sueldoNuevo);
	}

	public String toString() {
		String EmpleadoFormateado;

		EmpleadoFormateado = String.format(
				"Nombre: %s%n " + "Dni: %s%n" + "Año de ingreso: %x%n" + "Sueldo bruto anual: %f",
				this.nombre, this.dni, this.anyo, this.sueldo);

		return EmpleadoFormateado;
	}
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Empleado)) {
			return false;
		}
		if (this) {
			
		}
	}

	/*
	 * Getters
	 */
	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

	public int getAnyo() {
		return anyo;
	}

	public double getSueldo() {
		return sueldo;
	}

	/*
	 * Setters
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setAnyo(int anyo) {
		if (anyo < 0) {
			throw new IllegalArgumentException();
		}
		this.anyo = anyo;
	}

	public void setSueldo(double sueldo) {
		if (sueldo < 0) {
			throw new IllegalArgumentException();
		}
		this.sueldo = sueldo;
	}

}

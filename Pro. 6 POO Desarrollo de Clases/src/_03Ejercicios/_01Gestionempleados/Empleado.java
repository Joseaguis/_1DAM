package _03Ejercicios._01Gestionempleados;

import java.util.Calendar;

import _02Ejemplos._03Tiempo.Tiempo;

public class Empleado implements Comparable<Empleado> {

	private String nombre;
	private String dni;
	private int anyo;
	private double sueldo;

	/**
	 * @param nombre
	 * @param dni
	 * @param anyo
	 * @param sueldo
	 */
	/**
	 * @param nombre
	 * @param dni
	 * @param anyo
	 * @param sueldo
	 */
	public Empleado(String nombre, String dni, int anyo, double sueldo) {
		this.setNombre(nombre);
		this.setDni(dni);
		this.setAnyo(anyo);
		this.setSueldo(sueldo);
	}

	/**
	 * @return
	 */
	public int antiguedad() {

		int anyoActual = Calendar.getInstance().get(Calendar.YEAR);
		int anyosAntiguedad = anyoActual - this.anyo;

		return anyosAntiguedad;
	}

	/**
	 * @param porcentaje
	 */
	public void incrementarSueldo(double porcentaje) {
		double sueldoNuevo = this.sueldo * ((porcentaje / 100) + 1);
		setSueldo(sueldoNuevo);
	}

	/**
	 *
	 */
	public String toString() {
		String EmpleadoFormateado;

		EmpleadoFormateado = String.format(
				"Nombre: %s%n" + "Dni: %s%n" + "Año de ingreso: %d%n" + "Sueldo bruto anual: %6.02f", this.nombre, this.dni,
				this.anyo, this.sueldo);

		return EmpleadoFormateado;
	}

	/**
	 *
	 */
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Empleado)) {
			return false;
		}
		Empleado e = (Empleado) o;
		if (this.dni.equals(e.dni)) {
			return true;
		} else {
			return false;
		}

	}

	public int compareTo(Empleado e) {

		if (this.dni.compareTo(e.dni) < 0) {
			return -1;
		} else if (this.dni.compareTo(e.dni) > 0 ) {
			return 1;
		} else {
			return 0;
		}
		
	}

	/**
	 * @param salarioMensual
	 * @return
	 */
	public static double calcularIRPF(double salarioMensual) {
		double porcentajeIRPF = 0;

		if (salarioMensual <= 800) {
			porcentajeIRPF = 3;
		} else if (salarioMensual <= 1000) {
			porcentajeIRPF = 10;
		} else if (salarioMensual <= 1500) {
			porcentajeIRPF = 15;
		} else if (salarioMensual <= 2100) {
			porcentajeIRPF = 20;
		} else {
			porcentajeIRPF = 30;
		}

		return salarioMensual * (porcentajeIRPF / 100);
	}

	/*
	 * Getters
	 */
	
	/**
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @return
	 */
	public int getAnyo() {
		return anyo;
	}

	/**
	 * @return
	 */
	public double getSueldo() {
		return sueldo;
	}

	/*
	 * Setters
	 */
	/**
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @param dni
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @param anyo
	 */
	public void setAnyo(int anyo) {
		if (anyo < 0) {
			throw new IllegalArgumentException();
		}
		this.anyo = anyo;
	}

	/**
	 * @param sueldo
	 */
	public void setSueldo(double sueldo) {
		if (sueldo < 0) {
			throw new IllegalArgumentException();
		}
		this.sueldo = sueldo;
	}

}

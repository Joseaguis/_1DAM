package _03Ejercicios._01Gestionempleados;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author alumno
 *
 */
public class Empresa {

	private String nombre;
	private ArrayList<Empleado> plantilla;

	public Empresa(String nombreEmpresa) {
		setNombreEmpresa(nombreEmpresa);
		this.plantilla = new ArrayList<Empleado>();
	}

	/**
	 * @param e
	 * @throws IllegalArgumentException
	 */
	public void contratar(Empleado e) throws IllegalArgumentException {
		if (!plantilla.contains(e)) {
			plantilla.add(e);
		} else {
			throw new IllegalArgumentException("No se puede contratar a alguien que ya está contratado");
		}
	}

	/**
	 * @param e
	 * @throws NoSuchElementException
	 */
	public void despedir(Empleado e) throws NoSuchElementException {
		if (!plantilla.remove(e)) {
			throw new NoSuchElementException("No se puede despedir a alguien que no está contratado");
		}
	}

	public void despedir(String dni) throws NoSuchElementException {
		Iterator<Empleado> it = plantilla.iterator();
		boolean encontrado = false;
		while (it.hasNext() || !encontrado) {
			Empleado empleado = (Empleado) it.next();
			if (empleado.getDni().equals(dni)) {
				encontrado = true;
				plantilla.remove(plantilla.indexOf(empleado));
			}
		}
		if (!encontrado) {
			throw new NoSuchElementException("No se puede despedir a alguien que no está contratado");
		}
	}

	public void subirTrienio(double porcentaje) {
		Iterator<Empleado> it = plantilla.iterator();
		while (it.hasNext()) {
			Empleado empleado = (Empleado) it.next();
			int anyoActual = Calendar.getInstance().get(Calendar.YEAR);
			if ((anyoActual - empleado.getAnyo()) % 3 == 0) {
				empleado.incrementarSueldo(porcentaje);
			}

		}
	}

	public String toString() {
		Iterator<Empleado> it = plantilla.iterator();
		String texto = this.nombre;

		while (it.hasNext()) {
			Empleado empleado = (Empleado) it.next();
			texto += "\n\n" + empleado.toString();
		}
		return texto;
	}

	public int getNumeroEmpleados() {
		return this.plantilla.size();
	}

	/**
	 * @return the nombreEmpresa
	 */
	public String getNombreEmpresa() {
		return nombre;
	}

	/**
	 * @return the listaEmpleados
	 */
	public ArrayList<Empleado> getListaEmpleados() {
		return plantilla;
	}

	/**
	 * @param nombreEmpresa the nombreEmpresa to set
	 */
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombre = nombreEmpresa;
	}
}

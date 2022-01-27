package _03Ejercicios._01gestionempleados;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Empresa {

	private String nombreEmpresa;
	private ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();

	public Empresa(String nombreEmpresa) {
		setNombreEmpresa(nombreEmpresa);
	}

	public void contratar(Empleado e) throws IllegalArgumentException {
		if (!listaEmpleados.contains(e)) {
			listaEmpleados.add(e);
		} else {
			throw new IllegalArgumentException("No se puede contratar a alguien que ya está contratado");
		}
	}

	public void despedir(Empleado e) throws NoSuchElementException {
		if (listaEmpleados.contains(e)) {
			listaEmpleados.remove(listaEmpleados.indexOf(e));
		} else {
			throw new NoSuchElementException("No se puede despedir a alguien que no está contratado");
		}
	}

	public void despedir(String dni) throws NoSuchElementException {
		Iterator<Empleado> it = listaEmpleados.iterator();
		boolean encontrado = false;
		while (it.hasNext() || !encontrado) {
			Empleado empleado = (Empleado) it.next();
			if (empleado.getDni().equals(dni)) {
				encontrado = true;
				listaEmpleados.remove(listaEmpleados.indexOf(empleado));
			}
		}
		if (!encontrado) {
			throw new NoSuchElementException("No se puede despedir a alguien que no está contratado");
		}
	}

	public void subirTrienio(double porcentaje) {
		Iterator<Empleado> it = listaEmpleados.iterator();
		while (it.hasNext()) {
			Empleado empleado = (Empleado) it.next();
			int anyoActual = Calendar.getInstance().get(Calendar.YEAR);
			if ((anyoActual - empleado.getAnyo()) % 3 == 0) {
				empleado.incrementarSueldo(porcentaje);
			}
			
		}
	}
	
	public String toString() {
		Iterator<Empleado> it = listaEmpleados.iterator();
		String texto = this.nombreEmpresa;
		
		while (it.hasNext()) {
			Empleado empleado = (Empleado) it.next();
			texto += "\n\n" + empleado.toString();
		}
		return texto;
	}

	public int getNumeroEmpleados() {
		return listaEmpleados.size();
	}

	/**
	 * @return the nombreEmpresa
	 */
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	/**
	 * @return the listaEmpleados
	 */
	public ArrayList<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}

	/**
	 * @param listaEmpleados the listaEmpleados to set
	 */
	public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}

	/**
	 * @param nombreEmpresa the nombreEmpresa to set
	 */
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
}

package _03Ejercicios._01gestionempleados;

import java.util.ArrayList;

public class Empresa {

	private String nombreEmpresa;
	private ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
	
	public Empresa (String nombreEmpresa) {
		setNombreEmpresa(nombreEmpresa);
	}
	
	public void contratar (Empleado e) {
		if (!listaEmpleados.contains(e)) {
			
		} else {
			throw new IllegalArgumentException();
		}
		
		
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

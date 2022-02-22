package _03Ejercicios._06Contrareloj;

import _02Ejemplos._03Tiempo.Tiempo;

public class Corredor {
	private static int siguienteDorsal;
	static {
		siguienteDorsal = 1;
	}
	private int dorsal;
	private String nombre;
	private Tiempo salida;
	private Tiempo llegada;

	public Corredor(int dorsal, String nombre, Tiempo salida) {
		this.dorsal = dorsal;
		this.nombre = nombre;
		this.salida = salida;
	}

	public int getDuracion() {
		if (llegada == null) {
			throw new UnsupportedOperationException("No hay hora de llegada");
		}
		int horaSalida = salida.getHora();
		int minSalida = salida.getMinuto();
		int segSalida = salida.getSegundo();

		int horaLlegada = llegada.getHora();
		int minLlegada = llegada.getMinuto();
		int segLlegada = llegada.getSegundo();

		return (horaLlegada - horaSalida) * 3600 + (minLlegada - minSalida) * 60 + (segLlegada - segSalida);
	}

	public String toString() {
		if (this.llegada != null) {
			return String.format("(%d) - %s - Salida: %s - Llegada: %s - Duracion: %d", this.dorsal,this.nombre,this.salida,this.llegada,getDuracion());
		} else {
			return String.format("(%d) - %s - Salida: %s", this.dorsal,this.nombre,this.salida);
		}
	}
	
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if (!(o instanceof Corredor)) {
			return false;
		}
		
		Corredor corredor = (Corredor) o;
		if (this.dorsal == corredor.getDorsal()) {
			return true;
		} else {
			return false;
		}
	}
	
	public int compareTo(Object o) {
		Corredor corredor = (Corredor) o;
		
		return this.dorsal - corredor.getDorsal();
	}
	
	public static int generarDorsal() {
		int d = siguienteDorsal;
		siguienteDorsal++;
		return d;
	}
	
	/**
	 * @return the siguienteDorsal
	 */
	public int getSiguienteDorsal() {
		return siguienteDorsal;
	}
	
	/**
	 * @return the dorsal
	 */
	public int getDorsal() {
		return dorsal;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the salida
	 */
	public Tiempo getSalida() {
		return salida;
	}

	/**
	 * @return the llegada
	 */
	public Tiempo getLlegada() {
		return llegada;
	}

	/**
	 * @param dorsal the dorsal to set
	 */
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @param salida the salida to set
	 */
	public void setSalida(Tiempo salida) {
		this.salida = salida;
	}

	/**
	 * @param llegada the llegada to set
	 */
	public void setLlegada(Tiempo llegada) throws IllegalArgumentException {
		if (this.salida.compareTo(llegada) > 0) {
			this.llegada = llegada;
		} else {
			throw new IllegalArgumentException("La hora de llegada debe ser despues de la de salida");
		}

	}

}

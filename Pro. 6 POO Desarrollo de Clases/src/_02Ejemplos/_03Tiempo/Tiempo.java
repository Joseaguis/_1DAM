package _02Ejemplos._03Tiempo;

/**
 * Clase para representar un instante de tiempo del dia, con precision de
 * segundos (hora, minuto y segundos)
 * 
 */
public class Tiempo {
	// Atributos: Los atributos son informacion que tienen cada uno de los objetos
	// pertenecen a una clase
	private int hora;
	private int minuto;
	private int segundo;

	// Metodos de la clase

	// Metodos constructores: Se ejecutan al crear un objeto
	// - Se ejecutan al crear un objeto
	// - Puede haber varios constructores si quiero que los objetos de la clase se
	// puedan crear de varias formas
	// - El constructor es un metodo que tiene el mismo nombre que la clase, no
	// devuelve nada PERO no se pone la palabra "void" en su cabezera

	/**
	 * Crea un objeto Tiempo dados una hora, un minuto y un segundo
	 * 
	 * @param hora    la hora
	 * @param minuto  el minuto
	 * @param segundo el segundo
	 */
	public Tiempo(int hora, int minuto, int segundo) {
		// Desde el constructor puedo llamar
		this.setHora(hora);
		this.setMinuto(minuto);
		this.setSegundo(segundo);

	}

	/**
	 * Crea un objeto Tiempo dados los segundos transcurridos desde las 00:00:00
	 * 
	 * @param segundosTranscurridos
	 */
	public Tiempo(int segundosTranscurridos) {
		int h = (segundosTranscurridos / 3600);
		int m = ((segundosTranscurridos % 3600) / 60);
		int s = ((segundosTranscurridos % 3600) % 60);
		this.setHora(h);
		this.setMinuto(m);
		this.setSegundo(s);
	}
	
	/**
	 * Crea un objeto Tiempo a partir de un String con formato hh:mm:ss
	 * Si el formano no es correcto se producira una excepcion
	 * SI la hora, minuto o segundo no son correctos, se producira excepcion
	 * 
	 * @param s
	 */
	public Tiempo (String s) {
		this.setHora(Integer.parseInt(s.substring(0, s.indexOf(':'))));
		this.setMinuto(Integer.parseInt(s.substring(s.indexOf(':') + 1, s.lastIndexOf(':'))));
		this.setSegundo(Integer.parseInt(s.substring(s.lastIndexOf(':') + 1)));
	}
	/*
	 * Devuelve un String representativo del objeto
	 */

	public String toString() {
		// return hora + ":" + minuto + ":" + segundo;
		return String.format("%02d:%02d:%02d", hora, minuto, segundo);
	}

	public boolean equals(Object o) {
		// Hay que comparar la hora, minuto y segundo de this con la hora , minuto y
		// segundo de p

		// Si this y 'o' son el mismo objeto (misma direccion de memoria) los objetos
		// son los mismos
		if (this == o)
			return true;

		// Si o no es el mismo tipo Tiempo, los objetos no seran iguales
		if (!(o instanceof Tiempo))
			return false;

		// Comparamos hora, minuto y segundo
		if (this.hora == ((Tiempo) o).hora && this.minuto == ((Tiempo) o).minuto
				&& this.segundo == ((Tiempo) o).segundo)
			return true;
		else
			return false;
	}

	// Metodo getter
	public int getHora() {
		return hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	// Metodo setter
	public void setHora(int hora) {
		if (hora < 0 || hora > 23)
			throw new IllegalArgumentException();
		this.hora = hora; // el this es necesario
	}

	public void setMinuto(int m) {
		if (m < 0 || m > 60)
			throw new IllegalArgumentException();
		this.minuto = m; // el this no es necesario
	}

	public void setSegundo(int s) {
		if (s < 0 || s > 60)
			throw new IllegalArgumentException();
		this.segundo = s; // el this no es necesario
	}

}
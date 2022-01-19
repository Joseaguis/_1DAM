package _02Ejemplos._02Tiempo;

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

	/*
	 * Devuelve un String representativo del objeto
	 */
	public String toString() {
		// return hora + ":" + minuto + ":" + segundo;
		return String.format("%02d:%02d:%02d", hora, minuto, segundo);
	}
	// Metodo getter
	public int getHora() {
		return hora;
	}
	public void setHora(int h) {
		if (h < 0 ||h > 23) throw new IllegalArgumentException();
		hora = h;
		
	}
}

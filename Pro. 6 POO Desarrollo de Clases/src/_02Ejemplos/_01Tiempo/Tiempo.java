package _02Ejemplos._01Tiempo;

/**
 * Clase para representar un instante de tiempo del dia, con precision de
 * segundos (hora, minuto y segundos)
 * 
 */
public class Tiempo {
	// Atributos: Los atributos son informacion que tienen cada uno de los objetos
	// pertenecen a una clase
	int hora;
	int minuto;
	int segundo;

	// Metodos de la clase

	/*
	 * Devuelve un String representativo del objeto
	 */
	public String toString() {
		// return hora + ":" + minuto + ":" + segundo;
		return String.format("%02d:%02d:%02d", hora, minuto, segundo);
	}

}

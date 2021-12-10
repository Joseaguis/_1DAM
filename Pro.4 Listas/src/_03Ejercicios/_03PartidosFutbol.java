package _03Ejercicios;

import java.util.ArrayList;
import java.util.Arrays;

public class _03PartidosFutbol {
	/*
	 * Dada una lista con los nombres de los equpos de la liga.
	 * Devolver otra lista con los partidos que habrá que disputar
	 * Ejemplo:
	 *  Equipos: a, b, c
	 *  Partidos a-b, a-c, b-a, b-c, c-a, c-b
	 */

	public static void main(String[] args) {
		ArrayList<String> equipos = new ArrayList<String>(Arrays.asList("a","b","c"));
		for (String partido : obtenerPartidos(equipos)) {
			System.out.println(partido);
		}
	}
	public static ArrayList<String> obtenerPartidos (ArrayList<String> equipos){
		ArrayList<String> l = new ArrayList<String>();
		for (String equipo1 : equipos) {
			for (String equipo2 : equipos) {
				if (!equipo1.equals(equipo2)) {
					l.add(equipo1 + "-" + equipo2);
				}
			}
		}
		
		return l;
	}
}

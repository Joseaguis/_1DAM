package _03Ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class _04Futbol {
	public static void main(String[] args) {
		String[] equiposParticipantes = {
				"Valencia", "Sevilla", "Real Madrid", "Barcelona",
				"Villareal", "Zaragoza", "Valladolid", "Cadiz"
		};
		String[][] partidosDisputados = {
				{"Valencia", "Sevilla", "Barcelona", "Cadiz"},{"Villareal", "Zaragoza", "Valladolid", "Real Madrid"}
		};
		System.out.println(Arrays.toString(equiposParticipantes));
		
		
		System.out.println(Arrays.toString(EquiposLocales(equiposParticipantes, partidosDisputados)));
		System.out.println(Arrays.toString(NoVisitante(equiposParticipantes, partidosDisputados)));
		
		
	}
	
	public static String[] EquiposLocales (String[] equiposParticipantes, String[][] partidos) {
		TreeSet<String> locales = new TreeSet<String>();
		
		for (int i = 0; i < partidos[0].length; i++) {
			String equipo = partidos[0][i];
			boolean encontrado = false;
			for (int j = 0; j < equiposParticipantes.length && !encontrado; j++) {
				if (equiposParticipantes[j].equals(equipo)) {
					locales.add(equipo);
					encontrado = true;
				}
			}
		}
		return locales.toArray(new String[0]);
	}
	
	public static String[] NoVisitante (String[] equiposParticipantes, String[][] partidos) {
		TreeSet<String> locales = new TreeSet<String>();
		
		for (int i = 0; i < partidos[0].length; i++) {
			String equipo = partidos[1][i];
			boolean encontrado = false;
			for (int j = 0; j < equiposParticipantes.length || !encontrado; j++) {
				if (equiposParticipantes[j].equals(equipo)) {
					locales.add(equipo);
					encontrado = true;
				}
			}
		}
		ArrayList<String> l = new ArrayList<>(Arrays.asList(equiposParticipantes));
		l.removeAll(locales);
		return l.toArray(new String[0]);
	}
}

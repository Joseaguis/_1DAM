package _03Ejercicios;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class _11EjercicioMaps {
	public static void main(String[] args) {
		List<String> vueltas = Arrays.asList(new String[] { "Arturo", "Encarna", "Maria", "Fran", "Carlos", "Daniel",
				"Miguel", "Maria", "Encarna", "Maria", "Fran", "Carlos", "Daniel", "Miguel", "Maria", "Antonio",
				"Pablo", "Maria", "Fran", "Pablo", "Daniel", "Miguel", "Maria", "Encarna", "Maria", "Fran", "Carlos",
				"Daniel", "Miguel", "Maria", "Antonio", "Pablo" });

		Map<String, String> patrocinios = new HashMap<>();
		patrocinios.put("Arturo", "Javi");
		patrocinios.put("Encarna", "Javi");
		patrocinios.put("Maria", "Esther");
		patrocinios.put("Fran", "Esther");
		patrocinios.put("Carlos", "Monica");
		patrocinios.put("Daniel", "Monica");

		mostrarPagos(vueltas, patrocinios);

	}

	private static void mostrarPagos(List<String> vueltas, Map<String, String> patrocinios) {
		// TODO
		Map<String, Integer> resultado = new TreeMap<>();
		final String SINPATROCINIO = "Sin Patrocinio";
		resultado.put(SINPATROCINIO, 0);

		for (String participante : vueltas) {

			String profesor = patrocinios.get(participante);
			
			if (profesor != null) {
				Integer val = resultado.get(profesor);
				
				if (val == null) {
					resultado.put(profesor, 1);
				} else {
					resultado.put(profesor, val + 1);
				}
				
			} else {
					resultado.put(SINPATROCINIO, resultado.get(SINPATROCINIO) + 1);
			}
		}
		
		String text = "";

		
		for (Map.Entry<String, Integer> entry : resultado.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();

			if (!key.equals(SINPATROCINIO)) {
				text += String.format("%s tiene que pagar %d euros%n", key, val);
			}
		}

		text += String.format("%nVueltas dadas por alumnado sin patrocinar: %d", resultado.get(SINPATROCINIO));

		System.out.println(text);

	}
}
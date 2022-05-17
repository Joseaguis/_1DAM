package _03Ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class _09Baloncesto {
	public static void main(String[] args) {
		List<String> faltas = new ArrayList<String>(
				Arrays.asList("A", "A", "A", "B", "C", "B", "C", "B", "B", "C", "A", "A", "B", "C", "A"));

		Map<String, Integer> m = new LinkedHashMap<String, Integer>();

		for (int i = 0; i < faltas.size(); i++) {
			
			Integer veces = m.get(faltas.get(i));
			
			if (veces == null) {
				m.put(faltas.get(i), 1);
			} else {
				m.put(faltas.get(i), veces + 1);
			}
		}

		System.out.println(m);

	}
}

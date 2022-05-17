package _03Ejercicios;

import java.util.Map;
import java.util.TreeMap;

public class _10Coches {
	public static void main(String[] args) {
		Map<String, Integer> coches = new TreeMap<>();
		Map<Integer, Integer> m = new TreeMap<>();

		coches.put("Toyota Corolla", 1999);
		coches.put("Seat ibiza", 2010);
		coches.put("Volkswagen Golf", 2000);
		coches.put("Seat Leon", 2010);
		coches.put("Mitsubisi 3", 1999);
		coches.put("Toyota pasta", 1999);
		
		for (Map.Entry<String, Integer> entry : coches.entrySet()) {
			Integer val = entry.getValue();
			Integer veces = m.get(val);
			if (veces == null) {
				m.put(val, 1);
			} else {
				m.put(val, veces + 1);
			}
		}
		
		System.out.println(m);
	}
}

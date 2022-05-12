package _02Ejemplos;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class _06MetodosMap {
	public static void main(String[] args) {
		LinkedHashMap<String, String> traducciones = new LinkedHashMap<>();
		
		// put: 
		// Si no existe una pareja co n la misma clave, inseta la pareja devuelve null
		traducciones.put("coche", "car");
		traducciones.put("bici", "bicycle");
		traducciones.put("casa", "home");
		traducciones.put("fuego", "fire");
		traducciones.put("balon", "ball");
		System.out.println(traducciones);
		
		// Si ya exista una pareja con la misma clave, sobreescribe el valor
		traducciones.put("casa", "house");
		System.out.println(traducciones);
		System.out.println();
		/*
		 * Get:
		 * Devuelve el valor con el que aparece determinada clave, o devuelve null
		 * si no hay ninguna pareja con esa clave
		 */
		System.out.println("Traduccion de coche: " + traducciones.get("coche"));
		System.out.println("Traduccion de moto: " + traducciones.get("moto"));
		System.out.println();
		/*
		 * Remove:
		 * Elimina la pareja cuya calve coincida con la indicada. Si la pareja
		 * existe, devuelve el valor con el que aparece. Si no existe, null
		 */
		System.out.println("Eliminar coche: " + traducciones.remove("coche"));
		System.out.println("Eliminar moto: " + traducciones.remove("moto"));
		System.out.println();
		/*
		 * containsKey y containsValue:
		 * nos dicen si una clve o si un valor estan en el map
		 */
		System.out.println("Tenemos traduccion de casa?: " + traducciones.containsKey("casa"));
		System.out.println("Tenemos alguna palabra que se traduzca como house?: " + traducciones.containsValue("house"));
		System.out.println();
		
		/*
		 * size():
		 * devuelve el numero de parejas
		 */
		System.out.println(traducciones.size());
		System.out.println();
		
		/*
		 * Claves y valores:
		 */
		System.out.println("Claves: " + traducciones.keySet());
		System.out.println("Valores: " + traducciones.values());
		System.out.println();
		
		/*
		 * Recorrido de un map:
		 * 
		 */
		Set<String> setCastellano = traducciones.keySet();
		for (String palabraCastellano : setCastellano) {
			String palabraIngles = traducciones.get(palabraCastellano);
			System.out.println("La traduccion de " + palabraCastellano + " es " + palabraIngles);
		}
		
		
	}
}

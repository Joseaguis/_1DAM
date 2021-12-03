package _02Ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class _07EliminarPares {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>(Arrays.asList(1, 7, 2, 4, 8, 2, 4, 9, 10, 5, 6, 0, 7, 3, 1));

		System.out.println(l);
		// Con un for:each no se puedemodificar lista mientras la recorremos
		
		Iterator<Integer> it = l.iterator();
		while (it.hasNext()) {
			int numero = it.next();
			if (numero % 2 == 0) {
				it.remove();	// Eliminamos sobre el iterator, no sobre la lista
			}
			
		}

	}
}

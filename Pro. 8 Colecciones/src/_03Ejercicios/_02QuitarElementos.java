package _03Ejercicios;

import java.util.Collection;
import java.util.Iterator;

public class _02QuitarElementos {
	public static void main(String[] args) {
		
	}
	
	public static Collection<String> QuitarElementos(Collection<String> coleccion, String prefijo) {
		
		Iterator<String> it = coleccion.iterator();
		
		while (it.hasNext()) {
			String s = it.next();
			if (s.startsWith(prefijo)) {
				it.remove();
			}
			
		}
		return coleccion;
	}
}

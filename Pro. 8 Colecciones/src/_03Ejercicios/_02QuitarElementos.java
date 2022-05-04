package _03Ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class _02QuitarElementos {
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<>(Arrays.asList("Casa","Pasa", "Camaron", "Estuche"));
		String s = "C";
		System.out.println(l);
		QuitarElementos(l, s);
		System.out.println(l);
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

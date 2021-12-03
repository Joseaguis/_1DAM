package _02Ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class _06RecorridoListas {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>(Arrays.asList(2,4,6,8,10));
		
		int suma = 0;
		for (int i = 0; i < l.size(); i++) {
			suma += l.get(i);
		}
		System.out.println(suma);
		
		//2. Con un bucle for each
		for (Integer i : l) {
			suma+= i;
		}
		
		//3. Con un objeto Iterator
		suma = 0;
		Iterator<Integer> it = l.iterator();
		while(it.hasNext()) {
			suma += it.next();
		}
	}
}

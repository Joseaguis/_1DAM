package _01Pruebas;

import java.util.ArrayList;

public class _01Listas {
	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<>();
		lista.add("Mario");
		lista.add("Jorge");
		lista.add("Verto");
		lista.add("Marco");
		lista.add("Javier");
		lista.add("Luis");
		lista.add("Mario");
		lista.add("Ester");
		lista.add("Jose");
		lista.add("Laura");
		lista.add("Mario");
		lista.add("Julian");
		
		int posP = 0;
		int posF = 0;
		System.out.println(lista);
		for (int i = 0; i < lista.size(); i++) {
			boolean continuar = true;
			do {
				posP = lista.indexOf(lista.get(i));
				posF = lista.lastIndexOf(lista.get(i));
				if (posP != posF) {
					lista.remove(posF);
				}else {
					continuar = false;
				}
			} while (continuar);
			System.out.println(lista);
		}
		System.out.println(lista);
		
	}
}

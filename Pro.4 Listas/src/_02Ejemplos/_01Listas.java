package _02Ejemplos;

import java.util.ArrayList;

public class _01Listas {
	public static void main(String[] args) {

		// Array de Strings
		String[] aProfes = new String[5];
		aProfes[0] = "Javi";
		aProfes[1] = "Chema";
		System.out.println(aProfes);

		// Lista de Strings
		ArrayList<String> lProfes = new ArrayList<>();

		// añadir elementos a la lista
		lProfes.add("Chema");
		lProfes.add("Javi");
		System.out.println(lProfes);
		
		// Insertar elementos en la lista
		lProfes.add(1, "Alejandro");
		System.out.println(lProfes);
		
		// Se puede eliminar
		/*
		 * lProfes.remove(1);
		 * System.out.println(lProfes);
		 * lProfes.remove("Javi");
		 * System.out.println(lProfes);z
		 */
		
		//Sobreescribir
		lProfes.set(0, "CHEMA");
		System.out.println(lProfes);
		
		//Consultar por posición
		String p = lProfes.get(2);
		System.out.println(p);
		
		//Consultar por contenido
		int posicion = lProfes.indexOf("Javi");
		System.out.println(posicion);
		
		//Buscar un elemento
		System.out.println(lProfes.contains("Nicolas"));
	}
}

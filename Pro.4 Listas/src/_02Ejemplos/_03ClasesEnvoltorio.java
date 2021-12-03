package _02Ejemplos;

import java.util.ArrayList;

public class _03ClasesEnvoltorio {
	public static void main(String[] args) {
		// no se pueden crear ArrayList de tipos primitivos
		// ArrayList<int> prueba;
		
		//Por cada tipo primitivo xiste una clase, llamada clases ENVOLTORIO (Wrapper)
		
		/*
		 * byte - Byte
		 * short - Short
		 * int - Integer
		 * long - Long
		 * float - Float
		 * double - Double
		 * char - Character
		 * boolean - Boolean
		 */
		
		
		
		
		ArrayList<Integer> listaNumeros = new ArrayList<>();
		listaNumeros.add(new Integer(10));
		listaNumeros.add(new Integer(20));
		listaNumeros.add(30);
		System.out.println(listaNumeros);
		
		ArrayList<Character> listaVocales = new ArrayList<>();
		listaVocales.add(new Character('a'));
		listaVocales.add(new Character('e'));
		listaVocales.add(new Character('i'));
		listaVocales.add(new Character('o'));
		listaVocales.add('u');
		System.out.println(listaVocales);
		
		
		
		
	}
}

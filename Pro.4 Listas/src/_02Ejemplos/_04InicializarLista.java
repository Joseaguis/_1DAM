package _02Ejemplos;

import java.util.ArrayList;
import java.util.Arrays;

public class _04InicializarLista {
	public static void main(String[] args) {
		ArrayList<String> l1 = new ArrayList<>();
		l1.add("luis");
		l1.add("javier");
		l1.add("pablo");
		l1.add("viecente");

		ArrayList<String> l2 = new ArrayList<>(Arrays.asList("luis", "pablo", "vicente", "javier"));
		System.out.println(l2);
	}
}

package _03Ejercicios;

import java.util.ArrayList;
import java.util.Arrays;

public class _02ActualizarCorreos {
	/*
	 * Disponemos de una lista con los alumnos del centro del 2020 y otra lista con
	 * los alumnos del centro del 2021 Implementar un método que devuelva una lista
	 * con los alumnos a los que hay que eliminarles la cuenta de correos
	 * electronico
	 * 
	 * Implementar un metodo que devuelva una lista con los alujmnos a los que hay
	 * que crear una cuenta
	 */

	public static void main(String[] args) {
		ArrayList<String> matricula2020 = new ArrayList<>(Arrays.asList("angel", "benito", "carlos", "david", "elena"));
		ArrayList<String> matricula2021 = new ArrayList<>(Arrays.asList("fede", "hector", "ismael", "david", "elena"));

		System.out.println(correosEliminar(matricula2020, matricula2021));
		System.out.println(correosCrear(matricula2020, matricula2021));
	}

	public static ArrayList<String> correosEliminar(ArrayList<String> anterior, ArrayList<String> actual) {
		ArrayList<String> listaEliminar = new ArrayList<>();

		for (String nombreAnterior : anterior) {
			if (!actual.contains(nombreAnterior)) {
				listaEliminar.add(nombreAnterior);
			}
		}
		return listaEliminar;
	}

	public static ArrayList<String> correosCrear(ArrayList<String> anterior, ArrayList<String> actual) {
		ArrayList<String> listaCrear = new ArrayList<>();

		for (String nombreActual : actual) {
			if (!anterior.contains(nombreActual)) {
				listaCrear.add(nombreActual);
			}
		}
		return listaCrear;
	}
}

package _03Ejercicios;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _15Notas {
	public static void main(String[] args) {
		double[][] notas = { { 8, 8, 8, 8 }, { 4, 8, 2, 9 }, { 9, 7, 8, 6 }, { 5, 5, 5, 5 }, { 6, 2, 8, 5 } };

		imprimirNotasAlumnos(notas);
		imprimirNotasAsignatura(notas);
		imprimirMediaAlumnos(notas);
		imprimirMediaAsignatura(notas);
		indicarAsignaturaMasFacil(notas);
		System.out.println("Hay algun alumno que haya suspendido todo?: " + HayAlumnoQueSuspendaTodo(notas));

	}

	public static void imprimirNotasAlumnos(double[][] notas) {

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Alumno: " + i);
			for (int j = 0; j < notas[i].length; j++) {
				System.out.println("----Asignatura " + j + " : " + notas[i][j]);
			}
		}

	}

	public static void imprimirNotasAsignatura(double[][] notas) {

		for (int j = 0; j < notas[0].length; j++) {
			System.out.println("Asignatura: " + j);
			for (int i = 0; i < notas[j].length; i++) {
				System.out.println("----Alumno " + i + " : " + notas[i][j]);
			}
		}
	}

	public static void imprimirMediaAlumnos(double[][] notas) {
		int j;
		for (int i = 0; i < notas.length; i++) {
			double sumaNotas = 0;
			for (j = 0; j < notas[i].length; j++) {
				sumaNotas += notas[i][j];
			}
			double media = sumaNotas / notas[0].length;
			System.out.format("Media del Alumno %d: %04.2f%n", i, media);
		}
	}

	public static void imprimirMediaAsignatura(double[][] notas) {
		int j;
		for (j = 0; j < notas[0].length; j++) {
			double sumaNotas = 0;
			for (int i = 0; i < notas.length; i++) {
				sumaNotas += notas[i][j];
			}
			double media = sumaNotas / notas.length;
			System.out.format("Media del Asignatura %d: %04.2f%n", j, media);
		}
	}

	public static void indicarAsignaturaMasFacil(double[][] notas) {
		int j;
		double[] mediaAsignatura = new double[notas[0].length];
		for (j = 0; j < notas[0].length; j++) {
			double sumaNotas = 0;
			for (int i = 0; i < notas.length; i++) {
				sumaNotas += notas[i][j];
			}
			mediaAsignatura[j] = sumaNotas / notas[0].length;
		}
		int asignaturaMasFacil = 0;
		double mejorMedia = 0;
		for (int i = 0; i < mediaAsignatura.length; i++) {
			if (mediaAsignatura[i] > mejorMedia) {
				mejorMedia = mediaAsignatura[i];
				asignaturaMasFacil = i;
			}
		}
		System.out.println(
				"La asignatura mas Facil es la posición: " + asignaturaMasFacil + "\nCon la nota de: " + mejorMedia);
	}

	public static boolean HayAlumnoQueSuspendaTodo(double[][] notas) {
		
		boolean alguienSuspendioTodo = false;
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas.length; j++) {
				
			}
		}
		
		return false;
	}

	public static boolean HayAsignaturaQueSuspendanTodos(double[][] notas) {

		return false;
	}
}

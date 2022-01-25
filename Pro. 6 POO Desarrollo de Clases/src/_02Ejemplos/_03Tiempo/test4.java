package _02Ejemplos._03Tiempo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class test4 {
	public static void main(String[] args) {
		
		ArrayList<Tiempo> horario = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		String s = "";
		
		do {
			
			System.out.println("hh:mm:ss");
			s = sc.nextLine();
			if (!s.equals("")) {
				Tiempo t = new Tiempo(s);
				// Lo añadiremos al horario si no esta repetido
				if(!horario.contains(t)) {
					horario.add(t);
				}
			}
		} while (!s.equals(""));
		
		System.out.println(horario);
		
		Collections.sort(horario);
		System.out.println(horario);

	}

}

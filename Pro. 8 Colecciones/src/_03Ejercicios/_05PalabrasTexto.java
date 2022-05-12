package _03Ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class _05PalabrasTexto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner read = null;
		TreeSet<String> lh = new TreeSet<>();
		
		
		try {
			String texto = sc.nextLine();
			File doc = new File("/home/alumno/Git/_1DAM/Pro. 8 Colecciones/src/_03Ejercicios/" + texto);
			read = new Scanner(doc);

			while (read.hasNext()) {
				lh.add(read.nextLine());
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			read.close();
			sc.close();
		}

		System.out.println(lh.toString());
	}
}

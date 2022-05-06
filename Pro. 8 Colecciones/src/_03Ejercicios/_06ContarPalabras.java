package _03Ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class _06ContarPalabras {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner read = null;
		LinkedHashSet<String> lh = new LinkedHashSet<String>();
		
		
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

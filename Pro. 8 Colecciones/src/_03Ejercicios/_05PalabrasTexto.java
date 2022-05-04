package _03Ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class _05PalabrasTexto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String texto = sc.nextLine();
		Scanner obj = null;
		LinkedHashSet<String> lh = new LinkedHashSet<String>(); 
		
				try {
			File doc = new File(texto);
			obj = new Scanner(doc);
			
			while(obj.hasNext()) {
				lh.add(obj.next());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			obj.close();
		}
		
		System.out.println(lh.toString());
	}
}

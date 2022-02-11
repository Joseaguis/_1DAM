package practica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Premio {

	private static Scanner f;

	public static void premio() throws FileNotFoundException {
		f = null;
		ArrayList<Integer> l = new ArrayList<>();
		try {
			f = new Scanner(new File("Ganadora"));

			while (f.hasNext()) {
				int num = f.nextInt();
				l.add(num);
			}
			
			
		} catch (FileNotFoundException e) {
			f.close();
		}

	}
}

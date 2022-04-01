package _03ejercicios._04Obrero;

public class Test {
	public static void main(String[] args) {
		Montador m1 = new Carpintero();
		// Montador m2 = new Albanyil();	error de COMPILACION
		Obrero o1 = new Carpintero();
		Obrero o2 = new Albanyil();
		// o1.montar("Mesa");	error de COMPILACION
		// o2.levantarMuro();	error de COMPILACION
		// m1.saludar();	error de COMPILACION
		m1.montar("Silla");
		((Albanyil)o2).levantarMuro();
		// ((Albanyil)o1).levantarMuro(); error de EJECUCION
		
		/*
		  	Se crea Obrero
			Se crea Carpintero
			Se crea Obrero
			Se crea Carpintero
			Se crea Obrero
			Se crea Albanyil
			Montando Silla
			Levantando muro
		 */
		
	}
}

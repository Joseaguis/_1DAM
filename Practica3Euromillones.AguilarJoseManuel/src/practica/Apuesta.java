package practica;

import java.util.ArrayList;
import java.util.Random;

public class Apuesta {
	/**
	 * 
	 */
	private final static int NUMMAX = 50;
	private final static int NUMIN = 1;
	private final static int ESTRELLA_MAX = 12;
	private final static int ESTRELLA_MIN = 1;
	private final static int COMB_NUMEROS = 5;
	private final static int COMB_ESTRELLAS = 2;
	private int seed;
	
	
	ArrayList<Integer> numeros;
	ArrayList<Integer> estrellas;
	
	public Apuesta () {
		numeros = new ArrayList<Integer>();
		estrellas = new ArrayList<Integer>();
		
		Random r = new Random();
		
		for (int i = 0; i < COMB_NUMEROS; i++) {
			
		}
		
	}
	
}

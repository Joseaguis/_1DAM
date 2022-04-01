package _03ejercicios._04Obrero;

public class Carpintero extends Obrero implements Montador{
	
	public Carpintero() {
		System.out.println("Se crea Carpintero");
	}
	@Override
	public void montar(String x) {
		System.out.println("Montando " + x);
		
	}

	@Override
	public void desmontar(String x) {
		System.out.println("Desmontando " + x);
	}
	
	public void clavar() {
		System.out.println("Clavando");
	}
	
}

package _03ejercicios._01Aulas;

public class Aula_Musica extends Aula {
	boolean tienePiano;
	
	public Aula_Musica(int codigo, int longitud, int anchura, boolean tienePiano) {
		super(codigo, longitud, anchura);
		this.tienePiano = tienePiano;
	}
	
	@Override
	public int capacidad() {
		int capacidad = super.capacidad();
		return this.tienePiano ? capacidad - 2 : capacidad;
	}
	
	@Override
	public String toString() {
		return super.toString() + " - " + (this.tienePiano ? "tiene piano" : "No tiene piano");
	}

	public boolean isTienePiano() {
		return tienePiano;
	}

	public void setTienePiano(boolean tienePiano) {
		this.tienePiano = tienePiano;
	}
	
}

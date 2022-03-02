package _03ejercicios._01Aulas;

public class Aula_Informatica extends Aula {
	int numOrdenadores;
	
	public Aula_Informatica(int codigo, int longitud, int anchura, int numOrdenadores) {
		super(codigo, longitud, anchura);
		this.numOrdenadores = numOrdenadores;
	}
	
	@Override
	public int capacidad() {
		return numOrdenadores * 2;
	}
	
	public String toString() {
		return super.toString() + " - Nº Ordenadores: " + numOrdenadores;
	}

	public int getNumOrdenadores() {
		return numOrdenadores;
	}

	public void setNumOrdenadores(int numOrdenadores) {
		this.numOrdenadores = numOrdenadores;
	}
}

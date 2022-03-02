package _03ejercicios._01Aulas;

public class Aula {
	private int codigo;
	private int longitud;
	private int anchura;
	
	public Aula(int codigo, int longitud, int anchura) {
		this.codigo = codigo;
		this.longitud = longitud;
		this.anchura = anchura;
	}
	
	public double superficie() {
		return this.longitud * this.anchura;
	}
	
	public int capacidad() {
		return (int) (superficie() / 1.4);
	}
	
	@Override
	public String toString() {
		return "Codigo: " + codigo + " - Superficie: " + superficie() + " - Capacidad: " + capacidad();
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public void setAnchura(int anchura) {
		this.anchura = anchura;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public int getLongitud() {
		return this.longitud;
	}
	
	public int getAnchura() {
		return this.anchura;
	}
}

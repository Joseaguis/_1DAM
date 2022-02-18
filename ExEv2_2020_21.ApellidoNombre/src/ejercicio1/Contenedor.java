package ejercicio1;

public class Contenedor {
	private String companyia;
	private int codigo;
	private double peso;
	private boolean peligroso;
	
	public Contenedor(String companyia, int codigo, double peso, boolean peligroso) {
		this.companyia = companyia;
		this.codigo = codigo;
		this.peso = peso;
		this.peligroso = peligroso;
	}

	public double getPeso() {
		return peso;
	}
	public boolean isPeligroso() {
		return peligroso;
	}
	
	@Override
	public boolean equals(Object o){
		if(this == o) return true;
		if(!(o instanceof Contenedor)) return false;
		Contenedor c = (Contenedor)o;
		return this.companyia.equals(c.companyia) && this.codigo == c.codigo;
	}
}

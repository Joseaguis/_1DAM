package ejercicio3;

public class Resultado {
	private String nombre;
	private int escanyos;
	
	public Resultado(String p, int e){
		nombre = p;
		escanyos = e;
	}
	
	public String getPartido(){
		return nombre;
	}
	
	public int getEscanyos(){
		return escanyos;
	}
	
	// Dos partidos son el mismo si tienen el mismo nombre
	public boolean equals(Object o){
		if(o == null) return false;
		if(this == o) return true;
		if(!(o instanceof Resultado)) return false;
		return this.nombre.equalsIgnoreCase(((Resultado)o).nombre);
	}
	
	public String toString() {
		return nombre + " - " + escanyos;
	}

}

package _04EjerciciosInterfaces._03Ejercicio;

public class Publicacion implements Comparable<Publicacion>{
	public String codigo;
	public String titulo;
	public int anyo;
	
	public Publicacion(String codigo, String titulo, int anyo){
		this.codigo = codigo;
		this.titulo = titulo;
		this.anyo = anyo;
	}
	
	public int compareTo(Publicacion v) {
		return this.codigo.compareTo(v.codigo);
	}

	public String getCodigo() {
		return codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}


}


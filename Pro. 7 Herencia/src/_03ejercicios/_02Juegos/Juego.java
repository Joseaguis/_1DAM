package _03ejercicios._02Juegos;

public class Juego {
	protected String titulo;
	protected String fabricante;
	protected int anyo;
	
	public Juego(String t, String f, int a) {
		this.titulo = t;
		this.fabricante = f;
		this.anyo = a;
	}
	
	public String toString() {
		return "-" + titulo + " - " + fabricante + " - " + anyo;
	}
	
	public boolean equals(Object o) {
		if (this == o) return true;
		
		if (!(o instanceof Juego)) return false;
		
		Juego juego = (Juego)o;
		if (this.titulo.equals(juego.titulo)) {
			if (this.fabricante.equals(juego.fabricante)) {
				if (this.anyo == juego.anyo) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	public int compareTo(Juego o) {
		int orden = this.titulo.compareTo(o.titulo);
		if (orden == 0) {
			orden = this.fabricante.compareTo(o.fabricante);
			if (orden == 0) {
				orden = this.anyo - o.anyo;
			}
		}
		return orden;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	
	
}

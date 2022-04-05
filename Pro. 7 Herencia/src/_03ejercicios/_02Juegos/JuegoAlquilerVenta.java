package _03ejercicios._02Juegos;

public abstract class JuegoAlquilerVenta extends Juego {

	protected double precio;
	protected int numCopiasDisponibles;
	
	public JuegoAlquilerVenta(String t, String f, int a, double p, int numCop) {
		super(t, f, a);
		this.precio = p;
		this.numCopiasDisponibles = numCop;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		
		if (!(o instanceof JuegoAlquilerVenta)) return false;
		
		JuegoAlquilerVenta juego = (JuegoAlquilerVenta)o;
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
	
	public int compareTo(JuegoAlquilerVenta o) {
		int orden = this.titulo.compareTo(o.titulo);
		if (orden == 0) {
			orden = this.fabricante.compareTo(o.fabricante);
			if (orden == 0) {
				orden = this.anyo - o.anyo;
			}
		}
		return orden;
	}
	
	@Override
	public String toString() {
		return String.format("%s%n-Precio: %.2f€ - NumCopias: %d", super.toString(), this.precio, this.numCopiasDisponibles);
	}
	
}

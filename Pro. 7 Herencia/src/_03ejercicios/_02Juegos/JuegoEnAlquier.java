package _03ejercicios._02Juegos;

public class JuegoEnAlquier extends JuegoAlquilerVenta{
	protected int diasDeAlquiler;
	
	public JuegoEnAlquier(String t, String f, int a, double p, int numCop, int diasDeAlquiler) {
		super(t, f, a, p, numCop);
		this.diasDeAlquiler = diasDeAlquiler;
	}
	
	public boolean alquilar() {
		if (this.numCopiasDisponibles > 0) {
			this.numCopiasDisponibles--;
			return true;
		} else {
			return false;
		}
	}
	
	public void devolver() {
		this.numCopiasDisponibles++;
	}
	
	@Override
	public String toString() {
		return String.format("%s%n-Dias de alquiler: %d", super.toString(), this.diasDeAlquiler);
	}
}

package _03ejercicios._02Juegos;

public class JuegoEnVenta extends JuegoAlquilerVenta{
	
	public JuegoEnVenta(String t, String f, int a, double p, int numCop) {
		super(t, f, a, p, numCop);
	}
	
	public boolean vender() {
		if (this.numCopiasDisponibles > 0) {
			this.numCopiasDisponibles++;
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
}

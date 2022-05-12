package ejercicio3;

public class DeportistaExterno extends Deportista {
	private double mensualidad;

	public DeportistaExterno(String nombre, String dni, String deporte, double mensualidad) {
		super(nombre, dni, deporte);
		this.mensualidad = mensualidad;
	}

	public String toString() {
		return String.format("EXTERNO%n%s", super.toString());
	}

	@Override
	public double calcularImporteAPagar() {
		// TODO Auto-generated method stub
		return 0;
	}

}

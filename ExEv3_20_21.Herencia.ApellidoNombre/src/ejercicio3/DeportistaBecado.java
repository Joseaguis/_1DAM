package ejercicio3;

public class DeportistaBecado extends DeportistaInterno {
	private double porcentajeBeca;

	public DeportistaBecado(String nombre, String dni, String deporte, String regimen, double porcentajeBeca) {
		super(nombre, dni, deporte, regimen);
		this.porcentajeBeca = porcentajeBeca;
	}

	@Override
	public double calcularImporteAPagar() {
		return super.calcularImporteAPagar() * (1 + porcentajeBeca / 100.0);
	}
	
	@Override
	public void mostrarRecibo() {
		// TODO Auto-generated method stub
		super.mostrarRecibo();
	}
}

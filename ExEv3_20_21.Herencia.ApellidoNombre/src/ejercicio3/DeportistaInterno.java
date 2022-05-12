package ejercicio3;

public class DeportistaInterno extends Deportista{
	private String regimen;
	
	public DeportistaInterno(String nombre, String dni, String deporte, String regimen) {
		super(nombre, dni, deporte);
		if (!regimen.equals("SOLO_ALOJAMIENTO") 
				&& !regimen.equals("ALOjAMIENTO+DESAYUNO")
				&& !regimen.equals("PENSION_COMPLETA")) {
			throw new IllegalArgumentException();
		}
		this.regimen = regimen;
	}

	@Override
	public double calcularImporteAPagar() {
		if (regimen.equals("SOLO_ALOJAMIENTO")) {
			return 300;
		} else if (regimen.equals("ALOjAMIENTO+DESAYUNO")) {
			return 500;
		} else if (regimen.equals("PENSION_COMPLETA")) {
			return 800;
		} else {
			return -1;
		}
	}
	
	@Override
	public void mostrarRecibo() {
		// TODO Auto-generated method stub
		 return String super.mostrarRecibo();
	}
	
}

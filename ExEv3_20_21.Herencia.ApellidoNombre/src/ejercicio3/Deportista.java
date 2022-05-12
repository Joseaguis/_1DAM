package ejercicio3;

public abstract class Deportista {
	
	private String nombre;
	private String dni;
	private String deporte;
	
	public Deportista (String nombre, String dni, String deporte) {
		this.nombre = nombre;
		this.dni = dni;
		this.deporte = deporte;
	}
	
	public String toString() {
		return String.format("Nombre: %s%nDni: %s%nDeporte: %s", this.nombre, this.dni, this.deporte);
	}
	
	public abstract double calcularImporteAPagar();
	public void mostrarRecibo() {
		System.out.println(String.format("NOMBRE: %s%nDNI: %s%nDeporte: %s", this.nombre, this.dni, this.deporte));
	}
	
}

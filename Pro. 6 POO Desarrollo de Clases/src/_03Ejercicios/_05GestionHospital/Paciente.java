package _03Ejercicios._05GestionHospital;

public class Paciente {
	private String nombre;
	private int edad;
	private int estado;

	public Paciente(String nombre, int edad) throws IllegalArgumentException {
		this.nombre = nombre;
		this.edad = edad;
		setEstado((int)(Math.random() * 6));
	}

	public int getEdad() {
		return this.edad;
	}

	public int getEstado() {
		return this.estado;
	}

	public void mejorar() throws IllegalArgumentException {
		setEstado(getEstado() - 1);
	}

	public void empeorar() {
		setEstado(getEstado() + 1);
	}

	public String toString() {
		String estadoTxt = "";
		switch (this.estado) {
		case 0:
			estadoTxt = "curado";
			break;
		case 1:
			estadoTxt = "leve";
			break;
		case 2: 
			estadoTxt = "muy leve";
			break;
		case 3:
			estadoTxt = "enfermo";
			break;
		case 4: 
			estadoTxt = "grave";
			break;
		case 5:
			estadoTxt = "muy grave";
			break;
		}
		return String.format("%s - %d años - %s", this.nombre, this.edad, estadoTxt);
	}

	public int compareTo(Object o) {

		Paciente paciente = (Paciente) o;

		int comparador = 0;
		if (this.estado > paciente.getEstado()) {
			return 1;
		} else if (this.estado < paciente.getEstado()) {
			return -1;
		} else {
			if (this.edad > paciente.getEdad()) {
				return 1;
			} else if (this.edad < paciente.getEdad()) {
				return -1;
			} else {
				return 0;
			}
		}
	}

	private void setEstado(int estado) throws IllegalArgumentException{
		if (estado < 0 || estado > 5) {
			throw new IllegalArgumentException();
		} else {
			this.estado = estado;
		}
	}

}

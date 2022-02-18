package _03Ejercicios._05GestionHospital;

public class TestPaciente {
	public static void main(String[] args) {
		Paciente paciente1 = new Paciente("Juan", 20);
		Paciente paciente2 = new Paciente("Miguel", 30);

		if (paciente1.compareTo(paciente2) == 1) {
			System.out.println(paciente1 + "\n" + paciente2);
		} else if (paciente1.compareTo(paciente2) == -1) {
			System.out.println(paciente2 + "\n" + paciente1);
		} else {
			System.out.println("Son iguales");
		}
		try {
			paciente1.mejorar();
			System.out.println(paciente1);
		} catch (IllegalArgumentException e) {
			System.out.println("El paciente ya esta curado\n" + paciente1);

		}
	}
}

package _03ejercicios._05Usuarios;

public class Administrador extends UsuarioAvanzado implements Instalador {

	public Administrador(String n, String c) {
		super(n, c);
	}

	public void desinstalarPrograma(String nombrePrograma) {
		System.out.println("El usuario " + nombre + " desinstala " + nombrePrograma);
	}
}

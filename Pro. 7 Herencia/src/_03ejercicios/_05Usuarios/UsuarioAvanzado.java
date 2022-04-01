package _03ejercicios._05Usuarios;

public class UsuarioAvanzado extends Usuario implements Instalador {

	public UsuarioAvanzado(String n, String c) {
		super(n, c);
	}

	public void instalarPrograma(String nombrePrograma) {
		System.out.println("El usuario " + nombre + " instala " + nombrePrograma);
	}
	
	@Override
	public void imprimirArchivo(String nombreArchivo) {
		System.out.println("El usuario avanzado " + nombre + " imprime " + nombreArchivo);
	}
	

}

package _03ejercicios._05Usuarios;

public class Usuario {
	protected String nombre;
	protected String contraseña;
	
	public Usuario (String n, String c) {
		nombre = n;
		contraseña = c;
		System.out.println("Se crea usuario " + nombre);
	}
	
	public void imprimirArchivo(String nombreArchivo) {
		System.out.println("El usuario " + nombre + " imprime " + nombreArchivo);
	}
}

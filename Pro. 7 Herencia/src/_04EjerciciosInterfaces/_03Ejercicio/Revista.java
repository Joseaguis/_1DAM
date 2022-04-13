package _04EjerciciosInterfaces._03Ejercicio;

public class Revista extends Publicacion{

	protected int numRevista;
	
	public Revista(String codigo, String titulo, int anyo, int numRevista) {
		super(codigo, titulo, anyo);
		this.numRevista = numRevista;
	}

}

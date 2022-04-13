package _04EjerciciosInterfaces._03Ejercicio;

public class Libro extends Publicacion implements Prestable{

	public boolean prestado = false;
	
	public Libro(String codigo, String titulo, int anyo) {
		super(codigo, titulo, anyo);
	}
	
	@Override
	public void prestar() throws IllegalArgumentException{
		if(prestado) throw new IllegalArgumentException("ya esta prestado");
		this.prestado = true;
	}

	@Override
	public void devolver() throws IllegalArgumentException{
		if(!prestado) throw new IllegalArgumentException("no se ha prestado");
		this.prestado = false;
	}

	@Override
	public boolean getPrestado() {
		return prestado;
	}

}

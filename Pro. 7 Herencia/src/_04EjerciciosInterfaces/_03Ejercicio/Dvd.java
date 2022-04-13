package _04EjerciciosInterfaces._03Ejercicio;

public class Dvd extends Publicacion implements Prestable{
	
	public int duracion;
	public boolean prestado = false;
	
	public Dvd(String codigo, String titulo, int anyo, int duracion) {
		super(codigo, titulo, anyo);
		this.duracion = duracion;
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

package _04EjerciciosInterfaces._03Ejercicio;

public interface Prestable {
	boolean prestado = false;
	
	void prestar();
	
	void devolver();
	
	boolean getPrestado();
}

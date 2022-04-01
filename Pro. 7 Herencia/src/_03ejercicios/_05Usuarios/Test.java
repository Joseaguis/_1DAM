package _03ejercicios._05Usuarios;

public class Test {
	public static void main(String[] args) {
		Administrador a1 = new Administrador("Admin", "0123");
		a1.instalarPrograma("Word");
		a1.imprimirArchivo("carta.txt");
		Instalador i1 = new UsuarioAvanzado("Borja","0123");
		i1.instalarPrograma("Word");
		// i1.imprimirArchivo("carta.txt");
		// Instalador i2 = new Invitado();
		// i2.imprimirArchivo("carta.txt");
		Usuario u1 = new UsuarioAvanzado("Raul", "0123");
		// u1.instalarPrograma("Word");
		u1.imprimirArchivo("carta.txt");
		((UsuarioAvanzado)u1).instalarPrograma("Word");
		((Administrador)u1).desinstalarPrograma("Word");
		// ((UsuarioAvanzado)u1).desinstalarPrograma("Word");
	}
}


/*
	1.	OK
	2.	OK
	3.	OK
	4.	OK
	5.	EC - Instalador no contiene el metodo imprimirArchivo
	6.	EC - Invitado no implementa la interfaz de instalador
	7.	EC - El anterior no funciona
	8.	OK
	9. 	EC - Usuraio no contiene el metodo instalarPrograma
	10. OK
	11. OK
	12. EE - Usuario no contiene el metodo de instalarPrograma no da EC por el casting
	13. OK
	14. EC - UsuraioAvanzado no contiene desisntalarPrograma
*/
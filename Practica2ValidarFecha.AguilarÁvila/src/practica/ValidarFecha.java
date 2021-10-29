package practica;

import java.util.Scanner;

/**
 * Clase de programa que hara uso de la clase de utilidad Fechas para averigura
 * si una fecha que introduce el usuario es correcta o no.
 * 
 * @author nombre del alumno
 *
 */
public class ValidarFecha {
	// Definimos el objeto Scanner tec fuera de los metodos. Al hacerlo así
	// podemos usar tec tanto en el metodo main como en el resto de métodos
	Scanner tec = new Scanner(System.in);

	
	public static void main(String[] args) {
		int opcion;
		do {
			opcion = elegirOpcionMenu();
			switch (opcion) {
			case 0:
				System.out.println("Fin del programa");
				break;
			case 1:
				opcion1();
				break;
			case 2:
				opcion2();
				break;
			}
		} while (opcion != 0); // Cuando es 0 termina el bucle

	}

	/**
	 * Muestra el menu descrito en el enunciado y permite al usuario elegir una
	 * opción. Si el usuario pone una opción incorrecta, le avisa y le deja
	 * volver a seleccionar una opcion
	 * 
	 * @return la opcion elegida por el usuario: 0, 1, 2, ....
	 */
	public static int elegirOpcionMenu() {
		// TODO Completar: Bucle que muestre el menu y lea la opcion que elija el
		// usuario. El bucle se repetira mientras que el usuario elija una opcion incorrecta.
		return 0; 
	}

	/**
	 * Metodo para responder a la opcion 1 del menu. Lee una fecha y le dice ç
	 * al usuario si es correcta o incorrecta
	 */
	public static void opcion1() {
		// TODO: Pedir y Leer una fecha como String

		// TODO: Descompomner la fecha en dia mes y anyo

		// TODO: Comprobar si es valida y mostrar el mensaje correspondiente

	}

	public static void opcion2() {
		// TODO: Bucle que lea la primera fecha mientras el usuario introduzca una fecha incorrecta

		// TODO: Bucle que lea la segunda fecha mientras el usuario introduzca una fecha incorrecta

		// TODO Comprobar cual es la menor, usando el metodo Fechas.compararFechas y mostrar el mensaje correspondiente

	}

}

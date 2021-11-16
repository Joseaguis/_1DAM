package practica;

import java.util.Scanner;

import utiles.Fechas;

/**
 * Clase de programa que hara uso de la clase de utilidad Fechas para averigura
 * si una fecha que introduce el usuario es correcta o no.
 * 
 * @author nombre del alumno
 *
 */
public class ValidarFecha {
	// Definimos el objeto Scanner tec fuera de los metodos. Al hacerlo as�
	// podemos usar tec tanto en el metodo main como en el resto de m�todos
	public static Scanner sc = new Scanner(System.in);

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
			case 3:
				opcion3();
				break;
			}
		} while (opcion != 0); // Cuando es 0 termina el bucle

	}

	/**
	 * Muestra el menu descrito en el enunciado y permite al usuario elegir una
	 * opci�n. Si el usuario pone una opci�n incorrecta, le avisa y le deja volver a
	 * seleccionar una opcion
	 * 
	 * @return la opcion elegida por el usuario: 0, 1, 2, ....
	 */
	public static int elegirOpcionMenu() {
		// TODO Completar: Bucle que muestre el menu y lea la opcion que elija el
		// usuario. El bucle se repetira mientras que el usuario elija una opcion
		// incorrecta.
		int opcion = 0;
		do {
			System.out.println("\nElija la opcion que quiere realizar\n");
			System.out.println("0.- Terminar el programa");
			System.out.println("1.- Validar una fecha");
			System.out.println("2.- Comparar dos fechas");
			System.out.println("3.- Diferencia entre fechas");
			opcion = sc.nextInt();
			if (opcion != 0 && opcion != 1 && opcion != 2 && opcion != 3) {
				System.out.println("\nError: Introduzca una de las cuatro opciones que aparecen");
			}
		} while (opcion != 0 && opcion != 1 && opcion != 2 && opcion != 3);
		return opcion;
	}

	/**
	 * Metodo para responder a la opcion 1 del menu. Lee una fecha y le dice � al
	 * usuario si es correcta o incorrecta
	 */
	public static void opcion1() {
		// TODO: Pedir y Leer una fecha como String
		System.out.println("Porfavor, introduzca una fecha con formato dd/mm/aaaa");
		String fecha = "";
		fecha = sc.next();
		// TODO: Descompomner la fecha en dia mes y anyo
		int dia = Fechas.extraerDia(fecha);
		int mes = Fechas.extraerMes(fecha);
		int anyo = Fechas.extraerAnyo(fecha);
		// TODO: Comprobar si es valida y mostrar el mensaje correspondiente
		if (dia > 0 && mes > 0 && anyo > 0) {
			if (dia <= Fechas.diasDelMes(mes, anyo) && mes <= 12) {
				System.out.println("La fecha es correcta");
			} else {
				System.out.println("La fecha es incorrecta");
			}
		} else {
			System.out.println("La fecha es incorrecta");
		}
	}

	public static void opcion2() {
		// TODO: Bucle que lea la primera fecha mientras el usuario introduzca una fecha
		// incorrecta
		boolean validarF = false;
		int d1, m1, a1, d2, m2, a2;
		do {
			System.out.println("Porfavor, introduzca la primera con formato dd/mm/aaaa");
			String fecha = "";
			fecha = sc.next();
			d1 = Fechas.extraerDia(fecha);
			m1 = Fechas.extraerMes(fecha);
			a1 = Fechas.extraerAnyo(fecha);
			if (d1 > 0 && m1 > 0 && a1 > 0) {
				if (d1 <= Fechas.diasDelMes(m1, a1) && m1 <= 12) {
					validarF = true;
				} else {
					validarF = false;
				}
			} else {
				validarF = false;
			}
		} while (validarF == false);
		
		// TODO: Bucle que lea la segunda fecha mientras el usuario introduzca una fecha
		// incorrecta
		validarF = false;
		do {
			System.out.println("Porfavor, introduzca la segunda fecha con formato dd/mm/aaaa");
			String fecha = "";
			fecha = sc.next();
			d2 = Fechas.extraerDia(fecha);
			m2 = Fechas.extraerMes(fecha);
			a2 = Fechas.extraerAnyo(fecha);
			if (d2 > 0 && m2 > 0 && a2 > 0) {
				if (d2 <= Fechas.diasDelMes(m2, a2) && m2 <= 12) {
					validarF = true;
				} else {
					validarF = false;
				}
			} else {
				validarF = false;
			}
		} while (validarF == false);
		// TODO Comprobar cual es la menor, usando el metodo Fechas.compararFechas y
		// mostrar el mensaje correspondiente
		int fechaMayor = Fechas.compararFechas(d1, m1, a1, d2, m2, a2);
		if (fechaMayor == 0) System.out.println("Las fechas son iguales");
		else if (fechaMayor == 1)System.out.println("La primera fecha es menor");
		else System.out.println("La segunda fecha es menor");
	}
	/**
	 * Este metodo sirve para responder a la opcion 3, la cual indica la diferencia de dias
	 * que hay entre las 2 fechas
	 */
	public static void opcion3() {
		boolean validarF = false;
		int d1, m1, a1, d2, m2, a2;
		// Se pregunta por la primera fecha
		do {
			System.out.println("Porfavor, introduzca la primera con formato dd/mm/aaaa");
			String fecha = "";
			fecha = sc.next();
			d1 = Fechas.extraerDia(fecha);
			m1 = Fechas.extraerMes(fecha);
			a1 = Fechas.extraerAnyo(fecha);
			if (d1 > 0 && m1 > 0 && a1 > 0) {
				if (d1 <= Fechas.diasDelMes(m1, a1) && m1 <= 12) {
					validarF = true;
				} else {
					validarF = false;
				}
			} else {
				validarF = false;
			}
		} while (validarF == false);
		
		//Se pregunta por la segunda fecha
		validarF = false;
		do {
			System.out.println("Porfavor, introduzca la segunda fecha con formato dd/mm/aaaa");
			String fecha = "";
			fecha = sc.next();
			d2 = Fechas.extraerDia(fecha);
			m2 = Fechas.extraerMes(fecha);
			a2 = Fechas.extraerAnyo(fecha);
			if (d2 > 0 && m2 > 0 && a2 > 0) {
				if (d2 <= Fechas.diasDelMes(m2, a2) && m2 <= 12) {
					validarF = true;
				} else {
					validarF = false;
				}
			} else {
				validarF = false;
			}
		} while (validarF == false);
			
		//Dias totales
		
		int diasTotales = 0;
		
		while (a1 != a2) {
			if (a1 == a2) {
				
			} else if (a1 < a2) {
				
			} else {
				
			}
		}
		
		if (m1 == m2) {
			
		} else {
			for (int i = m1; i < m2; i++) {
				diasTotales += Fechas.diasDelMes(m1, a2);
			}
		}
		
		diasTotales += d2 - d1;
		
		System.out.println("La diferencia de dias es de " + Math.abs(diasTotales));
	}
	
}

package _03Ejercicios._02Reservaslibreria;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javi
 */
import java.util.*;

public class GestionReservas {
	static Scanner tec = new Scanner(System.in);

	public static void main(String[] args) {

		String opcionesMenu[] = { "1.- Realizar reserva", "2.- Cancelar reserva", "3.- Pedido", "4.- Recepcion",
				"5.- Listado", "6.- Salir" };

		int opc;
		String nif, nombre, tel;
		int codigo, ejemplares;

		// Creamos un ListaReserva
		ListaReservas l = new ListaReservas();
		// Mostramos el menú y actuamos según lo que
		// indique el usuario
		do {
			opc = menu(opcionesMenu);
			switch (opc) {
			case 1:
				System.out.println("---- RESERVAR ----");

				try {
					// Pedimos los datos de la reserva
					System.out.println("NIF: ");
					nif = tec.nextLine();
					System.out.println("Nombre: ");
					nombre = tec.nextLine();
					System.out.println("Telefono: ");
					tel = tec.nextLine();
					System.out.println("Codigo libro: ");
					codigo = tec.nextInt();
					System.out.println("Ejemplares: ");
					ejemplares = tec.nextInt();

					l.reservar(nif, nombre, tel, codigo, ejemplares);
				} catch (IllegalArgumentException e) {
					System.out.println("La reserva ya existe");
				} catch (InputMismatchException e) {
					System.out.println("Datos incorrectos");
				}
				break;
			case 2:
				System.out.println("---- CANCELAR RESERVA ----");
				try {
					System.out.println("NIF: ");
					nif = tec.nextLine();
					System.out.println("Codigo libro: ");
					codigo = tec.nextInt();

					l.cancelar(nif, codigo);
				} catch (NoSuchElementException e) {
					System.out.println("la reserva no existe");
				}

				break;
			case 3:

				System.out.println("--- PEDIDO ---");
				try {
					System.out.println("Codigo libro: ");
					codigo = tec.nextInt();

					System.out.println("Numero de Pedidos: " + l.numEjemplaresReservadosLibro(codigo));
				} catch (InputMismatchException e) {
					System.out.println("Datos incorrectos");
				}
				break;

			case 4:

				System.out.println("--- RECEPCION ---");
				try {
					System.out.println("Codigo libro: ");
					codigo = tec.nextInt();

					System.out.println(l.reservasLibro(codigo));
				} catch (InputMismatchException e) {
					System.out.println("Datos incorrectos");
				}
				break;
			case 5:
				System.out.println("--- LISTADO  ---");

				System.out.println(l.toString());

				break;
			}
		} while (opc != 6);
	}

	public static int menu(String opciones[]) {
		int opc;
		do {
			for (int i = 0; i < opciones.length; i++) {
				System.out.println("\t" + opciones[i]);
			}
			System.out.println("Elija una opción");
			opc = tec.nextInt();
			tec.nextLine(); // Limpiar buffer

		} while (opc < 0 || opc > opciones.length);
		return opc;
	}
}
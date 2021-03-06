package _03Ejercicios._02Reservaslibreria;

import java.util.Scanner;

public class Reserva implements Comparable<Reserva> {

	private String nifCliente;
	private String nombreCliente;
	private String telfCliente;
	private int codLibroReservado;
	private int numEjemplares;

	public Reserva(String nif, String nombre, String tel, int codigo, int ejemplares) {
		this.nifCliente = nif;
		this.nombreCliente = nombre;
		this.telfCliente = tel;
		this.codLibroReservado = codigo;
		this.numEjemplares = ejemplares;
	}

	public Reserva(String nif, String nombre, String tel, int codigo) {
		this.nifCliente = nif;
		this.nombreCliente = nombre;
		this.telfCliente = tel;
		this.codLibroReservado = codigo;
		this.numEjemplares = 1;
	}

	/**
	 * @param numEjemplares the numEjemplares to set
	 */
	public void setNumEjemplares(int numEjemplares) {
		this.numEjemplares = numEjemplares;
	}

	public static Reserva leerReserva() {
		Scanner sc = new Scanner(System.in);

		String nif = null, nombre = null, tel = null;
		int codLib = 0, ejemplares = 0;

		boolean continuar = false;
		Reserva nuevaReserva = null;
		do {
			try {
				System.out.println("Introduzca datos para la reserva: ");
				System.out.println("Nif Cliente: ");
				nif = sc.nextLine();

				System.out.println("Nombre Cliente:");
				nombre = sc.nextLine();

				System.out.println("Telefono Cliente:");
				tel = sc.nextLine();

				System.out.println("Codigo Libro:");
				codLib = sc.nextInt();
				
				System.out.println("Nº Ejemplares:");
				ejemplares = sc.nextInt();
				continuar = true;

				sc.nextLine();
			} catch (Exception e) {
				// TODO: handle exception
			}
		} while (!continuar);
		nuevaReserva = new Reserva(nif, nombre, tel, codLib, ejemplares);
		return nuevaReserva;
	}

	public String toString() {
		String reserva = "\n";
		return reserva += String.format(
				"Nif del CLiente: %s%n" + "Nombre del CLiente: %s%n" + "Telefono del Cliente: %s%n"
						+ "Codigo de libro reservado: %d%n" + "Numero de Ejemplares: %d%n",
				this.nifCliente, this.nombreCliente, this.telfCliente, this.codLibroReservado, this.numEjemplares);
	}

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Reserva)) {
			return false;
		}

		Reserva r = (Reserva) o;
		if (this.nifCliente.equals(r.nifCliente) && this.codLibroReservado == r.codLibroReservado) {
			return true;
		} else {
			return false;
		}

	}

	public int compareTo(Reserva r) {
		int a = this.codLibroReservado - r.codLibroReservado;

		if (a == 0) {
			return this.nifCliente.compareTo(r.nifCliente);
		} else {
			return a;
		}
	}

	/**
	 * @return the nifCliente
	 */
	public String getNifCliente() {
		return nifCliente;
	}

	/**
	 * @return the nombreCliente
	 */
	public String getNombreCliente() {
		return nombreCliente;
	}

	/**
	 * @return the telfCliente
	 */
	public String getTelfCliente() {
		return telfCliente;
	}

	/**
	 * @return the codLibroReservado
	 */
	public int getCodLibroReservado() {
		return codLibroReservado;
	}

	/**
	 * @return the numEjemplares
	 */
	public int getNumEjemplares() {
		return numEjemplares;
	}

}

package _03Ejercicios._07GestorCorreoElectronico;

import java.util.Scanner;

public class TestCorreo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String emisor, destinatario, asunto, texto;

		boolean continuar = false;
		Mensaje mensaje1;
		do {
			System.out.println("Introduce un email");
			System.out.println("Emisor:");
			emisor = sc.nextLine();

			System.out.println("Destinatario:");
			destinatario = sc.nextLine();

			System.out.println("Asunto:");
			asunto = sc.nextLine();

			System.out.println("Texto:");
			texto = sc.nextLine();
			mensaje1 = new Mensaje(emisor, destinatario, asunto, texto);
			if (!Mensaje.validarEMail(mensaje1.getEmisor())) {
				System.out.println("Emisor incorrecto");
			}
			if (!Mensaje.validarEMail(mensaje1.getDestinatario())) {
				System.out.println("Destinatario incorrecto");
			}
			continuar = true;

		} while (!continuar);

		System.out.println(mensaje1);

	}
}

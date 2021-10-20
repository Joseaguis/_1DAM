package _03Ejercicios;

import java.util.Scanner;

public class _26Mes {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String text = sc.next();
		
		System.out.println(diasDe(num));
		System.out.println(diasDe(text));
	}

	public static int diasDe(int mes) {
		int numero = 0;
		if (mes == 1)numero = 31;
		else if (mes == 2)numero = 28;
		else if (mes == 3)numero = 31;
		else if (mes == 4)numero = 30;
		else if (mes == 5)numero = 31;
		else if (mes == 6)numero = 30;
		else if (mes == 7)numero = 31;
		else if (mes == 8)numero = 31;
		else if (mes == 9)numero = 30;
		else if (mes == 10)numero = 31;
		else if (mes == 11)numero = 30;
		else if (mes == 11)numero = 31;
		else numero = 0;
		return numero;
	}
	public static int diasDe(String mes) {
		int numero = 0;
		if (mes.equalsIgnoreCase("enero"))numero = 31;
		else if (mes.equalsIgnoreCase("febrero"))numero = 28;
		else if (mes.equalsIgnoreCase("marzo"))numero = 31;
		else if (mes.equalsIgnoreCase("abril"))numero = 30;
		else if (mes.equalsIgnoreCase("mayo"))numero = 31;
		else if (mes.equalsIgnoreCase("junio"))numero = 30;
		else if (mes.equalsIgnoreCase("julio"))numero = 31;
		else if (mes.equalsIgnoreCase("agosto"))numero = 31;
		else if (mes.equalsIgnoreCase("septiembre"))numero = 30;
		else if (mes.equalsIgnoreCase("octubre"))numero = 31;
		else if (mes.equalsIgnoreCase("noviembre"))numero = 30;
		else if (mes.equalsIgnoreCase("diciembre"))numero = 31;
		return numero;
	}
}

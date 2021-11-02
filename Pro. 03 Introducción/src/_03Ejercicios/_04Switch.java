package _03Ejercicios;

import java.util.Scanner;

public class _04Switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero, y string");
		int num = sc.nextInt();
		String text = sc.next();
		
		System.out.println(nombreMes(num));
		System.out.println(estacionDelAnyo(num));
		System.out.println(numeroDiaSemana(text));
		System.out.println(nombreDiaSemana(num));
		System.out.println(diasDelMes(num));
		
		System.out.println("Introduce mes y año");
		num = sc.nextInt();
		int anyo = sc.nextInt();
		
		System.out.println(diasDelMes(num, anyo));
	}

	public static String nombreMes(int mes) {
		String nombreMes = "";
		switch (mes) {
		case 1:
			nombreMes = "Enero";
			break;
		case 2:
			nombreMes = "Febrero";
			break;
		case 3:
			nombreMes = "Marzo";
			break;
		case 4:
			nombreMes = "Abril";
			break;
		case 5:
			nombreMes = "Mayo";
			break;
		case 6:
			nombreMes = "Junio";
			break;
		case 7:
			nombreMes = "Julio";
			break;
		case 8:
			nombreMes = "Agosto";
			break;
		case 9:
			nombreMes = "Septiembre";
			break;
		case 10:
			nombreMes = "Octubre";
			break;
		case 11:
			nombreMes = "Noviembre";
			break;
		case 12:
			nombreMes = "Diciembre";
			break;
		default:
			nombreMes ="Erroneo";
			break;
		}
		
		return nombreMes;
	}

	public static String estacionDelAnyo(int mes) {
		String estacion = "";
		switch (mes) {
		case 3:
		case 4:
		case 5:
			estacion = "Primavera";
			break;
		case 6:
		case 7:
		case 8:
			estacion = "Verano";
			break;
		case 9:
		case 10:
		case 11:
			estacion = "Otoño";
			break;
		case 12:
		case 1:
		case 2:
			estacion = "Invierno";
			break;

		default:
			estacion="Erroneo";
			break;
		}
		return estacion;
	}

	public static int numeroDiaSemana(String dia) {
		dia = dia.toLowerCase();
		int diaN = 0;
		switch (dia) {
		case "lunes":
			diaN = 1;
			break;
		case "martes":
			diaN = 2;
			break;
		case "miercoles":
			diaN = 3;
			break;
		case "jueves":
			diaN = 4;
			break;
		case "viernes":
			diaN = 5;
			break;
		case "sabado":
			diaN = 6;
			break;
		case "domingo":
			diaN = 7;
			break;

		default:
			diaN = -1;
			break;
		}
		return diaN;
	}
	public static String nombreDiaSemana(int dia) {
		String nombreDia = "";
		
		switch (dia) {
		case 1:
			nombreDia = "Lunes";
			break;
		case 2:
			nombreDia = "Martes";
			break;
		case 3:
			nombreDia = "Miercoles";
			break;
		case 4:
			nombreDia = "Jueves";
			break;
		case 5:
			nombreDia = "Viernes";
			break;
		case 6:
			nombreDia = "Sabado";
			break;
		case 7:
			nombreDia = "Domingo";
			break;

		default:
			nombreDia = "Erroneo";
			break;
		}
			
		return nombreDia;
	}
	public static int diasDelMes(int mes) {
		int dias = 0;
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			dias = 31;
			break;
			
		case 4:
		case 6:
		case 9:
		case 11:
			dias = 30;
			break;
			
		case 2:
			dias = 28;
			break;
			
		default:
			dias = -1;
			break;
		}
		return dias;
	}
	public static int diasDelMes(int mes, int anyo) {
		
		int dias = 0;	
		boolean bisiesto;
		
		// Dice si el año es visiesto
		if (anyo % 100 == 0) {
			if (anyo % 400 == 0) {
				bisiesto = true;
			}else {
				bisiesto = false;
			} 
		}else {
			if (anyo % 4 == 0) {
				bisiesto = true;
			} else {
			bisiesto = false;
			}
				
		}
		
		// Dice los dias del mes
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			dias = 31;
			break;
			
		case 4:
		case 6:
		case 9:
		case 11:
			dias = 30;
			break;
			
		case 2:
			if (bisiesto) dias = 29;
			else dias = 28;
			break;
			
		default:
			dias = -1;
			break;
		}
		return dias;
	}
}

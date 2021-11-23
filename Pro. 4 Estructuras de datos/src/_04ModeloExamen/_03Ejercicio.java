package _04ModeloExamen;

import java.util.Arrays;
import java.util.Scanner;

public class _03Ejercicio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el codigo: ");
		String codigo = sc.next();
		
		String[] codSeparado = separar(codigo);
		
		System.out.println("Letras del código: " + codSeparado[0]);
		System.out.println("Números del código: " + codSeparado[1]);
	}
	public static String[] separar(String codigo) {
		String[] vSeparado = new String[2];
		vSeparado[0] = codigo.substring(0,codigo.indexOf('-'));
		vSeparado[1] = codigo.substring(codigo.indexOf('-') + 1);
		
		if (vSeparado[0].length() > vSeparado[1].length()) {
			String aux = vSeparado[0];
			vSeparado[0] = vSeparado[1];
			vSeparado[1] = aux;
		}
		
		return vSeparado;
	}
}

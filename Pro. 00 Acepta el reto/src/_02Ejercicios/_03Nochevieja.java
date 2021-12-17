package _02Ejercicios;

import java.util.Scanner;

public class _03Nochevieja {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String hora = "";
		
		while (!hora.equals("00:00")) {
			hora = sc.nextLine();
			int horaN = Integer.parseInt(hora.substring(0,hora.indexOf(':')));
			int minN = Integer.parseInt(hora.substring(hora.indexOf(':') + 1));
			int minTotal = (horaN * 60) + minN;
			if (minTotal == 0) {
			
			}else {
				System.out.println(minTotal);
			}
			
		}
		
		
	}
}

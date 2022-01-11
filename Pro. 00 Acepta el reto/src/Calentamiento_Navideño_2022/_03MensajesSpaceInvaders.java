package Calentamiento_Navideño_2022;


import java.util.Scanner;

public class _03MensajesSpaceInvaders {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int con = sc.nextInt();
		for (int c = 0; c < con; c++) {
			
			int puntuaciones = sc.nextInt();
			char[][] m = new char[puntuaciones][3];
			
			String texto = "";
			for (int i = 0; i < m.length; i++) {
				String text = sc.next();
				for (int j = 0; j < m[0].length; j++) {
					m[i][j] = text.charAt(j);
				}
				
			}
			
			for (int j = 0; j < m[0].length; j++) {
				for (int i = 0; i < m.length; i++) {
					texto += m[i][j];
				}
			}
			
			System.out.println(texto);
		}
		
		
	}
}
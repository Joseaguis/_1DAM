package Calentamiento_Navideño_2022;

import java.util.Scanner;

public class _02PicPocPic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean continuar = true;
		while (continuar) {
			int jugador_1 = 0;
			int jugador_2 = 0;
			int num = sc.nextInt();
			
			if (num != 0 && num > 0) {
				int posicionBola = 0;
				for (int i = 0; i < num; i++) {
					String onomayopeya = sc.next();
					
					if (onomayopeya.equals("PIC")) {
						if (posicionBola == 0) {
							posicionBola = 1;
						}else {
							posicionBola = 0;
						}
					} else if (onomayopeya.equals("PONG!")) {
						if (posicionBola == 0) {
							jugador_1++;
						}else {
							jugador_2++;
						}
					}else {
						
					}
						
				}
			} else if (num == 0) {
				continuar = false;
			}
			System.out.println(jugador_1 + " " + jugador_2);
			if (continuar) {

			}
		}

	}
}

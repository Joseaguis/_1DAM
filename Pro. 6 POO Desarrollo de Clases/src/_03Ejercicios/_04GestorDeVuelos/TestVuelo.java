package _03Ejercicios._04GestorDeVuelos;

import _02Ejemplos._03Tiempo.Tiempo;

public class TestVuelo {
	 public static void main(String[] args) {
		Vuelo v = new Vuelo("IB101","Valencia","Madrid",new Tiempo(10,0,0),new Tiempo(11,30,0),200);
		
		System.out.println(v);
		
		v.reservarAsiento("Miguel", "11111A");
		v.reservarAsiento("Alvaro", "22222B");
		v.reservarAsiento("Paco", "333333C");
		v.reservarAsiento("Ruben", "44444D");
		
		v.reservarAsiento("Victor", "555555E",'V');
		
		System.out.println(v);
	}
}

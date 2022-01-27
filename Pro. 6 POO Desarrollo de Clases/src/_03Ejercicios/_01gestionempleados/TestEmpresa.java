package _03Ejercicios._01gestionempleados;

import java.util.NoSuchElementException;

public class TestEmpresa {
	public static void main(String[] args) {
		Empresa matisseDAM = new Empresa("MatisseDAM");
		Empleado p1 = new Empleado("Jose", "12345678A",1234,1200);
		Empleado p2 = new Empleado("Luis", "89765412L",2019,900);
		Empleado p3 = new Empleado("Juan", "58749632A",2004,1400);
		Empleado p4 = new Empleado("Javier", "32659841Ñ",2001,700);
		
		System.out.println(matisseDAM.toString());
		
		matisseDAM.contratar(p1);
		matisseDAM.contratar(p2);
		matisseDAM.contratar(p3);
		matisseDAM.contratar(p4);
		
		System.out.println(matisseDAM.toString());
		
		matisseDAM.subirTrienio(10);
		
		System.out.println(matisseDAM.toString());
		
		matisseDAM.despedir(p2);
		try {
			matisseDAM.despedir("58746932A");
		} catch (NoSuchElementException e) {
			System.err.println("No existe el empleado indicado");
		}

		System.out.println(matisseDAM.toString());
	}
}

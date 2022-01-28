package _03Ejercicios._01Gestionempleados;

import java.util.NoSuchElementException;

public class TestEmpresa {
	public static void main(String[] args) {
		Empresa e = new Empresa("MatisseDAM");
		System.out.println("Numero empleado: " + e.getNumeroEmpleados());
		
		Empleado p1 = new Empleado("Jose", "12345678A",1234,1200);
		Empleado p2 = new Empleado("Luis", "89765412L",2019,900);
		Empleado p3 = new Empleado("Juan", "58749632A",2004,1400);
		Empleado p4 = new Empleado("Javier", "32659841Ñ",2001,700);
		
		
		System.out.println(e.toString());
		
		e.contratar(p1);
		e.contratar(p2);
		e.contratar(p3);
		e.contratar(p4);
		
		System.out.println("Numero empleado: " + e.getNumeroEmpleados());
		System.out.println(e.toString());
		
		e.subirTrienio(10);
		
		System.out.println(e.toString());
		
		e.despedir(p2);
		try {
			e.despedir("58746932A");
		} catch (NoSuchElementException i) {
			System.err.println("No existe el empleado indicado");
		}

		System.out.println(e.toString());
	}
}

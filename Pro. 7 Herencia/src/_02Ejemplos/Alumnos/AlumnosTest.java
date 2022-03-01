package _02Ejemplos.Alumnos;

public class AlumnosTest {
	public static void main(String[] args) {
		Alumno a = new Alumno();
		
		a.setDni("54894684A");
		a.setNombre("Jose");
		a.setNia(12314546);
		a.setGrupo("DAM");
		
		Persona p = new Persona("412412O","Juan");
	//	Alumno a2 = new Alumno("5123123V","Pepe");
		
		System.out.println(p);
		System.out.println(a);
	}
}

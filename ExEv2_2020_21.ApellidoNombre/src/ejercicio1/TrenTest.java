package ejercicio1;

public class TrenTest {
	public static void main(String[] args) {

		// Creamos varios contenedores
		Contenedor c1 = new Contenedor("CSC", 1, 10000, true);
		Contenedor c2 = new Contenedor("CSC", 2, 10000, false);
		Contenedor c3 = new Contenedor("HANGING", 18, 10000, false);
		Contenedor c4 = new Contenedor("MAERS", 10, 10000, false);

		// Creamos un tren de que permite mercancias peligrosas
		Tren t1 = new Tren("TALGO1", true,35000);

		try {
			// Realizar aqui pruebas de carga ...
			t1.cargar(c1);
			t1.cargar(c2);
			t1.cargar(c3);
			// Continuar con otras pruebas si se estima oportuno.
			
			
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(t1.toString());
		

	}

}

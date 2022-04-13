package _02Ejemplos._07clasesGenericas;

import java.util.ArrayList;

public class TestEquipo {
	public static void main(String[] args) {
		EquipoFutbol ef = new EquipoFutbol("1ºDAM");

		ef.fichar(new Futbolista(1, "Jose"));
		ef.fichar(new Futbolista(2, "Javier"));

		EquipoProgramame ep = new EquipoProgramame("Sin java no hay paraiso");
		ep.fichar(new Programador("111111A", "Luis", "java"));
		ep.fichar(new Programador("222222A", "Paco", "python"));

		EquipoObject eo = new EquipoObject("2ºDAM");
		eo.fichar(new Futbolista(1, "Jose"));
		eo.fichar(new Programador("11111A", "Luis", "java"));

//		System.out.println(((Futbolista)eo.getCapitan()).getGoles());

		System.out.println(ef);
		System.out.println(ep);
		System.out.println(eo);

//		int luis = 20;
//		nombres.add("Javi");
//		nombres.add("Roberto");
//		nombres.add(luis);
//		for (int i = 0; i < nombres.size(); i++) {
//			System.out.println(((String) nombres.get(i)).toUpperCase());
//		}

		// Con la sintaxis de genericidad (notacion de diamante)
		// el mismo error se detectaria al compilar
		ArrayList<String> nombres2 = new ArrayList<>();
		nombres2.add("Javi");
		nombres2.add("Roberto");
		
		
		
		Equipo<Futbolista> equipo = new Equipo<>("3ºDAM");
		Equipo<Programador> equipo2 = new Equipo<>("2ºDAM");
		
		System.out.println(equipo.getCapitan().getGoles());
		System.out.println(equipo2.getCapitan().getLenguaje());
		

	}
}

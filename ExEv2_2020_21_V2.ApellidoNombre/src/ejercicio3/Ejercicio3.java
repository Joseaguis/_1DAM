package ejercicio3;
import java.util.ArrayList;
import java.util.Arrays;
public class Ejercicio3 {
	public 	static void mostrarDiferenciaEscanyos(ArrayList<Resultado> res2015, ArrayList<Resultado> res2016) {
		//Completar
	}
	
	public static void main(String[] args) {
		ArrayList<Resultado> res2015 = new ArrayList<>(Arrays.asList(new Resultado [] {
				new Resultado("PSOE",90),
				new Resultado("PP",123),
				new Resultado("CS",40),
				new Resultado("PODEMOS",71),
				new Resultado("CDC",8),
				new Resultado("PNV",6),
				new Resultado("ERC",9),
				new Resultado("IU",2)
		}));
		
		ArrayList<Resultado> res2016 = new ArrayList<>(Arrays.asList(new Resultado [] {
				new Resultado("PP",137),
				new Resultado("PSOE",85),
				new Resultado("PODEMOS",71),
				new Resultado("CS",32),
				new Resultado("ERC",9),
				new Resultado("CDC",8),
				new Resultado("PNV",5)
		}));
		
		
		Ejercicio3.mostrarDiferenciaEscanyos(res2015,res2016);
	}
}

package _03Ejercicios._03Coches;

public class TestCoche {
	public static void main(String[] args) {
		Coche c = new Coche();
		
		System.out.println(c);
		
		c.arrancar();
		
		c.acelerar(50);
		System.out.println(c);
		
		c.frenar(15);
		System.out.println(c);
		
		c.subirMarcha();
		System.out.println(c);
		
		double km = 1125;
		System.out.format("Consumo de combustible: %4.2f litros consumidos por 100Km%n",c.consumo());
		System.out.format("Horas de trayecto de %4.2f Km: %4.2f horas%n",km ,c.tiempoParaLlegar(km));
	}
}

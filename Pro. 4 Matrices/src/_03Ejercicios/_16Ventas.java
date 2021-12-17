package _03Ejercicios;

public class _16Ventas {
	public static void main(String[] args) {
		int[][] ventas = { 
				{ 200, 100, 100, 100, 100, 100, 100, 100, 100, 100 },
				{ 100, 100, 100, 100, 52, 100, 100, 70, 100, 500 }, 
				{ 100, 100, 300, 100, 100, 100, 50, 100, 100, 300 },
				{ 400, 100, 100, 150, 100, 400, 100, 100, 100, 100 },
				{ 123, 100, 100, 100, 89, 100, 150, 100, 140, 45 } };
		double[] precio = { 200, 10.1, 20.2, 30, 31, 4.8, 7.5, 1.5, 2.5, 3.5 };

		distribuidorMasHaVendido(ventas);
		articuloMasSeVende(ventas);
		informeVentaDistribuidor(ventas, precio);
	}

	public static void distribuidorMasHaVendido(int[][] ventas) {
		int[] sumaProd = new int [ventas.length];
		for (int i = 0; i < ventas.length; i++) {
			for (int j = 0; j < ventas[0].length; j++) {
				sumaProd[i] += ventas[i][j];
			}
		}
		int mayor = 0;
		int posMayor = 0;
		for (int i = 0; i < sumaProd.length; i++) {
			if (mayor < sumaProd[i]) {
				mayor = sumaProd[i];
				posMayor = i;
			}
		}
		System.out.println("El distribuidor que mas ha vendido es el nº:" + (posMayor + 1));
	}

	public static void articuloMasSeVende(int[][] ventas) {
		int[] sumaDistr = new int [ventas[0].length];
		for (int j = 0; j < ventas[0].length; j++) {
			for (int i = 0; i < ventas.length; i++) {
				sumaDistr[j] += ventas[i][j];
			}
		}
		int mayor = 0;
		int posMayor = 0;
		for (int i = 0; i < sumaDistr.length; i++) {
			if (mayor < sumaDistr[i]) {
				mayor = sumaDistr[i];
				posMayor = i;
			}
		}
		System.out.println("El articulo mas vendido es el nº:" + (posMayor + 1));
	}

	public static void informeVentaDistribuidor(int[][] ventas, double[] precio) {
		final int ventasuperior1 = 30_000;
		final int ventasuperior2 = 70_000;
		final double comision1 = 0.05;
		final double comision2 = 0.08;
		
		double[] totalVenta = new double[ventas.length];
		double[] comisionAplicada = new double[ventas.length];
		double[] totalComision = new double[ventas.length];
		
		for (int i = 0; i < ventas.length; i++) {
			double sumaTotal = 0;
			for (int j = 0; j < ventas[0].length; j++) {
				sumaTotal = sumaTotal + (ventas[i][j] * precio [j]);
			}
			totalVenta[i] = sumaTotal;
		}
		for (int i = 0; i < totalVenta.length; i++) {
			if (totalVenta[i] > ventasuperior2) {
				comisionAplicada[i] = comision2;
			}else if(totalVenta[i] > ventasuperior1){
				comisionAplicada[i] = comision1;
			}
		}
		
		for (int i = 0; i < ventas.length; i++) {
			totalComision[i] = totalVenta[i] * comisionAplicada[i];
			System.out.println("\nDistribuidor nº: " + (i + 1));
			System.out.format("------Total venta: %08.2f€\n", totalVenta[i]);
			System.out.format("------Comision aplicada de: %04.2f%%\n", comisionAplicada[i] * 100);
			System.out.format("------Total comision %06.2f€\n", totalComision[i]);
			
		}
		
	}
}

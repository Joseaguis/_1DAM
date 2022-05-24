package _02Ejemplos;

public class _02SumarHasta5Modular {
	
	public static void main(String[] args) {
		int suma = sumarhasta5();
		System.out.println(suma);
	}
	
	public static int sumarhasta5() {
		return 5 + sumarhasta4();
	}
	
	public static int sumarhasta4() {
		return 4 + sumarhasta3();
	}
	
	public static int sumarhasta3() {
		return 3 + sumarhasta2();
	}
	
	public static int sumarhasta2() {
		return 2 + sumarhasta1();
	}
	
	public static int sumarhasta1() {
		return 1;
	}
}

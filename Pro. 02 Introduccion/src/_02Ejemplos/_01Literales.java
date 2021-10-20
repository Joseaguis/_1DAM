package _02Ejemplos;

public class _01Literales {
	public static void main(String[] args) {
		
		int num1 = 20;
		int num2 = 020;
		int num3 = 0x20;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		//Los literaes de tipo long llevan una L detras
		
		long largo1 = 12345;
		long largo2 = 1111111111L;
		
		//Literales raros
		System.out.println(20/0.0);
		System.out.println(-20/0.0);
		System.out.println(0.0/0.0);
	}
}

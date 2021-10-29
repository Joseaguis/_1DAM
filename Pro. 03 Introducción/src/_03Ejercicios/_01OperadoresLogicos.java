package _03Ejercicios;

public class _01OperadoresLogicos {
	public static void main(String[] args) {
		
		int m = 18, j = 19, p = 20, v = 15;
		
		//No hacer las g, k, 
		boolean a = m < 18;
		System.out.println("Miguel menor de edad: " + a);
		
		boolean b = m > j;
		System.out.println("Miguel es mayor que Julio: " + b);
		
		boolean c = m > j && m > p && m > v;
		System.out.println("Miguel es el mas viejo: " + c);
		
		boolean d = !(m > j && m > p && m > v);
		System.out.println("Miguel no es el mas viejo: " + d);

		boolean e = m < 18 && j < 18;
		System.out.println("Miguel y Julio son menores de edad: " + e);

		boolean f = m > 18 || j > 18 || p > 18 || v > 18;
		System.out.println("Alguno de ellos es mayor de edad: " + f);

		boolean h = (m + j + p + v) >= 100;
		System.out.println("Entre todos tienen más de 100 años.: " + h);

		boolean i = (m + j) > p;
		System.out.println("Entre Miguel y Julio suman más edad que Pablo.: " + i);

		boolean j2 = (m + j) > (p + v);
		System.out.println("Entre Miguel y Julio suman más edad que Pablo y Vicente juntos.: " + j2);

		boolean l = m < 18 || j < 18 || p < 18 || v < 18;
		System.out.println("Al menos uno de ellos es menor de edad.: " + l);

		boolean m2 = m < 18 && j < 18 && p < 18 && v < 18;
		System.out.println("Todos son menores de edad.: " + m2);

		boolean o = m == j || m == v || m == p || j == v || j == p|| p == v;
		System.out.println("Al menos dos de ellos nacieron el mismo año: " + o);

		boolean p2 = m < j || p < j || v < j;
		System.out.println("Al menos uno de ellos es menor que Julio: " + p2);
		
	}
}

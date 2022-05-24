package _02Ejemplos;

public class _06Fibonacci {
	public static void main(String[] args) {
		System.out.println(fibonacciIterativo(8));

	}

	public static int fibonacciIterativo(int n) {
		if (n == 1)
			return 0;
		else if (n == 2)
			return 1;
		else {
			int a = 0;
			int b = 1;
			int f = 0;

			for (int i = 3; i <= n; i++) {
				f = a + b;
				a = b;
				b = f;
			}
			return f;
		}
	}
	
	public static int fibonacci(int n) {
		if(n == 1) return 0;
		else if(n == 2) return 1;
		else return fibonacci(n - 1) + fibonacci(n - 2);
	}
}

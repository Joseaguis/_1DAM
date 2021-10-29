package _02Ejemplos;

public class _04IncrementoDecremento {
	public static void main(String[] args) {
		int a, b, c, d;
		a = b = c = d = 10;
		//El incremento y decremento se pueden  poner antes o despues del nombre de la variable
		//El efecto es el mismo:
		
		a++; //11
		++b; //11
		c--; // 9
		--d; // 9
		
		System.out.println(a + " " + b + " " + c + " " + d);
		
		//Si el incremento o decremento son parte de una expresión mas grande, entonces
		//no es lo mismo que vaya antes o que vaya despues.
		
		int x, y;
		
		//Preincremento: El valor de la variable incrementada cambia antes del uso de la variable
		x = 10;
		y = ++x;
		System.out.println(x + " " + y);
		
		//Postincremento: El valor de la variable incrementada cambia despues del uso de la variable
		x = 10;
		y = x++;
		System.out.println(x + " " + y);
		
		
	}
}

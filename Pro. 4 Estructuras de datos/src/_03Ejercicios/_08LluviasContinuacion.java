package _03Ejercicios;

public class _08LluviasContinuacion {
	public static void main(String[] args) {
		double[] lluvia = { 1, 0, 0, 1, 2, 3, 0, 0, 5, 4, 2};
		System.out.println(primerDiaLluviaX(lluvia, 0));
		System.out.println(ultimoDiaLluviaX(lluvia, 0));
	}

	public static int primerDiaLluviaX(double p[], double x) {
		boolean encontrado = false;
		int primerDia = -1;

		for (int i = 0; i < p.length && !encontrado; i++) {
			if (p[i] == x) {
				primerDia = i;
				encontrado = true;
			}
		}
		return primerDia;
	}

	public static int ultimoDiaLluviaX(double p[], double x) {
		boolean encontrado = false;
		int ultimoDia = -1;

		for (int i = p.length - 1; i > 0 && !encontrado; i--) {
			if (p[i] == x) {
				ultimoDia = i;
				encontrado = true;
			}
		}
		return ultimoDia;
	}
}

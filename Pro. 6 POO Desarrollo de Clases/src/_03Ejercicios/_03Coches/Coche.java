package _03Ejercicios._03Coches;

public class Coche {
	private boolean enMarcha;
	private double velocidadMax;
	private double velocidadActual;
	private double rpmMaxima;
	private double rpmActual;
	private int marcha;

	public Coche() {
		this.enMarcha = false;
		this.velocidadMax = 180;
		this.velocidadActual = 0;
		this.rpmMaxima = 65000;
		this.rpmActual = 0;
		this.marcha = 0;
	}

	public Coche(double velocidadMax, double rpmMaxima) {
		this.enMarcha = false;
		this.velocidadMax = velocidadMax;
		this.velocidadActual = 0;
		this.rpmMaxima = rpmMaxima;
		this.rpmActual = 0;
		this.marcha = 0;
	}

	public String toString() {
		String texto;
		texto = String.format(
				"¿Coche en marcha?: %b%n" + "Velocidad maxima: %5.2f%n" + "Velocidad actual: %5.2f%n" + "Rpm maxima: %8.2f%n"
						+ "Rpm actual: %8.2f%n" + "Marcha actual: %d%n",
				this.enMarcha, this.velocidadMax, this.velocidadActual, this.rpmMaxima, this.rpmActual, this.marcha);

		return texto;
	}

	public void arrancar() {
		this.enMarcha = true;
	}

	public void apagar() {
		this.velocidadActual = 0;
		this.rpmActual = 0;
		this.marcha = 0;
		this.enMarcha = false;
	}

	public void acelerar(double v) {
		if (enMarcha) {
			if (marcha != 0) {
				setVelocidadActual(getVelocidadActual() + v);
				setRpmActual(getRpmActual() + (v * 70));
			}
		}
	}

	public void frenar(double v) {
		if (enMarcha) {
			setVelocidadActual(getVelocidadActual() - v);
			setRpmActual(getRpmActual() - (v * 70));
			if (getVelocidadActual() == 0) {
				setRpmActual(0);
				setMarcha(0);
			}
		}

	}
	
	public void subirMarcha() {
		if (enMarcha) {
			setMarcha(getMarcha() + 1);
			setRpmActual(getRpmActual() * 1.30);
		}
	}
	
	public void bajarMarcha() {
		if (enMarcha) {
			setMarcha(getMarcha() - 1);
			setRpmActual(getRpmActual() * 0.7);
		}
	}
	
	public double consumo() {
		double litrosCombustible = (getRpmActual() / getMarcha()) / 1000;
		if (marcha != 0) {
			litrosCombustible = (getRpmActual() / getMarcha()) / 1000;
		} else {
			litrosCombustible = 0;
		}
		
		return litrosCombustible;
	}
	
	public double tiempoParaLlegar (double km) {
		
		return km / this.velocidadActual;
	}

	/**
	 * @return the enMarcha
	 */
	public boolean isEnMarcha() {
		return enMarcha;
	}

	/**
	 * @return the velocidadMax
	 */
	public double getVelocidadMax() {
		return velocidadMax;
	}

	/**
	 * @return the velocidadActual
	 */
	public double getVelocidadActual() {
		return velocidadActual;
	}

	/**
	 * @return the rpmMaxima
	 */
	public double getRpmMaxima() {
		return rpmMaxima;
	}

	/**
	 * @return the rpmActual
	 */
	public double getRpmActual() {
		return rpmActual;
	}

	/**
	 * @return the marcha
	 */
	public int getMarcha() {
		return marcha;
	}

	/**
	 * @param enMarcha the enMarcha to set
	 */
	public void setEnMarcha(boolean enMarcha) {
		this.enMarcha = enMarcha;
	}

	/**
	 * @param velocidadMax the velocidadMax to set
	 */
	public void setVelocidadMax(double velocidadMax) {
		this.velocidadMax = velocidadMax;
	}

	/**
	 * @param velocidadActual the velocidadActual to set
	 */
	public void setVelocidadActual(double velocidadActual) {
		if (velocidadActual > this.velocidadMax) {
			velocidadActual = this.velocidadMax;
		} else if (velocidadActual < 0) {
			velocidadActual = 0;
		}
		this.velocidadActual = velocidadActual;
	}

	/**
	 * @param rpmMaxima the rpmMaxima to set
	 */
	public void setRpmMaxima(double rpmMaxima) {
		this.rpmMaxima = rpmMaxima;
	}

	/**
	 * @param rpmActual the rpmActual to set
	 */
	public void setRpmActual(double rpmActual) {
		if (rpmActual > this.rpmMaxima) {
			rpmActual = this.rpmMaxima;
		} else if (rpmActual < 0) {
			rpmActual = 0;
		}
		this.rpmActual = rpmActual;
	}

	/**
	 * @param marcha the marcha to set
	 */
	public void setMarcha(int marcha) {
		if (marcha > 5)
			marcha = 5;
		else if (marcha < 0)
			marcha = 0;

		this.marcha = marcha;
	}
}

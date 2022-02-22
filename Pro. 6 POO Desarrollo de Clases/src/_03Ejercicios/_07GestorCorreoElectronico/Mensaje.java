package _03Ejercicios._07GestorCorreoElectronico;

public class Mensaje {
	private static int siguienteCodigo;
	static {
		siguienteCodigo = 1;
	}
	private int codigo;
	private String emisor;
	private String destinatario;
	private String asunto;
	private String texto;

	public Mensaje(String emisor, String destinatario, String asunto, String texto) {
		this.emisor = emisor;
		this.destinatario = destinatario;
		this.asunto = asunto;
		this.texto = texto;

		this.codigo = siguienteCodigo;
		siguienteCodigo++;
	}

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (!(o instanceof Mensaje)) {
			return false;
		}

		Mensaje mensaje = (Mensaje)o;
		
		if (this.codigo == mensaje.getCodigo()) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean validarEMail(String email) {
		int posArroba = email.indexOf('@');
		int posPunto = email.indexOf('.');
		
		return posPunto != -1 && posArroba > 0 && posPunto < email.length() && posArroba < posPunto - 1;
	}
	
	public String toString() {
		return String.format("Codigo: %d%nEmisor: %s%nDestinatario: %s%nAsunto: %s%nTexto:%n%s", this.codigo,this.emisor,this.destinatario,this.asunto,this.texto);
	}

	/**
	 * @return the siguienteCodigo
	 */
	public static int getSiguienteCodigo() {
		return siguienteCodigo;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @return the emisor
	 */
	public String getEmisor() {
		return emisor;
	}

	/**
	 * @return the destinatario
	 */
	public String getDestinatario() {
		return destinatario;
	}

	/**
	 * @return the asunto
	 */
	public String getAsunto() {
		return asunto;
	}

	/**
	 * @return the texto
	 */
	public String getTexto() {
		return texto;
	}

}

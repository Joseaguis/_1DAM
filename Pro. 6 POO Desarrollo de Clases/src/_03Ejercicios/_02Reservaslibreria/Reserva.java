package _03Ejercicios._02Reservaslibreria;

public class Reserva {
	
	private String nifCliente;
	private String nombreCliente;
	private String telfCliente;
	private int codLibroReservado;
	private int numEjemplares;
	
	public Reserva (String nif,String nombre, String tel, int codigo, int ejemplares){
		this.nifCliente = nif;
		this.nombreCliente = nombre;
		this.telfCliente = tel;
		this.codLibroReservado = codigo;
		this.numEjemplares = ejemplares;
	}
	public Reserva (String nif,String nombre, String tel, int codigo){
		this.nifCliente = nif;
		this.nombreCliente = nombre;
		this.telfCliente = tel;
		this.codLibroReservado = codigo;
	}
	
	
	/**
	 * @param numEjemplares the numEjemplares to set
	 */
	public void setNumEjemplares(int numEjemplares) {
		this.numEjemplares = numEjemplares;
	}
	/**
	 * @return the nifCliente
	 */
	public String getNifCliente() {
		return nifCliente;
	}
	/**
	 * @return the nombreCliente
	 */
	public String getNombreCliente() {
		return nombreCliente;
	}
	/**
	 * @return the telfCliente
	 */
	public String getTelfCliente() {
		return telfCliente;
	}
	/**
	 * @return the codLibroReservado
	 */
	public int getCodLibroReservado() {
		return codLibroReservado;
	}
	/**
	 * @return the numEjemplares
	 */
	public int getNumEjemplares() {
		return numEjemplares;
	}
	
}

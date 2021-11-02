package utiles;

/**
 * Esta es una clase de utilidad, con metodos static. 
 * Se trata de metodos utiles para trabajar con fechas.
 * @author nombre del alumno/a
 *
 */
public class Fechas {
	
	/**
	 * Determina si un anyo es o no bisiesto.
	 * @param anyo el anyo
	 * @return true si el anyo es bisiesto y false en caso contrario
	 */
	public static boolean esBisiesto(int anyo){
		boolean bisiesto;
		
		if (anyo % 100 == 0) {
			if (anyo % 400 == 0) {
				bisiesto = true;
			}else {
				bisiesto = false;
			} 
		}else {
			if (anyo % 4 == 0) {
				bisiesto = true;
			} else {
			bisiesto = false;
			}
		}
		return bisiesto;
	}
	
	/**
	 * Devuelve el numero de dias que tiene un mes de determinado anyo. El anyo
	 * es necesario porque el mes de febrero puede tener un numero distinto 
	 * de dias dependiendo de si el anyo es o no bisiesto.
	 * @param mes El mes. Estara entre 1 y 12.
	 * @param anyo El anyo. Valor positivo
	 * @return el numero de dias que tiene el mes
	 */
	public static int diasDelMes(int mes, int anyo){
		int dias = 0;
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			dias = 31;
			break;
			
		case 4:
		case 6:
		case 9:
		case 11:
			dias = 30;
			break;
			
		case 2:
			if (esBisiesto(anyo)) dias = 29;
			else dias = 28;
			break;
			
		default:
			dias = -1;
			break;
		}
		return dias;
	}
	
	/**
	 * Devuelve el nombre de un mes: "Enero", "Febrero", ....
	 * @param mes El mes del que se pide el nombre. Estara entre 1 y 12
	 * @return el nombre del mes correspondiente
	 */
	public static String nombreDelMes(int mes){
		String nombreMes = "";
		switch (mes) {
		case 1:
			nombreMes = "Enero";
			break;
		case 2:
			nombreMes = "Febrero";
			break;
		case 3:
			nombreMes = "Marzo";
			break;
		case 4:
			nombreMes = "Abril";
			break;
		case 5:
			nombreMes = "Mayo";
			break;
		case 6:
			nombreMes = "Junio";
			break;
		case 7:
			nombreMes = "Julio";
			break;
		case 8:
			nombreMes = "Agosto";
			break;
		case 9:
			nombreMes = "Septiembre";
			break;
		case 10:
			nombreMes = "Octubre";
			break;
		case 11:
			nombreMes = "Noviembre";
			break;
		case 12:
			nombreMes = "Diciembre";
			break;
		default:
			nombreMes ="Erroneo";
			break;
		}
		
		return nombreMes;
	}
	
	/**
	 * Dado un String que contiene una fecha en formato dd/mm/aaaa
	 * devuelve un entero con el dia de la fecha.
	 * @param fecha String con formato dd/mm/aaaa. La longitud del string
	 * no tiene por que ser 10, pues el dia y el mes se pueden expresar
	 * con uno o dos digitos.
	 * @return el dia de la fecha
	 */
	public static int extraerDia (String fecha){
		int dia = 0;
		String restoFecha = fecha;
		String pFecha = "";
		for (int i = 0; i < 1; i++) {
			pFecha = fecha.substring(0, fecha.indexOf('/'));
			restoFecha = fecha.substring(fecha.indexOf('/') + 1);
		}
		dia = Integer.parseInt(pFecha);
		return dia;
	}

	/**
	 * Dado un String que contiene una fecha en formato dd/mm/aaaa
	 * devuelve un entero con el mes de la fecha.
	 * @param fecha String con formato dd/mm/aaaa. La longitud del string
	 * no tiene por que ser 10, pues el dia y el mes se pueden expresar
	 * con uno o dos digitos.
	 * @return el mes de la fecha
	 */
	public static int extraerMes (String fecha){
		//TODO Completar extraerMes
		int mes = 0;
		String restoFecha = fecha;
		String pFecha = "";
		for (int i = 0; i < 2; i++) {
			pFecha = fecha.substring(0, fecha.indexOf('/'));
			restoFecha = fecha.substring(fecha.indexOf('/') + 1);
		}
		mes = Integer.parseInt(pFecha);
		return mes;
	}
	
	/**
	 * Dado un String que contiene una fecha en formato dd/mm/aaaa
	 * devuelve un entero con el anyo de la fecha.
	 * @param fecha String con formato dd/mm/aaaa. La longitud del string
	 * no tiene por que ser 10, pues el dia y el mes se pueden expresar
	 * con uno o dos digitos.
	 * @return el anyo de la fecha
	 */
	public static int extraerAnyo (String fecha){
		//TODO Completar extraerAnyo
		int año = 0;
		String restoFecha = fecha;
		String pFecha = "";
		for (int i = 0; i < 3; i++) {
			pFecha = fecha.substring(0, fecha.indexOf('/'));
			restoFecha = fecha.substring(fecha.indexOf('/') + 1);
		}
		año = Integer.parseInt(pFecha);
		return año;
	}
	
	/**
	 * Dada una fecha expresada con tres valores (dia, mes y anyo), devuelve
	 * si la fecha es valida o no. Para que una fecha sea correcta:
	 * - El dia tiene que ser mayor que cero.
	 * - El dia tiene que ser menor o igual que el numero de dias que tiene el mes
	 * - El mes tiene que estar entre 1 y 12
	 * - El anyo tiene que ser positivo.
	 * @param dia El dia de la fecha
	 * @param mes El mes de la fecha
	 * @param anyo El anyo de la fecha
	 * @return true si la fecha es valida y false si no lo es
	 */
	public static boolean esFechaValida(int dia, int mes, int anyo){
		// TODO Completar esFechaValida
		// Este metodo tendra que llamar a diasDelMes para averiguar cuantos
		// dias tiene el mes de la fecha que nos dan y asi comprobar �
		// si el dia es correcto o no
		return false;
	}
	
	/**
	 * Compara dos fechas para averiguar cual de ellas es la menor. Cada fecha vendra expresada
	 * por tres valores (dia, mes y anyo)
	 * @param d1 Dia de la primera fecha
	 * @param m1 Mes de la primera fecha
	 * @param a1 Anyo de la primera fecha
	 * @param d2 Dia de la segunda fecha
	 * @param m2 Mes de la segunda fecha
	 * @param a2 Anyo de la segunda fecha
	 * @return un entero que ser�:
	 *  -1 si la primera fecha es menor (anterior) que la segunda 
	 *   0 si las dos fechas son iguales
	 *  +1 si la primera fecha es mayor (posterior) que la segunda 
	 */ 
	public static int compararFechas (int d1, int m1, int a1, int d2, int m2, int a2){
		// TODO Completar compararFechas
		return 0;
	}
}

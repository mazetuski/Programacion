/**
 * Paquete fechaPorGrupos.
 */
package fechaPorGrupos;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Pattern;

/**
 * Clase Fecha.
 * 
 * @author Miguel &Aacute;ngel Zamora Blanco.
 * @author Antonio Luque Bravo
 * @author Coral Almansa Dom&iacute;nguez
 * @author Roberto Carlos Flores G&oacute;mez
 * 
 * @version 1.0
 * 
 */
public class Fecha {
	private SimpleDateFormat formateador = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy", new Locale("es", "ES"));
	private GregorianCalendar calendar = new GregorianCalendar();
	private static final String COMPROBAR_FECHA = "^([0-2][1-9]|[3][0-1])([-/])([0][1-9]|[1][0-2])([-/])([0-1]\\d\\d\\d|[2][0]\\d\\d)$";

	/**
	 * Costructor de Fecha
	 * 
	 * @param dia
	 *            Dia de la fecha.
	 * @param mes
	 *            Mes de la fecha.
	 * @param anio
	 *            A&ntilde;o de la fecha.
	 * @throws FechaNoValidaException
	 *             si la fecha no es valida.
	 */
	Fecha(String dia, String mes, String anio) throws FechaNoValidaException {
		setCalendar(dia, mes, anio);
	}

	/**
	 * Constructor de Fecha.
	 * 
	 * @param fecha
	 *            Fecha que se almacena.
	 * @throws FormatoNoValidoException
	 *             si el formato no es valido.
	 * @throws FechaNoValidaException
	 *             si la fecha no es valida.
	 */
	Fecha(String fecha) throws FormatoNoValidoException, FechaNoValidaException {
		if (esValidoFormato(fecha)) {
			String[] fechaArray = fecha.split("[-/]");
			setCalendar(fechaArray[0], fechaArray[1], fechaArray[2]);
		}

	}

	/**
	 * Metodo que dice si una fecha es futura.
	 * 
	 * @return true si es futura, false en caso contrario.
	 */
	boolean esFuturo() {
		return calendar.after(GregorianCalendar.getInstance());
	}

	/**
	 * Metodo que calcula los dias transcurridos entre una fecha y la actual.
	 * 
	 * @return Devuelve la cantidad de dias transcurridos.
	 * @throws FechaFuturaException
	 *             si la fecha es futura.
	 */
	long calcularDiasTranscurridos() throws FechaFuturaException {
		if (esFuturo())
			throw new FechaFuturaException("La fecha es futura.");
		long fechaMilis = calendar.getTimeInMillis();
		long fechaActualMilis = GregorianCalendar.getInstance().getTimeInMillis();
		long diasTranscurridos = fechaActualMilis - fechaMilis;
		return diasTranscurridos = ((((diasTranscurridos / 1000) / 60) / 60) / 24);

	}

	/**
	 * Metodo que dice si el formato de la fecha es valido.
	 * 
	 * @return Devuelve true si es valido.
	 * @throws FormatoNoValidoException
	 *             si el formato no es valido.
	 */
	private boolean esValidoFormato(String fecha) throws FormatoNoValidoException {
		if (!Pattern.matches(COMPROBAR_FECHA, fecha))
			throw new FormatoNoValidoException("El formato de la fecha no es valido.");
		return true;
	}

	/**
	 * Metodo que dice si la fecha es valida.
	 * 
	 * @param dia
	 *            Dia de la fecha.
	 * @param mes
	 *            Mes de la fecha.
	 * @param anio
	 *            Anio de la fecha.
	 * @return Devuelve true si es valida la fecha.
	 * @throws FechaNoValidaException
	 *             si la fecha no es valida.
	 */
	private boolean esValidaFecha(String dia, String mes, String anio) throws FechaNoValidaException {
		setCalendar(dia, mes, anio);
		try {
			calendar.get(Calendar.DAY_OF_WEEK);
		} catch (Exception e) {
			throw new FechaNoValidaException("La fecha no es valida.");
		}
		return true;
	}

	/**
	 * Metodo que establece una fecha.
	 * 
	 * @param dia
	 *            Dia de la fecha.
	 * @param mes
	 *            Mes de la fecha.
	 * @param anio
	 *            Anio de la fecha.
	 * @throws FechaNoValidaException
	 */
	private void setCalendar(String dia, String mes, String anio) throws FechaNoValidaException {
		calendar.setLenient(false);
		int date = Integer.parseInt(dia);
		int month = Integer.parseInt(mes) - 1;
		int year = Integer.parseInt(anio);
		calendar.set(year, month, date);
		try {
			calendar.get(Calendar.DAY_OF_WEEK);
		} catch (Exception e) {
			throw new FechaNoValidaException("La fecha no es valida.");
		}
	}

	/**
	 * Metodo que dice si una persona es mayor de edad.
	 * 
	 * @return Devuelve los anios de la persona.
	 * @throws FechaFuturaException
	 *             si la fecha es futura.
	 */
	boolean esMayorEdad() throws FechaFuturaException {
		if (esFuturo())
			throw new FechaFuturaException("La fecha es futura.");
		// long edadMilis = calendar.getTimeInMillis();
		// long fechaActualMilis =
		// GregorianCalendar.getInstance().getTimeInMillis();
		// long aniosTranscurridos = fechaActualMilis - edadMilis;
		// return (((((aniosTranscurridos / 1000) / 60) / 60) / 24) / 365) >=
		// 18;
		if ((GregorianCalendar.getInstance().YEAR - calendar.YEAR) > 18)
			return true;
//		else if (GregorianCalendar.getInstance().YEAR - calendar.YEAR == 18)
//			if (GregorianCalendar.getInstance().MONTH > calendar.MONTH
//					|| (GregorianCalendar.getInstance().MONTH == calendar.MONTH
//							&& GregorianCalendar.getInstance().DAY_OF_MONTH > calendar.MONTH))
//				return true;
		return false;

	}

	/**
	 * Metodo que suma dos fechas.
	 * 
	 * @param fecha
	 *            Fecha que se suma.
	 * @return La suma de las fechas.
	 */
	GregorianCalendar sumarFechas(int dia, int anios) {
		GregorianCalendar fechaSuma = calendar;
		fechaSuma.add(calendar.DAY_OF_MONTH, dia);
		fechaSuma.add(calendar.YEAR, anios);
		return fechaSuma;

	}

	/**
	 * Metodo que devuelve el dia de la semana en castellano.
	 * 
	 * @return Devuelve el dia de la semana.
	 */
	String getdiaSemana() {
		SimpleDateFormat dia = new SimpleDateFormat("EEEE", new Locale("es", "ES"));
		return dia.format(calendar.getTime());
	}

	/**
	 * Metodo que devuelve el mes en castellano.
	 * 
	 * @return Devuelve el mes.
	 */
	String getMesActual() {
		SimpleDateFormat dia = new SimpleDateFormat("MMMM", new Locale("es", "ES"));
		return dia.format(calendar.getTime());
	}

	@Override
	public String toString() {
		return formateador.format(calendar.getTime());
	}

}

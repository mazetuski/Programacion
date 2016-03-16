/**
 * Paquete fechaPorGrupos.
 */
package fechaPorGrupos;

import java.util.GregorianCalendar;

/**
 * Clase TestFecha.
 * 
 * @author Miguel &Aacute;ngel Zamora Blanco.
 * @author Antonio Luque Bravo
 * @author Coral Almansa Dom&iacute;nguez
 * @author Roberto Carlos Flores G&oacute;mez
 * 
 * @version 1.0
 * 
 */
public class TestFecha {
	public static void main(String[] args) {
		try {
			Fecha fecha = new Fecha("31/01/1995");
			Fecha fecha2 = new Fecha("29", "02", "1999");
			Fecha fechaFutura = new Fecha("29/02/2020");
			System.out.println("Dias transcurridos: "
					+ fecha.calcularDiasTranscurridos());
			System.out.println(fecha);
			System.out.println("Dias transcurridos fecha 2: "
					+ fecha2.calcularDiasTranscurridos());
			System.out.println("Es futura?: " + fecha.esFuturo());
			System.out.println("Es futura? (fechaFutura): "
					+ fechaFutura.esFuturo());
			GregorianCalendar fechaSuma = fecha.sumarFechas(fecha2);
			System.out.println("Suma fecha: " + fechaSuma.getTime());
			System.out.println("Es mayor de edad?:" + fecha.esMayorEdad());
			System.out.println("Es mayor de edad?:" + fecha2.esMayorEdad());
			System.out.println("Dia de la semana: " + fecha.getdiaSemana());
			System.out.println("Mes: " + fecha.getMesActual());

		} catch (FechaNoValidaException | FechaFuturaException
				| FormatoNoValidoException e) {
			System.err.println(e.getMessage());
		}
	}
}

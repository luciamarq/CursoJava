package cuentas.filtros;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Optional;


public class Filtros {

	/*
	 * FILTROS PARA MI PROYECTO BANCO:
	 */
	
	/*
	 * Comprobaremos si el formato de la fecha es correcto dada una String: 
	 */
	public static LocalDate fechaCorrecta (String fecha, String formato) {
		
		DateTimeFormatter formato_f = DateTimeFormatter.ofPattern(formato);
		/*
		 * En vez de un Optional simplficamos el codigo 
		 * incializando la fecha a null;
		 */
		LocalDate fecha_correcta = null;
		
		try {
			fecha_correcta = LocalDate.parse(fecha, formato_f);
			if(fecha_correcta!=null) {
				return fecha_correcta;
			}
		
		}catch(DateTimeParseException e) {
			
		}
		return null;	
	}
	/*
	 * Sobrecarga del metodo:
	 */
	
	public static LocalDate fechaCorrecta(String fecha) {
		return fechaCorrecta(fecha, "dd-MM-yyyy");
	}

	/*
	 * 1) Los nombres de titular deben de tener entre 20 y 30 caracteres
	 */
	
	public static boolean long_maxima(String titular, int longitud) {
		return titular.length()<=longitud;
	}
	
	public static boolean long_min(String titular, int longitud) {
		return titular.length()<=longitud;
	}
	
	public static boolean controlLongitud(String titular, int long_max, int long_min) {
		return long_maxima(titular, long_max) && long_min(titular, long_min);
		
	}
	
	/*
	 * Fecha:  caducidad >3 y <5 años:
	 */
	
	public static boolean fecha_maxima(LocalDate fecha, LocalDate fecha_max) {
		return fecha.isBefore(fecha_max);
		
	}
	
	public static boolean fecha_min(LocalDate fecha, LocalDate fecha_min) {
		return fecha.isAfter(fecha_min);
	}
	
	/*
	 * Implementar en las fechas de caducidad:
	 */
	public static boolean controlFecha (LocalDate fecha, int any_max, int min_any) {
		LocalDate hoy = LocalDate.now();
		return(hoy.getYear()>fecha.getYear()+min_any && hoy.getYear()<fecha.getYear()+any_max);
	}
	
	
	/*
	 * Para filtrar los conceptos de ingresos y gastos >10 y <100:
	 */
	
	public static boolean concepto_max(String concepto, int longitud) {
		return concepto.length()<=longitud;
	}
	
	public static boolean concepto_min(String concepto, int longitud) {
		return concepto.length()<=longitud;
	}
	
	public static boolean conceptoLongitud(String concepto, int long_max, int long_min) {
		return long_maxima(concepto, long_max) && long_min(concepto, long_min);
		
	}
	
	
	
}

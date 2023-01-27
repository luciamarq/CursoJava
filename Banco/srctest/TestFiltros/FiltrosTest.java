package TestFiltros;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.hamcrest.core.IsNot;
import org.junit.jupiter.api.Test;

import cuentas.filtros.Filtros;

class FiltrosTest {

	final String CONCEPTO = "ESTO ES 10";
	final String TITULAR3 = "Maria Calvo Cox";
	final String CONCEPTO2="ESTO TIENE MUCHOS MAS CARACTERES";
	final String TITULAR1 ="ESTE TITULAR ES DE 21";
	final String TIULAR2 = "ESTO TIENE MAS DE 30 CARACTERES seguro";
	final String CONCEPTO3= "ESTO TIENE MAS DE 10 Y MENOS DE 100";
	final LocalDate fecha = LocalDate.parse("2022-03-04");
	final LocalDate hoy = LocalDate.now();
	final LocalDate fecha3 = LocalDate.parse("1998-12-21");
	final String fecha4 = "08-07-2022";
	final String fecha5 = "09/07/1997";
	
	
	@Test
	void testfechaCorrecta() {
		assertNotNull(Filtros.fechaCorrecta(fecha4));		
	}
	
	@Test
	void testFechaNoOk() {
		assertNull(Filtros.fechaCorrecta(fecha5));
	}
	
	@Test
	void testFechaOkFormato() {
		assertNotNull(Filtros.fechaCorrecta(fecha4, "dd-MM-yyyy"));
	}
	
	@Test
	void testFechaFormato() {
		assertNull(Filtros.fechaCorrecta(fecha5, "yyyy/MM/dd"));
	}

	@Test
	void testLong_maxima() {
		assertFalse(Filtros.long_maxima(TITULAR1, 20));
	}
	
	@Test
	void testLong_maxPasa20() {
		assertTrue(Filtros.long_maxima(TITULAR1, 21));
	}

	
	/*
	 * Pasa los 30 caracteres, por lo que devuelve false:
	 */
	@Test
	void testLong_min() {
		assertFalse(Filtros.long_min(TIULAR2, 30));
	}

	@Test
	void testControlLongitud() {
		assertFalse(Filtros.controlLongitud(TITULAR1, 30, 20));
	}
	
	/*
	 * Para que si que funcione el calculo de la longitud del titular:
	 */
	
	@Test
	void testControlLongitud2() {
		assertTrue(Filtros.controlLongitud(TITULAR3, 30, 20));
	}

	
	@Test
	void testFecha_maxima() {
		assertFalse(Filtros.fecha_maxima(fecha, fecha3));
	}

	@Test
	void testFecha_min() {
		assertFalse(Filtros.fecha_min(fecha3, fecha));
	}

	@Test
	void testControlFecha() {
		assertFalse(Filtros.controlFecha(fecha, 5, 3));
		
	}

	@Test
	void testConcepto_max() {
		assertTrue(Filtros.concepto_max(CONCEPTO2, 32));
	}

	@Test
	void testConcepto_min() {
		assertTrue(Filtros.concepto_max(CONCEPTO, 10));
	}

	@Test
	void testConceptoLongitud() {
		assertFalse(Filtros.conceptoLongitud(CONCEPTO3, 100, 10));
		
	}

}

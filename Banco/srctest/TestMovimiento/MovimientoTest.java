package TestMovimiento;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import EjercicioCuentas.Movimiento;

class MovimientoTest {
	
	final double IMPORTE = 100.0;
	final String CONCEPTO = "ESTO ES LA PRUEBA DEL CONCEPTO";
	final LocalDate fecha = LocalDate.parse("2022-07-12");
	Movimiento mov;
	
	@BeforeEach
	void creacionMov() {
		mov = new Movimiento();
		
	}
	
	/*
	 * IMPLEMENTAR:
	 */
	@AfterEach
	void reset() {
		 
	}

	@Test
	void testGetmConcepto() {
		mov.setmConcepto(CONCEPTO);
		assertEquals(CONCEPTO, mov.getmConcepto());
	}


	@Test
	void testGetmFecha() {
		LocalDate hoy = LocalDate.now();
		mov.setmFecha(hoy);
		assertEquals(hoy, mov.getmFecha());
	}


	@Test
	void testGetmImporte() {
		mov.setmImporte(IMPORTE);
		assertEquals(IMPORTE, mov.getmImporte());
	}

}

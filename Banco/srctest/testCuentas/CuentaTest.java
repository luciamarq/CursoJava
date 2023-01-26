package testCuentas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import EjercicioCuentas.Cuenta;

/*
 * 
 * PRUEBA TEST PARA LA CLASE CUENTAS
 */

class CuentaTest {
	
	/*
	 * variables para el test:
	 */
	private String N_CUENTA = "1ES243567";
	private String TITULAR = "Lucia MARQUEZ";
	private String TITULAR_ERROR = "WER";
	private double IMPORTE1 = 1000.0;
	private String CONCEPTO1= "ESTO ES UN CONCEPTO CON MUCHISIMOS CARACTERES";
	private double IMPORTE2=-400.0;
	
	
	Cuenta cuenta;
	
	
	@BeforeEach
	void testCuenta() throws Exception{
		cuenta = new Cuenta (N_CUENTA, TITULAR);
		
	}
	/*
	void testInicio() throws Exception {
		Assertions.assertThrows(Exception.class, () -> {
			new Cuenta (N_CUENTA, TITULAR);
		});
	}
	*/

	@Test
	void testIngresarDouble() throws Exception {
		Assertions.assertThrows(Exception.class, () -> {
			cuenta.ingresar(IMPORTE2);
			assertEquals(IMPORTE2, cuenta.getSaldo());
		});
		
	}

	@Test
	void testIngresarStringDouble() throws Exception {
		Assertions.assertThrows(Exception.class, () -> {
			cuenta.ingresar(CONCEPTO1, IMPORTE2);
		});
		
	}

	@Test
	void testRetirarDouble() {
		Assertions.assertThrows(Exception.class, () -> {
			cuenta.retirar(IMPORTE1);
		});
	}

	@Test
	void testRetirarStringDouble() {
		Assertions.assertThrows(Exception.class, () -> {
			cuenta.retirar(CONCEPTO1, IMPORTE1);
		});
	}
	
	/*
	 * Ahora vamos con los importes negativos:
	 */
	@Test
	void testRetirarNegativo_double() {
		Assertions.assertThrows(Exception.class, () -> {
			cuenta.retirar(IMPORTE2);
		});
		
	}
	@Test
	void testRetirarNegativo_StringDouble() {
		Assertions.assertThrows(Exception.class, () -> {
			cuenta.retirar(CONCEPTO1,IMPORTE2);
		});
	}
	@Test
	void testIngresarNegativo_Double() {
		Assertions.assertThrows(Exception.class, () -> {
			cuenta.ingresar(IMPORTE2);
		});
	}
	@Test
	void testIngresarNegativo_StringDouble() {
		Assertions.assertThrows(Exception.class, () -> {
			cuenta.retirar(CONCEPTO1, IMPORTE2);
		});
	}
}

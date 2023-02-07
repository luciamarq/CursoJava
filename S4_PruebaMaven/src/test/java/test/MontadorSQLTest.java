package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bbdd.util.MontadorSQL;

class MontadorSQLTest {
	
	final String NOMBRE_CAMPO = "NombreCampo";
	final int VALOR_INT = 20;
	final String SALIDA_UNO = "NombreCampo = 20 ";
	final String VALOR_STRING = "Texto en cadena";
	private final String SALIDA_STRING= "NombreCampo = Texto en cadena";
	
	
	
	
	@Test
	void testAddSalidaStringIntString() {
		String salida ="";
		salida = MontadorSQL.addSalida(salida, NOMBRE_CAMPO, VALOR_INT, " , ");
		assertEquals(SALIDA_UNO.trim(),salida.trim());
		
	}
	
	
	@Test
	void testAddSalidaStringStringStringString() {
		String salida = "";
		salida = MontadorSQL.addSalida(SALIDA_STRING.trim(), NOMBRE_CAMPO, VALOR_STRING, " , ");
		assertEquals(SALIDA_STRING.trim(), salida.trim());
		
	}

}

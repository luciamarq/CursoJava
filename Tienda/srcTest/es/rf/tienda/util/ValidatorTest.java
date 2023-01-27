package es.rf.tienda.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class ValidatorTest {
	
	private String ALFANUMERICO_OK = "ABS123";
	private String ALFANUMERICO_ERR = "234567898765";
	
	private String TELEFONO_OK = "6750900376";
	private String TELEFONO_ERR = "2344";
	
	private String EMAIL = "lu.marquez@hotmail.es";
	private String EMAIL_ERR = "luciamarquezgaercia";
	
	private String DNI = "46087712J";
	private String DNI_ERR="D446087712";
	
	@Test
	void testIsAlfanumeric() {
		assertTrue(Validator.isAlfanumeric(ALFANUMERICO_OK));
	}
	
	@Test
	void testIsNotAlfanumeric() {
		assertFalse(Validator.isAlfanumeric(ALFANUMERICO_ERR));
	}
	
	@Test
	void testCumplePhoneNumber() {
		assertTrue(Validator.cumplePhoneNumber(TELEFONO_OK));
	}
	@Test
	void testNoCumpleTelefono() {
		assertFalse(Validator.cumplePhoneNumber(TELEFONO_ERR));
	}

	@Test
	void testIsEmailValido() {
		assertTrue(Validator.isEmailValido(EMAIL));
		
	}
	
	@Test
	void testIsNotEmailValido() {
		assertFalse(Validator.isEmailValido(EMAIL_ERR));
	}

	@Test
	void testCumpleDNI() {
		assertTrue(Validator.cumpleDNI(DNI));
	}
	
	@Test
	void testNoCumpleDNI() {
		assertFalse(Validator.cumpleDNI(DNI_ERR));
	}

	@Test
	void testCumpleRangoIntIntInt() {
		assertTrue(Validator.cumpleRango(7, 0, 9));
	}
	
	@Test
	void testNoCumpleRangoIntInt() {
		assertFalse(Validator.cumpleRango(27.0, 0, 3));
	}

	@Test
	void testCumpleRangoDoubleIntInt() {
		assertTrue(Validator.cumpleRango(7.0, 0, 9));
	}
	
	@Test
	void testNoCumpleRangoDouble() {
		assertFalse(Validator.cumpleRango(27.0, 0, 3));
	}

	@Test
	void testCumpleLongitudMin() {
		assertTrue(Validator.cumpleLongitudMin("Lucia", 3));
	}
	@Test 
	void noCumpleLongitudMin() {
		assertFalse(Validator.cumpleLongitudMin("Lucia", 9));
		
	}

	@Test
	void testCumpleLongitudMax() {
		assertTrue(Validator.cumpleLongitudMax("Lucia", 6));
	}
	
	@Test
	void NoCumpleLongMax() {
		assertFalse(Validator.cumpleLongitudMax("Lucia", 3));
	}

	@Test
	void testCumpleLongitud() {
		assertTrue(Validator.cumpleLongitud("Lucia", 1, 9));
	}
	
	@Test 
	void noCumpleLongitud() {
		assertFalse(Validator.cumpleLongitud("Lucia", 7, 10));
	}

	@Test
	void testValDateMin() {
		
	}

	@Test
	void testValDateMax() {
		fail("Not yet implemented");
	}

	@Test
	void testEsFechaValida() {
		fail("Not yet implemented");
	}

	@Test
	void testEsPasswordValida() {
		fail("Not yet implemented");
	}

}

package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

import org.junit.jupiter.api.Test;

import es.rf.tienda.util.Validator;

class ValidatorTest {
	
	private String ALFANUMERICO_OK = "AB123";
	private String ALFANUMERICO_ERR = "@@@@@";
	
	private String TELEFONO_OK = "6750900376";
	private String TELEFONO_ERR = "2344";
	
	private String EMAIL = "lu.marquez@hotmail.es";
	private String EMAIL_ERR = "luciamarquezarrova.es";
	
	private String DNI = "46.087.712-J";
	private String DNI_ERR="44771P"; //La letra no se corresponde
	
	private String PASSWORD="12345Pm@";
	private String PASSWORD_ERR="12345P";
	
	
	LocalDate fechaMIN = LocalDate.of(2021, 9, 12);
	LocalDate hoy = LocalDate.now();
	String fechaValida = "23/09/2021";
	String fechaNoValida = "30-5-2023";

	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/LLLL/yyyy");
	
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
		assertTrue(Validator.cumpleLongitud("LuciaMa", 5, 9));
	}
	
	@Test 
	void noCumpleLongitud() {
		assertFalse(Validator.cumpleLongitud("Lucia", 7, 10));
	}

	@Test
	void testValDateMin() {
		assertFalse(Validator.valDateMin(hoy,fechaMIN));
	}
	@Test
	void testNoValDateMin() {
		
	assertTrue(Validator.valDateMin(fechaMIN, hoy));
	}
	
	@Test
	void testValDateMax() {
		assertTrue(Validator.valDateMax(hoy, fechaMIN));
	}

	@Test
	void testEsFechaValida() {
		assertTrue(Validator.esFechaValida(fechaValida));
	}

	@Test
	void testNoFechaValida() {
		assertFalse(Validator.esFechaValida(fechaNoValida));
	}
	@Test
	void testEsPasswordValida() {
		assertTrue(Validator.esPasswordValida(PASSWORD));
	}
	
	@Test
	void testNoEsPasswordValido() {
		assertFalse(Validator.esPasswordValida(PASSWORD_ERR));
	}

}

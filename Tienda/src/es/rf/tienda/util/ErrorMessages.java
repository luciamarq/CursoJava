package es.rf.tienda.util;


/* *****************************************************
 * NOMBRE: ErrorMessages.java
 * 
 * DESCRIPCION:  
 * 			Clase con los String que contienen los mensajes de error 
 * 			especificados por las reglas de negocio.
 * 
 *  @version	Enero 2016
 *  
 *  @author 	Miguel Garcia
 *  
 *  *****************************************************/
public class ErrorMessages {
	
	
		
	/**
	 * Codigo de producto
	 */
	public final static String PROERR_001 = "Formato codigo erroneo";
	public final static String PROERR_002 = "Longitud de codigo erroneo";
	
	/**
	 * Campo con longitud erronea
	 */
	public final static String PROERR_003 = "La longitud de ? ha de estar entre ? y ?";
	
	
	/*
	 * Campo del email fallido:
	 */
	
	public final static String ERR_EMAIL="El formato del email, no es valido";
	
	/*
	 * formato del password de Usuario incorrecto:
	 * 
	 */
	
	public final static String ERR_PASS="La contraseña debe contener minusculas, mayusculas y caracteres especiales";
	
	public final static String ERR_DNI = " El formato de dni no cumple el estandar debe ser: xx.xxx.xx-X";
}


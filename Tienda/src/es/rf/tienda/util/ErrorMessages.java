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
	
	public final static String ERR_FECH_REPOSICION ="La fecha de reposicion no es valida. Debe ser mayor o igual a la actual";
	
	public final static String ERR_FECH_ACTIVACION ="La fecha de activacion no es valida. Debe ser mayor o igual a la actual";
	public final static String ERR_FECH_DESACTIVACION="La fecha de desactivacion dede ser >= a la de activacion";
	public final static String ERR_FECH_DESAC2 = "La fecha de desactivacion debe ser mayor o igual a la fecha actual";
	public final static String ERR_CAMPO_VACIO = "Este campo no puede ser NULO";
}


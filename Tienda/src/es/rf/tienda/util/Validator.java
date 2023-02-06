package es.rf.tienda.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;



/********************************************************************************************
 * NOMBRE: Validator.java
 * 
 * DESCRIPCION: 
 * 			Clase auxiliar para validar los datos que sean 
 * 			introducidos en la aplicaci�n.
 * 
 *  @version	30/01/2023 
 *  @author 	Lucia Marquez
 *  
 * ******************************************************************************************/
public class Validator {
	
	private static final String ALFANUMERIC_PATTERN = "^[a-zA-Z0-9]*$";
	private static final String CODIGO_PRODUCTO_PATTERN ="^[A-Z]{2}+\\d{3}$";
	private static final String PASSWORD_PATTERN = 
            "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";
	/**
	 * Patr�n para validar el email, evitando puntos finales antes de la @ y que solo contenga
	 * car�cteres alfanum�ricos		 
	 */
	//OK
	private final static String EMAIL_PATTERN = 
			"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		
	/**
	 * Permite verificar que un DNI cumple con el patr�n XX.XXX.XXX-L
	 */
	private final static String DNI_PATTERN = "\\d{2}\\.\\d{3}\\.\\d{3}-[a-zA-Z]";
		
	/**
	 * Permite validar un tel�fono, el cual debe contener de 10 a 20 d�gitos
	 * y donde los espacios est�n permitidos
	 */
	
	//OK
	private final static String PHONE_PATTERN =  "[\\d ]{10,20}";
	
	/**
	 * Orden de las letras con las cuales se comprobar� la validez del DNI
	 */
	private final static String LETRA_DNI = "TRWAGMYFPDXBNJZSQVHLCKE";
	
	/**
	 * Longitud que debe tener todo DNI pasado a la aplicaci�n.
	 */
	private final static int LONGITUD_DNI = 12;

	/* ***************************************************************************************
	 * NOMBRE: isAlfanumeric                                                                 *
	 * 
	 * DESCRIPCI�N: *//**
	 * 		Permite verificar que el texto pasado solo contiene caracters alfanum�ricos
	 * 
	 * @param texto String a verificar que solo tenga car�cteres alfanum�ricos
	 * 
	 * @return  true, si cumple solo contiene caracters alfanum�ricos. <br> 
	 * 			false en caso contrario
	 * FECHA: Enero 2023
	 * 
	 * AUTOR: Lucia Marquez 
	 * 
	 * **************************************************************************************/
	public static boolean isAlfanumeric(String texto){
		return(texto.matches(ALFANUMERIC_PATTERN));
	}
	//DEBE CONTENER 2 LETRAS MAYUSCULAS Y 3 UMEROS:
	public static boolean codigoProductoValido(String codigo) {
		return(codigo.matches(CODIGO_PRODUCTO_PATTERN));
	}
	/*
	public static boolean isVacio(String prueba){
		return true;
	}
	*/
	
	/* ***************************************************************************************
	 * NOMBRE: cumplePhoneNumber                                                                 *
	 * 
	 * DESCRIPCI�N: *//**
	 * 		El phone number debe tener un total de entre 10 y 20, contando d�gitos y espacios.
	 * 		M�nimo aceptable son 10 d�gitos.
	 * 
	 * @param phoneNumber String con el n�mero de telefono de entre 10 y 20 d�gitos. 
	 * 		Puede tener espacios, pero siempre con 10 d�gitos como m�nimo.
	 * 
	 * @return true, si cumple todas las condiciones
	 *
	 * FECHA: Enero 2023
	 * AUTOR: Miguel Garcia
	 * 
	 * **************************************************************************************/
	public static boolean cumplePhoneNumber(String phoneNumber){
		
		return (phoneNumber!= null && phoneNumber.matches(PHONE_PATTERN));
		
	}

	/* ***************************************************************************************
	 * NOMBRE: isEmailValido                                                                 *
	 * 
	 * DESCRIPCI�N: *//**
	 * 			Comprueba si el email tiene un formato que pueda ser v�lido.
	 * 
	 * @param email String a comprobar
	 * 
	 * @return true, en caso que el formato sea v�lido
	 * FECHA: Enero 2023
	 * 
	 * AUTOR: Miguel Garcia
	 * 
	 * **************************************************************************************/
	public static boolean isEmailValido(String email){
		return (email!= null && email.matches(EMAIL_PATTERN));
	}

	/* ***************************************************************************************
	 * NOMBRE: cumpleDNI                                                                 *
	 * 
	 * DESCRIPCI�N: *//**
	 * 			Esta funci�n verifica que el DNI cumple el siguiente formato: xx.xxx.xxx-L <br>
	 * 			El DNI ha de tener longitud 12
	 * 
	 * @param dni String con DNI a ser validado
	 * 
	 * @return true, si el DNI cumple el estandar nacional.
	 * FECHA: Enero 2023
	 * AUTOR: Miguel Garcia
	 * 
	 * **************************************************************************************/
	
	//OKK
	public static boolean cumpleDNI(String dni){
		
		/*
		 * Comparará la letra que recibo por parametro,
		 * con la letra correcta que debiera tener el dni:
		 * Ademas controlará la longitud del dni y si contiene los caracteres asociados a DNI_PATTERNS
		 */
		if(dni.length()!=LONGITUD_DNI) {
			return false;
		}
		String [] asignacion_Letra = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
		String c1= dni.substring(0,2);
		String c2=dni.substring(3,6);
		String c3=dni.substring(7,10);
		String numeros = c1+c2+c3;
		int numeros2 = Integer.parseInt(numeros);
		int resto = numeros2%23;
		String letra1 = dni.substring(11);
		return(dni != null && asignacion_Letra[resto].equals(letra1) && dni.matches(DNI_PATTERN));
		
	}
	

	/** ***************************************************************************************
	 * NOMBRE: cumpleRango                                                                 *
	 * 
	 * DESCRIPCI�N: *//**
	 * 		Comprueba que un N�mero se necuentra entre 2 valores
	 * 
	 * @param valor (int)/(double) N�mero a comprobar
	 * @param valorMinimo (int) N�mero valor aceptable
	 * @param valorMaximo (int) M�N�mero valor aceptable
	 * 
	 * @return true si valorMinimo > valor > valorMaximo
	 * FECHA: Enero 2023
	 * AUTOR: Miguel Garcia 
	 * 
	 * **************************************************************************************/
	public static boolean cumpleRango(int valor, int valorMinimo, int valorMaximo){
		return(valorMinimo>=valor || valor <=valorMaximo);
	}
	
	/*
	 * Casteo el numero a entero y como estoy sobrecargando el metodo,
	 * invoco al otro pasandole como parametro mi numero int:
	 * 
	 */
	public static boolean cumpleRango(double valor, int valorMinimo, int valorMaximo){
		int valor_parse = (int) valor;
		return(cumpleRango(valor_parse, valorMinimo, valorMaximo));
	}

	/* ***************************************************************************************
	 * NOMBRE: cumpleLongitudMin                                                                 *
	 * 
	 * DESCRIPCI�N: *//**
	 * 		Comprobar que el texto pasado tiene una longitud de al menos x caracteres, siendo
	 * 		x el entero pasado como par�metro
	 * 
	 * @param texto String texto a comprobar
	 * @param longitudMinima int que indique longitud m�nima.
	 * 
	 * @return cierto, si la longitud del texto es mayor o igual que longitudMinima
	 * FECHA: Enero 2023
	 * AUTOR: Miguel Garcia
	 * 
	 * **************************************************************************************/
	public static boolean cumpleLongitudMin(String texto, int longitudMinima){
		return(texto.length()>=longitudMinima);
		
	}

	/* ***************************************************************************************
	 * NOMBRE: cumpleLongitudMax                                                                 *
	 * 
	 * DESCRIPCI�N: *//**
	 * 		Comprobar que el texto pasado tiene una longitud de, como mucho, x caracteres, siendo
	 * 		x el entero pasado como par�metro
	 * 
	 * @param texto String con el texto a comprobar
	 * @param longitudMaxima int con la longitud m�xima del texto
	 * 
	 * @return true, si el texto es menor o igual que la longitud m�xima.
	 * FECHA: Enero 2023 
	 * AUTOR: Miguel Garcia 
	 * 
	 * **************************************************************************************/
	public static boolean cumpleLongitudMax(String texto, int longitudMaxima){
		
		return(texto.length()<=longitudMaxima);
		
	}


	/****************************************************************************************
	 * NOMBRE: cumpleLongitud                                                                 *
	 * 
	 * DESCRIPCI�N: *//**
	 * 		Comprobar que la longitud de un texto se encuentra entre unos valores m�ximos y m�nimos 
	 * 
	 * @param texto String con el texto que a validar
	 * @param longitudMinima (int) M�nima longitud del texto
	 * @param longitudMaxima (int) M�xima longitud v�lida para el texo
	 * 
	 * @return true, si la longitud del texto cumple: longitudMinima
	 *               <= longitudTexto <=longitudMaxima
	 * FECHA: Enero 2023 
	 * AUTOR: Miguel Garcia - Barcelona
	 * 
	 * **************************************************************************************/
	public static boolean cumpleLongitud(String texto, int longitudMinima, int longitudMaxima){
		return(longitudMinima<=texto.length() && texto.length()<=longitudMaxima);
	}
	/**
	 * Valida una fecha calendar con m�nimo min
	 * @param fecha
	 * @param min
	 * @return
	 */
	
	
	
	public static boolean valDateMin(LocalDate fecha, LocalDate min){
		return fecha.isBefore(min);	
	}
	
	/**
	 * Valida una fecha calendar con m�ximo max
	 * @param fecha
	 * @param max
	 * @return
	 */
	public static boolean valDateMax(LocalDate fecha, LocalDate max){
		return fecha.isAfter(max);
		
	}	
	
	/**
	 * esFechaValida
	 * Recibe una string con formato fecha dd/mm/aaaa y comprueba el formato
	 * @param fecha
	 * @return
	 */
	public static boolean esFechaValida(String fecha){
		DateTimeFormatter formato= DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fecha_correcta=null;
		try {
			fecha_correcta = LocalDate.parse(fecha, formato);
			if(fecha_correcta!=null) {
				return true;
			}
		
		}catch(DateTimeParseException e) {
			e.printStackTrace();
			
		}
		return false;	
	}
		
	
	/**
	 * Nombre esPasswordValida
	 * Descripcion Comprueba que la cadena recibida cumpla con lasnormas de contrase�a
	 * @param password string con la contrase�a introducida
	 * @return true si cumple con las especificaciones
	 */

	public static boolean esPasswordValida(String password){
		return (password!=null && password.matches(PASSWORD_PATTERN));

	}
}

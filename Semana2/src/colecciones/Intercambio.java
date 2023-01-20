package colecciones;

public class Intercambio{
	
	private String cadena1;
	private String cadena2;
	
	public Intercambio(String cadena1, String cadena2) {
		super();
		//Para un mejor encapsulamiento podemos pasar x todos los seter and getters:
		this.cadena1=cadena1;
		
		this.cadena2=cadena2;
		
	/*
	 * Getters and setters:
	 */
		
	}
	public String getCadena1() {
		return cadena1;
	}
	public String getCadena2() {
		return cadena2;
		
	}
	
	public void setCadena1() {
		this.cadena1=cadena1;
	}
	public void setCadena2() {
		this.cadena2=cadena2;
	}
	
	/*
	 * Metodo que me intercambia el valor de dos objetos de la clase
	 * Intercambio. (En este caso del tipo String)
	 */
	public void intercambio () {
		String temp=cadena1;
		cadena1=cadena2;
		cadena2=temp;
		
	}
	
	
	
	
}

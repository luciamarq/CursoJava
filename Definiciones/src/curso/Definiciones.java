package curso;

import java.time.LocalTime;

public class Definiciones {
	private static boolean seguro = false;
	private static int importe = 0;
	private static double cantidad = 0d;
	public static String descripcion = "\"Hola \nmundo\"";
	public String nombre = "";
	protected String valor = "";
//Un metodo que nos devuelve el valor de importe. Ya que importe es una variable privada.
	
	public int getImporte() {
		return importe;
	}
public void setImporte(int imp) {
	if (imp>=0) {
		importe = imp;
	}
}
/*Prueba de como definir los campos:
 * 
*/
	public static void main(String[] args) {
		
		Enlace ss1 = new Enlace();
		ss1.modificacion();
		ss1.url="https://asjdjdabjda.com";
		ss1.hora=LocalTime.now();
		
		Enlace ss2 = new Enlace();
		ss2.modificacion();
		ss2.url="hhtpa://jhaUGDD";
		ss2.hora=LocalTime.now();
		
	}


}

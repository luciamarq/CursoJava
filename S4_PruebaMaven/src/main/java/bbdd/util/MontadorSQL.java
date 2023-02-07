package bbdd.util;

public class MontadorSQL {
	
	
	public static String addSalida(String salida, String nombreCampo, String valor, String separador) {
		return addSalidaSencilla(salida, nombreCampo, ""+valor, ""+separador);
		
	}
	
	public static String addSalida(String salida, String nombreCampo, int valor, String separador) {
		return addSalidaSencilla(salida, nombreCampo, ""+valor , ""+separador);
		
	}
	
	
	public static String addSalidaSencilla(String salida, String nombreCampo, String valor, String separador) {
		salida = nombreCampo+ " = " +valor;
		return salida;
		
	}
	
}

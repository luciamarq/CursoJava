package automovil;


public class AccesoABD {
	
	/*
	 * Creamos una clase con los metodos
	 * leer y grabar con cualquier tipo de objeto
	 * que see reciba como parametro;
	 */
	
	
	public void leer(AccesoLeer rece) {
		rece.leer();
		System.out.println("Leido");
	}
	
	public void grabar(AccesoLeer rece) {
		rece.grabar();
		System.out.println("Grabado");
	}
	
	
}

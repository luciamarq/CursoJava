package herencia;

public class Agua extends Congelado {
	//ATRIBUTOS:
	private int salinidad;
	
	//CONSTRUCTOR:
	public Agua(String fecha_caducidad, String n_lote, String temp_congelado, int salinidad) {
		super(fecha_caducidad, n_lote, temp_congelado);
		this.setSalinidad(salinidad);
	}
	
	//getters and setters:

	public int getSalinidad() {
		return salinidad;
	}


	public void setSalinidad(int salinidad) {
		this.salinidad = salinidad;
	}

	@Override
	public String toString() {
		return "Agua [salinidad=" + salinidad + ", getTemp_congelado()=" + getTemp_congelado()
				+ ", getFecha_caducidad()=" + getFecha_caducidad() + ", getN_lote()=" + getN_lote() + "]";
	}

	
	
	
		

}

package herencia;

public class Agua extends Congelado {
	//ATRIBUTOS:
	private int salinidad;
	
	//CONSTRUCTOR:
	public Agua(String fecha_caducidad, String n_lote, String temp_congelado, int salinidad) {
		super(fecha_caducidad, n_lote, temp_congelado);
		setSalinidad(salinidad);
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
		return "Agua" + super.toString() + " [salinidad=" + salinidad + "]";
	}

	

	
	
	
		

}

package herencia;

public class Congelado extends Producto {
	
	private String temp_congelado;

	/*
	 * CONSTRUCTOR:
	 */

	public Congelado(String fecha_caducidad, String n_lote, String temp_congelado) {
		super(fecha_caducidad, n_lote);
		setTemp_congelado(temp_congelado);
		
	}
	
	
	//getters and setters

	public String getTemp_congelado() {
		return temp_congelado;
	}

	public void setTemp_congelado(String temp_congelado) {
		this.temp_congelado = temp_congelado;
	}


	@Override
	public String toString() {
		return "Congelado\t " + super.toString() + " [temp_congelado=" + temp_congelado + "]";
	}

	

	
	
	
	
	

}

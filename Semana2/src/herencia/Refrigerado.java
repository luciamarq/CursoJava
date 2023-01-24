package herencia;

public class Refrigerado extends Producto {
	
	
	//Atributos:
	private String codigo_origen;

	//Constructor:
	public Refrigerado(String fecha_caducidad, String n_lote, String codigo_origen) {
		super(fecha_caducidad, n_lote);
		setCodigo_origen(codigo_origen);
	}


	//GETTERS AND SETTERS
	public String getCodigo_origen() {
		return codigo_origen;
	}



	public void setCodigo_origen(String codigo_origen) {
		this.codigo_origen = codigo_origen;
	}


	@Override
	public String toString() {
		return "Refrigerado" + super.toString() + " [codigo_origen=" + codigo_origen + "]";
	}

	

	
	
	
	
	
	

}

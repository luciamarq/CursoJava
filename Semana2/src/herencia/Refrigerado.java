package herencia;

public class Refrigerado extends Producto {
	
	
	//Atributos:
	private String codigo_origen;

	//Constructor:
	public Refrigerado(String fecha_caducidad, String n_lote, String codigo_origen) {
		super();
		this.setCodigo_origen(codigo_origen);
		this.setFecha_caducidad(fecha_caducidad);
		this.setN_lote(n_lote);
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
		return "Refrigerado [codigo_origen=" + codigo_origen + ", getFecha_caducidad()=" + getFecha_caducidad()
				+ ", getN_lote()=" + getN_lote() + "]";
	}

	
	
	
	
	
	

}

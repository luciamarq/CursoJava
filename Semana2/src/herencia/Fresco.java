package herencia;

public class Fresco extends Producto {
	
	//Atributos:
	private String fecha_envasado;
	private String pais_origen;
	
	//CONSTRUCTOR:
	public Fresco(String fecha_caducidad, String n_lote, String fecha_envasado, String pais_origen) {
		super();
		this.setFecha_caducidad(fecha_caducidad);
		this.setPais_origen(pais_origen);
		this.setFecha_caducidad(fecha_caducidad);
		this.setN_lote(n_lote);
		this.setFecha_envasado(fecha_envasado);
	}

	//getters and setters:
	public String getFecha_envasado() {
		return fecha_envasado;
	}

	public void setFecha_envasado(String fecha_envasado) {
		this.fecha_envasado = fecha_envasado;
	}

	public String getPais_origen() {
		return pais_origen;
	}

	public void setPais_origen(String pais_origen) {
		this.pais_origen = pais_origen;
	}

	@Override
	public String toString() {
		return "Fresco [fecha_envasado=" + fecha_envasado + ", pais_origen=" + pais_origen + ", getFecha_caducidad()="
				+ getFecha_caducidad() + ", getN_lote()=" + getN_lote() + "]";
	}
	
	
	
	
}

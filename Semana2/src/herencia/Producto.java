package herencia;

public class Producto {
	
	//Atributos:
	private String fecha_caducidad;
	private String n_lote;
	
	//CONSTRUCTOR:
	public Producto(String fecha_caducidad, String n_lote) {
		super();
		setFecha_caducidad(fecha_caducidad);
		setN_lote(n_lote);
	}
	
	public Producto() {
		
	}
	
	//SETTERS AND GETTERS:
	public String getFecha_caducidad() {
		return fecha_caducidad;
	}
	public void setFecha_caducidad(String fecha_caducidad) {
		this.fecha_caducidad = fecha_caducidad;
	}
	public String getN_lote() {
		return n_lote;
	}
	public void setN_lote(String n_lote) {
		this.n_lote = n_lote;
	}

	@Override
	public String toString() {
		return "[fecha_caducidad=" + fecha_caducidad + ", n_lote=" + n_lote + "]";
	}
	
	
	
	
	
	
	

}

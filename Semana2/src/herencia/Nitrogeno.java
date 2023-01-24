package herencia;

public class Nitrogeno extends Congelado {
	
	//ATRIBUTOS:
	private String metodo;
	private String t_exposicion;
	
	//CONSTRUCTOR
	
	public Nitrogeno(String fecha_caducidad, String n_lote, String temp_congelado, String metodo, String t_exposicion) {
		super(fecha_caducidad, n_lote, temp_congelado);
		setMetodo(metodo);
		setT_exposicion(t_exposicion);
		
	}
	
	
	//getters and setter:
	public String getMetodo() {
		return metodo;
	}

	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}
	public String getT_exposicion() {
		return t_exposicion;
	}
	public void setT_exposicion(String t_exposicion) {
		this.t_exposicion = t_exposicion;
	}


	@Override
	public String toString() {
		return "Nitrogeno" + super.toString() + " [metodo=" + metodo + ", t_exposicion=" + t_exposicion + "]";
	}

	

	


	
	
	
	
	
}

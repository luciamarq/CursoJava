package automovil;

public class Camion extends Vehiculo {
	private int peso_max;
	private int precio;
	
	/*
	 * CONSTRUCTOR
	 */
	
	public Camion(int num_marchas, int v_maxima, int num_chasis, int num_ruedas, int peso_max, int precio) {
		super(num_marchas, v_maxima, num_chasis, num_ruedas);
		setPeso_max(peso_max);
		setPrecio(precio);
		
	}
	
	public int getPeso_max() {
		return peso_max;
	}
	public void setPeso_max(int peso_max) {
		this.peso_max = peso_max;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Camion" + super.toString() + " [peso_max=" + peso_max + ", precio=" + precio + "]";
	}
	
	
	
	

}

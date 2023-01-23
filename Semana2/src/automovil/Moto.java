package automovil;

public class Moto extends Vehiculo {
	
	private int deposito;
	
	/*
	 * CONSTRUCTOR;
	 */

	public Moto(int num_marchas, int v_maxima, int num_chasis, int num_ruedas, int deposito) {
		super(num_marchas, v_maxima, num_chasis, num_ruedas);
		setDeposito(deposito);
	}
	
	//GETTERS AND SETTERS

	public int getDeposito() {
		return deposito;
	}

	public void setDeposito(int deposito) {
		this.deposito = deposito;
	}
	
	/*
	 * TO STRING
	 */

	@Override
	public String toString() {
		return "Moto" + super.toString()+ " [deposito=" + deposito + "]";
	}
	
	
	
	

}

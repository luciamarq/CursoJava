package automovil;

public abstract class Vehiculo implements AccesoLeer {
	
	//Atributos comunes (padre):
	private int num_marchas;
	private int v_maxima;
	private int num_chasis;
	private int num_ruedas;
	
	/*
	 * Constructor de la clase padre:
	 */
	public Vehiculo(int num_marchas, int v_maxima, int num_chasis, int num_ruedas) {
		super();
		setNum_marchas(num_marchas);
		setV_maxima(v_maxima);
		setNum_chasis(num_chasis);
		setNum_ruedas(num_ruedas);
		AccesoABD dao = new AccesoABD();
		dao.leer(this);
		dao.grabar(this);
	}

	//Getters and setters;
	
	public int getNum_marchas() {
		return num_marchas;
	}
	
	public void setNum_marchas(int num_marchas) {
		this.num_marchas = num_marchas;
	}
	public int getV_maxima() {
		return v_maxima;
	}
	public void setV_maxima(int v_maxima) {
		this.v_maxima = v_maxima;
	}
	
	public int getNum_chasis() {
		return num_chasis;
	}
	public void setNum_chasis(int num_chasis) {
		this.num_chasis = num_chasis;
	}
	public int getNum_ruedas() {
		return num_ruedas;
	}
	public void setNum_ruedas(int num_ruedas) {
		this.num_ruedas = num_ruedas;
	}
	/*
	 * TO STRING:
	 */
	@Override
	public String toString() {
		return "[num_marchas=" + num_marchas + ", v_maxima=" + v_maxima + " num_chasis="
				+ num_chasis + ", num_ruedas=" + num_ruedas + "]";
	}
	@Override
	public void leer() {
		
	}
	@Override
	public void grabar() {
		
	}
	

	
	
	
	
	

}

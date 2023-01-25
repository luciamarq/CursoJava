package EjercicioCuentas;

import java.time.LocalDate;

abstract class Tarjeta {
	
	protected Cuenta mCuentaAsociada;
	protected LocalDate mFechaCaducidad;
	protected String mNumero;
	protected String mTitular;
	
	public Tarjeta(String mNumero, String mTitular, LocalDate mFechaCaducidad) {
		super();
		setmFechaCaducidad(mFechaCaducidad);
		setmNumero(mNumero);
		setmTitular(mTitular);
	}
	
	abstract void setmFechaCaducidad(LocalDate mFechaCaducidad);

	abstract void setmNumero(String mNumero);

	abstract void setmTitular(String mTitular);

	
	public Object getmCuentaAsociada() {
		return mCuentaAsociada;
	}
	

	public void setmCuentaAsociada(Cuenta o) {
		this.mCuentaAsociada = o;
	}

	/*
	 * Metodos propios de la clase:
	 */
	abstract void ingresar(double x) throws Exception;
	
	abstract void retirar(double x) throws Exception ;
	
	abstract double getSaldo();
	
	abstract void pagoEnEstablecimiento(String datos, double x);

	@Override
	public String toString() {
		return " [mCuentaAsociada=" + mCuentaAsociada + ", mFechaCaducidad=" + mFechaCaducidad + ", mNumero="
				+ mNumero + ", mTitular=" + mTitular + "]";
	}
	
	
	
	
	
	
	
	

}

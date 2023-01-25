package EjercicioCuentas;

import java.time.LocalDate;

public class Debito extends Tarjeta {
	
	
	
	public Debito(String mNumero, String mTitular, LocalDate mFechaCaducidad) {
		super(mNumero, mTitular, mFechaCaducidad);

	}

	@Override
	void ingresar(double x) throws Exception {
		this.mCuentaAsociada.retirar("Ingreso en cajero automatico", x);
		System.out.println("Ingreso en cajero automatico...");
		mCuentaAsociada.getSaldo();

	}

	@Override
	void retirar(double x) throws Exception{
		if(getSaldo()<x) {
			new Exception("No se puede retirar una cantidad negativa");
		}
		if(x<getSaldo()) {
			new Exception ("Credito insuficiente");
	
		}
		else {
			mCuentaAsociada.retirar("Retirada en cajero automatico", x);
		}
		
	}
	
	void retirar(String concepto, double x) throws Exception {
		mCuentaAsociada.retirar(concepto, x);
		
	}

	@Override
	void pagoEnEstablecimiento(String datos, double x) {
		this.getmCuentaAsociada();
		mCuentaAsociada.getSaldo();
		System.out.println("Compras en: " +  datos);

	}

	@Override
	void setmFechaCaducidad(LocalDate mFechaCaducidad) {
		this.mFechaCaducidad=mFechaCaducidad;
		
	}

	@Override
	void setmNumero(String mNumero) {
		this.mNumero=mNumero;
		
	}

	@Override
	void setmTitular(String mTitular) {
		this.mTitular=mTitular;
		
	}

	

	@Override
	public String toString() {
		return "Debito" +  super.toString();
	}

	@Override
	public double getSaldo() {
		return this.mCuentaAsociada.getSaldo();
		
	}
	
	

}

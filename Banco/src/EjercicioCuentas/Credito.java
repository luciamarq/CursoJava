package EjercicioCuentas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import cuentas.filtros.Filtros;

public class Credito extends Tarjeta {
	
	/*
	 * Para los filtros de la longitud de concepto:
	 */
	
	final int l_max=100;
	final int l_min=10;
	
	/*
	 * Para los filtros de fecha de caducidad;
	 */
	
	final int any_max=5;
	final int any_min=3;
	
	/*
	 * Credito de la tarjeta que iremos + o - con cada movimiento bancario:
	 */
	protected double mCredito=30000;
	protected List <Movimiento> mMovimientos = new ArrayList<Movimiento>();  
	
	/*
	 * Constructor:
	 */
	public Credito(String mNumero, String mTitular, LocalDate mFechaCaducidad) {
		super(mNumero, mTitular, mFechaCaducidad);
		setmCredito(mCredito);
		setmMovimientos(mMovimientos);
		setmCuentaAsociada(mCuentaAsociada);
		
	}

	public double getmCredito() {
		return mCredito;
	}
	

	public void setmCredito(double mCredito) {
		this.mCredito = mCredito;
	}

	public List<Movimiento> getmMovimientos() {
		return mMovimientos;
	}

	public void setmMovimientos(List<Movimiento> mMovimientos) {
		this.mMovimientos = mMovimientos;
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
	public void ingresar(double x) {
		mCredito+=x;
		mCuentaAsociada.addMovimiento("Ingreso en cuenta asociada", x);
		
	}
	public void ingresar(String concepto, double x) throws Exception {
		if(Filtros.conceptoLongitud(concepto, l_max, l_min)) {
			mCuentaAsociada.ingresar(x);
		}
		else {
			new Exception("Error en la longitud del concepto");
		}
	}
	
	void retirar(String concepto, double x) throws Exception {
		if(Filtros.conceptoLongitud(concepto, l_max, l_min)) {
			mCuentaAsociada.retirar(x);
		}
		else {
			new Exception ("Error en la longitud del concepto");
		}
	}
		
		
	@Override
	void retirar(double x) throws Exception{
		double comision;
		comision = 0.05*x;
		
		/*
		 * Si la comision es mayor que 3 se le agrega una comision del 5%
		 * del importe total.
		 * Si la comision no llega a 3, se le agrega un coste de euros.
		 */
		
		if(x<0) {
			throw new Exception ("No se puede retirar una cantidad negativa");
		}
		else {
			if(comision<3) {
				mCredito-=(x+3);
				mCuentaAsociada.addMovimiento("Retirada en cuenta asociada", x);
				
			}
			else {
				mCredito-=(0.05*x);
				mCuentaAsociada.addMovimiento("Retirada en cuenta asociada", x);
			}
		}
		if(x>getmCredito()) {
			throw new Exception("Credito insuficiente");
			
		}
		
	}

	@Override
	double getSaldo() {
		return this.mCuentaAsociada.getSaldo();
	}

	@Override
	void pagoEnEstablecimiento(String datos, double x) {
		mCredito-=x;
		this.mCuentaAsociada.addMovimiento("Compra a credito en tienda: " , x);
		
		
	}
	/*
	 * Suma el importe de todos los movimientos filtrado por fecha (mes/año)
	 * y elimina esos movimientos de el Array de Movimientos:
	 */
	public void liquidar(int mes, int año) {
		
		double importeMes=0.0;
		Movimiento liq = new Movimiento();
		
		for (Iterator it = mMovimientos.iterator(); it.hasNext();) {
			Movimiento m = (Movimiento) it.next();
			if(m.getmFecha().getMonthValue() == mes && m.getmFecha().getYear()==año) {
				importeMes+=m.getmImporte();
				it.remove();
			}
		}	
		
		liq.setmImporte(importeMes);
		if(importeMes!=0) {
			((Cuenta) getmCuentaAsociada()).addMovimiento(liq);
		}
		
		/* con streams
		r = mMovimientos.stream()
				.filter(mov->mov.getmFecha().getMonthValue() == mes && mov.getmFecha().getYear() == año)
				.map(mov -> mov.getImporte())
				.reduce(0d, (subtot, it) -> subtotal + element);
		
		mMovimientos = new Vector<Movimientos>(mMovimientos.stream()
				.filter(mov-> !(mov.getmFecha().getMonthValue() == mes && mov.getmFecha().getYear() == año))
				.collect(Collectors.toList());
				
				liq.setmImporte(importeMes);
				if(r!=0) {
			((Cuenta) getmCuentaAsociada()).addMovimiento(liq);
		}	
		
		*/
		
		
	
	}
	
	
	@Override
	public String toString() {
		return "Credito" + super.toString() + "[mCredito=" + mCredito + ", mMovimientos=" + mMovimientos + "]";
	}


}

package EjercicioCuentas;

import java.util.ArrayList;
import java.util.List;

import cuentas.filtros.Filtros;

public class Cuenta {
	
	//PARA LOS FILTROS DE TITULAR:
	final int t_max = 30;
	final int t_min = 20;
	
	//PARA LOS FILTROS DE CONCEPTO:
	final int l_min=10;
	final int l_max = 100;
	
	
	//Atributos:
	protected List <Movimiento> mMovimientos = new ArrayList<Movimiento>(); 
	protected String mNumero;
	protected String Mtitular;
	
	double saldoTotal=30000;
	
	//Constructor:
	public Cuenta(String mNumero, String mtitular) {
		if(Filtros.controlLongitud(mtitular, t_max, t_min)) {
			this.mNumero = mNumero;
			Mtitular = mtitular;
		}
		
	}
	
	/*
	 * Añade un movimiento a partir de un concepto y el importe
	 */
	public void addMovimiento(String concepto, double importe) {
		Movimiento m = new Movimiento();
		m.setmConcepto(concepto);
		m.setmImporte(importe);
		addMovimiento(m);
	}
	
	
	public void addMovimiento(Movimiento m) {
		mMovimientos.add(m);
	}
	/*
	 * RECUPERAMOS EL VALOR DEL SALDO TOTAL DE LA CUENTA:
	 */
	public double getSaldo() {
		for (Movimiento m: mMovimientos) {
			saldoTotal+=m.getmImporte();
			
		}
		return saldoTotal;
		
	}
	
	void ingresar(double x) throws Exception {
		ingresar("Ingreso en efectivo", x);
		
	}
	/*
	 * Filtra el concepto tiene menos de 10 o mas de 100 caracteres
	 */
	void ingresar(String concepto, double x) throws Exception {
		if(x<=0) {
			throw new Exception("No se puede ingresar una cantidad negativa");
		}
			
		saldoTotal+=x;
		addMovimiento(concepto,x);
		
	}
	
	void retirar (double x) throws Exception {
		retirar("Retirada en efectivo", x);
		
		
	}
	
	void retirar(String concepto, double x) throws Exception {
		if(x<0) {
			throw new Exception ("No se puede reitirar una cantidad negativa");
		}
		
		if(getSaldo()<x) {
			throw new Exception("Saldo insuficiente");
		}
		saldoTotal-=x;
		addMovimiento(concepto,x);
	}

	@Override
	public String toString() {
		return "Cuenta [mMovimientos=" + mMovimientos + ", mNumero=" + mNumero + ", Mtitular=" + Mtitular
				+ ", saldoTotal=" + saldoTotal + "]";
	}
	
	
	
}

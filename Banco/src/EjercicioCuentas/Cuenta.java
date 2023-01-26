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
	
	double saldoTotal=100.0;
	
	//Constructor:
	//Aplicamos el filtro del control de la longitud del titular:
	public Cuenta(String mNumero, String mtitular)throws Exception {
		if(Filtros.controlLongitud(mtitular, t_max, t_min)) {
			this.mNumero = mNumero;
			Mtitular = mtitular;
		}
		else {
			throw new Exception ("Titular con pocos caracteres");
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
	
	
	public void ingresar(double x) throws Exception {
		ingresar("Ingreso en efectivo", x);
		
	}
	/*
	 * Si la cantidad a ingresar es negativa -> Excepcion
	 * Si la cantidad a ingresar es menor que el saldo -> Saldo insuficiente
	 */
	public void ingresar(String concepto, double x) throws Exception {
		if(x<=0) {
			throw new Exception("No se puede ingresar una cantidad negativa");
		}
			
		saldoTotal+=x;
		addMovimiento(concepto,x);
		
	}
	
	public void retirar (double x) throws Exception {
		retirar("Retirada en efectivo", x);
		
		
	}
	/*
	 * Si la cantidad a retirar es negativa -> Excepcion
	 * Si la cantidad a retirar es menor que el saldo -> Saldo insuficiente
	 */
	public void retirar(String concepto, double x) throws Exception {
		if(x<0) {
			throw new Exception ("No se puede retirar una cantidad negativa");
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

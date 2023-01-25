package EjercicioCuentas;

import java.time.LocalDate;

public class Movimiento {
	private String mConcepto;
	private LocalDate mFecha;
	private double mImporte;
	
	/*
	 * Constructor vacio ya que es un POJO (se creara en los metodos de la clase
	 * tarjeta y cuenta).
	 */
	public Movimiento() {
		mFecha=LocalDate.now();
		
	}

	/*
	 * Getters and setters:
	 */
	public String getmConcepto() {
		return mConcepto;
	}

	public void setmConcepto(String mConcepto) {
		this.mConcepto = mConcepto;
	}

	public LocalDate getmFecha() {
		return mFecha;
	}

	public void setmFecha(LocalDate mFecha) {
		this.mFecha = mFecha;
	}

	public double getmImporte() {
		return mImporte;
	}

	public void setmImporte(double mImporte) {
		this.mImporte = mImporte;
	}
	/*
	 * TO STRING:
	 */
	@Override
	public String toString() {
		return "[mConcepto=" + mConcepto + ", mFecha=" + mFecha + ", mImporte=" + mImporte + "]";
	}
	
	
	
	
	

}

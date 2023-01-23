package figuras;

public abstract class Figura {
	protected int co_x, co_y;
	Punto coor;
	private int base;
	private int altura;
	
	public Figura(int base, int altura) {
		this.setBase(base);
		this.setAltura(altura);
	}

	
	public int getCoor() {
		return co_x;
		
		
	}
		
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Figura [base=" + base + ", altura=" + altura + "]";
	}
	
	/*
	 * lo defino como abstract ya que en cada clase hija
	 * operara de una manera diferente segun la figura que sea:
	 */
	
	abstract double cacularArea(); 
	
	abstract String dibujar();
	
	

}

	


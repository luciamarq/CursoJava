package figuras;

public class Rectangulo extends Figura {
	
	
	public Rectangulo(int base, int altura) {
		super(base, altura);
		this.setAltura(getAltura());
		this.setBase(getBase());
		this.setAltura(altura);
		this.setBase(base);
	}

	@Override
	double cacularArea() {
		int area = this.getAltura()*this.getBase();
		return area;
	}

	@Override
	String dibujar() {
		// TODO Auto-generated method stub
		return "Dibujando un RECTANGULO DE.... " + "Altura " +  this.getAltura()+ " y " + "Base " + this.getBase() ;
	}

}

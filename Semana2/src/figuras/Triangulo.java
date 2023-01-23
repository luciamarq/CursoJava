package figuras;

public class Triangulo extends Figura {

	public Triangulo(int base, int altura) {
		super(base, altura);
		
		this.setAltura(getAltura());
		this.setBase(getBase());
		this.setAltura(altura);
		this.setBase(base);
	}
	
	@Override
	double cacularArea() {
		int area = (this.getAltura()*this.getBase()/2);
		return area;
	}

	@Override
	String dibujar() {
		return "Dibujando un TRIANGULO DE.... " + "Altura " +  this.getAltura()+ " y " + "Base " + this.getBase();
	}

	
	
}

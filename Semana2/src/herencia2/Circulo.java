package herencia2;

public class Circulo extends Figura {

	/*
	 * AQUI MI RADIO SERA 1/2 DE LA BASE:
	 */
	
	public Circulo (int base, int altura) {
		super();
		this.setAltura(getAltura());
		this.setBase(getBase());
		this.setAltura(altura);
		this.setBase(base);
	}

	@Override
	double cacularArea() {
		double a = this.getBase()*0.5;
		double area = Math.pow(a, 2);
		return area;
	}

	@Override
	String dibujar() {
		// TODO Auto-generated method stub
		return "Dibujando un CIRCULO DE.... " + "RADIO " + (this.getBase()*0.5);
	}

}

package figuras;

public class Punto {
	private int x;
	private int y;
	
	public Punto(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void inverse() {
		int tmp=x;
		x=y;
		y=tmp;
		
	}


	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
	
	
	
	
	

}

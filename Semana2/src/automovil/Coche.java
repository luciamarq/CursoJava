package automovil;

public class Coche extends Vehiculo implements Comportamiento {
	
	//Atributos:
	private int num_puertas;
	private String color;
	private String modelo;
	
	private boolean comportamiento4x4;
	
	//CONSTRUCTOR
	
	public Coche(int num_marchas, int v_maxima, int num_chasis, int num_ruedas, int num_puertas, String color, String modelo) {
		super(num_marchas, v_maxima, num_chasis, num_ruedas);
		setNum_puertas(num_puertas);
		setColor(color);
		setModelo(modelo);
		
	}
	//getters y setters:
	public int getNum_puertas() {
		return num_puertas;
	}
	public void setNum_puertas(int num_puertas) {
		this.num_puertas = num_puertas;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	@Override
	public String toString() {
		return "Coche" + super.toString()+ "[num_puertas=" + num_puertas + ", color=" + color + ", modelo=" + modelo + "]";
	}
	
	
	@Override
	public void activarReductor(boolean activar) {
		comportamiento4x4=activar;
		
	}

	
	
	
	
	
	
	
	
	
	
}

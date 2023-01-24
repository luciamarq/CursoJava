package herencia;

public class Aire extends Congelado {
	
	private int por_nitrogeno;
	private int por_oxigeno;
	private int por_diox;
	private int por_vapA;
	
	
	//CONSTRUCTOR:
	public Aire(String fecha_caducidad, String n_lote, String temp_congelado, int por_nitrogeno, int por_oxigeno,
			int por_diox, int por_vapA) {
		super(fecha_caducidad, n_lote, temp_congelado);
		setPor_diox(por_diox);
		setPor_nitrogeno(por_nitrogeno);
		setPor_oxigeno(por_oxigeno);
		setPor_vapA(por_vapA);
		
	}
	
	//getters and setters:
	public int getPor_nitrogeno() {
		return por_nitrogeno;
	}

	public void setPor_nitrogeno(int por_nitrogeno) {
		this.por_nitrogeno = por_nitrogeno;
	}
	public int getPor_oxigeno() {
		return por_oxigeno;
	}
	public void setPor_oxigeno(int por_oxigeno) {
		this.por_oxigeno = por_oxigeno;
	}
	public int getPor_diox() {
		return por_diox;
	}
	public void setPor_diox(int por_diox) {
		this.por_diox = por_diox;
	}
	public int getPor_vapA() {
		return por_vapA;
	}
	public void setPor_vapA(int por_vapA) {
		this.por_vapA = por_vapA;
	}

	@Override
	public String toString() {
		return "Aire" + super.toString() + " [por_nitrogeno=" + por_nitrogeno + ", por_oxigeno=" + por_oxigeno + ", por_diox=" + por_diox
				+ ", por_vapA=" + por_vapA + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}

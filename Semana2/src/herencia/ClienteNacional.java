package herencia;

public class ClienteNacional extends Cliente {
	
	private String nif;

	/*
	 * Constructor de la clase:
	 */
	
	public ClienteNacional(String nif) {
		super();
		this.nif = nif;
	}

	//getters y stters
	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}
	
	
	
	
	
	

}	
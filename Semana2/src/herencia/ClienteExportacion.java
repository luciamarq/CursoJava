package herencia;

public class ClienteExportacion extends Cliente {
	
	private String vat;

	public ClienteExportacion(String nombre, String direccion, String correoElectronico, String vat) {
		super(nombre, direccion, correoElectronico);
		this.vat = vat;
		this.setNombre(nombre);
		this.setDireccion(direccion);
		this.setCorreoElectronico(correoElectronico);
		
	}
	
	//getters and setters
	public String getVat() {
		return vat;
	}

	public void setVat(String vat) {
		this.vat = vat;
	}
	
	
	
	
	
	
	
	

}

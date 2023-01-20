package herencia;

public class Usuario extends Persona {
	
	private String codigoUsuario;
	
	/*
	 * Constructor de la clase usuario:
	 */
	public Usuario(String nombre, String direccion, String correoElectronico, String codigoUsuario) {
		super(nombre, direccion, correoElectronico);
		this.codigoUsuario=codigoUsuario;
	}

	public void autorizar() {
		System.out.println("Autorizada");
		
	}
	
	@Override
	public void crear() {
		System.out.println("Persona creada desde Usuario");
	
	}
	
	
	
	
	public String getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(String codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	@Override
	public String aString() {
		return "Usuario: " + getNombre() + "Codigo de usuario " + getCodigoUsuario();
	}

}

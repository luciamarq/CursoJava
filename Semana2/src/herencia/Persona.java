package herencia;

public abstract class Persona {
	
	private String nombre;
	private String direccion;
	private String correoElectronico;
	
	
	
	/*
	 * Ahora el constructor de la clase padre: 
	 */
	
	public Persona(String nombre, String direccion, String correoElectronico) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.correoElectronico = correoElectronico;
	}
	
	/*
	 * GETTERS AND SETTERS DE LOS ATRIBUTOS:
	 */
	public String getNombre() {
		return nombre;
	}

	public Persona() {
		
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	
	/*
	 * Metodos: 
	 */
	
	public void crear() {
		
		System.out.println("Persona creada desde Persona");
		
	}
	
	public void borrar() {
		
		System.out.println("Persona borrada desde persona");
		
	}
	
	public void enviaMensaje() {
		System.out.println("Mensaje enviado desde Persona");
	}
	
	abstract String aString();
	
	
	
	

}

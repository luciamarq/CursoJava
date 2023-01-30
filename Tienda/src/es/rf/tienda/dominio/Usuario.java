package es.rf.tienda.dominio;

import java.time.LocalDate;

public class Usuario {
	
	private static int autonumerico = 1;
	private int id_usuario;
	private String user_nombre;
	private String user_email;
	private String user_pass;
	private int user_tipo;
	private String user_dni;
	private LocalDate user_fechAlta;
	private LocalDate user_fecConfirmacion;
	
	//CONSTRUCTOR CON PARAMETROS OBLIGATORIOS:
    public Usuario(int id_usuario, String user_nombre, String user_email, String user_pass, int user_tipo) {
    	
    	setId_usuario(id_usuario);
    	setUser_nombre(user_nombre);
    	setUser_email(user_email);
    	setUser_pass(user_pass);
    	setUser_tipo(user_tipo);
    	
    }

    //CONSTRUCTOR VACIO Y CON EL AUTOINCREMENTO DEL ID:
    public Usuario() {
    	id_usuario = Usuario.autonumerico++;
    }
    
	public static void setAutonumerico(int autonumerico) {
		Usuario.autonumerico = autonumerico;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getUser_nombre() {
		return user_nombre;
	}

	public void setUser_nombre(String user_nombre) {
		this.user_nombre = user_nombre;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_pass() {
		return user_pass;
	}

	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}

	public int getUser_tipo() {
		return user_tipo;
	}

	public void setUser_tipo(int user_tipo) {
		this.user_tipo = user_tipo;
	}

	public String getUser_dni() {
		return user_dni;
	}

	public void setUser_dni(String user_dni) {
		this.user_dni = user_dni;
	}

	public LocalDate getUser_fechAlta() {
		return user_fechAlta;
	}

	public void setUser_fechAlta(LocalDate user_fechAlta) {
		this.user_fechAlta = user_fechAlta;
	}

	public LocalDate getUser_fecConfirmacion() {
		return user_fecConfirmacion;
	}

	public void setUser_fecConfirmacion(LocalDate user_fecConfirmacion) {
		this.user_fecConfirmacion = user_fecConfirmacion;
	}
    
    
	
}

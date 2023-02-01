package es.rf.tienda.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import es.rf.tienda.util.ErrorMessages;
import es.rf.tienda.util.Validator;

public class Usuario {
	
	//administrador, visitante, me ayudara en los tipos de permiso:
	
	//private static String[] tipoUsuarios = {"Visitante", "Usuario", "Cliente", "Empleado", "Terceros", "Administrador"}; 
	private static int autonumerico = 1;
	private int id_usuario;
	private String user_nombre;
	private String user_email;
	private String user_pass;
	private int user_tipo;
	private String user_dni;
	private LocalDate user_fechAlta;
	private LocalDate user_fecConfirmacion;
	
	//Variables filtros y validacion;
	private final int longMin_nombre = 5;
	private final int longMax_nombre = 100;
	
	//CONSTRUCTOR CON PARAMETROS OBLIGATORIOS:
    public Usuario(int id_usuario, String user_nombre, String user_email, String user_pass, int user_tipo) throws Exception {
    	id_usuario=autonumerico++;
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
    

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getUser_nombre() {
		return user_nombre;
	}

	public void setUser_nombre(String user_nombre) throws Exception {
		if(Validator.cumpleLongitud(user_nombre, longMin_nombre, longMax_nombre)) {
			this.user_nombre = user_nombre;
		}
		else {
			 throw new Exception (ErrorMessages.PROERR_003);
			 
		}
		
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) throws Exception {
		if(Validator.isEmailValido(user_email)) {
			this.user_email = user_email;
		}
		else {
			throw new Exception (ErrorMessages.ERR_EMAIL);
		}
		
	}

	public String getUser_pass() {
		return user_pass;
	}

	public void setUser_pass(String user_pass) throws Exception {
		if(Validator.esPasswordValida(user_pass)) {
			this.user_pass = user_pass;	
		}
		else {
			throw new Exception (ErrorMessages.ERR_PASS);
		}
		
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

	public void setUser_dni(String user_dni) throws Exception {
		if(Validator.cumpleDNI(user_dni)) {
			this.user_dni = user_dni;
		}
		else {
			throw new Exception (ErrorMessages.ERR_DNI);
		}
		
	}

	public LocalDate getUser_fechAlta() {
		return user_fechAlta;
	}

	public void setUser_fechAlta(LocalDate user_fechAlta) {
		this.user_fechAlta = LocalDate.now();  //por defecto el dia actual
	}

	public LocalDate getUser_fecConfirmacion() {
		return user_fecConfirmacion;
	}

	public void setUser_fecConfirmacion(LocalDate user_fecConfirmacion) {
		this.user_fecConfirmacion = LocalDate.now(); //por defecto el dia actual 
	}

	@Override
	public String toString() {
		return "Usuario [id_usuario=" + id_usuario + ", user_nombre=" + user_nombre + ", user_email=" + user_email
				+ ", user_pass=" + user_pass + ", user_tipo=" + user_tipo + ", user_dni=" + user_dni
				+ ", user_fechAlta=" + user_fechAlta + ", user_fecConfirmacion=" + user_fecConfirmacion + "]";
	}

	
	

	
	
	
    
    
	
}

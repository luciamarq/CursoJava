package es.rf.tienda.dominio;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

import es.rf.tienda.exception.DomainException;
import es.rf.tienda.util.ErrorMessages;
import es.rf.tienda.util.Validator;

/*
 * Dominio producto de nuestra tienda:
 */
public class Producto {
	
	//ATRIBUTOS:
	private String id_producto;
	private String pro_descripcion;
	private String pro_desLarga;
	
	private double pro_precio;
	private int pro_stock;
	
	private LocalDate pro_fecRepos; //fecha prevista de reposicion
	private LocalDate pro_fecActi; //fecha de activacion
	private LocalDate pro_fecDesacti;
	
	private String pro_uniVenta; //unidad de venta
	private double pro_cantXUniVenta;
	private String pro_uniUltNivel; //Unidad Ultima
	private int id_pais;
	private String pro_usoRecomendado;
	
	private int id_categoria;
	private int pro_stkReservado; //Stock reservado
	private int pro_nStkAlto; //Stock para nivel Alto
	private int pro_nStkBajo; //Stock para nivel bajo
	private char pro_stat; //estado
	
	/*
	 * Para los filtros:
	 */
	
	private final int longmin_IdProducto = 5;
	private final int longmax_IdProducto = 5;
	private final int longmin_descripcion = 5;
	private final int longmax_descripcion = 100;
	private final int longmax_descripcion2 = 2000;
	private final int rangomin_precio=0;
	private final int rangomax_precio=100;
	private final int longmin_uniVentas = 1;
	private final int longMax_uniVentas = 10;
	private final int longmin_uso = 0;
	private final int longmax_uso=2000;
	
	private LocalDate hoy = LocalDate.now();
	
	//CONSTRUCTOR:
	//constructor vacio --> sin datos:
	
	public Producto() throws DomainException {
		//super();
		setId_producto(id_producto);
		setPro_descripcion(pro_descripcion);
		setPro_precio(pro_precio);
		setPro_uniVenta(pro_uniVenta);
		setId_pais(id_pais);
		setId_categoria(id_categoria);
		
		
	}
	
	
	  //CONSTRUCTOR CON PARAMETROS OBLIGATORIOS:
	
	public Producto(String id_producto, String pro_descripcion, int pro_precio, String pro_uniVenta, int id_pais, int id_categoria ) throws Exception {
		
	}

	//GETTERS AND SETTERS:

	public String getId_producto() {
		return id_producto;
	}

	public void setId_producto(String id_producto) throws DomainException{
		
		if(id_producto != null) {
			if(Validator.codigoProductoValido(id_producto) && Validator.cumpleLongitud(id_producto, longmin_IdProducto, longmax_IdProducto)) {
				this.id_producto = id_producto;	
		}
			else {
				if(Validator.cumpleLongitud(id_producto, longmin_IdProducto, longmax_IdProducto) == false) {
				throw new DomainException (ErrorMessages.PROERR_002); //Si la longitud no es correcta:
						
				}
				if(Validator.isAlfanumeric(id_producto)==false) {
					throw new DomainException(ErrorMessages.PROERR_001); //Si el formato no es el adecuado:
				}
			
			}
		
		}else {
			throw new DomainException(ErrorMessages.ERR_CAMPO_VACIO);
		}
	}

	public String getPro_descripcion() {
		return pro_descripcion;
	}

	public void setPro_descripcion(String pro_descripcion) throws DomainException {
		if(Validator.cumpleLongitud(pro_descripcion, longmin_descripcion, longmax_descripcion)) {
			this.pro_descripcion = pro_descripcion;
		}
		else {
			throw new DomainException (ErrorMessages.PROERR_003);
		}
	}

	public String getPro_desLarga() {
		return pro_desLarga;
	}

	public void setPro_desLarga(String pro_desLarga) throws DomainException {
		//descripcion larga
		if(Validator.cumpleLongitud(pro_desLarga, longmin_descripcion, longmax_descripcion2)) {
			this.pro_desLarga = pro_desLarga;
		}
		else {
			throw new DomainException (ErrorMessages.PROERR_003);
				
		}		
	}

	public double getPro_precio() {
		return pro_precio;
	}

	public void setPro_precio(double pro_precio) throws DomainException {
		if(Validator.cumpleRango(pro_precio, rangomin_precio, rangomax_precio)==true) {
		//Redondeado a 2 digitos:
			this.pro_precio = Math.round((pro_precio*100.0)/100.0);
		}
		else {
			throw new DomainException (ErrorMessages.PROERR_003);
		}
	}

	public int getPro_stock() {
		return pro_stock;
	}

	public void setPro_stock(int pro_stock) {
		this.pro_stock=pro_stock;
	}

	public LocalDate getPro_fecRepos() {
		return pro_fecRepos;
	}

	public void setPro_fecRepos(LocalDate pro_fecRepos) throws DomainException {
		//fecha de reposicion
		if(pro_fecRepos.isAfter(hoy) || pro_fecRepos.equals(hoy)) {
			this.pro_fecRepos = pro_fecRepos;
		}
		else {
			 throw new DomainException (ErrorMessages.ERR_FECH_REPOSICION);
		}
	}

	public LocalDate getPro_fecActi() {
		return pro_fecActi;
	}

	public void setPro_fecActi(LocalDate pro_fecActi) throws DomainException {
		if(pro_fecActi.isAfter(hoy) || pro_fecActi.equals(hoy)) {
			this.pro_fecActi = pro_fecActi;
		}
		else {
			 throw new DomainException (ErrorMessages.ERR_FECH_ACTIVACION);
		}
	}

	public LocalDate getPro_fecDesacti() {
		return pro_fecDesacti;
	}

	public void setPro_fecDesacti(LocalDate pro_fecDesacti) throws DomainException {
		/*
		 * si la fecha de activacion existe en ese producto 
		 * la fecha de desactivacion es mayor o igual a la fecha de activacion: 
		 * Si no tiene fecha de activacion, debe ser mayor o igual a la fecha actual:
		 */
		if(getPro_fecActi()!=null) { 
			if((pro_fecDesacti.isAfter(getPro_fecActi()) || pro_fecDesacti.equals(getPro_fecActi()))) {
				this.pro_fecDesacti=pro_fecDesacti;
		}
			else {
				throw new DomainException (ErrorMessages.ERR_FECH_DESACTIVACION);
			}
		}else {
			if(pro_fecDesacti.isAfter(hoy) || pro_fecDesacti.equals(hoy)) {
				this.pro_fecDesacti=pro_fecDesacti;
				
			}
			else {
				throw new DomainException (ErrorMessages.ERR_FECH_DESAC2);
			}
		}
	}
	

	public String getPro_uniVenta() {
		return pro_uniVenta;
	}

	public void setPro_uniVenta(String pro_uniVenta) throws DomainException {
		if(Validator.cumpleLongitud(pro_uniVenta, longmin_uniVentas, longMax_uniVentas)) {
			this.pro_uniVenta = pro_uniVenta;
		}
		
		else {
			 throw new DomainException (ErrorMessages.PROERR_003);
		}
	}

	public double getPro_cantXUniVenta() {
		return pro_cantXUniVenta;
	}

	public void setPro_cantXUniVenta(double pro_cantXUniVenta) {
		this.pro_cantXUniVenta=Math.round((pro_cantXUniVenta*100.0)/100.0); //redondeamos el valor a 2 decimales:
		
	}

	public String getPro_uniUltNivel() {
		return pro_uniUltNivel;
	}

	public void setPro_uniUltNivel(String pro_uniUltNivel) {
		this.pro_uniUltNivel=pro_uniUltNivel;
	}

	public int getId_pais() {
		return id_pais;
	}

	public void setId_pais(int id_pais) {
		this.id_pais = id_pais;
	}

	public String getPro_usoRecomendado() {
		return pro_usoRecomendado;
	}

	public void setPro_usoRecomendado(String pro_usoRecomendado) throws DomainException {
		if(Validator.cumpleLongitud(pro_usoRecomendado, longmin_uso, longmax_uso)) {
			this.pro_usoRecomendado=pro_usoRecomendado;
		}
		else {
			 throw new DomainException(ErrorMessages.PROERR_003);
		}
		
	}
	
	public int getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}

	public int getPro_stkReservado() {
		return pro_stkReservado;
	}

	public void setPro_stkReservado(int pro_stkReservado) {
		this.pro_stkReservado = pro_stkReservado;
	}

	public int getPro_nStkAlto() {
		return pro_nStkAlto;
	}

	public void setPro_nStkAlto(int pro_nStkAlto) {
		this.pro_nStkAlto = pro_nStkAlto;
	}

	public int getPro_nStkBajo() {
		return pro_nStkBajo;
	}

	public void setPro_nStkBajo(int pro_nStkBajo) {
		this.pro_nStkBajo = pro_nStkBajo;
	}

	public char getPro_stat() {
		return pro_stat;
	}

	public void setPro_stat(char pro_stat) throws DomainException {
		if(Validator.cumpleRango(pro_stat, 1, 1)) {
			this.pro_stat = 'A'; //por defecto
		}
		else {
			 throw new DomainException(ErrorMessages.PROERR_003);
		}
		
	}

	@Override
	public String toString() {
		return "Producto [id_producto=" + id_producto + ", pro_descripcion=" + pro_descripcion + ", pro_desLarga="
				+ pro_desLarga + ", pro_precio=" + pro_precio + ", pro_stock=" + pro_stock + ", pro_fecRepos="
				+ pro_fecRepos + ", pro_fecActi=" + pro_fecActi + ", pro_fecDesacti=" + pro_fecDesacti
				+ ", pro_uniVenta=" + pro_uniVenta + ", pro_cantXUniVenta=" + pro_cantXUniVenta + ", pro_uniUltNivel="
				+ pro_uniUltNivel + ", id_pais=" + id_pais + ", pro_usoRecomendado=" + pro_usoRecomendado
				+ ", id_categoria=" + id_categoria + ", pro_stkReservado=" + pro_stkReservado + ", pro_nStkAlto="
				+ pro_nStkAlto + ", pro_nStkBajo=" + pro_nStkBajo + ", pro_stat=" + pro_stat + ", longmin_IdProducto="
				+ longmin_IdProducto + ", longmax_IdProducto=" + longmax_IdProducto + ", longmin_descripcion="
				+ longmin_descripcion + ", longmax_descripcion=" + longmax_descripcion + ", longmax_descripcion2="
				+ longmax_descripcion2 + ", rangomin_precio=" + rangomin_precio + ", rangomax_precio=" + rangomax_precio
				+ ", longmin_uniVentas=" + longmin_uniVentas + ", longMax_uniVentas=" + longMax_uniVentas
				+ ", longmin_uso=" + longmin_uso + ", longmax_uso=" + longmax_uso + ", hoy=" + hoy + "]";
	}
	

	
	
	
	
	
	
	
	

}

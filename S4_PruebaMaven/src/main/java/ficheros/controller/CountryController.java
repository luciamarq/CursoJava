package ficheros.controller;

import java.sql.SQLException;
import java.util.List;

import bbdd.modelos.Country;
import ficheros.dao.CountryDAO;

public class CountryController {
	/*
	 * Clase controlador para el dialogo
	 *  entre acciones de las pantallas
	 *  de usuario (dialogar con capa DAO)
	 */
	
	CountryDAO cDAO;
	public CountryController() throws SQLException {
		cDAO = new CountryDAO();
		
	}
	
	public List<Country> leerTodos() throws Exception {
		return cDAO.leerTodos();
		
		
	}
	
	public Country leerUno(String country_id) throws Exception{
		return cDAO.leerUno(country_id);
		
	}
	
	public int actualizar(Country country) throws SQLException {
		return cDAO.actualizar(country);
	}
	
	
	public int borrar(String country_id) throws SQLException {
		return cDAO.delete(country_id);
	}
	
	
}

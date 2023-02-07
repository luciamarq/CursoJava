package rf.curso.S4_MiniApi2.controller;

import java.sql.SQLException;

import java.util.List;

import rf.curso.S4_MiniApi2.modelos.*;
import rf.curso.S4_MiniApi2.dao.CountryDAO;
import rf.curso.S4_MiniApi2.interfaces.*;

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
		return cDAO.obtenerCountrys();
		
		
	}
	
	public Country leerUno(String country_id) throws Exception{
		return cDAO.buscar(country_id);
		
	}
	
	public void actualizar(Country country) throws SQLException {
		cDAO.editar(country);
	}
	
	
	public void borrar(String country_id) throws SQLException {
		cDAO.eliminar(country_id);
	}
	
	
}

package ficheros.dao;
import java.sql.SQLException;
import java.util.List;

import bbdd.modelos.Country;

public interface CountryDaoInterface {
	
	public Country leerUno(String country_id) throws Exception;
	public List <Country> leerTodos() throws Exception;
	public int actualizar(Country country) throws Exception;
	public int delete(Country country) throws SQLException;
	public int delete(String country_id) throws SQLException;
	//Devolvemos el objeto y el objeto actualizado:
	public Country insert(Country country);
	
	
	
	
	
}

package ficheros.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bbdd.modelos.Country;
import bbdd.util.MontadorSQL;
import bbdd.util.OracleJDBBC;

/*
 * LAS CLASES DAO SON LAS QUE REALIZAN LAS OPERACIONES CON BASES DE DATOS:
 */

public class CountryDAO implements CountryDaoInterface {
	private Connection conn;
	private final static String SQL_LEER_COUNTRIES = "Select * FROM countries";
	private final static String SQL_LEER_COUNTRIES_ID = "Select * FROM countries where country_id=";
	private final static String SQL_ACTUALIZAR_MI_TABLA = "Update countries_lucia set country_id = ?, country_name= ?, region_id= ?";
	private final static String SQL_DELETE_COUNTRIE="delete countries_lucia where country_id= ";
	public CountryDAO() throws SQLException {
		OracleJDBBC ora = new OracleJDBBC();
		conn = ora.abrir();
		
	}
	
	public Country leerUno(String country_id) throws Exception {
		ResultSet rs = null;
		try {
			Statement stm = conn.createStatement();
			rs = stm.executeQuery(SQL_LEER_COUNTRIES_ID +  country_id);
			
			rs.next();
			return carga(rs);
			
		}catch(SQLException e) {
			throw new Exception(SQL_LEER_COUNTRIES_ID + country_id);
		}
		
	}

	public List<Country> leerTodos() throws Exception {
		ResultSet rs = null;
		List <Country> salida = new ArrayList<Country>();
		try {
			Statement stm = conn.createStatement();
			rs = stm.executeQuery(SQL_LEER_COUNTRIES);
			
			while(rs.next()){
				salida.add(carga(rs));

			}
			
		}catch (SQLException e) {
			throw new Exception(SQL_LEER_COUNTRIES + " " + e.getMessage());
			

		}
		return salida;
	}

	public int actualizar(Country country) throws SQLException {
		PreparedStatement ps = conn.prepareStatement(SQL_ACTUALIZAR_MI_TABLA);
		ps.setString(1, country.getCountry_id());
		ps.setString(2, country.getCountry_name());
		ps.setString(3, country.getRegion_id());
		//ps.setString(4,country.getCountry_id());
		return ps.executeUpdate();
		

	}


	public int delete(String country_id) throws SQLException {
		PreparedStatement ps = conn.prepareStatement(SQL_DELETE_COUNTRIE);
		ps.setString(1, country_id);
		return ps.executeUpdate();
	}

	public Country insert(Country country) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Country carga(ResultSet rs) throws SQLException {
		Country ctr = new Country();
		ctr.setCountry_id(rs.getString("country_id"));
		ctr.setCountry_name(rs.getString("country_name"));
		ctr.setRegion_id(rs.getString("region_id"));
		return ctr;
		
	}

	@Override
	public int delete(Country country) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//METODO PARA RECIBIR UNA SALIDA DE STRING QUE COMPLETE LAS QUERYS:
	public String montaSQL(Country country) {
		String salida = "";
		salida=MontadorSQL.addSalida(salida,"country_id", country.getCountry_id(),",");
		salida=MontadorSQL.addSalida(salida,"country_name", country.getCountry_name(),",");
		salida=MontadorSQL.addSalida(salida,"region_id", country.getRegion_id(),",");
		return salida;
	}

	
	
	



	
	

}

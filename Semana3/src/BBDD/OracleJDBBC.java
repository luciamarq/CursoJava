package BBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class OracleJDBBC {
		private static Connection conn;
		private final static String JDBC_DRIVER ="oracle.jdbc.driver.OracleDriver";
		private final static  String URL = "jdbc:oracle:thin:@95.17.8.252:1521:xe";
		private final static String DATABASE="";
		private final static String USUARIO = "hr";
		private final static String PASSWORD="hr";
		private final static String SQL_USE="USE  ";
		private final static String SQL_CREATE="CREATE DATABASE";
		
		/*
		 * Sentencia sql con la que obtendre los datos:
		 */
		private final static String SQL_LEER_TODOS = "Select * FROM Employees";
		private final static String SQL_LEER_COUNTRIES = "Select * FROM coutries";
		
		public static void main(String[] args) throws SQLException {
		
		
		try {
			Class.forName(JDBC_DRIVER);
			
		}catch(ClassNotFoundException e) {
			System.out.println("Clase no encontrada");
			e.printStackTrace();
			return;
		}
		
		System.out.println("Oracle JDBC driver registrado");
		
		
		
		
		
		
		conn = null;
		try {
			conn = DriverManager.getConnection(URL+DATABASE,USUARIO,PASSWORD);
			
		}catch(SQLException e) {
			System.out.println("Connection failer");
			e.printStackTrace();
			return;
		}
		lecturaEmployees();
		if(conn !=null) {
			System.out.println("You made it!");
			conn.close();
		}else {
			System.out.println("Failed to make connection");
		}
	}



		/*
		 * Leer base de datos desde java: 
		 */
		private static void lecturaEmployees() throws SQLException  {
			ResultSet rs = null;
			try {
				Statement stm = conn.createStatement();
				rs = stm.executeQuery(SQL_LEER_TODOS);
				
				while(rs.next()){
					System.out.println(rs.getString("First_name")); //Nos facilita la columna
					
					
				
				}
				
			}catch (SQLException e) {
				System.out.println(SQL_LEER_TODOS + " " + e.getMessage());
				e.printStackTrace();
			}finally {
				if(rs!=null) {
					rs.close();
				}
			}
		}
		
		
		private static void lecturaCountries() throws SQLException  {
			ResultSet rs = null;
			try {
				Statement stm = conn.createStatement();
				rs = stm.executeQuery(SQL_LEER_COUNTRIES);
				
				while(rs.next()){
					Country ctr = new Country();
					ctr.setCountry_id(rs.getString("country_id"));
					ctr.setCountry_name(rs.getString("country_name"));
					ctr.setRegion_id(rs.getString("region_id"));
					
					
				
				}
				
			}catch (SQLException e) {
				System.out.println(SQL_LEER_COUNTRIES + " " + e.getMessage());
				e.printStackTrace();
			}finally {
				if(rs!=null) {
					rs.close();
				}
			}
		}
		
		

}

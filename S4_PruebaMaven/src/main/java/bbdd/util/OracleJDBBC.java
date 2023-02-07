package bbdd.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import bbdd.modelos.Country;


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
		
		public Connection abrir() throws SQLException {
		
		
		try {
			Class.forName(JDBC_DRIVER);
			
		}catch(ClassNotFoundException e) {
			System.out.println("Clase no encontrada");
			e.printStackTrace();
			return null;
		}
		
		System.out.println("Oracle JDBC driver registrado");
	
		
		conn = null;
		try {
			conn = DriverManager.getConnection(URL+DATABASE,USUARIO,PASSWORD);
			
		}catch(SQLException e) {
			System.out.println("Connection failer");
			e.printStackTrace();
			return null;
		}
		//lecturaEmployees();
		
		return conn;
		
	}

	public void cerrar() throws SQLException {
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
		

}

package Modules;

import java.sql.*;
import java.sql.Connection;
import javax.swing.JOptionPane;
public class DB_Connections{
	
	private static Connection connection;
	private static DB_Connections db;
	
	public DB_Connections(){
		
		connection = null;
		
		try{
			
			connection = DriverManager.getConnection
		    (
		       "jdbc:mysql://localhost:3306/goldenfields_db", 
		       "root", 
		       "" 	
			);	
			System.out.println("Connected Successfully");
		}
		
		catch(Exception e){
			
			JOptionPane.showMessageDialog(null, "Connection Error"+ e.getMessage());
		}
	}
	
	public static DB_Connections getDBConnection(){
		
		if(db == null){
			
			db = new DB_Connections();
		}
		return db;
	}
	
	public Connection getConnection() throws SQLException{
		
		if(connection == null || connection.isClosed()){
			
			connection = DriverManager.getConnection
				    (
				       "jdbc:mysql://localhost:3306/goldenfields_db", 
				       "root", 
				       "" 	
					);	
		}
		return connection;
	}	
}

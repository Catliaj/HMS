package Modules;
import java.sql.*;

import javax.swing.JOptionPane;
import Modules.DB_Connections;

public class LoginAuth{
	
	private String userName, password;
	private boolean loginSuccess = false;
	
	DB_Connections adminCon = new DB_Connections();
	Connection connection;
	
	// Clerk login authentication
	public void clerkLogin(String userName, String password){
		
		setUserName(userName);
		setPassword(password);
		try{ 
			connection = adminCon.getConnection();
			String Query = ("SELECT * FROM USERS WHERE USER_NAME = ? AND PASSWORD = ?");
			PreparedStatement ps = connection.prepareStatement(Query);
			ps.setString(1, getUserName());
			ps.setString(2, getPassword());
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()){
				String role = rs.getString("ROLE");
				
				if("clerk".equalsIgnoreCase(role)){
					
					loginSuccess = true;
					JOptionPane.showMessageDialog(null, "Login Successfully");
				}
				else if("customer".equalsIgnoreCase(role)){
					
					JOptionPane.showMessageDialog(null, "Access Denied: staff cannot access this section");
				}
				else{
					
					JOptionPane.showMessageDialog(null, "Invalid Role: Please contact administrator");
				}
			}
			else{
				
				JOptionPane.showMessageDialog(null, "Invalid Username or Password");
			}
			connection.close();
		}
		catch(Exception ex){
			
			ex.printStackTrace(); 
			JOptionPane.showMessageDialog( null,"Error: " + ex.getMessage());
		}
		
	}
	
	// Customer login Authentication
	public void customerLogin(String userName, String password){
		
		setUserName(userName);
		setPassword(password);
		try
		{
			connection = adminCon.getConnection();
			String Query = ("SELECT * FROM USERS WHERE USER_NAME = ? AND PASSWORD = ?");
			PreparedStatement ps = connection.prepareStatement(Query);
			ps.setString(1, getUserName());
			ps.setString(2, getPassword());
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()){
				
				String role = rs.getString("ROLE");
				
				if("customer".equalsIgnoreCase(role)){
					
					loginSuccess = true;
					JOptionPane.showMessageDialog(null, "Login Successfully");
				}
				else if("clerk".equalsIgnoreCase(role)){
					
					JOptionPane.showMessageDialog(null, "Access Denied: please use staff account");
				}
				else{
					
					JOptionPane.showMessageDialog(null, "Invalid Role: Please contact administrator");
				}
			}
			else{
				
				JOptionPane.showMessageDialog(null, "Invalid Username or Password");
			}
			connection.close();
		}
		catch(Exception ex){
			
			ex.printStackTrace(); 
			JOptionPane.showMessageDialog( null,"Error: " + ex.getMessage());
		}
		
	}
	
	
	
	public boolean  loginSuccess(){
		
		return loginSuccess;
	}

	public void setUserName(String userName){
		
		this.userName = userName;
	}
	
    public void setPassword(String password){
		
		this.password = password;
	}

    public String getUserName(){
		
		return userName;
	}
    
    public String getPassword(){
		
		return password;
	}

	
}

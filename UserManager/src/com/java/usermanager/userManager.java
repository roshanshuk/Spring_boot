package com.java.usermanager;
import java.sql.*;
public class userManager {

	public static void main(String args[])
	{
		String jdbcURL = "jdbc:mysql://localhost:3306/users";
		String username = "root";
		String password = "admin";
		
		String name ="Loes Paeter";
		
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(jdbcURL, username, password);
	     
		String sql = "delete from users where name=?";
		PreparedStatement st = con.prepareStatement(sql);
	
		st.setString(1, name);
		
		 int row = st.executeUpdate();
		 
		 if (row > 0 )
		 {
			 System.out.println("Data have been successfully deleted");
		 }
		con.close();
	}catch(Exception e)
		{
		e.printStackTrace();
		}
    }
}

package com.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsersDao {
	
	String url = "jdbc:mysql://localhost:3306/demo_data";
	String username = "root";
	String password = "12345678";
	
	public int registerUser(User user) throws ClassNotFoundException {																															
		String insert_users_sql = "INSERT INTO users" + "(name, surname, username, password, profession) VALUES" +
								   "(?, ?, ?, ?, ?);";
		
		int result = 0;
		
		Class.forName("com.mysql.jdbc.Driver");
		
		try {
			Connection con = DriverManager.getConnection(url, username, password);
			
			PreparedStatement ps = con.prepareStatement(insert_users_sql);
			ps.setString(1, user.getName());
			ps.setString(2, user.getSurname());
			ps.setString(3, user.getUsername());
			ps.setString(4, user.getPassword());
			ps.setString(5, user.getProfession());

			result = ps.executeUpdate();
		} 
			catch (SQLException e) {
			e.printStackTrace();
			}
		
		return result;
	}

}

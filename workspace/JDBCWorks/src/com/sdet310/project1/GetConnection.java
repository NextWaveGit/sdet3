package com.sdet310.project1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetConnection {
	
	// will have static methods which will return connection object 
	// of underlying DB 
	
	static Connection conn = null;
	public Statement ps = null;
	public ResultSet rs = null;
	public static Connection mysqlCon(){
		
		// this line refers to the class which is in mysql-connector.jar 
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/sdet310", "root", "hexaware");
			return conn;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
}
	
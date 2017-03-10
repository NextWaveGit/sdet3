package com.sdet310.project1;

import java.sql.SQLException;

import java.sql.Connection;
import java.sql.ResultSet;


public class SynonymSearchCountDAO {
	
	public static int count = 0;
	
	public static void updateSearchCount(String word) {
		try {
			String sqlSelect ="select count from synonym where word = '" +word +"'";		
			
			
			Connection con = GetConnection.mysqlCon();
			
			GetConnection gc= new GetConnection();
			
			gc.ps=con.createStatement();
			
			System.out.println(sqlSelect);
			
			gc.ps.executeQuery(sqlSelect);
			gc.rs = gc.ps.getResultSet();
			
			gc.rs.next();
			count = gc.rs.getInt("count")+1;
	
			String sqlUpdate ="update synonym set count =  "+ count+ " where word = '" +word +"'";
			
			System.out.println(count);
			System.out.println(sqlUpdate);
			gc.ps.executeUpdate(sqlUpdate);
			
			gc.rs.close();
			gc.ps.close();
			GetConnection.conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}

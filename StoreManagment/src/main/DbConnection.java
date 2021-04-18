package main;

import java.sql.DriverManager;
import java.sql.*;
import com.mysql.jdbc.Connection;

public class DbConnection {

	private static final String URL="jdbc:mysql://localhost:3306/";
	private static final String User="root";
	private static final String PASSWORD="root";
	private static final String DBNAME="Inventory";
	//private static final String Parameter
	 
	public static Connection getConnection() {
		Connection conn=null;
		try {
			conn=(Connection) DriverManager.getConnection(URL+DBNAME,User,PASSWORD);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	public static void disconnect(java.sql.Connection connection) {
		try{
			if(connection!=null) 
			{
			connection.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String [] args) {
		Connection conn=getConnection();
		if(conn!=null) {
			System.out.println("Connection");
		}else {
			System.out.println("Not Connected");
		}
	}
}

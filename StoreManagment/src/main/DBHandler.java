package main;

import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;



public class DBHandler {
	
	public boolean insertProduct(Product product) {
		boolean result= false;
		try {
			String sql="Insert into Product Values(?,?,?,?)";
			Connection connection=DbConnection.getConnection();
			
			PreparedStatement stmt=connection.prepareStatement(sql);
			
			stmt.setInt(1, product.getProductId());
			stmt.setString(2,product.getProductName());
			stmt.setInt(3,product.getQuantity());
			stmt.setInt(4,product.getPrice());
			
			int inserted=stmt.executeUpdate();
			
			result=inserted>=1;
			
			DbConnection.disconnect(connection);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public boolean deleteProduct(int id) {
		boolean result=false;
		try {
			String sql="Delete from product where ProductId=?";
			Connection conn=DbConnection.getConnection();
			
			PreparedStatement stmt=conn.prepareStatement(sql);
			stmt.setInt(1, id);
			int delete =stmt.executeUpdate();
			
			result=delete>=1;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public boolean updateProduct(Product product) {
		boolean result=false;
		try {
			String sql="Update product set Quantity=?,Price=? where ProductId=?";
			Connection conn=DbConnection.getConnection();
			PreparedStatement stmt= conn.prepareStatement(sql);
			stmt.setInt(1,product.getQuantity());
			stmt.setInt(2,product.getPrice());
			stmt.setInt(3, product.getProductId());
			
			int updated=stmt.executeUpdate();
			result=updated>=1;
			
			DbConnection.disconnect(conn);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public Product getProduct(int id) {
		Product product=null;
		try {
			String sql="Select * from product where ProductId=?";
			Connection conn=DbConnection.getConnection();
			
			PreparedStatement stmt=conn.prepareStatement(sql);
			stmt.setInt(1,id);
			
			ResultSet rs=stmt.executeQuery();
			
			while(rs.next()) {
				product=new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4));
				
			}
			DbConnection.disconnect(conn);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return product;
	}
	public ArrayList<Product> getProducts(){
		
		ArrayList<Product> products=new ArrayList<Product>();
		
		Product product=null;
		try {
			String sql="Select * from product";
			Connection conn=DbConnection.getConnection();
			
			PreparedStatement stmt=conn.prepareStatement(sql);
			//stmt.setInt(1,id);
			
			ResultSet rs=stmt.executeQuery();
			
			while(rs.next()) {
				product=new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4));
				
				products.add(product);
			}
			DbConnection.disconnect(conn);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return products;
	}

	

}

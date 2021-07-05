package com.te.jdbc2;

import java.sql.*;

public class StaticQuery {

	public void insertStatically()  {
		
		
		
		Connection connection=null;
		Statement statement=null;
		
		String dburl="jdbc:mysql://localhost:3306/emp?user=root&password=root";
		String query="Insert into Student values(115,'xyz',67.90)";
		
		try {
        Class.forName("com.mysql.jdbc.Driver");
		
		 connection =DriverManager.getConnection(dburl);
		 
		 statement =connection.createStatement();
		 
		 int result=statement.executeUpdate(query);
		 
		 if(result!=0) {
			 
			 System.out.println(result + "no of rows affected");
			 System.out.println("data inserted succesfully");
		 }
		 
		}catch (Exception e) {

			e.printStackTrace();
			
		}finally {
			
			try {
				if(connection!=null) {
					connection.close();
				}
				if(statement!=null) {
					statement.close();
				}
				
			}catch (Exception e) {
				
				e.printStackTrace();
				
			}
		}

}
		

public void updateStatically() {
	
	Connection connection=null;
	Statement statement=null;
	
	String dburl="jdbc:mysql://localhost:3306/emp?user=root&password=root";
	String query="update Student set id=105 where name='Ishwar'";
	
	try {
    Class.forName("com.mysql.jdbc.Driver");
	
	 connection =DriverManager.getConnection(dburl);
	 
	 statement =connection.createStatement();
	 
	 int result=statement.executeUpdate(query);
	 
	 if(result!=0) {
		 
		 System.out.println(result + "no of rows affected");
		 System.out.println("data inserted succesfully");
	 }
	 
	}catch (Exception e) {

		e.printStackTrace();
		
	}finally {
		
		try {
			if(connection!=null) {
				connection.close();
			}
			if(statement!=null) {
				statement.close();
			}
			
		}catch (Exception e) {
			
			e.printStackTrace();
			
		}
	}

	
	
}
	
	
	
public void deleteStatically() {
	
	
	
	Connection connection=null;
	Statement statement=null;
	
	String dburl="jdbc:mysql://localhost:3306/emp?user=root&password=root";
	String query="delete from Student where id=104";
	
	try {
    Class.forName("com.mysql.jdbc.Driver");
	
	 connection =DriverManager.getConnection(dburl);
	 
	 statement =connection.createStatement();
	 
	 int result=statement.executeUpdate(query);
	 
	 if(result!=0) {
		 
		 System.out.println(result + "no of rows affected");
		 System.out.println("data inserted succesfully");
	 }
	 
	}catch (Exception e) {

		e.printStackTrace();
		
	}finally {
		
		try {
			if(connection!=null) {
				connection.close();
			}
			if(statement!=null) {
				statement.close();
			}
			
		}catch (Exception e) {
			
			e.printStackTrace();
			
		}
	}

}
	

	
	
	
}











	
	







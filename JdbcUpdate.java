package com.te.jdbc1;

import java.sql.*;

public class JdbcUpdate {
	public static void main(String[] args) {
		
		Connection connection=null;
		Statement statement=null;
		
		String dburl="jdbc:mysql://localhost:3306/emp?user=root&password=root";
		String query="update emp_details set id=1135 where name='Ishwar'";
		
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
	
	


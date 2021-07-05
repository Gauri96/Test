package com.te.jdbc2;

import java.sql.*;


import java.util.Scanner;

public class DynamicQuery {
	
	public void insertDynamically() {
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter id");
		int id=scanner.nextInt();
		System.out.println("enter name");
		String name=scanner.next();
		System.out.println("enter marks");
		double marks=scanner.nextDouble();
		
		
		
		try {
		Connection connection=null;
		
		PreparedStatement prepare=null;
		String dburl="jdbc:mysql://localhost:3306/emp?user=root&password=root";
		
		String query="Insert into Student values(? ,?, ?)";
		
		connection=DriverManager.getConnection(dburl);
		
		prepare=connection.prepareStatement(query);
		
		prepare.setInt(1, id);
		prepare.setString(2, name);
		prepare.setDouble(3, marks);
		
		
		int result=prepare.executeUpdate();
		
		if(result!=0)
		{
			System.out.println(result+"no of rows affected");
			System.out.println("data inserted successfully");
		}
	
		
	}catch(Exception e) {
		
		e.printStackTrace();
	}
		
		
	
		
		
		
	}




public void updateDynamically() {
	
	Scanner scanner =new Scanner(System.in);
	System.out.println("enter id");
	int id=scanner.nextInt();
	System.out.println("enter name");
	String name=scanner.nextLine();
	System.out.println("enter marks");
	double marks=scanner.nextDouble();
	
	
	
	
	String dburl="jdbc:mysql://localhost:3306/emp?user=root&password=root";
	String query="update Student set id=? where name=?";

	Connection connection=null;
	PreparedStatement prepared =null;
	try {
		connection=DriverManager.getConnection(dburl);
    	prepared=connection.prepareStatement(query);
    	
    	prepared.setInt(1, id);
    	prepared.setString(2, name);
    	
    	int result=prepared.executeUpdate();
    	if(result !=0) {
    		System.out.println(result +"  No of row affected");
    	}
    	
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public void deleteDynamically() {
	Scanner scanner =new Scanner(System.in);
	//System.out.println("enter id");
	//int id=scanner.nextInt();
	System.out.println("enter name");
	String name=scanner.nextLine();



Connection connection=null;
PreparedStatement statement=null;

String dburl="jdbc:mysql://localhost:3306/emp?user=root&password=root";
String query="delete from Student where name=?";
try {
connection=DriverManager.getConnection(dburl);
statement=connection.prepareStatement(query);

statement.setString(1, name);
int result=statement.executeUpdate();
if(result !=0) {
System.out.println(result+" No of row affected");
System.out.println("Data deleted successfully");
}
} catch (Exception e) {
// TODO Auto-generated catch block
e.printStackTrace();
}

}
}



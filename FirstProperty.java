package com.te.jdbc1;
import java.io.FileInputStream;
import java.util.Properties;

public class FirstProperty {
public static void main(String[] args) {
			
		try {
		FileInputStream fileInputStream=new FileInputStream("Demo.Properties");
		Properties properties=new Properties();
		properties.load(fileInputStream);
		System.out.println("First data :"+properties.getProperty("dburl"));
		System.out.println("second data :"+properties.getProperty("query"));
		System.out.println("third data :"+properties.getProperty("dburl"));
		System.out.println("forth data :"+properties.getProperty("query"));
		System.out.println("fifth data :"+properties.getProperty("dburl"));
		System.out.println("sixth data :"+properties.getProperty("query"));
		}catch(Exception e) {
			System.out.println("__________");
		}
	}
	}





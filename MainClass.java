package com.te.jdbc2;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		DynamicQuery d=new DynamicQuery();
		StaticQuery s=new StaticQuery();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 1 For Dynamic and 2 For Static:");
	    int in=scanner.nextInt();
	    System.out.println("enter 1 for insert 2 for update 3 for delete");
	    int i=scanner.nextInt();
	 switch(in) {
	 case 1:{
		 if(i==1) {
		 d.insertDynamically();
	}
		 else if(i==2) {
			 d.updateDynamically();	 
	 }
		 else if(i==3) {
			 d.deleteDynamically();
		 }
	}
		 case 2:{
			 if(i==1) {
			 s.insertStatically();
		}
			 else if(i==2){
			 s.updateStatically();
		 }
			 else if(i==3){
			 s.deleteStatically();
		 }
	}
	 
	}
	}
	}

package com.deepak.dao;

import java.sql.*;

public class MyConnection {
	public static Connection createCon(){  
		try{  
			//step1 load the driver class  
			Class.forName("oracle.jdbc.OracleDriver");  
			  
			//step2 create  the connection object  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:xe","deepak","deepakji51");  
			  
			return con;
		}catch(Exception e){ 
			System.out.println(e);
		}  
		
		return null;
	}  
}

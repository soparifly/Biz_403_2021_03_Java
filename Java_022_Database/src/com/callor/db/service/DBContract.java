package com.callor.db.service;

import java.sql.Connection;
import java.sql.DriverManager;



public class DBContract {
	
	public static void main(String[] args) {
		
			
		
	}
	private static void DB_INFO() {
		
		public static final String JdbDriver ="oracle.jdbc.driver.OracleDriver";
		public static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
		
		
		public static final String USER = "scuser";
		public static final String PASSWORD = "scuser";
		
		System.out.println("Hello 오라클");
		System.out.println("JdbcDriver"+ DBContract.DB_INFO.JdbDriver);
		System.out.println("URL"+ DBContract.DB_INFO.);
		//JdbcDriver
		try {
			Class.forName(DBContract.DB_INFO.JdbcDriver);
			Connection dbConn = null;
			
			dbConn = DriverManager.getConnection(
					DBContract.DB_INFO.URL,
					DBContract.DB_INFO.USER,
					DBContract.DB_INFO.PASSWORD
					);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("JDBC Driver없음!!");
			
			
		}
	}
}

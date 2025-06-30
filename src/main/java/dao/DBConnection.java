package main.java.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
// Exact code used to create database and table in MySQL
//	CREATE DATABASE IF NOT EXISTS PetSync
//	  DEFAULT CHARACTER SET utf8mb4
//	  DEFAULT COLLATE utf8mb4_unicode_ci;
//
//	USE PetSync;
//
//	CREATE TABLE IF NOT EXISTS users (
//	  uuid CHAR(40) NOT NULL PRIMARY KEY,
//	  fullname VARCHAR(128),
//	  email VARCHAR(128),
//	  password VARCHAR(50),
//	  role VARCHAR(40)
//	);


 public static Connection getConnectionToDatabase() {
     
     final String CONN_STRING = "jdbc:mysql://localhost:3306/petsync";
     Connection connection = null;

     System.out.println("getConnectionToDatabase.");

     try {
         // load the driver class
         Class.forName("com.mysql.jdbc.Driver");
         System.out.println("MySQL JDBC Driver Registered!");
         // get hold of the DriverManager
         connection = DriverManager.getConnection(CONN_STRING, "root", "");

     } catch (ClassNotFoundException e) {
         System.out.println("Where is your MySQL JDBC Driver?");
         e.printStackTrace();

     }

     catch (SQLException e) {
         System.out.println("Connection Failed! Check output console");
         e.printStackTrace();

     }

     if (connection != null) {
         System.out.println("Connection made to DB!");

     }

     return connection;
 }


}

package com.breachdatabase.webapp.Datbase_Taxi;

import java.io.IOException;
import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.sql.Statement;

public class DatabaseConection {
	
	public static void connectionDB() throws IOException {
		  String jdbcUrl = "jdbc:mysql://localhost:3306/mydatabase";
	        String username = "root";
	        String password = "root";
	        converJSON convertJSON= new converJSON();
	        String deletesqlString= "DELETE FROM breachdatabase";
	        String sql = "INSERT INTO breachdatabase (Name, Title, Domain, BreachDate, AddedDate, PwnCount, Description, LogoPath, DataClasses, IsVerified, IsFabricated, IsSensitive, IsRetired, IsSpamList, IsMalware, ModifiedDate) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
	        	
	        	
	        	try (PreparedStatement statement = connection.prepareStatement(deletesqlString)){
	        		statement.executeUpdate();
	        		System.out.println("Database Clear");
	        	};
	        	
	            // Connection established. Do something with the database.
	            System.out.println("Connected to the database!");
	            
	            	APIroot apIroot = new APIroot();
	                
	            	
	             List<Breach> allBreachs = apIroot.sendGET();
	             for (Breach breach: allBreachs) {
	            	 
	            	 
	            	 try (PreparedStatement statement = connection.prepareStatement(sql)) {
	                     statement.setString(1, breach.getName());
	                     statement.setString(2, breach.getTitle());
	                     statement.setString(3, breach.getDomain());
	                     statement.setString(4, breach.getBreachDate());
	                     statement.setString(5, breach.getAddedDate());
	                     statement.setLong(6, breach.getPwnCount());
	                     statement.setString(7, breach.getDescription());
	                     statement.setString(8, breach.getLogoPath());
	                     statement.setString(9,  breach.getDataClasseStrings().toString());
	                     statement.setBoolean(10, breach.isIsVerified());
	                     statement.setBoolean(11, breach.isIsFabricated());
	                     statement.setBoolean(12, breach.isIsSensitive());
	                     statement.setBoolean(13, breach.isIsRetired());
	                     statement.setBoolean(14, breach.isIsSpamList());
	                     statement.setBoolean(15, breach.isIsMalware());
	                     statement.setString(16, breach.getModifiedDateString());
	                     
	                     
	                     int rowsInserted = statement.executeUpdate();
	                     if (rowsInserted > 0) {
	                         System.out.println("Processing... "+breach.getName());
	                     } else {
	                         System.out.println("Failed to insert data.");
	                     }
	                 }
	             }
	            	
	            
	            
	        } catch (SQLException e) {
	            System.out.println("Failed to connect to the database.");
	            e.printStackTrace();
	        }
	}

}

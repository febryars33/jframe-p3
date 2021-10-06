/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salary;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Febriansyah
 */
public class DatabaseConnection {
    
    private static java.sql.Connection DatabaseConnection;
    
    public static java.sql.Connection getConnection() {
        
        if(DatabaseConnection == null) {
            try {
                
                String url = "jdbc:mysql://localhost:3306/jframe_gaji";
                
                String username = "root";
                
                String password = "eadgbedadgbe123";
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                
                DatabaseConnection = DriverManager.getConnection(url, username, password);
                
                System.out.println("Database Connected !");
                
            } catch (SQLException e) {
                
                System.out.println("Database Connection Failed.");
            }
        }
        return DatabaseConnection;
    }
    
    public static void main(String args[]) {
        getConnection();
    }
    
}

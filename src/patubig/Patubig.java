/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


package patubig;

import java.sql.*;
/**
 *
 * @author Acer
 */
public class Patubig {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/waterstation"; 
        String user = "root"; 
        String password = "";
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            if (conn != null) {
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Failed to connect!");
            }
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace(); 
        // TODO code application logic here
    }
    
}}
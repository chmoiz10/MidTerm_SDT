/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectiondb;

import java.sql.*;

/**
 *
 * @author mr-attitude
 */
public class ConnectionDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
//here sonoo is database name, root is username and password
            try (Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Cities", "root", "")) {
                //here sonoo is database name, root is username and password
                Statement stmt = (Statement) con.createStatement();
                ResultSet rs = stmt.executeQuery("Select * FROM Record");
                while (rs.next()) {
                    System.out.println(rs.getInt(1) + " - " + rs.getString(2));
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}

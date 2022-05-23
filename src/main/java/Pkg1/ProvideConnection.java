/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pkg1;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class ProvideConnection {
    public static Connection getConnection(Connection con){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/accounts", "Hamza", "hamzaqureshi2937#");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"System Error");
        }
        return con;
    }
    
}

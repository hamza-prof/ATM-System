/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pkg1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class GetData {
    private static String name;
   // private static String mobile;
    private static String money;
    private Connection con;
    private ResultSet rs;
    private static String amount="";
    private Statement st;
    
    protected static void setName(String input){
        name=input;
    }
    protected static void setMoney(String input){
        money=input;
    }
    protected static void setWithdraw(String input){
        amount=input;
    }
    protected static String getWithdraw(){
       return amount; 
    }
    protected static String getName(){
        return name;
    }
    protected static String getMoney(){
        return money;
    }
    
    
    public static void main(String[] args){
        System.out.println(name);
        System.out.println(money);
    }
    
    
    
}

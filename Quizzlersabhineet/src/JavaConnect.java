/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
import java.sql.*;
import javax.swing.*;

public class JavaConnect {
    
    Connection Conn=null;
    
    public static Connection ConnecrDb()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection Conn=DriverManager.getConnection("jdbc:mysql://localhost/datastorage","root","muz511");
            JOptionPane.showMessageDialog(null,"Welcome To The Quizzlers");
            return Conn;
        }
        catch(Exception e)
        {
         JOptionPane.showMessageDialog(null, e);
         return null;
        }
    }
    
}

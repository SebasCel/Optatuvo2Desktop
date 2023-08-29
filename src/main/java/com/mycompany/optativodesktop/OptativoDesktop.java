/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.optativodesktop;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author lab217-01
 */
public class OptativoDesktop {

    
    private static String userDB = "postgres";
    private static String passDB = "Alumno2023";
    private static String portDB = "5432";
    private static String dataBase = "db1";
    
    private static String url = "jdbc:postgresql://localhost:5432/"+dataBase;
    
    
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(url,userDB,passDB);
        } catch (SQLException ex) {
            Logger.getLogger(OptativoDesktop.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

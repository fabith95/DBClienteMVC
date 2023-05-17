
package com.cliente.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Conexion {
    private static Connection conn = null;
    private static String login = "FerreserviciosJF";
    private static String clave = "1301";
    private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
    
    public static Connection getConnection(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(url, login,clave);
            conn.setAutoCommit(false);
            if (conn != null){
                System.out.println(  "CONEXION ESTABLECIDA DB");
            }else{
                System.out.println(  "ERROR EN LA CONEXION DB"  );
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "CONEXION ERRONEA" + e.getMessage());
        }
        return conn;
    }
    
    public void desconexion(){
        try {
            conn.close();
        } catch (Exception e) {
            System.out.println("ERROR AL DESCONECTAR" + e.getMessage());
        }
    }
    
    public static void main(String[] args){
        Conexion c = new Conexion();
        c.getConnection();
    
    }
}
     

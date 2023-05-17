
package com.cliente.bo;

import com.cliente.dao.ClienteDAO;
import com.cliente.db.Conexion;
import com.cliente.identidad.Cliente;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;

/**
 *
 * @author Usuario
 */
public class ClienteBO {
    private String mensaje = " ";
    private ClienteDAO edao = new ClienteDAO();
    
     public String agregarCliente(Cliente cli){
         Connection conn = Conexion.getConnection();
         try {
             mensaje = edao.agregarCliente(conn, cli);
             
         } catch (Exception e) {
             mensaje = mensaje + " " + e.getMessage();
         }finally{
             try {
                 if (conn != null){
                     conn.close();
                 }
             } catch (Exception e) {
                 mensaje = mensaje + " " + e.getMessage();
             }
         }
        return mensaje;
    }
    
    public String modificarCliente(Cliente cli){
        Connection conn = Conexion.getConnection();
         try {
             mensaje = edao.modificarCliente(conn, cli);
             
         } catch (Exception e) {
             mensaje = mensaje + " " + e.getMessage();
         }finally{
             try {
                 if (conn != null){
                     conn.close();
                 }
             } catch (Exception e) {
                 mensaje = mensaje + " " + e.getMessage();
             }
         }
        return mensaje;
    }
    
    public String eliminarCliente(int id_Cliente){
        Connection conn = Conexion.getConnection();
         try {
             mensaje = edao.eliminarCliente(conn, id_Cliente);
         } catch (Exception e) {
             mensaje = mensaje + " " + e.getMessage();
         }finally{
             try {
                 if (conn != null){
                     conn.close();
                 }
             } catch (Exception e) {
                 mensaje = mensaje + " " + e.getMessage();
             }
         }
        return mensaje;
    }
    
    public void listarCliente(JTable tabla){
        Connection conn = Conexion.getConnection();
        edao.listarCliente(conn, tabla);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public int getMaxId() {
        Connection conn = Conexion.getConnection();
        int id_cliente = edao.getMaxId(conn);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return id_cliente;
    }
}

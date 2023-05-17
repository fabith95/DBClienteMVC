
package com.cliente.dao;

import com.cliente.identidad.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class ClienteDAO {
    private String mensaje = " ";
    
    public String agregarCliente(Connection conn, Cliente cli){
        PreparedStatement pst = null;
        String sql = "INSERT INTO CLIENTE (ID_CLIENTE, EDAD_CLI, RUT_CLI, PRIMER_NOMBRE_CLI, SEGUNDO_NOMBRE_CLI, PRIMER_APELLIDO_CLI, SEGUNDO_APELLIDO_CLI, IDENTIFICACION_CLI, TELEFONO_CELULAR_CLI, TELEFONO_FIJO_CLI, CORREO_CLI, CUENTA_BANCARIA_CLI)" 
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, cli.getId_cliente());
            pst.setInt(2, cli.getEdad_cli());
            pst.setString(3, cli.getRut_cli());
            pst.setString(4, cli.getPrimer_nombre_cli());
            pst.setString(5, cli.getSegundo_nombre_cli());
            pst.setString(6, cli.getPrimer_apellido_cli());
            pst.setString(7, cli.getSegundo_apellido_cli());
            pst.setString(8, cli.getIdentificacion_cli());
            pst.setString(9, cli.getTelefono_celular_cli());
            pst.setString(10, cli.getTelefono_fijo_cli());
            pst.setString(11, cli.getCorreo_cli());
            pst.setString(12, cli.getCuenta_bancaria_cli());
            mensaje = "GUARDADO CORRECTAMENTE";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
           mensaje = "NO SE PUDO GUARDAR \n " + e.getMessage(); 
        }
        return mensaje;
    }
    
    public String modificarCliente(Connection conn, Cliente cli){
        PreparedStatement pst = null;
        String sql = "UPDATE CLIENTE SET EDAD_CLI=?, RUT_CLI=?, PRIMER_NOMBRE_CLI=?, SEGUNDO_NOMBRE_CLI=?, PRIMER_APELLIDO_CLI=?, SEGUNDO_APELLIDO_CLI=?, IDENTIFICACION_CLI=?, TELEFONO_CELULAR_CLI=?, TELEFONO_FIJO_CLI=?, CORREO_CLI=?, CUENTA_BANCARIA_CLI=? "
                +"WHERE ID_CLIENTE = ? ";
        
        try {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, cli.getEdad_cli());
            pst.setString(2, cli.getRut_cli());
            pst.setString(3, cli.getPrimer_nombre_cli());
            pst.setString(4, cli.getSegundo_nombre_cli());
            pst.setString(5, cli.getPrimer_apellido_cli());
            pst.setString(6, cli.getSegundo_apellido_cli());
            pst.setString(7, cli.getIdentificacion_cli());
            pst.setString(8, cli.getTelefono_celular_cli());
            pst.setString(9, cli.getTelefono_fijo_cli());
            pst.setString(10, cli.getCorreo_cli());
            pst.setString(11, cli.getCuenta_bancaria_cli());
            pst.setInt(12, cli.getId_cliente());
            mensaje = "MODIFICADO CORRECTAMENTE";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
           mensaje = "NO SE PUDO MODIFICAR \n " + e.getMessage(); 
        }       
        return mensaje;
    }
    
    public String eliminarCliente(Connection conn, int id_cliente){
        PreparedStatement pst = null;
        String sql = "DELETE FROM CLIENTE WHERE ID_CLIENTE = ?";
        
        try {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, id_cliente); 
            mensaje = "ELIMINADO CORRECTAMENTE";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
           mensaje = "NO SE PUDO ELIMINAR \n " + e.getMessage(); 
        }       
        return mensaje;
    }
    
    public void listarCliente(Connection conn, JTable tabla){
        DefaultTableModel model;
        String [] columnas = {"IDCLIENTE","EDAD","RUT","PRIMER NOMBRE","SEGUNDO NOMBRE","PRIMER APELLIDO","SEGUNDO APELLIDO","IDENTIFICACION","TELEFONO CELULAR","TELEFONO FIJO","CORREO","CUENTA BANCARIA"};
        model = new DefaultTableModel(null, columnas);

        String sql = "SELECT * FROM CLIENTE ORDER BY ID_CLIENTE";

        String[] filas = new String[12];
        Statement st = null;
        ResultSet rs = null;
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                for (int i = 0; i < 12; i++) {
                    filas[i] = rs.getString(i + 1);
                }
                model.addRow(filas);        
            }
            tabla.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUEDE LISTAR LA TABLA");
        }
    }
    
    public int getMaxId(Connection conn){
        int id_cliente = 0;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            pst = conn.prepareStatement("SELECT MAX(ID_CLIENTE)+1 as ID_CLIENTE FROM CLIENTE");
            rs = pst.executeQuery();
            if (rs.next()){
                id_cliente = rs.getInt(1);
            }
            rs.close();
            pst.close();
        } catch (SQLException e) {
            System.out.println("ERROR AL MOSTRAR ID" + e.getMessage());
        }
        return id_cliente;
    }
}

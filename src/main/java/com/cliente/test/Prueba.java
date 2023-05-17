
package com.cliente.test;

import com.cliente.bo.ClienteBO;
import com.cliente.identidad.Cliente;

/**
 *
 * @author Usuario
 */
public class Prueba {
    ClienteBO ebo = new ClienteBO();
    Cliente cli = new Cliente();
    String mensaje = "";
    public void insertar(){
//        cli.setEdad_cli(27);
//        cli.setRut_cli("71372265-90");
//        cli.setPrimer_nombre_cli("FABITH");
//        cli.setSegundo_nombre_cli("STIVEN");
//        cli.setPrimer_apellido_cli("BUENO");
//        cli.setSegundo_apellido_cli("ZULUAGA");
//        cli.setIdentificacion_cli("10366569088");
//        cli.setTelefono_celular_cli("30436441977");
//        cli.setTelefono_fijo_cli("25831799");
//        cli.setCorreo_cli("FABITH95@GMAIL.COM");
//        cli.setCuenta_bancaria_cli("10000001");
//        mensaje = ebo.agregarCliente(cli);
//        System.out.println(mensaje);

        cli.setEdad_cli(30);
        cli.setRut_cli("00000000-90");
        cli.setPrimer_nombre_cli("ISABELA");
        cli.setSegundo_nombre_cli(" ");
        cli.setPrimer_apellido_cli("ECHEVERRI");
        cli.setSegundo_apellido_cli("HINCAPIE");
        cli.setIdentificacion_cli("1024587545");
        cli.setTelefono_celular_cli("365784521");
        cli.setTelefono_fijo_cli("300265412");
        cli.setCorreo_cli("ISA@GMAIL.COM");
        cli.setCuenta_bancaria_cli("200200200");
        mensaje = ebo.agregarCliente(cli);
        System.out.println(mensaje);
    }
    
    public void modificar(){
        
        cli.setId_cliente(1);
        cli.setEdad_cli(50);
        cli.setRut_cli("9000090-90");
        cli.setPrimer_nombre_cli("JOSE");
        cli.setSegundo_nombre_cli("STIVEN");
        cli.setPrimer_apellido_cli("BUENO");
        cli.setSegundo_apellido_cli("ZULUAGA");
        cli.setIdentificacion_cli("10366569088");
        cli.setTelefono_celular_cli("30436441977");
        cli.setTelefono_fijo_cli("25831799");
        cli.setCorreo_cli("FABITH95@GMAIL.COM");
        cli.setCuenta_bancaria_cli("10000001");
        mensaje = ebo.modificarCliente(cli);
        System.out.println(mensaje);

    }
    
    public void eliminar(){
        
        mensaje = ebo.eliminarCliente(7);
        System.out.println(mensaje);

    }
    public static void main(String[] args){
        Prueba test = new Prueba();    
//        test.insertar();
//        test.modificar();
//          test.eliminar();
    }
    
}


package com.cliente.identidad;

/**
 *
 * @author Usuario
 */
public class Cliente {
    private int id_cliente;
    private int edad_cli;
    private String rut_cli;
    private String primer_nombre_cli;
    private String segundo_nombre_cli;
    private String primer_apellido_cli;
    private String segundo_apellido_cli;
    private String identificacion_cli;
    private String telefono_celular_cli;
    private String telefono_fijo_cli;
    private String correo_cli;
    private String cuenta_bancaria_cli;

    public Cliente() {
    }

    public Cliente(int id_cliente, int edad_cli, String rut_cli, String primer_nombre_cli, String segundo_nombre_cli, String primer_apellido_cli, String segundo_apellido_cli, String identificacion_cli, String telefono_celular_cli, String telefono_fijo_cli, String correo_cli, String cuenta_bancaria_cli) {
        this.id_cliente = id_cliente;
        this.edad_cli = edad_cli;
        this.rut_cli = rut_cli;
        this.primer_nombre_cli = primer_nombre_cli;
        this.segundo_nombre_cli = segundo_nombre_cli;
        this.primer_apellido_cli = primer_apellido_cli;
        this.segundo_apellido_cli = segundo_apellido_cli;
        this.identificacion_cli = identificacion_cli;
        this.telefono_celular_cli = telefono_celular_cli;
        this.telefono_fijo_cli = telefono_fijo_cli;
        this.correo_cli = correo_cli;
        this.cuenta_bancaria_cli = cuenta_bancaria_cli;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getEdad_cli() {
        return edad_cli;
    }

    public void setEdad_cli(int edad_cli) {
        this.edad_cli = edad_cli;
    }

    public String getRut_cli() {
        return rut_cli;
    }

    public void setRut_cli(String rut_cli) {
        this.rut_cli = rut_cli;
    }

    public String getPrimer_nombre_cli() {
        return primer_nombre_cli;
    }

    public void setPrimer_nombre_cli(String primer_nombre_cli) {
        this.primer_nombre_cli = primer_nombre_cli;
    }

    public String getSegundo_nombre_cli() {
        return segundo_nombre_cli;
    }

    public void setSegundo_nombre_cli(String segundo_nombre_cli) {
        this.segundo_nombre_cli = segundo_nombre_cli;
    }

    public String getPrimer_apellido_cli() {
        return primer_apellido_cli;
    }

    public void setPrimer_apellido_cli(String primer_apellido_cli) {
        this.primer_apellido_cli = primer_apellido_cli;
    }

    public String getSegundo_apellido_cli() {
        return segundo_apellido_cli;
    }

    public void setSegundo_apellido_cli(String segundo_apellido_cli) {
        this.segundo_apellido_cli = segundo_apellido_cli;
    }

    public String getIdentificacion_cli() {
        return identificacion_cli;
    }

    public void setIdentificacion_cli(String identificacion_cli) {
        this.identificacion_cli = identificacion_cli;
    }

    public String getTelefono_celular_cli() {
        return telefono_celular_cli;
    }

    public void setTelefono_celular_cli(String telefono_celular_cli) {
        this.telefono_celular_cli = telefono_celular_cli;
    }

    public String getTelefono_fijo_cli() {
        return telefono_fijo_cli;
    }

    public void setTelefono_fijo_cli(String telefono_fijo_cli) {
        this.telefono_fijo_cli = telefono_fijo_cli;
    }

    public String getCorreo_cli() {
        return correo_cli;
    }

    public void setCorreo_cli(String correo_cli) {
        this.correo_cli = correo_cli;
    }

    public String getCuenta_bancaria_cli() {
        return cuenta_bancaria_cli;
    }

    public void setCuenta_bancaria_cli(String cuenta_bancaria_cli) {
        this.cuenta_bancaria_cli = cuenta_bancaria_cli;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id_cliente=" + id_cliente + ", edad_cli=" + edad_cli + ", rut_cli=" + rut_cli + ", primer_nombre_cli=" 
                + primer_nombre_cli + ", segundo_nombre_cli=" + segundo_nombre_cli + ", primer_apellido_cli=" 
                + primer_apellido_cli + ", segundo_apellido_cli=" + segundo_apellido_cli + ", identificacion_cli=" 
                + identificacion_cli + ", telefono_celular_cli=" + telefono_celular_cli + ", telefono_fijo_cli=" 
                + telefono_fijo_cli + ", correo_cli=" + correo_cli + ", cuenta_bancaria_cli=" + cuenta_bancaria_cli + '}';
    }

    
    
}    


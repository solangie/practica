/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Sena
 */
public class UsuarioDTO {

private enum tipoDocumento{cc,ce};
private Double documento;
private String nombre;
private String apellido;   
private String correo;
private String contraseña;
private int idRol;
private int idTelefono;

    public UsuarioDTO() {
    }
    
   public UsuarioDTO(Double documento) {
        this.documento = documento;
    } 

    public UsuarioDTO(Double documento, String nombre, String apellido, String correo, String contraseña, int idRol, int idTelefono) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contraseña = contraseña;
        this.idRol = idRol;
        this.idTelefono = idTelefono;
    }

    /**
     * @return the documento
     */
    public Double getDocumento() {
        return documento;
    }

    /**
     * @param documento the documento to set
     */
    public void setDocumento(Double documento) {
        this.documento = documento;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the contraseña
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * @param contraseña the contraseña to set
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * @return the idRol
     */
    public int getIdRol() {
        return idRol;
    }

    /**
     * @param idRol the idRol to set
     */
    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    /**
     * @return the idTelefono
     */
    public int getIdTelefono() {
        return idTelefono;
    }

    /**
     * @param idTelefono the idTelefono to set
     */
    public void setIdTelefono(int idTelefono) {
        this.idTelefono = idTelefono;
    } 
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DTO;

/**
 *
 * @author Home
 */
public class telefonoDTO {
    private int idTelefono;
    private String descripcion;
    private int numero;

    public telefonoDTO() {
    }

    public telefonoDTO(int idTelefono) {
        this.idTelefono = idTelefono;
    }

    public telefonoDTO(int idTelefono, String descripcion, int numero) {
        this.idTelefono = idTelefono;
        this.descripcion = descripcion;
        this.numero = numero;
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

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}

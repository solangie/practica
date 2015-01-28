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
public class rolesDTO {
    
    private int idrol;
    private String descripcion;

    public rolesDTO() {
    }

    public rolesDTO(int idrol) {
        this.idrol = idrol;
    }

    public rolesDTO(int idrol, String descripcion) {
        this.idrol = idrol;
        this.descripcion = descripcion;
    }

    /**
     * @return the idrol
     */
    public int getIdrol() {
        return idrol;
    }

    /**
     * @param idrol the idrol to set
     */
    public void setIdrol(int idrol) {
        this.idrol = idrol;
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
   
    
    }


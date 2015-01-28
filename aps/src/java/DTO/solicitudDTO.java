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
public class solicitudDTO {
    private int idSolicitud;
    private String descripcion;
    private int idReserva;
    private int idInscripcion;
    private double documento;
    private boolean estado;

    public solicitudDTO() {
    }

    public solicitudDTO(int idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public solicitudDTO(int idSolicitud, String descripcion, int idReserva, int idInscripcion, double documento, boolean estado) {
        this.idSolicitud = idSolicitud;
        this.descripcion = descripcion;
        this.idReserva = idReserva;
        this.idInscripcion = idInscripcion;
        this.documento = documento;
        this.estado = estado;
    }

   

    /**
     * @return the idSolicitud
     */
    public int getIdSolicitud() {
        return idSolicitud;
    }

    /**
     * @param idSolicitud the idSolicitud to set
     */
    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
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
     * @return the idReserva
     */
    public int getIdReserva() {
        return idReserva;
    }

    /**
     * @param idReserva the idReserva to set
     */
    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    /**
     * @return the idInscripcion
     */
    public int getIdInscripcion() {
        return idInscripcion;
    }

    /**
     * @param idInscripcion the idInscripcion to set
     */
    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    /**
     * @return the documento
     */
    public double getDocumento() {
        return documento;
    }

    /**
     * @param documento the documento to set
     */
    public void setDocumento(double documento) {
        this.documento = documento;
    }

    /**
     * @return the estado
     */
    public boolean getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

  
            }

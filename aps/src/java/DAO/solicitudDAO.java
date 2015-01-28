/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import DTO.solicitudDTO;
import interfaces.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utilidades.conexion;


/**
 *
 * @author Sena
 */
public class solicitudDAO implements Usuario<solicitudDTO>{
    
    private static final String SQL_INSERTAR = "insert into solicitudes (idSolicitud, descripcion, idReserva, idInscripcion, documento, estado) value(?,?,?,?,?,?,) ";
    private static final String SQL_ELIMINAR = "delete from solicitudes where idSolicitud = ?";
    private static final String SQL_MODIFICAR ="update solicitudes set estado = ?,documento = ?,idInscripcion = ?, idReserva = ?,descripcion = ?,idSolicitud = ? ,where idSolicitud = ?";
    private static final String SQL_LISTARUNO = "select * from solicitudes where idSolicitud =?";
    private static final String SQL_LISTARTODO = "select * from solicitudes";
    
    private static final conexion con = conexion.saberEstado();

    @Override
    public boolean crear(solicitudDTO ob) {
       
           PreparedStatement ps;
           try {
           ps=con.getCnn().prepareStatement(SQL_INSERTAR);
           ps.setInt(1, ob.getIdSolicitud());
           ps.setString(2, ob.getDescripcion());
           ps.setInt(3, ob.getIdSolicitud());
           ps.setInt(4, ob.getIdReserva());
           ps.setDouble(5, ob.getDocumento());
           ps.setBoolean(6, ob.getEstado());
           
           if(ps.executeUpdate()>0){
               return true;
           }
       } catch (SQLException ex) {
           Logger.getLogger(solicitudDAO.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
               con.cerrarConexion();
           }
        return false;
    }

    @Override
    public boolean eliminar(Object key) {
       try {
           PreparedStatement ps;
           ps = con.getCnn().prepareStatement(SQL_ELIMINAR);
           ps.setString(1, key.toString());
           
           if(ps.executeUpdate()>0){
               return true;
           }
       } catch (SQLException ex) {
           Logger.getLogger(solicitudDAO.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
           con.cerrarConexion();
       }
       return false;
    }

    @Override
    public boolean modificar(solicitudDTO ob) {
       try {
           PreparedStatement ps;
           ps =con.getCnn().prepareStatement(SQL_MODIFICAR);
           ps.setBoolean(1, ob.getEstado());
           ps.setDouble(2, ob.getDocumento());
           ps.setInt(3, ob.getIdReserva());
           ps.setInt(4, ob.getIdSolicitud());
           ps.setString(5, ob.getDescripcion());
           ps.setInt(6, ob.getIdSolicitud());
           
           if(ps.executeUpdate()>0){
               return true;
           }
       } catch (SQLException ex) {
           Logger.getLogger(solicitudDAO.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
        con.cerrarConexion();
    }
       return false;    
    }

    @Override
    public solicitudDTO listarUno(Object key) {
      
           PreparedStatement ps;
           ResultSet res;
           solicitudDTO so =null;
            try {
           ps = con.getCnn().prepareStatement(SQL_LISTARUNO);
           ps.setString(1, key.toString());
           
           res = ps.executeQuery();
           
           while (res.next()){
               so = new solicitudDTO(res.getInt(1),res.getString(2) ,res.getInt(3),res.getInt(4),res.getDouble(5),res.getBoolean(6));
           }
           return so;
       } catch (SQLException ex) {
           Logger.getLogger(solicitudDAO.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
           con.cerrarConexion();
       }
        return so;
    }

    @Override
    public List<solicitudDTO> listarTodo() {
      
           PreparedStatement ps;
           ResultSet res;
           ArrayList<solicitudDTO> solicitudes = new ArrayList();
           
         try {
           ps =con.getCnn().prepareStatement(SQL_LISTARTODO);
           res = ps.executeQuery();
           
           while (res.next()){
               solicitudes.add(new solicitudDTO(res.getInt(1),res.getString(2),res.getInt(3),res.getInt(4),res.getDouble(5),res.getBoolean(6)));               
           }
       } catch (SQLException ex) {
           Logger.getLogger(solicitudDAO.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
           con.cerrarConexion();
       }
       return solicitudes;
    }
    
}
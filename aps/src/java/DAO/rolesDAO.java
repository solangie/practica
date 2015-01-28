/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.rolesDTO;
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
public class rolesDAO implements Usuario<rolesDTO>{
   private static final String SQL_INSERTAR = "insert into roles (idRol, descripcion) value(?,?) ";
    private static final String SQL_ELIMINAR = "delete from roles where idRol = ?";
    private static final String SQL_MODIFICAR ="update roles set descripcion = ?, idRol = ?";
    private static final String SQL_LISTARUNO = "select * from roles where idRol =?";
    private static final String SQL_LISTARTODO = "select * from roles";
    
    private static final conexion con = conexion.saberEstado();

    @Override
    public boolean crear(rolesDTO ob) {
      
           PreparedStatement ps;
          try {  
           ps=con.getCnn().prepareStatement(SQL_INSERTAR);
           ps.setInt(1, ob.getIdrol());
           ps.setString(2, ob.getDescripcion());
           
           if(ps.executeUpdate()>0){
               return true;
           }
       } catch (SQLException ex) {
           Logger.getLogger(rolesDAO.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
              con.cerrarConexion();
          }
           return false;
    }

    @Override
    public boolean eliminar(Object key) {
       try {
           PreparedStatement ps;
           
           ps=con.getCnn().prepareStatement(SQL_ELIMINAR);
           ps.setString(1, key.toString());
           
           if(ps.executeUpdate()>0);
           return true;
       } catch (SQLException ex) {
           Logger.getLogger(rolesDAO.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
        con.cerrarConexion();
    }
       return false;
    }

    @Override
    public boolean modificar(rolesDTO ob) {
       try {
           PreparedStatement ps;
           
           ps=con.getCnn().prepareStatement(SQL_MODIFICAR);
           ps.setString(1, ob.getDescripcion());
           ps.setInt(2, ob.getIdrol());
           
           if(ps.executeUpdate()>0){
               return true;
           }
       } catch (SQLException ex) {
           Logger.getLogger(rolesDAO.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
           con.cerrarConexion();
       }
              return false; 
    }

    @Override
    public rolesDTO listarUno(Object key) {
       
           PreparedStatement ps;
           ResultSet res;
           rolesDTO r= null;
           try {
           ps=con.getCnn().prepareStatement(SQL_LISTARUNO);
           ps.setString(1, key.toString());
           
           res= ps.executeQuery();
           while (res.next()){
               r = new rolesDTO(res.getInt(1), res.getString(2));
           }
           return r;
       } catch (SQLException ex) {
           Logger.getLogger(rolesDAO.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
               con.cerrarConexion();
           }
           return r;
    }

    @Override
    public List<rolesDTO> listarTodo() {
       
           PreparedStatement ps;
           ResultSet res;
           ArrayList<rolesDTO> roles = new ArrayList();
          try {
           ps =con.getCnn().prepareStatement(SQL_LISTARTODO);
           res = ps.executeQuery();
           
           while (res.next()){
               roles.add(new rolesDTO(res.getInt(1),res.getString(2)));
           }
       } catch (SQLException ex) {
           Logger.getLogger(rolesDAO.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
           con.cerrarConexion();
       }
       
       return roles;         
    }
}


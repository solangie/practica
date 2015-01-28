/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.UsuarioDTO;
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
public class UsuarioDAO implements Usuario<UsuarioDTO>{
    
    private static final String SQL_INSERTAR = "insert into usuario (documento, nombre, apellido, correo,contraseña, idRol, idTelefono) value(?,?,?,?,?,?,?) ";
    private static final String SQL_ELIMINAR = "delete from usuarios where documento = ?";
    private static final String SQL_MODIFICAR ="update usuarios set idTelefono = ?,idRol = ?,contraseña = ?,correo = ?,apellido = ?,nombre = ? ,where documento = ?";
    private static final String SQL_LISTARUNO = "select * from usuario where documento =?";
    private static final String SQL_LISTARTODO = "select * from usuarios";
    
    private static final conexion con = conexion.saberEstado();
 
    @Override
    public boolean crear(UsuarioDTO ob) {
        PreparedStatement ps;
        
        try{
        ps=con.getCnn().prepareStatement(SQL_INSERTAR);
        ps.setDouble(1, ob.getDocumento());
        ps.setString(2, ob.getNombre());
        ps.setString(3, ob.getApellido());
        ps.setString(4, ob.getCorreo());
        ps.setString(5, ob.getContraseña());
        ps.setInt(6, ob.getIdRol());
        ps.setInt(7, ob.getIdTelefono());
        
        
            if(ps.executeUpdate()>0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
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
        
        
            if(ps.executeUpdate()>0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            con.cerrarConexion();
        }
       return false;
    }

    @Override
    public boolean modificar(UsuarioDTO ob) {
        try {
            PreparedStatement ps;
            ps=con.getCnn().prepareStatement(SQL_MODIFICAR);
            
            ps.setInt(1, ob.getIdTelefono());
            ps.setInt(2, ob.getIdRol());
            ps.setString(3, ob.getContraseña());
            ps.setString(4, ob.getCorreo());
            ps.setString(5, ob.getApellido());
            ps.setString(6, ob.getNombre());
            ps.setDouble(7, ob.getDocumento());
            
            if(ps.executeUpdate() >0){
                return true; 
            }} catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            con.cerrarConexion();
        }
        return false;
    }

    @Override
    public UsuarioDTO listarUno(Object key) {
       
            PreparedStatement ps;
            ResultSet res;
            UsuarioDTO u = null;
            try {
            ps = con.getCnn().prepareStatement(SQL_LISTARUNO);
            ps.setString(1,key.toString());
            
            res = ps.executeQuery();
            
            while (res.next()){
            u = new UsuarioDTO(res.getDouble(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getInt(6), res.getInt(7));
            }
            return u;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            con.cerrarConexion();
        }
          return u;  
    }

    @Override
    public List<UsuarioDTO> listarTodo() {
        
            PreparedStatement ps;
            ResultSet res;
            ArrayList<UsuarioDTO> usuarios = new ArrayList();
         
         try {
            ps = con.getCnn().prepareStatement(SQL_LISTARTODO);
            res = ps.executeQuery();
            
            while (res.next()){
                usuarios.add(new UsuarioDTO(res.getDouble(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getInt(6), res.getInt(7)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            con.cerrarConexion();
        }
         return usuarios;
    }
    
}
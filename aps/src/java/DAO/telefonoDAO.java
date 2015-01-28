/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import DTO.telefonoDTO;
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
 * @author Home
 */
public class telefonoDAO implements Usuario<telefonoDTO>{
    private static final String SQL_INSERTAR = "insert into telefonos (idTelefono, descripcion, numero) value(?,?,?) ";
    private static final String SQL_ELIMINAR = "delete from telefonos where idTelefono = ?";
    private static final String SQL_MODIFICAR ="update telefonos set idTelefono = ?,descripcion = numero = ?";
    private static final String SQL_LISTARUNO = "select * from telefonos where idTelefono =?";
    private static final String SQL_LISTARTODO = "select * from telefonos ";
    
    private static final conexion con = conexion.saberEstado();

    @Override
    public boolean crear(telefonoDTO ob) {
        try {
            PreparedStatement ps;
            
            ps=con.getCnn().prepareStatement(SQL_INSERTAR);
            ps.setInt(1, ob.getIdTelefono());
            ps.setString(2, ob.getDescripcion());
            ps.setInt(3, ob.getNumero());
            
            if(ps.executeUpdate()>0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(telefonoDAO.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(telefonoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            con.cerrarConexion();
        }
        return false;
    }

    @Override
    public boolean modificar(telefonoDTO ob) {
        try {
            PreparedStatement ps;
            ps=con.getCnn().prepareStatement(SQL_MODIFICAR);
            
            ps.setInt(1, ob.getNumero());
            ps.setString(2, ob.getDescripcion());
            ps.setInt(3, ob.getIdTelefono());
            
            if(ps.executeUpdate()>0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(telefonoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            con.cerrarConexion();
        }
            return false;
    }

    @Override
    public telefonoDTO listarUno(Object key) {
        
            PreparedStatement ps;
            ResultSet res;
            telefonoDTO tel=null;
            try {
            ps =con.getCnn().prepareStatement(SQL_LISTARUNO);
            ps.setString(1, key.toString());
            
            res=ps.executeQuery();
            while(res.next()){
                tel =new telefonoDTO(res.getInt(1), res.getString(2), res.getInt(3));
            }
            return tel;
            } catch (SQLException ex) {
            Logger.getLogger(telefonoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
                con.cerrarConexion();
            }
            return tel;
    }

    @Override
    public List<telefonoDTO> listarTodo() {
        
            PreparedStatement ps;
            ResultSet res;
            ArrayList<telefonoDTO> telefonos =new ArrayList();
            
            try {
            ps =con.getCnn().prepareStatement(SQL_LISTARTODO);
            res = ps.executeQuery();
            
            while (res.next()){
                telefonos.add(new telefonoDTO(res.getInt(1), res.getString(2), res.getInt(3)));
            }} catch (SQLException ex) {
            Logger.getLogger(telefonoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
                con.cerrarConexion();
            }
            return telefonos;
    }
}

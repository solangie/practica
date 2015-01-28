/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaces;

import java.util.List;



/**
 *
 * @author Home
 */
public interface Usuario <Objetos>{
    
    public boolean crear(Objetos ob);
    public boolean eliminar (Object key);
    public boolean modificar(Objetos ob);
    
    public Objetos listarUno(Object key);
    public List<Objetos> listarTodo();
    
    
}

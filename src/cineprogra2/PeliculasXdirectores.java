/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cineprogra2;

/**
 *
 * @author RICK LOPEZ
 */
public class PeliculasXdirectores {
    Conexion cn= new Conexion();
    public void Eliminar(int idP){
        cn.UID("delete from [peliculasxdirectores] where id="+idP+"");
    }
}

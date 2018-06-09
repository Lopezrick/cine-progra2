/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cineprogra2;

public class PeliculasXgenero {
    Conexion cn;
    public void insertar(int idP, int idGenero){
        cn.UID("INSERT INTO peliculasxgenero(idP,idGnero) VALUES (' " + idP + " ',' "+idGenero+"')");
    }
    public void eliminar(int codigo) {
        cn.UID("DELETE FROM peliculasxgenero WHERE idP='" + codigo + "'");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cineprogra2;

/**
 *
 * @author Ella no te ama;
 */
public class PeliculasXproductores {
    Conexion cn;
    public void insertar(int idP, int idProductor){
        cn.UID("INSERT INTO peliculasxproductores(idP,idProductora) VALUES (' " + idP + " ',' "+idProductor+"')");
    }
    public void eliminar(int codigo) {
        cn.UID("DELETE FROM peliculasxproductores WHERE idP=" + codigo + "");
    }
}

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
public class Descripcionpelicula {
   Conexion cn;
    public void insertar(int idP, int anio, int duracion){
        cn.UID("INSERT INTO descripcionpelicula(idP,anio,duracion) VALUES('" + idP + "','" + anio + "','" + duracion + "')" );
    }
    public void eliminar(int codigo) {
        cn.UID("DELETE FROM descripcionpelicula WHERE idP=" + codigo + "");
    }
}

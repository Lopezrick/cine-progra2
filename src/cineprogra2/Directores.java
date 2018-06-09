/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cineprogra2;

import java.sql.ResultSet;

/**
 *
 * @author Ella no te ama;
 */
public class Directores {
    Conexion cn = new Conexion();
   public ResultSet llenarDirectores(){
        return cn.getValores("SELECT * from directores"); 
    }       
    public void insertar(int id, String nombre, String apellidos){
        cn.UID("INSERT INTO directores(idD,nombre,apellidos) VALUES (' " + id + " ',' "+nombre+"',' " + apellidos + " ')");
    }
}

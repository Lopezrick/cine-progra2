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
public class Genero {
    Conexion cn= new Conexion();
    public ResultSet llenarGeneros(){
        return cn.getValores("SELECT * from genero"); 
    }
    public void insertar(int id, String nombre){
        cn.UID("INSERT INTO genero(idGenero,descripcion) VALUES (' " + id + " ',' "+nombre+"')");
    }
}

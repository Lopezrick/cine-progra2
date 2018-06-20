/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cineprogra2;

import java.sql.ResultSet;

/**
 *
 * @author Diferido de solidos...
 */
public class RegistroUsuarios {

    Conexion cn = new Conexion();

    public void Registro(String Usuario, String Contrasenia) {
        cn.UID("INSERT INTO usuarios(idUsuarios, Password) VALUES('" + Usuario + "','" + Contrasenia + "')");

    }

    public ResultSet ObtenerContra(String nom) {
        return cn.getValores("select Password from usuarios where idUsuarios='" + nom + "' ;");
    }
}

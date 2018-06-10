package cineprogra2;

import java.sql.ResultSet;

public class Pelicula {

   Conexion cn = new Conexion();

    public void insertarPeliCompleta(int idP, String titulo,int anio,String duracion,int idD, int idProductor,int idGenero) {
        cn.UID("INSERT INTO peliculas(idP,titulo) VALUES('" + idP + "','" + titulo + "')" );
    cn.UID("INSERT INTO descripcionpelicula(idP,anio,duracion) VALUES('" + idP + "','" + anio + "','" + duracion + "')" );
    cn.UID("INSERT INTO peliculasxgenero(idP,idGenero) VALUES('" + idP + "','" + idGenero + "')" );
    cn.UID("INSERT INTO peliculasxdirectores(idP,idD) VALUES('" + idP + "','" + idD + "')" );
    cn.UID("INSERT INTO peliculasxproductores(idP,idProductora) VALUES('" + idP + "','" + idProductor + "')" );
    
    }
    
}

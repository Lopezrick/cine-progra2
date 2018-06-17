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
    public ResultSet mostrarTodas(){
        return cn.getValores("SELECT peliculas.titulo, genero.descripcion, descripcionpelicula.anio, descripcionpelicula.duracion, productores.descripcion, directores.nombre, directores.apellidos FROM productores INNER JOIN ((((peliculas INNER JOIN descripcionpelicula ON peliculas.idP = descripcionpelicula.idP) INNER JOIN (directores INNER JOIN peliculasxdirectores ON directores.idD = peliculasxdirectores.idD) ON peliculas.idP = peliculasxdirectores.idP) INNER JOIN (genero INNER JOIN peliculasxgenero ON genero.idGenero = peliculasxgenero.idGenero) ON peliculas.idP = peliculasxgenero.idP) INNER JOIN peliculasxproductores ON peliculas.idP = peliculasxproductores.idP) ON productores.idProductora = peliculasxproductores.idProductora"); 
    }
}

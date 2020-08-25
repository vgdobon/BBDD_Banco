package com.clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDeDatos {

    public static Connection Conexion = null;

    //Conectar a la bbdd
    public static void conectarBD() throws SQLException, ClassNotFoundException {

        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://192.168.56.2/banco_db";
        String usuario = "banco";
        String clave = "620312786";
        Conexion = DriverManager.getConnection(url, usuario, clave);


    }
}


package com.estival.mensajes;

import java.sql.*;

public class Conexion {
    
    private static final String URL = "jdbc:mysql://localhost/mensajes_db?serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "1234";
    
    public static Connection getConexion() throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USER, PASS);
    }
    
    public static void cerrar(ResultSet rs) throws SQLException{
        rs.close();
    }
    
     public static void cerrar(PreparedStatement ps) throws SQLException{
        ps.close();
    }
     
      public static void cerrar(Connection cnn) throws SQLException{
        cnn.close();
    }
    
}


package com.estival.java_mensajes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        
       listarRegistros();
        //insertarRegistros("HOLA desde JAVA", "JHON MARIO");
        //editarRegistros("HOLA JAVA EDITADO", "JHON RESTREPO", 4);
        eliminarRegistros(5);
        listarRegistros();
        
    }
    
    static void listarRegistros() throws SQLException{
         Connection conectar = DriverManager.getConnection(
                "jdbc:mysql://localhost/mensajes_db?serverTimezone=UTC",
                "root",
                "1234"
        );
        
        System.out.println("Conexión Exitosa!!!!");
        
        String sql = "SELECT * FROM mensajes";
        
        PreparedStatement ps = conectar.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
            int id = rs.getInt("id_mensaje");
            String mensaje = rs.getString("mensaje");
            String autor = rs.getString("autor");
            String fecha = rs.getString("fecha");
            
            System.out.printf("%d %s %s %s\n", id, mensaje, autor, fecha);
        }
        
        rs.close();
        ps.close();
        conectar.close();
        
    }
    
    static void insertarRegistros(String mensaje, String autor) throws SQLException{
         Connection conectar = DriverManager.getConnection(
                "jdbc:mysql://localhost/mensajes_db?serverTimezone=UTC",
                "root",
                "1234"
        );
        
//        System.out.println("Conexión Exitosa!!!!");
        
        String sql = "INSERT INTO mensajes(mensaje, autor, fecha) VALUES (?,?, current_time())";
        
        PreparedStatement ps = conectar.prepareStatement(sql);
        ps.setString(1, mensaje);
        ps.setString(2, autor);
        ps.executeUpdate();
        ps.close();
        conectar.close();
        
    }
    
      static void editarRegistros(String mensaje, String autor, int id) throws SQLException{
         Connection conectar = DriverManager.getConnection(
                "jdbc:mysql://localhost/mensajes_db?serverTimezone=UTC",
                "root",
                "1234"
        );
        
//        System.out.println("Conexión Exitosa!!!!");
        
        String sql = "UPDATE mensajes SET mensaje= ?, autor=? WHERE id_mensaje = ?";
        
        PreparedStatement ps = conectar.prepareStatement(sql);
        ps.setString(1, mensaje);
        ps.setString(2, autor);
        ps.setInt(3, id);
        ps.executeUpdate();
        ps.close();
        conectar.close();
        
    }
      
       static void eliminarRegistros( int id) throws SQLException{
         Connection conectar = DriverManager.getConnection(
                "jdbc:mysql://localhost/mensajes_db?serverTimezone=UTC",
                "root",
                "1234"
        );
        
//        System.out.println("Conexión Exitosa!!!!");
        
        String sql = "DELETE FROM mensajes WHERE id_mensaje = ?";
        
        PreparedStatement ps = conectar.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
        ps.close();
        conectar.close();
        
    }
    
    
    
    
}

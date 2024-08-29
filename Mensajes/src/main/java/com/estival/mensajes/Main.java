
package com.estival.mensajes;

import java.sql.SQLException;
import java.util.List;


public class Main {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        Conexion.getConexion();
//        System.out.println("Conexion exitosa");
          
          MensajeDao mensajeDao = new MensajeDao();
          
//          Mensaje msm = new Mensaje("Buenas noches","Pedro");
//          int registro = mensajeDao.insertar(msm);
//          System.out.println("Se inserto "+ registro+ " registro");

//          Mensaje msm = new Mensaje(7, "Buenos dias","Camilo");
//          int registro = mensajeDao.editar(msm);
//          System.out.println("Se ha editado "+ registro+ " registro");

//          Mensaje msm = new Mensaje(8);
//          int registro = mensajeDao.eliminar(msm);
//          System.out.println("Se elimino "+ registro+ " registro");
          
          List<Mensaje> mensajes = mensajeDao.selccionar();
          
          
          
          for (Mensaje mensaje : mensajes) {
              System.out.println(mensaje);
        }
    }
    
}

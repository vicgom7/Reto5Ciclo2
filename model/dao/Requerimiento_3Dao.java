package reto4.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//Librerías para SQL y Base de Datos
import java.sql.SQLException;
//Estructura de datos
import java.util.ArrayList;

import reto4.model.vo.Requerimiento3;
import reto4.util.JDBCUtilities;

public class Requerimiento_3Dao {
    
    public ArrayList<Requerimiento3> rankingRequerimiento3() throws SQLException {
        // Su código
        ArrayList<Requerimiento3> respuesta = new ArrayList<Requerimiento3>();
        Connection conexion = JDBCUtilities.getConnection();

        try {

           String consulta =   "SELECT ID_Lider,Nombre , Primer_Apellido "+
                               "FROM Lider l "+
                               "WHERE Primer_Apellido like '%z' " +
                               "ORDER BY nombre ";
                               
           PreparedStatement statement = conexion.prepareStatement(consulta);
           ResultSet resultSet = statement.executeQuery();

           //recorrer los registros en los vo especificos
           while(resultSet.next()){
               Requerimiento3 Requerimiento3 = new Requerimiento3();
               Requerimiento3.setNombre(resultSet.getString("Nombre"));
               Requerimiento3.setPrimerApellido(resultSet.getString("Primer_Apellido"));
               Requerimiento3.setIdLider(resultSet.getInt("ID_Lider"));
               

               // se agrega cada registro como objeto del Arralist que contiene la consulta
               respuesta.add(Requerimiento3);
           }

           resultSet.close();
           statement.close();



        } catch (Exception e) {
            
            System.err.println ("Error consultando los lideres por nombre: "+e); 
       }finally{
           if (conexion != null) {
               conexion.close();
               
           }
       }
       //retornar la coleccion de vo's
       return respuesta;


   }

}

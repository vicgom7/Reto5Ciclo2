package reto4.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//Librerías para SQL y Base de Datos
import java.sql.SQLException;
//Estructura de datos
import java.util.ArrayList;

import reto4.model.vo.Requerimiento2;
import reto4.util.JDBCUtilities;

public class Requerimiento_2Dao {
    public ArrayList<Requerimiento2> rankingRequerimiento2() throws SQLException {
        // Su código
        ArrayList<Requerimiento2> respuesta = new ArrayList<Requerimiento2>();
        Connection conexion = JDBCUtilities.getConnection();

        try {

           String consulta =   "SELECT ID_Proyecto, Constructora, Ciudad, estrato "+
                               "FROM Proyecto p "+
                               "natural join Tipo t2 "+
                               "where Ciudad ='Cartagena' " +
                               "ORDER BY estrato ";
                               
           PreparedStatement statement = conexion.prepareStatement(consulta);
           ResultSet resultSet = statement.executeQuery();

           //recorrer los registros en los vo especificos
           while(resultSet.next()){
               Requerimiento2 Requerimiento2 = new Requerimiento2();
               Requerimiento2.setId_Proyecto(resultSet.getInt("ID_Proyecto"));
               Requerimiento2.setConstructora(resultSet.getString("Constructora"));
               Requerimiento2.setCiudad(resultSet.getString("Ciudad"));
               Requerimiento2.setEstrato(resultSet.getInt("estrato"));

               // se agrega cada registro como objeto del Arralist que contiene la consulta
               respuesta.add(Requerimiento2);
           }

           resultSet.close();
           statement.close();



        } catch (Exception e) {
            System.err.println ("Error consultando los proyectos por tipo: "+e); 
       }finally{
           if (conexion != null) {
               conexion.close();
               
           }
       }
       //retornar la coleccion de vo's
       return respuesta;


   }

}

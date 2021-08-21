package reto4.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//Librerías para SQL y Base de Datos
import java.sql.SQLException;
//Estructura de datos
import java.util.ArrayList;

import reto4.model.vo.requerimiento1;
import reto4.util.JDBCUtilities;

public class requerimiento_1Dao {
    
    public ArrayList<requerimiento1> rankingrequerimiento1() throws SQLException {
         // Su código
         ArrayList<requerimiento1> respuesta = new ArrayList<requerimiento1>();
         Connection conexion = JDBCUtilities.getConnection();

         try {

            String consulta =   "SELECT ID_Lider, Nombre, Primer_Apellido, salario "+
                                "FROM Lider l "+
                                "WHERE Salario <= 500000 " +
                                "ORDER BY salario ";
                                
            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();

            //recorrer los registros en los vo especificos
            while(resultSet.next()){
                requerimiento1 requerimiento1 = new requerimiento1();
                requerimiento1.setNombre(resultSet.getString("Nombre"));
                requerimiento1.setPrimerApellido(resultSet.getString("Primer_Apellido"));
                requerimiento1.setIdLider(resultSet.getInt("ID_Lider"));
                requerimiento1.setSalario(resultSet.getInt("salario"));

                // se agrega cada registro como objeto del Arralist que contiene la consulta
                respuesta.add(requerimiento1);
            }

            resultSet.close();
            statement.close();



         } catch (Exception e) {
             
             System.err.println ("Error consultando los lideres por salario: "+e); 
        }finally{
            if (conexion != null) {
                conexion.close();
                
            }
        }
        //retornar la coleccion de vo's
        return respuesta;


    }
    
}
package reto4.controller;

//Librerías para bases de datos
import java.sql.SQLException;
//Estructuras de datos (colecciones)
import java.util.ArrayList;

import reto4.model.dao.requerimiento_1Dao;
import reto4.model.vo.requerimiento1;
import reto4.model.dao.Requerimiento_2Dao;
import reto4.model.vo.Requerimiento2;
import reto4.model.dao.Requerimiento_3Dao;
import reto4.model.vo.Requerimiento3;

public class ControladorRequerimientosReto4 {       
    //Su codigo
    private final requerimiento_1Dao Requerimiento_1Dao;
    private final Requerimiento_2Dao Requerimiento_2Dao;
    private final Requerimiento_3Dao Requerimiento_3Dao;

    public ControladorRequerimientosReto4(){
        //Su codigo
        this.Requerimiento_1Dao = new requerimiento_1Dao();
        this.Requerimiento_2Dao = new Requerimiento_2Dao();
        this.Requerimiento_3Dao = new Requerimiento_3Dao();
    }

    public ArrayList<requerimiento1> consultarequerimiento1() throws SQLException {
        //Su codigo
        return this.Requerimiento_1Dao.rankingrequerimiento1();
    }
      
    public ArrayList<Requerimiento2> consultarRequerimiento_2() throws SQLException {
        //Su codigo
        return this.Requerimiento_2Dao.rankingRequerimiento2();
    }

    public ArrayList<Requerimiento3> consultarRequerimiento_3() throws SQLException {
        //Su codigo
        return this.Requerimiento_3Dao.rankingRequerimiento3();
    }
 
}

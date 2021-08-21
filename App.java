package reto4;

import reto4.view.VistaRequerimientoReto4;

import java.awt.EventQueue;

public class App {
    public static void main( String[] args ){        

        EventQueue.invokeLater(new Runnable(){
            public void run(){
                try {
                    VistaRequerimientoReto4 frame = new VistaRequerimientoReto4();    
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }             
            } 
        });

        //Casos de prueba 

        //Requerimiento 1 - Reto3
       /* VistaRequerimientoReto4.requerimiento1();
        System.out.println();

        //Requerimiento 2 - Reto3
         VistaRequerimientoReto4.requerimiento2();
         System.out.println();

        //Requerimiento 5 - Reto3
        VistaRequerimientoReto4.requerimiento3();
        System.out.println();*/


    }

}

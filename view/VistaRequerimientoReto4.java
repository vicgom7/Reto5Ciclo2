package reto4.view;

import java.sql.SQLException;
import java.util.ArrayList;

import reto4.controller.ControladorRequerimientosReto4;
import reto4.model.vo.requerimiento1;
import reto4.model.vo.Requerimiento2;
import reto4.model.vo.Requerimiento3;

import javax.swing.*;
import java.awt.event.*;

public class VistaRequerimientoReto4 extends JFrame{
    
    public static final ControladorRequerimientosReto4 controlador = new ControladorRequerimientosReto4();

    private JPanel contentPane;
    private static JTextArea areaDeTexto;

    public VistaRequerimientoReto4(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 100, 800, 600);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel etiqueta = new JLabel("SOLUCION RETO 5 / CICLO 2");
        etiqueta.setBounds(350, 5, 200, 20);
        contentPane.add(etiqueta);

        JScrollPane barra = new JScrollPane();
        barra.setBounds(155, 30, 600, 500);
        contentPane.add(barra);

        areaDeTexto = new JTextArea();
        barra.setViewportView(areaDeTexto);

        JButton Botonrq1 = new JButton("Requerimiento 1");
        Botonrq1.addActionListener(new ActionListener(){        
            @Override            
            public void actionPerformed(ActionEvent e){
                requerimiento1();
            }
        });
        Botonrq1.setBounds(10,100,130,25);
        contentPane.add(Botonrq1);

        JButton BotonLimpiar = new JButton("Limpiar");
        BotonLimpiar.addActionListener(new ActionListener(){
            @Override            
            public void actionPerformed(ActionEvent e){
                areaDeTexto.setText("");
            }
        });
        BotonLimpiar.setBounds(10,220,130,25);
        contentPane.add(BotonLimpiar);

        JButton Botonrq2 = new JButton("Requerimiento 2");
        Botonrq2.addActionListener(new ActionListener(){        
            @Override            
            public void actionPerformed(ActionEvent e){
                requerimiento2();
            }
        });
        Botonrq2.setBounds(10,140,130,25);
        contentPane.add(Botonrq2);

        JButton Botonrq3 = new JButton("Requerimiento 3");
        Botonrq3.addActionListener(new ActionListener(){        
            @Override            
            public void actionPerformed(ActionEvent e){
                requerimiento3();
            }
        });
        Botonrq3.setBounds(10,180,130,25);
        contentPane.add(Botonrq3);

    }




    public static void requerimiento1 (){
        
        //System.out.println("*** Lideres por Salario ***");

        try{
            
            ArrayList<requerimiento1> rankingrequerimiento1 = controlador.consultarequerimiento1();

            String salida = "\t\t\t*** Lideres por Salario ***\n\n\tNombre\tPrimer Apellido\t\tId del Lider\tSalario\n\n";

            for (requerimiento1 requerimiento1 : rankingrequerimiento1) {
                //System.out.printf("El Lider %s %s con Id %d Tiene un salario de %d %n",
                salida += "\t";
                salida += requerimiento1.getNombre();
                salida += "\t";
                salida += requerimiento1.getPrimerApellido();
                salida += "\t";
                salida += "\t";
                salida += requerimiento1.getIdLider();
                salida += "\t";
                salida += requerimiento1.getIdSalario();
                salida += "\n";
                }
                areaDeTexto.setText(salida);

        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }

    public static void requerimiento2 (){     

        //System.out.println("*** Proyectos por Tipo ***");

        try{
            // su codigo
            ArrayList<Requerimiento2> rankingRequerimiento2 = controlador.consultarRequerimiento_2();

            String salida = "\t\t\t*** Proyectos por Tipo ***\n\n\tId Proyecto\tConstructora\t\tCiudad\tEstrato\n\n";

            for (Requerimiento2 Requerimiento2 : rankingRequerimiento2) {
                //System.out.printf("El proyecto con ID %d de la constructora: %s de la ciudad %s, tiene un estrato asignado igual a %d %n",
                salida += "\t";
                salida += Requerimiento2.getId_Proyecto();
                salida += "\t";
                salida += Requerimiento2.getConstructora();
                
                if (Requerimiento2.getConstructora().equals("Pegaso")) {
                    salida += "\t";
                    salida += "\t";
                } else {
                    salida += "\t";
                }
                
                salida += Requerimiento2.getCiudad();
                salida += "\t";
                salida += Requerimiento2.getEstrato();
                salida += "\n";
                }
                areaDeTexto.setText(salida);
        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }


   public static void requerimiento3 (){
        //System.out.println("*** Lideres por Nombre ***");

        try{
              // su codigo    
              ArrayList<Requerimiento3> rankingRequerimiento3 = controlador.consultarRequerimiento_3();
            
              String salida = "\t\t*** Lideres por Nombre ***\n\n\tId Lider\tNombre\tPrimerNombre\n\n";
            
              for (Requerimiento3 Requerimiento3 : rankingRequerimiento3) {
                //System.out.printf("El Lider con Id %d se llama %s %s %n",
                salida += "\t";
                salida += Requerimiento3.getIdLider();
                salida += "\t";
                salida += Requerimiento3.getNombre();
                salida += "\t";
                salida += Requerimiento3.getPrimerApellido();
                salida += "\n";
                }
                areaDeTexto.setText(salida);
            }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
            }
        }

}
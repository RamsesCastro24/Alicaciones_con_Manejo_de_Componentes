/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import modelo.modelo;
import vista.vista;

public class controlador implements ActionListener{
    private vista vis;
    private modelo mod;
    modelo drawArea;
    String seleccion = "Cuadrado";
    String rellenado = "No";
    
    public controlador(vista view, modelo model){
        this.vis = view;
        this.mod = model;
//         this.vis.clear.setActionCommand("Limpiar");
        this.vis.combo.addActionListener(this);
//         this.view.saveJButton.addActionListener(this);
    
    }

    public void iniciar(modelo drawArea) {
        if(drawArea == null){
            drawArea = new modelo();
        }
        vis.show(drawArea);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
//        Graphics g = null;
//    String aux = e.getActionCommand();
//
//        switch (aux) {
//            case "Limpiar":
//                mod.clear(g);
//                
//
//                break;
//        }
        
//          if (e.getSource()== vis.clear) {
//    mod.clear();
//    }else if(e.getSource()==vis.blackBtn){
//    mod.black();    
//   }else if(e.getSource()==vis.blueBtn){
//    mod.blue();    
//  }else if(e.getSource()==vis.greenBtn){
//    mod.green();    
//  }else if(e.getSource()==vis.redBtn){
//    mod.red();    
//   }else if(e.getSource()==vis.magentaBtn){
//    mod.magenta();
//    }else if(e.getSource()==vis.cuadradoBtn){
//    mod.cuadrado();    
//   }else if(e.getSource()==vis.circuloBtn){
//    mod.circulo();    
//   }
       vis.combo.addItemListener(
            new ItemListener(){
                public void itemStateChanged( ItemEvent evento )
                {
                     if ( evento.getStateChange() == ItemEvent.SELECTED ){
                         //seleccion = view.combo.getSelectedItem().toString();
                         seleccion = "Linea";
                     }
                }
            }
        );
    }
}

package Test;

import controlador.controlador;
 import modelo.modelo;
import vista.vista;

public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

   modelo model = new modelo();
    vista vis = new vista();
    controlador con = new controlador(vis, model);
    con.iniciar(null);
  }
}

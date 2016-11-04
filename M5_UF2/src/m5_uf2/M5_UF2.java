/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m5_uf2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MarcosPortatil
 */
public class M5_UF2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Treballador[] treballadors = new Treballador[3];
        for (int i = 0; i < treballadors.length; i++) {
            try {
                treballadors[i] = new Treballador("Treballador " + i, 0, 2000F, 10F);
            } catch (datosIncorrectos ex) {
                Logger.getLogger(M5_UF2.class.getName()).log(Level.SEVERE, null, ex);
            }
           
            
        }
        System.out.println(CostPersonal.costDelPersonal(treballadors));
    }

}

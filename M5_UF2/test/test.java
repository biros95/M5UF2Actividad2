/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.junit.Assert.*;

/**
 *
 * @author MarcosPortatil
 */
import org.junit.Test;
import m5_uf2.*;

/**
 *
 * @author MarcosPortatil
 */
public class test {

    @Test(expected = datosIncorrectos.class) //PRUEBA DEL CODIGO COSTPERSONAL
    public void testDirectius() throws datosIncorrectos {
        Treballador treballadors[] = new Treballador[3];

        treballadors[0] = new Treballador("Nom1", Treballador.DIRECTOR, -3000, 0);
        treballadors[1] = new Treballador("Nom2", Treballador.SUBDIRECTOR, 2000, 5);
        treballadors[2] = new Treballador("Nom3", Treballador.SUBDIRECTOR, 2500, 10);

        float cost = CostPersonal.costDelPersonal(treballadors);
        assertEquals("Error en el càlcul del cost!", 7500, cost, 0);
         
    }
    
    
    
    @Test //PRUEBA DEL CODIGO COSTPERSONAL UNA VEZ REFACTORIZADO EL CODIGO
    public void provarDirectiu() throws datosIncorrectos{
        assertTrue(CostPersonal.esDirectiu(new Treballador("MARCOS", Treballador.DIRECTOR, 2000F, 10F)));
    }
    
    
    @Test //PRUEBA DEL CODIGO COSTPERSONAL UNA VEZ REFACTORIZADO EL CODIGO
    public void provarDirectiuFalse() throws datosIncorrectos{
        assertFalse(CostPersonal.esDirectiu(new Treballador("MARCOS", Treballador.OPERARI, 2000F, 10F)));
    }

}

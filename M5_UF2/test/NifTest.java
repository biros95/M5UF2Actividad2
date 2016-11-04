/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import m5_uf2.Nif;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sergi
 */
public class NifTest {

    public NifTest() {
        
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test del mètode esValid amb un NIF válid.
     */
    @Test
    public void testDNIValido2() {
        System.out.println("valido!");
        Nif instance = new Nif("53837779T");        
        assertEquals(true, instance.esValid());
    }

    /**
     * Test del mètode esValid amb un NIF amb lletra errónea.
     */
    @Test
    public void testDNIvalido() {
        System.out.println("VALIDO!");
        Nif instance = new Nif("53837779S");
        boolean expResult = false;
        boolean result = instance.esValid();
        assertEquals(expResult, result);
    }

    /**
     * Test del mètode esValid amb un NIF incomplet.
     */
    @Test
    public void testDNIValido3() {
        System.out.println("VALIDO!");
        Nif instance = new Nif("538Q");
        boolean expResult = false;
        boolean result = instance.esValid();
        assertEquals(expResult, result);
    }

}

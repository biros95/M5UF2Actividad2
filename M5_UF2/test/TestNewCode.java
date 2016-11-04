/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import m5_uf2.Directiu;
import m5_uf2.Operari;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MarcosPortatil
 */
public class TestNewCode {

    public TestNewCode() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void calcularNominaOperari() {
        Directiu d = new Directiu("N", 2000F);
        Operari o = new Operari("N", 2000F, 2F);
        assertEquals(2000F, d.getNomina(), 0);
        assertEquals(2040F, o.getNomina(), 0);

    }

    @Test
    public void calcularNominaDirectiu() {

    }
}

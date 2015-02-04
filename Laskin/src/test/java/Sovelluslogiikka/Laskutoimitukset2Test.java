package Sovelluslogiikka;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author saves
 */
/**
 * Luokka tarjoaa Laskutoimitukset2 luokan testejä
 * Tällä hetkellä testaa vain konstruktoria
 */
public class Laskutoimitukset2Test {
    Laskutoimitukset2 piirtaja;
    
    public Laskutoimitukset2Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        piirtaja = new Laskutoimitukset2();
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
    public void konstruktoriToimii() {
        assertEquals("k on: 0 b on: 0", piirtaja.toString());
    }
     
     
}

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
 * Luokka tarjoaa useita Laskutoimitukset luokan testejä
 */
public class LaskutoimituksetTest {
    
    Laskutoimitukset laskin;
    Laskutoimitukset laskin2;
    Laskutoimitukset laskin3;
    
    public LaskutoimituksetTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
       
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         laskin = new Laskutoimitukset(2.0);
    }
    
    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void hello() {}
     
     
     @Test
    public void plussausToimiiOikein() {
        laskin.plussa(2);
        assertEquals("Luku on 4.0", laskin.toString());
    }
     @Test
    public void miinustusToimiiOikein() {
        laskin.miinus(2);
        assertEquals("Luku on 0.0", laskin.toString());
    }
     @Test
    public void kertominenToimiiOikein() {
        laskin.kertolasku(2);
        assertEquals("Luku on 4.0", laskin.toString());
    }
     @Test
    public void jakaminenToimiiOikein() {
        laskin.jakolasku(1);
        assertEquals("Luku on 2.0", laskin.toString());
    }
     
     @Test
    public void toiseenPotenssiinToimiiOikein() {
        laskin.toiseenpotenssiin(2);
        assertEquals("Luku on 4.0", laskin.toString());
    }
     @Test
    public void neliojuuriToimiiOikein() {
        laskin2 = new Laskutoimitukset(0.0);
        laskin2.neliojuuri(4);
        assertEquals("Luku on 2.0", laskin.toString());
    }
     @Test
    public void nollausToimiiOikein() {
        laskin.nollaus();
        assertEquals("Luku on 0.0", laskin.toString());
    }
     @Test
    public void tulosToimiiOikein() {
        laskin.tulos();
        assertEquals("Luku on 2.0", laskin.toString());
    }
     @Test
    public void siniToimii() {
        laskin3 = new Laskutoimitukset(0.0);
        laskin3.sin(1);
        assertEquals("Luku on 0.8414709848078965", laskin3.toString());
    }
     @Test
    public void cosiniToimii1() {
        laskin3 = new Laskutoimitukset(0.0);
        laskin3.cos(1);
        assertEquals("Luku on 0.5403023058681398", laskin3.toString());
    }
      @Test
    public void cosiniToimii2() {
        laskin3 = new Laskutoimitukset(0.0);
        laskin3.cos(0);
        assertEquals("Luku on 1.0", laskin3.toString());
    }
     @Test
    public void tanToimii() {
        laskin3 = new Laskutoimitukset(0.0);
        laskin3.tan(1);
        assertEquals("Luku on 1.5574077246549023", laskin3.toString());
    }
     
}

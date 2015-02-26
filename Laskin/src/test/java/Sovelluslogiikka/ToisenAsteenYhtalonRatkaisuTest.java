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
public class ToisenAsteenYhtalonRatkaisuTest {

    ToisenAsteenYhtalonRatkaisu tayr;

    public ToisenAsteenYhtalonRatkaisuTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        tayr = new ToisenAsteenYhtalonRatkaisu();
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
    public void toisenAsteenYhtalonRatkaisuToimiiOikein1() {
        tayr.ratkaise(-3, 6, -3);
        assertEquals("x1: 1.0 ja x2: 1.0", tayr.toString());
    }

    @Test
    public void toisenAsteenYhtalonRatkaisuToimiiOikein2() {
        tayr.ratkaise(1, 2, -3);
        assertEquals("x1: 1.0 ja x2: -3.0", tayr.toString());
    }
}

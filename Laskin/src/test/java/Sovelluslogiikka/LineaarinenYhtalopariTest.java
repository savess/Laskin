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
 * Luokka tarjoaa LineaarinenYhtalopari luokan testejä
 */
public class LineaarinenYhtalopariTest {

    LineaarinenYhtalopari ly;

    public LineaarinenYhtalopariTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        ly = new LineaarinenYhtalopari();
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
    public void lineaarisenYhtaloparinRatkaisuToimiiOikein1() {
        ly.ratkaise(2, 3, 1, -1, 5, 5);
        assertEquals("x: 4.0 ja y: -1.0", ly.toString());
    }

    @Test
    public void lineaarisenYhtaloparinRatkaisuToimiiOikein2() {
        ly.ratkaise(10, 1, 1, 10, 4, 7);
        assertEquals("x: 0.3333333333333333 ja y: 0.6666666666666666", ly.toString());
    }

    @Test
    public void lineaarisenYhtaloparinRatkaisunElseToimiiOikein() {
        ly.ratkaise(1, 0, 1, 0, 1, 0);
        assertEquals("x: 0.0 ja y: 0.0", ly.toString());
    }
}

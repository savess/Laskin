package laskin.testaus;

/**
 *
 * @author saves
 */
public class Testausta {
    public static int ketjumaara(int n) {
        int ve = 3;
        int tulos = 4;

        for (int i = 1; i < n; i++) {
            tulos *= ve;
            
        }
        return tulos;
    }
    
}

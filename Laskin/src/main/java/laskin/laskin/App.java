package laskin.laskin;

import Kayttoliittyma.FunktionKuvaaja;
import Kayttoliittyma.Laskin;
import Sovelluslogiikka.LineaarinenYhtalopari;
import javax.swing.SwingUtilities;

/**
 * Hello world!
 *
 */
/**
 * Main luokka josta laskin käynnistetään
 */
public class App {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Laskin());

        LineaarinenYhtalopari ly = new LineaarinenYhtalopari();
        ly.ratkaise(1, 0, 1, 0, 1, 0);
        ly.ratkaise(10, 1, 1, 10, 4, 7);

        FunktionKuvaaja funktionkuvaaja = new FunktionKuvaaja(0, 0, 1, 1);
        funktionkuvaaja.run();

    }
}

package laskin.laskin;

import Kayttoliittyma.FunktionKuvaaja;
import Kayttoliittyma.Laskin;
import Sovelluslogiikka.LineaarinenYhtalopari;
import Sovelluslogiikka.ToisenAsteenYhtalonRatkaisu;
import java.util.Scanner;
import javax.swing.SwingUtilities;

/**
 * Hello world!
 *
 */
/**
 * Main luokka josta laskin käynnistetään
 */
public class App {

    static Scanner lukija = new Scanner(System.in);
    private static double a;
    private static double b;
    private static double c;
    private static double a2;
    private static double b2;
    private static double c2;
    private static double d;
    private static double e;
    private static double f;

    public static void main(String[] args) {


        String kasky = "";
        System.out.println("OHJEITA:");
        System.out.println("Anna käskyksi laskin, jos haluat laskea yksinkertaisia laskuja. Graafinen");
        System.out.println("Anna käskyksi tayr, jos haluat ratkaista toiseen asteen yhtälön. Teksti");
        System.out.println("Anna käskyksi yhtälöpari, jos haluat ratkoa yhtälöpareja. Teksti");
        System.out.println("Anna käskyksi kuvaaja, jos haluat piirtää funktion kuvaajan. Teksti/Graafinen");
        System.out.println("");
        System.out.print("Anna käsky: ");
        kasky = lukija.nextLine();
        System.out.println("");




        if (kasky.equals("laskin")) {
            SwingUtilities.invokeLater(new Laskin());
        } else if (kasky.equals("yhtälöpari")) {
            System.out.println("Yhtälöpari koostuu kahdesta yhtölästä jotka ovat: ax + by = e ja cx + y = f");
            System.out.println("");
            System.out.println("Syötä a, b, c, d, e ja f: ");
            a2 = lukija.nextDouble();
            b2 = lukija.nextDouble();
            c2 = lukija.nextDouble();
            d = lukija.nextDouble();
            e = lukija.nextDouble();
            f = lukija.nextDouble();
            LineaarinenYhtalopari ly = new LineaarinenYhtalopari();
            ly.ratkaise(a2, b2, c2, d, e, f);
        } else if (kasky.equals("kuvaaja")) {
            System.out.println("Tällä hetkellä vain koordinaatiston piirto haluttuun kokoon/tarkkuuteen toimii.");
            FunktionKuvaaja funktionkuvaaja = new FunktionKuvaaja(0, 0, 1, 1);
            funktionkuvaaja.run();
        } else if (kasky.equals("tayr")) {
            System.out.println("Toisen asteen yhtelö muotoa: ax^2 + bx + c");
            System.out.print("Anna a: ");
            a = Double.parseDouble(lukija.nextLine());
            System.out.print("Anna b: ");
            b = Double.parseDouble(lukija.nextLine());
            System.out.print("Anna c: ");
            c = Double.parseDouble(lukija.nextLine());
            System.out.println("Ratkaisu:");
            ToisenAsteenYhtalonRatkaisu tayr = new ToisenAsteenYhtalonRatkaisu();
            tayr.ratkaise(a, b, c);
        } else {
            System.out.println("Et antanut kunnollista käskyä, käynnistä ohjelma uudelleen.");
        }

    }
}

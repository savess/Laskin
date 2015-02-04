package Kayttoliittyma;

import Sovelluslogiikka.Laskutoimitukset2;
import javax.swing.JPanel;
import java.awt.*;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author saves
 */
/**
 * Luokka tarjoaa lineaarisen funktion kuvaajan käyttöliittymän (Sovelluslogiikka Laskutoimitukset)
 * Tällä hetkellä vain koordinaatiston piirto onnistuu
 */
public class FunktionKuvaaja extends JPanel {

    static Scanner lukija = new Scanner(System.in);
    int ikkunanKoko;
    static double koordinaatistonKoko;
    private int xlahto;
    private int ylahto;
    private int yloppu;
    private int xloppu;
    int koo;
    int bee;

    /**
     *
     * @param i
     * @param k
     * @param b
     * @param k
     */
    public FunktionKuvaaja(int i, double k, int b, int kk) {
        ikkunanKoko = i;
        koordinaatistonKoko = k;
        bee = b;
        koo = kk;
        setPreferredSize(new Dimension(ikkunanKoko, ikkunanKoko));
    }

    public void run() {

        System.out.print("Ikkunan koko: ");
        int size = Integer.parseInt(lukija.nextLine());
        System.out.print("Koordinaatiston koko/tarkkuus: ");
        double value = lukija.nextDouble();
        lukija.nextLine();





        JFrame frame = new JFrame("FunktionKuvaaja");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FunktionKuvaaja panel = new FunktionKuvaaja(size, value, bee, koo);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawLine(ikkunanKoko / 2, 0, ikkunanKoko / 2, ikkunanKoko);
        g.drawLine(0, ikkunanKoko / 2, ikkunanKoko, ikkunanKoko / 2);
        double[] a = x();
        int x = ikkunanKoko / 10, y = ikkunanKoko / 2, vA = 8;
        g.setFont(new Font("Sansserif", Font.PLAIN, ikkunanKoko / 30));
        for (int i = 0; i < 9; i++) {
            g.drawLine(x, y + 5, x, y - 5);
            if (i != 4 && vA != 4) {
                if (i > 4) {
                    g.drawString(a[i] + "", x - ikkunanKoko / 40, y + ikkunanKoko / 21);
                } else {
                    g.drawString(a[i] + "", x - ikkunanKoko / 30, y + ikkunanKoko / 21);
                }
                if (vA > 4) {
                    g.drawString(a[vA] + "", y - ikkunanKoko / 13, x + ikkunanKoko / 60);
                } else {
                    g.drawString(a[vA] + "", y - ikkunanKoko / 12, x + ikkunanKoko / 60);
                }
            }
            g.drawLine(y + 5, x, y - 5, x);
            x += ikkunanKoko / 10;
            vA--;

        }

        // piirtäminen ei toimi
        g.setColor(Color.BLUE);
        ylahto = koo * 0 + bee;
        xlahto = 0;
        yloppu = koo * 400 + bee;
        xloppu = 400;
        g.drawLine(xlahto, ylahto, xloppu, yloppu);



    }

    private static double[] x() {
        double increment = koordinaatistonKoko / 5, tamanhetkinena = -1 * (koordinaatistonKoko);
        double[] a = new double[9];
        for (int i = 0; i < 9; i++) {
            tamanhetkinena += increment;
            a[i] = Math.round(tamanhetkinena * 100.0) / 100.0;
        }
        return a;
    }
}

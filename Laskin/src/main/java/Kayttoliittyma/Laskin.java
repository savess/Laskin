package Kayttoliittyma;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author saves
 */
/**
 * Luokka tarjoaa käyttöliittymän Laskimelle, Sovelluslogiikan Laskutoimitus
 * luokalle
 */
public class Laskin implements Runnable {

    private JFrame jframe;

    @Override
    public void run() {
        jframe = new JFrame("Laskin");
        jframe.setPreferredSize(new Dimension(350, 250));
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        luoKomponentit(jframe.getContentPane());

        jframe.pack();
        jframe.setVisible(true);
    }

    private void luoKomponentit(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        jframe.setLayout(layout);

        JTextField tulostekstikentta = new JTextField("0");
        container.add(tulostekstikentta);
        tulostekstikentta.setEnabled(false);

        JTextField syotetekstikentta = new JTextField("");
        container.add(syotetekstikentta);


        JButton plussa = new JButton("+");
        JButton miinus = new JButton("-");
        JButton kertomerkki = new JButton("*");
        JButton jakomerkki = new JButton("/");
        JButton neliojuuri = new JButton("√");
        JButton kuutiojuuri = new JButton("sqrt3");
        JButton potenssi = new JButton("x²");
        JButton sin = new JButton("sin");
        JButton cos = new JButton("cos");
        JButton tan = new JButton("tan");
        JButton nollaus = new JButton("Z");


        nollaus.setBackground(Color.darkGray.brighter());


        Kuuntelija kuuntelija = new Kuuntelija(plussa, miinus, kertomerkki, jakomerkki, neliojuuri, kuutiojuuri,
                potenssi, sin, cos, tan, nollaus, tulostekstikentta, syotetekstikentta);
        plussa.addActionListener(kuuntelija);
        miinus.addActionListener(kuuntelija);
        kertomerkki.addActionListener(kuuntelija);
        jakomerkki.addActionListener(kuuntelija);
        neliojuuri.addActionListener(kuuntelija);
        kuutiojuuri.addActionListener(kuuntelija);
        potenssi.addActionListener(kuuntelija);
        sin.addActionListener(kuuntelija);
        cos.addActionListener(kuuntelija);
        tan.addActionListener(kuuntelija);
        nollaus.addActionListener(kuuntelija);
        nollaus.setEnabled(false);

        JPanel panel = new JPanel(new GridLayout(3, 3));
        panel.add(plussa);
        panel.add(miinus);
        panel.add(kertomerkki);
        panel.add(jakomerkki);
        panel.add(neliojuuri);
        panel.add(kuutiojuuri);
        panel.add(potenssi);
        panel.add(sin);
        panel.add(cos);
        panel.add(tan);
        panel.add(nollaus);

        container.add(panel);
    }
}

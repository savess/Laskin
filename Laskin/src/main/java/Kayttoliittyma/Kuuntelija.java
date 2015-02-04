package Kayttoliittyma;

import Sovelluslogiikka.Laskutoimitukset;
import Sovelluslogiikka.Laskutoimitukset2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author saves
 */
/**
 * Luokka kuuntelee Laskinta
 */
public class Kuuntelija implements ActionListener {
    private JButton plussa;
    private JButton miinus;
    private JButton kertomerkki;
    private JButton jakomerkki;
    private JButton neliojuuri;
    private JButton prosentti;
    private JButton potenssi;
    private JButton sin;
    private JButton cos;
    private JButton tan;
    private JButton tulos;
    private JButton nollaus;
    private JTextField tulostekstikentta;
    private JTextField syotetekstikentta; 
    private Laskutoimitukset laskutoimitukset;
    
    
    
    Kuuntelija(JButton plussa, JButton miinus, JButton kertomerkki, JButton jakomerkki,
            JButton neliojuuri, JButton prosentti, JButton potenssi, JButton sin, JButton cos, JButton tan,
            JButton tulos, JButton nollaus, 
            JTextField tulostekstikentta, JTextField syotetekstikentta) {
        this.plussa = plussa;
        this.miinus = miinus;
        this.kertomerkki = kertomerkki;
        this.jakomerkki = jakomerkki;
        this.neliojuuri = neliojuuri;
        this.prosentti = prosentti;
        this.potenssi = potenssi;
        this.sin = sin;
        this.cos = cos;
        this.tan = tan;
        this.tulos = tulos;
        this.nollaus = nollaus;
        this.tulostekstikentta = tulostekstikentta;
        this.syotetekstikentta = syotetekstikentta;
        this.laskutoimitukset = new Laskutoimitukset();
        
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        double x = 0;
        
        try {
           x = Integer.parseInt(syotetekstikentta.getText());
        } catch (Exception e) {
            System.out.println("Tapahtui virhe; et syöttänyt kunnollista numeroa.");
        }
        
        if (ae.getSource() == plussa) {
            laskutoimitukset.plussa(x);
        } else if (ae.getSource() == miinus) {
            laskutoimitukset.miinus(x);
        } else if (ae.getSource() == kertomerkki) {
            laskutoimitukset.kertolasku(x);
        } else if (ae.getSource() == jakomerkki) {
            laskutoimitukset.jakolasku(x);
        } else if (ae.getSource() == neliojuuri) {
            laskutoimitukset.neliojuuri(x);
        } else if (ae.getSource() == prosentti) {
            laskutoimitukset.prosentti(x);
        } else if (ae.getSource() == potenssi) {
            laskutoimitukset.toiseenpotenssiin(x);
        } else if (ae.getSource() == sin) {
            laskutoimitukset.sin(x);
        } else if (ae.getSource() == cos) {
            laskutoimitukset.cos(x);
        } else if (ae.getSource() == tan) {
            laskutoimitukset.tan(x);
        } else if (ae.getSource() == tulos) {
            laskutoimitukset.tulos();
        } else {
            laskutoimitukset.nollaus();
        }
        
        double tulos = laskutoimitukset.tulos();
        syotetekstikentta.setText("");
        tulostekstikentta.setText("" + tulos);
        if (tulos == 0) {
            nollaus.setEnabled(false);
        } else {
            nollaus.setEnabled(true);
        }
        
    }
    
}

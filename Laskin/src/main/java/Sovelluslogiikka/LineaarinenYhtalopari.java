package Sovelluslogiikka;

import java.util.Scanner;

/**
 *
 * @author saves
 */
/**
 * Luokka tarjoaa lineaarisen yhtäloparin laskentaan tarvittavia metodeita
 *
 */
public class LineaarinenYhtalopari {
    

    private double x;
    private double y;
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    /**
     *
     */
    /**
     * Metodi ratkaisee parametrinaan saamansa yhtälöparin, joka koostuu
     * kahdesta yhtölästä jotka ovat: ax + by = e ja cx + y = f
     *
     *
     * @param a käyttäjän antama syöte 
     * @param b käyttäjän antama syöte
     * @param c käyttäjän antama syöte
     * @param d käyttäjän antama syöte
     * @param e käyttäjän antama syöte
     * @param f käyttäjän antama syöte
     *
     * @return yhtälöparin ratkaisu
     */
    public void ratkaise(double a, double b, double c, double d, double e, double f) {


        if ((a * d) - (b * c) != 0) {
            x = ((e * d) - (b * f)) / ((a * d) - (b * c));
            y = ((a * f) - (e * c)) / ((a * d) - (b * c));
            System.out.println("x: " + x + " ja y: " + y);
        } else { // else koska nollalla ei saa jakaa
            x = 0;
            y = 0;
            System.out.println("Yhälöparilla ei ole ratkaisua");

        }
    }

    @Override
    public String toString() {
        return "x: " + this.x + " ja y: " + this.y;
    }
}

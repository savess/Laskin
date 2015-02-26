package Sovelluslogiikka;

/**
 *
 * @author saves
 */
/**
 * Luokka tarjoaa toisen asteen yhtälön ratkaisun
 *
 */
public class ToisenAsteenYhtalonRatkaisu {

    private double a;
    private double b;
    private double c;
    private double x1;
    private double x2;

    /**
     * Metodi kertoo mikä x:stä tulee kun ratkotaan toisen asteen yhtelö muotoa:
     * ax^2 + bx + c
     *
     *
     * @param double a Käyttäjän antama syöte
     * @param double b Käyttäjän antama syötä
     * @param double c Käyttäjän antama syöte
     *
     */
    public void ratkaise(double a, double b, double c) {
        x1 = (-(b) + java.lang.Math.sqrt(Math.pow((b), 2) - 4 * (a) * (c))) / (2 * (a));
        x2 = (-(b) - java.lang.Math.sqrt(Math.pow((b), 2) - 4 * (a) * (c))) / (2 * (a));

        System.out.println("x on joko " + x1 + " tai " + x2);
    }

    @Override
    public String toString() {
        return "x1: " + this.x1 + " ja x2: " + this.x2;
    }
}

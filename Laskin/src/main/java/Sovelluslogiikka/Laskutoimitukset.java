package Sovelluslogiikka;

/**
 *
 * @author saves
 */
/**
 * Luokka tarjoaa useita laskentaan tarvittavia metodeita
 *
 */
public class Laskutoimitukset {

    private double luku2;

    public Laskutoimitukset() {
    }

    public Laskutoimitukset(double luku2) {
        this.luku2 = luku2;
    }

    /**
     * Metodi kertoo mikä luku2 tulee kun siitä poistetaan käyttäjän antama
     * syöte
     *
     *
     * @param luku1 Käyttäjän antama syöte
     *
     *
     */
    public void miinus(double luku1) {
        luku2 -= luku1;
    }

    /**
     * Metodi kertoo mikä luku2 tulee kun siihen lisätään käyttäjän antama syöte
     *
     *
     * @param luku1 Käyttäjän antama syöte
     *
     *
     */
    public void plussa(double luku1) {
        luku2 += luku1;
    }

    /**
     * Metodi kertoo mikä luku2 tulee kun se kerrotaan käyttäjän antamalla
     * syöteellä
     *
     *
     * @param luku1 Käyttäjän antama syöte
     *
     *
     */
    public void kertolasku(double luku1) {
        luku2 *= luku1;
    }

    /**
     * Metodi kertoo mikä luku2 tulee kun se jaetaan käyttäjän antamalla
     * syöteellä
     *
     *
     * @param luku1 Käyttäjän antama syöte
     *
     *
     */
    public void jakolasku(double luku1) {
        luku2 /= luku1;
    }

    public void prosentti(double luku1) {
        //kesken
    }

    /**
     * Metodi kertoo mikä luku2 tulee kun käyttäjän syöte korotetaan toiseen
     * potenssiin
     *
     *
     * @param luku1 Käyttäjän antama syöte
     *
     *
     */
    public void toiseenpotenssiin(double luku1) {
        luku2 = Math.pow(luku1, 2);
    }

    /**
     * Metodi kertoo mikä luku2 tulee kun käyttäjän syötteestä otetaan
     * neliojuuri
     *
     *
     * @param luku1 Käyttäjän antama syöte
     *
     *
     */
    public void neliojuuri(double luku1) {
        luku2 = java.lang.Math.sqrt(luku1);
    }

    /**
     * Metodi kertoo mikä luku2 tulee kun käyttäjän syötteestä otetaan sin
     *
     *
     * @param luku1 Käyttäjän antama syöte
     *
     *
     */
    public void sin(double luku1) {
        luku2 = Math.sin(luku1);
    }

    /**
     * Metodi kertoo mikä luku2 tulee kun käyttäjän syötteestä otetaan cos
     *
     *
     * @param luku1 Käyttäjän antama syöte
     *
     *
     */
    public void cos(double luku1) {
        luku2 = Math.cos(luku1);
    }

    /**
     * Metodi kertoo mikä luku2 tulee kun käyttäjän syötteestä otetaan tan
     *
     *
     * @param luku1 Käyttäjän antama syöte
     *
     *
     */
    public void tan(double luku1) {
        luku2 = Math.tan(luku1);
    }

    /**
     * Metodi kertoo nollaa luku2
     *
     */
    public void nollaus() {
        luku2 = 0;
    }

    /**
     * Metodi palauttaa luku2
     *
     *
     * @param luku1 Käyttäjän antama syöte
     *
     * @return luku 2 Laskun tulos
     */
    public double tulos() {
        return luku2;
    }

    @Override
    public String toString() {
        return "Luku on " + this.luku2;
    }
}

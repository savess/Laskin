package Sovelluslogiikka;

/**
 *
 * @author saves
 */
public class Laskutoimitukset {
    private double luku2;
 
    
    public void miinus(double luku1) {
        luku2 -= luku1;
    }
    
    public void plussa(double luku1) {
        luku2 += luku1;
    }
    
    public void kertolasku(double luku1) {
        luku2 *= luku1;
    }
    
    public void jakolasku(double luku1) {
        luku2 /= luku1;
    }
    
    public void prosentti(double luku1) {
        //kesken
    }
    
    public void toiseenpotenssiin(double luku1) {
        luku2 =  Math.pow(luku1, 2);
    }
    
    public void neliojuuri(double luku1) {
        luku2 = java.lang.Math.sqrt(luku1);
    }
    
    public void sin(double luku1) {
        luku2 =  Math.sin(luku1);
    }
    public void cos(double luku1) {
        luku2 =  Math.cos(luku1);
    }
    public void tan(double luku1) {
        luku2 =  Math.tan(luku1);
    }

    public void nollaus() {
        luku2 = 0;
    }

    public double tulos() {
        return luku2;
    }

   

    

    
    
}

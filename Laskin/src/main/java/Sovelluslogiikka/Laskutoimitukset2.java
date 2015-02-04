package Sovelluslogiikka;

import java.util.Scanner;

/**
 *
 * @author saves
 */
/**
 * Luokka tarjoaa metodeita lineaarisen funktion kuvaajan piirtoon
 * Tällä hetkellä kerkeneräinen, vain konstruktorin luonti toimii
 * 
 */
public class Laskutoimitukset2 {

// funktion piirtäminen, keskeneräinen
    int k = 0;
    int b = 0;
    static Scanner lukija = new Scanner(System.in);

    public Laskutoimitukset2() {
    }

    // public static int xlahto(int xlahto) {
    //     return xlahto;
    //}
    //public static int ylahto(int ylahto) {
    //  return ylahto;
    //}
    //public static int xloppu(int xloppu) {
    //  return xloppu;
    //}
    //public static int yloppu(int yloppu) {
    //  return yloppu;
    //}
    //public static void piirra1() {
    //     int k = 0;
    //   int b = 0;
    // System.out.println("Yhtälö muotoa y = kx + b ");
    //System.out.println("Anna k: ");
    //k = Integer.parseInt(lukija.nextLine());
    //System.out.println("Anna b: ");
    //b = Integer.parseInt(lukija.nextLine());
    // int ylahto = k * 1 + b;
    //int xlahto = 1;
    //int yloppu = k * 10 + b;
    //int xloppu = 10;
    //}
    // public int piirra2(int xlahto, int ylahto, int xloppu, int yloppu) {
    //   k = 0;
    // b = 0;
    //System.out.println("Yhtälö muotoa y = kx + b ");
    //System.out.println("Anna k: ");
    //k = Integer.parseInt(lukija.nextLine());
    //System.out.println("Anna b: ");
    //b = Integer.parseInt(lukija.nextLine());
    //return 0;
    //}
    @Override
    public String toString() {
        return "k on: " + this.k + " b on: " + b;
    }
}

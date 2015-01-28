package Sovelluslogiikka;

import java.util.Scanner;

/**
 *
 * @author saves
 */
public class LineaarinenYhtalopari {
   // private static Scanner in = new Scanner(System.in);
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
    public void ratkaise(double a, double b, double c, double d, double e, double f) {
        
    //System.out.println("Syötä a, b, c, d, e ja f: ");
    // a = in.nextDouble();
    //b = in.nextDouble();
    //c = in.nextDouble();
    //d = in.nextDouble();
    //e = in.nextDouble();
    //f = in.nextDouble();
    
    if((a*d)-(b*c)!=0) {
        x = ((e*d)-(b*f))/((a*d)-(b*c));
        y = ((a*f)-(e*c))/((a*d)-(b*c));
        System.out.println("x: " + x + " ja y: " + y);
    }
    else {
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

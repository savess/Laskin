package laskin.testaus;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
 public class App {
     
	

    
     
    
        public static int jaaOmenat(int[] omenat) {
            Arrays.sort(omenat);
            int ekaJako =0;
            int tokaJako =0;
            
            for (int i = omenat.length-1; i >= 0 ; i--) {
                if(ekaJako<=tokaJako){
                    
                    ekaJako = ekaJako + omenat[i];
                    
                }
                else if(ekaJako>tokaJako) {
                    
                    tokaJako = tokaJako+ omenat[i];
                }
               
            }
     
            return Math.abs(ekaJako-tokaJako);
        }
       
        public static void main(String[] args) {
            System.out.println(jaaOmenat(new int[] {5, 3, 6, 2, 9}));
            System.out.println(jaaOmenat(new int[] {2, 2}));
            System.out.println(jaaOmenat(new int[] {999}));
            System.out.println(jaaOmenat(new int[] {999, 1, 1, 1}));
        }    
    }


package b3r8t3r.java.algorithms;

/**
 *
 * @author b3r8t3r
 */

class Algorithms {
        
}
    
class AlgorithmsBaseLvl extends Algorithms {
        // Reaslisation of Least Common Multiple
        public int lcm (int a, int b) {
            return abs(a*b)/gcd(a,b);
        }
        
        // Reaslisation of Greatest Common Divisor
        public int gcd (int a, int b) {
            return b != 0 ? gcd (b, a % b) : a;
        }
     
        public int abs (int a) {
            return (a>=0) ? a : -1*a;
        }
    }

public class JavaAlgorithms {
    
    

    public static void main(String[] args) {
        AlgorithmsBaseLvl algol = new AlgorithmsBaseLvl();
             
        int [] arr = {5,6,3,8,2};
        
        System.out.println("Hello World! "+algol.gcd(16, 20)+" "+algol.gcd(algol.gcd(16,20),90)+" "+algol.lcm(16, 20));
    }
}

/*************************************************
* Author: Celia Honigberg
* Problem name: Special Pythagorean triplet
* Problem number: 9
* Answer: 31875000
* Date solved: 05/14/2016
* Concepts: pythagorean triplets
*************************************************/
public class PythagoreanTriplet {
  
  public static long abc(long sum) {
    long a = 2;
    long b = 2;
    long c = 0;
    //find a^2+b^2 =c^2
    for (int i = 0; i < (int)sum/2; i++) { 
      for (int j = 0; j < (int)sum/2; j++) {
//        System.out.println(b);
        double c2 = a*a + b*b;
        long sqrt = (long)Math.sqrt(c2);
//        System.out.println(a + ", "+  b + ", " + c);
        if (sqrt*sqrt == (int) c2 && sqrt == (int)sqrt) {
          c = sqrt;
 
          if (a + b + c == sum) {
            return a*b*c; 
          }
        }
        b++;
      }
      b = 2;
      a++;
    }
    
   
    // see if c is a whole number
    //check to see if a+b+c = sum
    //return the product of a*b*c
    
    
    return -1;
  }
  
  public static void main (String [] args) {
    long test1 = abc(12);
    System.out.println("The product of the pythagorean triple that sums to 12 is (should be 60): " + test1); 
    test1 = abc(24);
    System.out.println("The product of the pythagorean triple that sums to 24 is (should be -1): " + test1);
    test1 = abc(30);
    System.out.println("The product of the pythagorean triple that sums to 30 is (should be -1): " + test1);
    test1 = abc(154);
    System.out.println("The product of the pythagorean triple that sums to 154 is (should be -1): " + test1); 
    test1 = abc(1000);
    System.out.println("The product of the pythagorean triple that sums to 1000 is: " + test1); 
    
  }
}
/*************************************************
* Author: Celia Honigberg
* Problem name: Factorial digit sum
* Problem number: 20
* Answer: 648 
* Date solved: 04/15/2015 
* Concepts: Suming digits, big integers
*************************************************/
import java.math.BigInteger;
public class FactorialDigitSum {
  public static long addDigits(BigInteger num) {
    String start = num.toString();
    long total = 0;
    for (int i = 0; i < start.length(); i++) {
      total = total + (int) (start.charAt(i) - '0'); 
    }
    return total;
  }
  public static BigInteger largeFactorial (int fact) {
    BigInteger n = new BigInteger("1");
    for (int i = 1; i <= fact; i++) {
      BigInteger iBig = new BigInteger(i+"");
      n = n.multiply(iBig);
    }
    return n;
  }
  
  
  
  public static void main (String [] args) {
    long i = addDigits(largeFactorial(10));
    System.out.println(i);
    i = addDigits(largeFactorial(100));
    System.out.println(i);
  }
  
}
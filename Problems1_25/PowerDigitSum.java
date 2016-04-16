/*************************************************
* Author: Celia Honigberg
* Problem name: Power digit sum
* Problem number: 16
* Answer: 1366 
* Date solved: 04/14/2016
* Concepts: Big Integers, powers, adding digits using strings
*************************************************/

import java.math.BigInteger;

public class PowerDigitSum {
  
  
  public static long addDigits(BigInteger num, int pow) {
   String start = num.pow(pow).toString();
   long total = 0;
   for (int i = 0; i < start.length(); i++) {
    total = total + (int) (start.charAt(i) - 48); // ohhh 0 in ascii.. i got dis. :)
   }
   return total;
  }
  
  
  public static void main (String [] args) {
    BigInteger num = BigInteger.valueOf(2);
    System.out.println("The total number of digits of 2^15 add up to: " + addDigits(num, 15));
    System.out.println("The total number of digits of 2^1000 add up to: " + addDigits(num, 1000));
  }
  
}
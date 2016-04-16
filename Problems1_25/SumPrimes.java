/*************************************************
* Author: Celia Honigberg
* Problem name: Special Pythagorean triplet
* Problem number: 9
* Answer: 31875000
* Date solved: 04/05/2016
* Concepts: primes, Sieve of Eratosthenes
*************************************************/

import java.util.Arrays;

public class SumPrimes {
 private boolean[] primes;
 public SumPrimes(int size) {
    primes = new boolean[size];
    Arrays.fill(primes, true);
    primes[0] = primes[1] = false;
    for (int i = 2; i < (primes.length/2); i++) {
      for (int j = 2; j*i < (primes.length); j++) {
          primes[i*j] = false;
      }
    }
  }
 
 public long sum() {
   long s = 0;
   for (int i = 0; i < primes.length; i++) {
     if (primes[i]) {
       s = s+(long)i;
     }
   }
   return s;
 }
 public static void main(String [] args) {
   SumPrimes test = new SumPrimes(10);
   long sum = test.sum();
   System.out.println("The sum of all primes under 10 is: " + sum);
   SumPrimes test2 = new SumPrimes(14);
   sum = test2.sum();
   System.out.println("The sum of all primes under 14 is: " + sum);
   SumPrimes test1 = new SumPrimes(2000000);
   sum = test1.sum();
   System.out.println("The sum of all primes under 2000000 is: " + sum);
 }
}
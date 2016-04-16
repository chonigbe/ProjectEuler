/*************************************************
* Author: Celia Honigberg
* Problem name: lol wut dis
*************************************************/

import java.util.Arrays;

public class MakePrimes {
  private boolean[] primes;
  
  public MakePrimes() {
    primes = new boolean[100000];
    Arrays.fill(primes, true);
    primes[0] = primes[1] = false;
    for (int i = 2; i < (primes.length/2); i++) {
      for (int j = 2; j*i < (primes.length); j++) {
          primes[i*j] = false;
      }
    }
  }
  
  public boolean getPrime(int n) {
   return primes[n]; 
  }
  public int findPrimes(int n) {
    int counter = 0;
    for (int i = 0; i <  (primes.length/2); i++) {
      if (primes[i] = true) {
        counter++;
        if (counter == n) {
         return i; 
        }
      }
    }
    return -1;
  }
  
  
  public static void main(String[] args) {
    MakePrimes test = new MakePrimes();
    int t1 = test.findPrimes(6);
    System.out.println("the 6th prime is (shoudl be 13): " + t1);
    t1 = test.findPrimes(10001);
    System.out.println("the 10001st prime is : " + t1);
  }
}
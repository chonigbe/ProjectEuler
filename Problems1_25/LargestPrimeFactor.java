/*************************************************
* Author: Celia Honigberg
* Problem name: Largest prime factor
* Problem number: 3
* Answer: 6857 
* Date solved: 03/31/2016
* Concepts: Primes, Sieve of Eratosthenes, factors
*************************************************/

import java.util.Arrays;
import java.lang.Math;


public class LargestPrimeFactor {
  
  boolean[] primes=new boolean[(int)800000];
  //13195 are 5, 7, 13 and 29.
  
  public LargestPrimeFactor() {
   fillPrimes();
  }
  
  public void fillPrimes() {
    Arrays.fill(primes,true);
    primes[0] = false;
    primes[1] = false;
    for (int i = 2; i < primes.length; i++) {
      if (primes[i]) {
        for (int j=2; i*j<primes.length;j++) {
          primes[i*j] = false;
        }
      }
    }
    
  }
  public static boolean isPrime(double num){
    for (int i = 2; i <= num/2; i++) {
      if (num % i == 0) {
        return false; }
    } 
    return true;
  }
  
  public long maxPrimeFactor(long num) {
    // cases: the number has a small prime factor (2)
    //        the number has a prime factor of itself 
    //        the prime factor is somewhere in between. 
    long large = 0; 
    long counter = 2;
    while (counter * counter <= num) {
      if (num % counter == 0) {
        num = num/counter;
      } else {
        counter++;
      }
      
    }
    if (num > large) {
      large = num;
    }
    return large;
  }
  
  
  public static void main(String[] args) {
    
    boolean ptest1 = isPrime(2);
    System.out.println("Two is prime: " + ptest1);
    boolean ptest2 = isPrime(349);
    System.out.println("349 is prime: " + ptest2);
    boolean ptest3 = isPrime(4);
    System.out.println("4 is not prime: " + ptest3);
    boolean ptest4 = isPrime(8);
    System.out.println("8 is not prime: " + ptest4);
    LargestPrimeFactor x = new LargestPrimeFactor();
    long ans  = x.maxPrimeFactor(13195);
    System.out.println("The largest prime factor of 13195 is (should be 29) " + ans); // somewhere in between
    long ans2 = x.maxPrimeFactor(600851475143L);
    System.out.println("The largest prime factor of 600851475143 is  " + ans2); // 2
    long ans3 = x.maxPrimeFactor(349);
    System.out.println("The largest prime factor of 349 is (should be 349) " + ans3); // answer is itself
    long ans4 = x.maxPrimeFactor(2);
    System.out.println("The largest prime factor of 2 is (should be 2) " + ans3); // answer is itself
    
  }
  
}
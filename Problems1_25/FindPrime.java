import java.util.Arrays;

public class FindPrime {
  private boolean[] primes;
  
  public FindPrime(int size) {
    primes = new boolean[size];
    Arrays.fill(primes, true);
    primes[0] = primes[1] = false;
    for (int i = 2; i < (primes.length/2); i++) {
      for (int j = 2; j*i < (primes.length); j++) {
          primes[i*j] = false;
      }
    }
  }
  
  public int primeX (int n) {
   int counter = 0;
   for (int i = 0; i < primes.length; i++) {
     if (primes[i] == true) {
       counter++; 
     }
     if (counter == n) {
       return i; 
     }
   }
   return -1;
  }
  
  public static void main (String[] args) {
   FindPrime test = new FindPrime(1000000);
   int p1 = test.primeX(2); // should return 3
   int p2 = test.primeX(6); // should return 13 
   int p3 = test.primeX(10001); // unknown return value
   
   System.out.println("The second prime should be 3: " + p1);
   System.out.println("The 6th prime should be 13: " + p2);
   System.out.println("The 10,001 prime is " + p3);
                                         
   
  }
}
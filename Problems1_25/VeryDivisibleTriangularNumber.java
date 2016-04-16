/*************************************************
* Author: Celia Honigberg
* Problem name: Highly divisible triangular number
* Problem number: 12
* Answer: 76576500
* Date solved: 04/12/2016
* Concepts: triangular numbers, finding number of divisors.
*************************************************/

public class VeryDivisibleTriangularNumber {
  
  public static long findNumDivisors(long n) {
    int count = 1;
    for (int i = 1; i <= n; i++) {
      if ( n%i == 0 ) {
       count++; 
      }
    }
    return count;
  }
  
  public static long triWithDivisors(long n) {
    long curr = 1;
    long tri = 1;
    for (long i = 2; curr < n; i++) {
      curr = findNumDivisors(tri);
      if (curr >= n) {
       return tri; 
      }
      tri = tri + i;
    //  System.out.println(tri);
      
    }
    return tri;
    
  }
  
  public static void main (String[] args) {
   long test = 0;
   test = triWithDivisors(1);
   System.out.println("Triangular number with 1 divisor, should be 1: " + test);
   test = triWithDivisors(2);
   System.out.println("Triangular number with 2 divisors, should be 3: " + test); 
   test = triWithDivisors(4);
   System.out.println("Triangular number with 4 divisors, should be 6: " + test);
   test = triWithDivisors(6);
   System.out.println("Triangular number with 6 divisors, should be 28: " + test); 
   test = findNumDivisors(450290773219832L);
   System.out.println("Triangular number with 6 divisors, should be 28: " + test); 
//   test = triWithDivisors(500);
//   System.out.println("Triangular number with 500 divisors: " + test); 
  }
  
}
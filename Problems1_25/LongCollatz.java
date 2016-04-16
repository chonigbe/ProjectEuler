/*************************************************
* Author: Celia Honigberg
* Problem name: Special Pythagorean triplet
* Problem number: 14
* Answer: 837799
* Date solved: 04/12/2016
* Concepts: Collatz sequence, 
*************************************************/

public class LongCollatz {
  
  
  public static long longChain(long large) {
    long max = 0;
    long curr = 1;
    long count = 0;
    long ret = 1;
    for (int i = 1; i < large; i++) {
      curr = i;
      count = 0;
//      System.out.println("------------------Current I: " + i);
      while (curr != 1) {
//        System.out.println("Curent value:" + curr);
        if (curr % 2 == 0) {
         curr = curr/2;
        } else {
         curr = (curr*3) + 1; 
        }
        count++;
      }
      if (count > max) {
       max = count; 
       ret = i;
      }
    }
    return ret;
    
  }
  
  
  public static void main(String [] args) {
    long test = 15;
    System.out.println("Here is the number under " + test+  " that produces the largest Collatx sequence: " + longChain(test));
    test = 1000000;
    System.out.println("Here is the number under " + test+  " that produces the largest Collatx sequence: " + longChain(test));
    
  }
  
}
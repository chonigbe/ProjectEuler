/*************************************************
* Author: Celia Honigberg
* Problem name: Even fibonacci numbers
* Problem number: 2
* Answer: 4613732
* Date solved: 03/31/2016
* Concepts: fibonacci numbers, modulos.
*************************************************/

public class even_fib {
  public static int ret_fib(){
   int sum = 0;
   int fib = 0;
   int fib2 = 1;
   while (fib < 4000000){
     int tmp = fib2;
     fib2 = fib+fib2;
     fib = tmp;
     if (fib2 % 2 == 0) {
       sum = sum + fib2; 
     }
   }
   return sum; 
  }
  
  public static void main(String args[]) {
    int sum = ret_fib();
    System.out.println("the value of the sum of even fibonacci numbers up to 4 million: " + sum);
    
  }
}
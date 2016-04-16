/*************************************************
* Author: Celia Honigberg
* Problem name: Multiples of 3 and 5
* Problem number: 1
* Answer: 233168 
* Date solved: 03/31/2016
* Concepts: Iterration, modulos
*************************************************/

public class Mut_3_5 {
  public Mut_3_5() {
  }
  public int getMultiple(int num) {
    int total = 0;
    for (int i = 0; i < num; i++) {
      if (i % 3 == 0 || i % 5 == 0 ) {
         total = total + i;
      }
    }
    return total;
  }
  public static void main (String [] args) {
   Mut_3_5 test = new Mut_3_5();
   int mut = test.getMultiple(1000);
   System.out.println("The value of Mut_3_5 of 10: " + mut); 
  }
}
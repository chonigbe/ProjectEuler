/*************************************************
* Author: Celia Honigberg
* Problem name: Number Letter Counts
* Problem number: 17
* Answer: 21124
* Date solved: 04/14/2016
* Concepts: Basic arithmatic and counting letters. OTL
*************************************************/
public class CountWords {
  
  
  public static void main (String [] args) {
   int oneToTen = 3+3+5+4+4+3+5+5+4;
   System.out.println("The total from one to ten is: " + oneToTen);
   int teens = 6 + 6 + 8 + 8 + 7 + 7 + 9 + 9 + 8;
   System.out.println("The total of teens is: " + teens);
   int twenties = 2*(oneToTen) + teens + 6;
   System.out.println("The total up to twenty-nine is: " + twenties);
   int allThetens = 6 + 6 + 5 + 5 + 5 + 7 + 7 + 5;
   int underOneHundred = 9*(oneToTen) + teens + ((allThetens) * 10);
   System.out.println("The total up to 100 is : " + underOneHundred);
   int allTheHundreds = (13+13+15+14+14+13+15+15+14);
   System.out.println("The total of all the hundreds : " + allTheHundreds);
   int underOneThousand = (underOneHundred*10)+ (100*allTheHundreds) + 4;
   System.out.println("The total up to 1001 is : " + underOneThousand);
  }
}
//21124
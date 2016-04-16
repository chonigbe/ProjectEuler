/*************************************************
* Author: Celia Honigberg
* Problem name: Sum square difference
* Problem number: 6
* Answer: 25164150
* Date solved: 04/01/2016
* Concepts: squares, sums of natural numbers.
*************************************************/

public class FindSumSquare {
  
  public FindSumSquare () {
  }
  public int getSumDiff(int num) {
    int sumSquares = 0;
    int squareSum = 0;
    
    for (int i = 0; i <= num; i++) {
      sumSquares = sumSquares + (i*i);
    }
    System.out.println(sumSquares);
    for (int i = 0; i <= num; i++) {
      squareSum = squareSum + i;
    }
//    System.out.println(squareSum);
    squareSum = squareSum* squareSum;
//    System.out.println(squareSum);
    return squareSum - sumSquares;
  }
  
  public static void main (String [] args) {
    // test sum of squares 
    FindSumSquare test = new  FindSumSquare ();
    int t1 = test.getSumDiff(10);
    System.out.println("The values of the difference of sums for 10 (should be 2640): " + t1);
    int t2 = test.getSumDiff(100);
    System.out.println("The values of the difference of sums for 100: " + t2);
    
  }
}
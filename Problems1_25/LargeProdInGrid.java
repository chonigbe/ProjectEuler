/*************************************************
* Author: Celia Honigberg
* Problem name: Largest product in a grid
* Problem number: 9
* Answer: 31875000
* Date solved: 04/05/2016
* Concepts: double arrays
*************************************************/

public class LargeProdInGrid {
  
  public static long findProd(long[][] nums) {
    long max = 0;
    System.out.println("Horizontal");
    //hoizontal
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[0].length-3; j++) {
        long curr = nums[i][j]*nums[i][j+1]*nums[i][j+2]*nums[i][j+3];
        if (curr > max) {
         max = curr; 
         System.out.println("max: " + max + "i: " + i + "j: " + j );
        }
      }
    }
    System.out.println("Vertical");
    //vertical
    for (int i = 0; i < nums[0].length; i++) {
      for (int j = 0; j < nums.length-3; j++) {
        long curr = nums[j][i]*nums[j+1][i]*nums[j+2][i]*nums[j+3][i];
        if (curr > max) {
         max = curr; 
         System.out.println("max: " + max + "i: " + i + "j: " + j );
        }
      }
    }
    System.out.println("Diagonal left");
    // diagonal left
    for (int i = 0; i < nums.length-3; i++) {
      for (int j = 0; j < nums[0].length-3; j++) {
        long curr = nums[i][j]*nums[i+1][j+1]*nums[i+2][j+2]*nums[i+3][j+3];
        if (curr > max) {
         max = curr; 
         System.out.println("max: " + max + "i: " + i + "j: " + j );
        }
      }
    }
    System.out.println("Diagonal right");
    // diagonal right
    for (int i = 3; i < nums.length; i++) {
      for (int j = 0; j < nums[0].length-3; j++) {
        long curr = nums[i][j]*nums[i-1][j+1]*nums[i-2][j+2]*nums[i-3][j+3];
        if (curr > max) {
         
         max = curr; 
          System.out.println("max: " + max + "i: " + i + "j: " + j );
        }
      }
    }
    return max;
  }
  
  public static void main(String [] args) {
    long test = 0;
    long[][] testhor = {{1,1,1,1,1},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
    long[][] testvert = {{0,0,0,0,2},{0,0,0,0,1},{0,0,0,0,1},{0,0,0,0,1},{0,0,0,0,1}};
    long[][] testdiag = {{1,0,0,0,0},{0,3,0,0,0},{0,0,1,0,0},{0,0,0,1,0},{0,0,0,0,0}};
    long[][] testdiag2 = {{0,0,0,0,1},{0,0,0,1,0},{0,0,4,0,0},{0,1,0,0,0},{0,0,0,0,0}};
     long[][] fin = {{8,02,22,97,38,15,00,40,00,75,04,05,07,78,52,12,50,77,91,8},{49,49,99,40,17,81,18,57,60,87,17,40,98,43,69,48,04,56,62,00}, {52,70,95,23,04,60,11,42,69,24,68,56,01,32,56,71,37,02,36,91}, {22,31,16,71,51,67,63,89,41,92,36,54,22,40,40,28,66,33,13,80}, {24,47,32,60,99,03,45,02,44,75,33,53,78,36,84,20,35,17,12,50}, {32,98,81,28,64,23,67,10,26,38,40,67,59,54,70,66,18,38,64,70}, {67,26,20,68,02,62,12,20,95,63,94,39,63,8,40,91,66,49,94,21}, {24,55,58,05,66,73,99,26,97,17,78,78,96,83,14,88,34,89,63,72}, {21,36,23,9,75,0,76,44,20,45,35,14,0,61,33,97,34,31,33,95}, {78,17,53,28,22,75,31,67,15,94,03,80,04,62,16,14,9,53,56,92}, {16,39,05,42,96,35,31,47,55,58,88,24,00,17,54,24,36,29,85,57}, {86,56,00,48,35,71,89,07,05,44,44,37,44,60,21,58,51,54,17,58}, {19,80,81,68,05,94,47,69,28,73,92,13,86,52,17,77,04,89,55,40}, {4,52,8,83,97,35,99,16,07,97,57,32,16,26,26,79,33,27,98,66}, {88,36,68,87,57,62,20,72,03,46,33,67,46,55,12,32,63,93,53,69}, {4,42,16,73,38,25,39,11,24,94,72,18,8,46,29,32,40,62,76,36}, {20,69,36,41,72,30,23,88,34,62,99,69,82,67,59,85,74,04,36,16}, {20,73,35,29,78,31,90,01,74,31,49,71,48,86,81,16,23,57,05,54}, {1,70,54,71,83,51,54,69,16,92,33,48,61,43,52,01,89,19,67,48}};
//     test = findProd(testhor);
//     System.out.println("Here is the product of the largest digits, horizontal test: " + test);
//     
//     test = findProd(testvert);
//     System.out.println("Here is the product of the largest digits, vertical test: " + test);
//     
//     test = findProd(testdiag);
//     System.out.println("Here is the product of the largest digits, left diagonal test: " + test);
//     
//     test = findProd(testdiag2);
//     System.out.println("Here is the product of the largest digits, right diagonal test: " + test);
     
     test = findProd(fin);
     System.out.println("Here is the product of the largest digits, final: " + test);
  }
}
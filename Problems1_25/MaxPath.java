/*************************************************
* Author: Celia Honigberg
* Problem name: Maximum path sum I
* Problem number: 18
* Answer: 1074 
* Date solved: 04/15/2016
* Concepts: Finding max path, recursion, cool algorithm
*************************************************/
import java.lang.Math;
import java.util.Arrays;

public class MaxPath{
  
  public static long[][] recFindMax(long[][] p) {
    int curr = p.length - 1;
    if (curr == 0) {
     return p; 
    }
    for (int i = 0; i < curr; i++) {
      p[curr-1][i] = p[curr-1][i] + Math.max(p[curr][i],p[curr][i+1]); 
    }
    return recFindMax(Arrays.copyOfRange(p, 0, curr));
  }
  
  public static long findMax(long[][] p) {
    long[][] ans = recFindMax(p);
    return ans[0][0];
  }
  
  
  
  public static void main (String [] args) {
    long[][] test = {{3},{7, 4}};
    System.out.println("Test MaxPath on small pryamid (should return 23): " + findMax(test));
    long[][] test1 = {{3},{7, 4},{2, 4, 6},{8, 5, 9, 3}};
    System.out.println("Test MaxPath on small pryamid (should return 23): " + findMax(test1));
    long[][] test2 = {{75},{95, 64},{17, 47, 82},{18, 35, 87, 10},{20, 4, 82, 47, 65},{19, 1, 23, 75, 3, 34},{88, 2, 77, 73, 07, 63, 67},{99, 65, 4, 28, 6, 16, 70, 92},{41, 41, 26, 56, 83, 40, 80, 70, 33},{41, 48, 72, 33, 47, 32, 37, 16, 94, 29},{53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14},{70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57},{91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48},{63, 66, 4, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31},{4, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 4, 23}};
    System.out.println("Test MaxPath on medium pryamid: " + findMax(test2));
  }
  
}
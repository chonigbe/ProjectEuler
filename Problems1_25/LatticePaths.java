/*************************************************
* Author: Celia Honigberg
* Problem name: Lattice paths
* Problem number: 15
* Answer: 137846528820
* Date solved: 05/14/2016
* Concepts: double arrays, path finding, not combinations (but kind of)
*************************************************/

import java.util.Arrays;
  public class LatticePaths {
  
  
  public static long latticePaths (int x, int y){
    long[][] array = new long[x][y];
    long xc = 0;
    long yc = 0;
    for (int i = 0; i < x; i++){
      for (int j = 0; j < y; j++) {
        xc = (i == 0) ? 1 : array[i-1][j];
        yc = (j == 0) ? 1 : array[i][j-1];
        array[i][j] = xc + yc;
      }
    }
    return array[x-1][y-1];
  }
  
  
  
  public static void main(String [] args) {
    int x = 2;
    int y = 2;
    System.out.println("Here is the number of lattice paths is a grid of (" + x +", " + y +"): " + latticePaths(x,y));
    x = 20;
    y = 20;
    System.out.println("Here is the number of lattice paths is a grid of (" +x+ ", " + y +"): " + latticePaths(x,y));
    
  }
  
  
}
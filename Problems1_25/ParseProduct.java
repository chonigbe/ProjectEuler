import java.io.File;
import java.util.Scanner;
import java.util.Arrays;
import java.io.FileNotFoundException;
public class ParseProduct {
  
  
  public static int findLargestProduct(File file, int num) {
    try 
    {
    Scanner scan =  new Scanner(file);
    int[] values = new int[num];
    int i = Integer.parseInt(scan.nextLine());
    int tmp = i;
    int counter = 0;
    while (tmp > 1) {
     tmp = tmp/10; 
     counter++;
    }
    int[] large = new int[counter];
    for (int k = 0; i != 0; k++) {
      int a = i%10;
      large[k] = i/10;
      i = i/10;
    }
    int max = 0;
    for (int j = 0; j < large.length-num; j++) {
      int result = 1;
      int[] section = Arrays.copyOfRange(large, j, j+num);
      for (int val : section) {
        result *= val;
      }
      if (result > max) {
        max = result;
      }
    }
    return max; 
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found exception thrown");
      return -1;
    }
  }
  
  
  public static void main(String args[]) {
   String file = "C:\\Users\\a564509\\Downloads\\Java Practice\\testinput.txt";
   File testinput = new File(file);
   int test = findLargestProduct(testinput, 4);
   System.out.println("The largest product of four values in the testinput.txt file (3888): " + test);
   file = "C:\\Users\\a564509\\Downloads\\Java Practice\\input.txt";
   File input = new File(file);
   int ans = findLargestProduct(input, 13);
   System.out.println("The largest product of 13 values in the input.txt file: " + ans);
  }
}
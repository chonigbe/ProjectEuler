/*************************************************
* Author: Celia Honigberg
* Problem name: Largest palindrome product
* Problem number: 4
* Answer: 906609 
* Date solved: 04/01/2016
* Concepts: recognizing palindromes
*************************************************/

public class LargePalindrome {
 
  public static boolean isPal(int n) {
    String s = Integer.toString(n);
    boolean pal = true;
    for (int i = 0; i < s.length()/2; i++) {
      if (s.charAt(i) != s.charAt(s.length()-i-1)) {
        pal = false;
      }
    }
    return pal;
  }
  public static int findLargePal() {
    int ans = -1;
    int total = 0;
    for (int i = 999; i > 900; i--) {
      for (int j = 999; j > 900; j--) {
        total = i*j;
        if (total > ans) {
          if (isPal(total)) {
            ans = total;
          }
        }
      }
    }
    return ans;
  }
  
  public static void main (String [] args) {
    //test pal
    Boolean testpal = isPal(101);
    System.out.println("101 is a palindrome: " + testpal);
    Boolean testpal2 = isPal(10);
    System.out.println("10 is not a palindrome: " + testpal2);
    Boolean testpal3 = isPal(9009);
    System.out.println("9009 is a palindrome: " + testpal3);
    Boolean testpal4 = isPal(9090);
    System.out.println("9090 is not a palindrome: " + testpal4);
    
    //test find large pal
    int pal = findLargePal();
    System.out.println("Heres some large palindrone: " + pal);
    
  }
}
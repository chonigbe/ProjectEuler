/*************************************************
* Author: Celia Honigberg
* Problem name: Counting Sundays
* Problem number: 19
* Answer: 171
* Date solved: 04/15/2016 
* Concepts: Date math, pattern searching. 
*************************************************/

public class CountSun {
  
  public static int countFirstSundays(int numyears, int startDate) {
   //enter in some starting values
   int month = 1;
   int num = startDate;
   int year = 1;
   int numSundays = 0;
   while (year <= numyears) {
  //   System.out.println(year);
     if ((num+1)%7 == 0 ) {
       numSundays++;
     }
     if (month == 12) {
       num = num + 31;
       year++;
       month = 1;
     } else {
       if (month == 2) {
         if (year % 4 == 0) {
           num = num + 29;
         } else {
           num = num + 28;
         }
       } else {
         if (month == 9 || month == 4 || month == 6 || month == 11   ) {
           num = num+30; 
         } else {
             num = num+31;
           }
       }
       month++;
     }
   }
   return numSundays;
  }
  
  public static void main(String [] args) {
    System.out.println("This may or may not be the answer: "+ countFirstSundays(100, 2)); //going for 100 years and starting on a tuesday
  }
  
  
  
}
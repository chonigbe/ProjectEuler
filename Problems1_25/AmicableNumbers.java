/*************************************************
* Author: Celia Honigberg
* Problem name: Amicable Numbers 
* Problem number: 21
* Answer: 
* Date solved: 
* Concepts: Amicable numbers, finding factors, hash tables
*************************************************/

import java.util.*;

public class AmicableNumbers {


	public static long findD(long num) {
		long d = 0;
		for (int i = 1; i <= num/2; i++) {

			if (num % i == 0) {
		//		System.out.println("I got here: " + i);
				d = d + i;
			}
		}
		return d; 
	}

	public static Hashtable makeAmicableHash (long max) {

		Hashtable<Long, Long> hash
		 = new Hashtable<Long, Long>();
		for (long i = 0; i < max; i++) {
			long d = findD(i);
			hash.put(d, i);
		}
		return hash;
	}


	public static long sumAmicable (long max){
		Hashtable<Long, Long> hash = makeAmicableHash(max);
		long sum = 0;
		for (long i = 0; i < max; i++) {
			if(hash.containsValue(i)) {
				// if (i != hash.get(findD(i))) {
					sum = sum+i;
				}
			//}
		}
		return sum;
	}

	public static void main (String [] args){
		long test = 220;
		System.out.println("FindD of 220 is: " + findD(test));
		test = 300;
		System.out.println("sumAmicable of 300 is: " + sumAmicable(test));
	}

}
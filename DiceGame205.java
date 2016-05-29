import java.util.Arrays;

/*************************************************
* Author: Celia Honigberg
* Problem name: Dice Game
* Problem number: 205
* Answer: 0.5731441
* Date solved: 05/29/2016
* Concepts: Object oriented design, probability, brute force
*************************************************/

public class DiceGame205 {
	
	private long maxPeter;
	private long maxColin;
	
	private final int peterMaxValue;
	private final int colinMaxValue;

	private final int peterNumberDice;
	private final int colinNumberDice;
	
	private int[] peterDice;
	private int[] colinDice;
	
	private long[] valsPeter;
	private long[] valsColin;
	
	public DiceGame205(int peterMaxValue, int colinMaxValue, int peterNumberDice, int colinNumberDice) {
		this.peterMaxValue = peterMaxValue;
		this.colinMaxValue = colinMaxValue;
		
		this.peterNumberDice = peterNumberDice;
		this.colinNumberDice = colinNumberDice;
		
		maxPeter = (long)Math.pow(peterMaxValue,peterNumberDice);
		maxColin = (long)Math.pow(colinMaxValue,colinNumberDice);
		
		peterDice = new int[peterNumberDice];
		colinDice = new int[colinNumberDice];
		
		Arrays.fill(peterDice, 1);
		Arrays.fill(colinDice, 1);
		
		valsPeter = new long[(int)maxPeter];
		valsColin = new long[(int)maxColin];
		
		fillVals();
	}
	
	public void fillVals() {
		for (int i = 0; i < (int)maxPeter; i++) {
			valsPeter[i] = sumArray(peterDice, peterNumberDice);
			incrimentDice(peterDice,peterNumberDice,0,peterMaxValue);
		}
		for (int i = 0; i < (int)maxColin; i++) {
			valsColin[i] = sumArray(colinDice, colinNumberDice);
			incrimentDice(colinDice,colinNumberDice,0,colinMaxValue);
		}
	}
	
	public int sumArray(int[] dice, int numDice) {
		int sum = 0;
		for (int i = 0; i < numDice; i++) {
			sum = sum + dice[i];
		}
		return sum;
	}
	
	public void incrimentDice(int[] dice, int totalDice, int currentDie, int maxValue) {
		if (currentDie < totalDice) {
			if (dice[currentDie] == maxValue) {
				dice[currentDie] = 1;
				incrimentDice(dice,totalDice,currentDie+1,maxValue);
			} else {
				dice[currentDie] = dice[currentDie]+1;
			}
		}
	}
	
	public long desiredOutcomes() {
		long count = 0;
		for (int i = 0; i < maxPeter; i++) {
			for (int j = 0; j < maxColin; j++) {
				if (valsPeter[i] > valsColin[j]) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args){
//		DiceGame205 game = new DiceGame205(2,1,1,1);
//		float total = (float)game.desiredOutcomes()/(float)(game.maxColin*game.maxPeter);
//		System.out.println(total);
		
//		DiceGame205 game = new DiceGame205(4,6,2,2);
//		float total = (float)game.desiredOutcomes()/(float)(game.maxColin*game.maxPeter);
//		System.out.println(total);
		// calculate total possibilities
		DiceGame205 game = new DiceGame205(4,6,9,6);
		float total = (float)game.desiredOutcomes()/(float)(game.maxColin*game.maxPeter);
		System.out.println(total);
	}
}

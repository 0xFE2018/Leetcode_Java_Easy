package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class ContructRectangle {

	//SOLUTION 1
/*	public int[] constructRectangle(int area) {

		Map<int[], Integer> factorDiff = new HashMap<int[], Integer>();

		for (int i = 1; i <= area; i++) {
			if (area % i == 0) {
				factorDiff.put(new int[] { Math.max(area / i, i), Math.min(area / i, i) }, Math.abs((area / i) - i));
			}
		}

		int min = Integer.MAX_VALUE;
		int[] temp= new int[2];
		for (int[] i : factorDiff.keySet()) {
			if (factorDiff.get(i) < min) {
				min = factorDiff.get(i);
				temp = i;
			}
		}
		return temp;
	}
*/
	//SOLUTION 2
	public int[] constructRectangle(int area) {
		
		int [] result = new int[2];
        
		int  a= (int)Math.sqrt(area);
		
		while(area % a !=0){
			a--;
		}
		
		int b=area/a;
		result[0]=a;
		result[1]=b;
		
		return result;
	}
}

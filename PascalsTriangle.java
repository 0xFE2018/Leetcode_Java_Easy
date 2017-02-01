package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

	public List<List<Integer>> generate(int numRows) {

		List<List<Integer>> pascalsTriange = new ArrayList<List<Integer>>();

		for (int i = 0; i < numRows; i++) {
			List<Integer> temp = new ArrayList<Integer>();

			if (i == 0){
				temp.add(1);
			}

			if (i == 1) {
				temp.add(1);
				temp.add(1);
			}

			if (i > 1) {
				temp.add(0, 1);
				for (int j = 0; j <= pascalsTriange.get(i - 1).size() - 2;j++) {
					temp.add(j + 1, pascalsTriange.get(i - 1).get(j)
							+ pascalsTriange.get(i - 1).get(j + 1));
				}
				temp.add(1);
			}
			
			pascalsTriange.add(temp);
		}
		return pascalsTriange;
	}

}

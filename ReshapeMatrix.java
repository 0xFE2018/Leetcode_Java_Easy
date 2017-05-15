package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class ReshapeMatrix {

	public static void main(String... args) {

	}

	public int[][] matrixReshape(int[][] nums, int r, int c) {

		List<Integer> listOfNums = new ArrayList<Integer>();

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				listOfNums.add(nums[i][j]);
			}
		}

		int[][] newArr = new int[r][c];
		int count = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (count > listOfNums.size() - 1) {
					return nums;
				}else{
					newArr[i][j] = listOfNums.get(count++);
					
				}
			}
		}

		return newArr;
	}

}

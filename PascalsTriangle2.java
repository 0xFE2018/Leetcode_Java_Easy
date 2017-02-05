package com.sort.example;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle2 {

	public static void main(String... args) {
		PascalsTriangle2 obj = new PascalsTriangle2();
		System.out.println(obj.getRow(4));

	}

	public List<Integer> getRow(int rowIndex) {

		int[] arr = new int[rowIndex + 1];
		List<Integer> pascalsRow = new ArrayList<>();

		for (int i = 0; i <= rowIndex; i++) {

			if (i == 0) {

				arr[0] = 1;
			}

			if (i == 1) {
				arr[0] = 1;
				arr[1] = 1;
			}

			if (i > 1) {
				int previous = 1;

				for (int j = 0; j < rowIndex - 1; j++) {
					int temp = arr[j + 1];
					arr[j + 1] = previous + arr[j + 1];
					previous = temp;
				}
				arr[rowIndex] = 1;

			}
		}

		for (int num : arr) {
			pascalsRow.add(num);
		}

		return pascalsRow;
	}
}

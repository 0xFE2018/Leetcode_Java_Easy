package com.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyBoardRow {

	public static void main(String[] args) {

		KeyBoardRow obj = new KeyBoardRow();
		String[] result = obj.findWords(new String[] { "Hello", "Alaska", "Dad", "Peace" });
		System.out.println(result);

	}

	public String[] findWords(String[] words) {

		String[] result;
		String[] strs = {  };
		Map<Character, Integer> map = new HashMap<>();

		if(words==null || words.length==0){
			return new String[]{};
		}
		
		for (int i = 0; i < 3; i++) {
			char[] array = strs[i].toCharArray();

			for (char ch : array) {
				map.put(ch, i);
			}

		}

		StringBuilder builder;
		List<String> list = new ArrayList<String>();

		for (String str : words) {
			builder = new StringBuilder();
			for (char ch : str.toUpperCase().toCharArray()) {
				builder.append(map.get(ch));
			}

			if (!builder.toString().isEmpty() && (builder.toString().matches("[0]*")
					|| builder.toString().matches("[1]*") || builder.toString().matches("[2]*"))) {
				list.add(str);
			}
		}
		
		result= new String[list.size()];
		
		for(int k=0;k<list.size();k++){
			result[k]=list.get(k);
		}

		return result;
	}

}

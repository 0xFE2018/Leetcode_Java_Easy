package Easy;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueChar {

	public int firstUniqChar(String s) {
		char[] charArr = s.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < charArr.length; i++) {
			if (!map.containsKey(charArr[i])) {
				map.put(charArr[i], 1);
			} else {
				map.put(charArr[i], map.get(charArr[i]) + 1);
			}
		}

		int minIndx = s.length();

		for (char c : map.keySet()) {
			if (map.get(c) == 1) {
				minIndx = minIndx < s.indexOf(c) ? minIndx : s.indexOf(c);
			}
		}
     return minIndx==s.length()?-1:minIndx;
	}
}

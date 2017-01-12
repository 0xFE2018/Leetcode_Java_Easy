package Easy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static void main(String... args) {
		FizzBuzz obj =new FizzBuzz();
		List<String> list=obj.fizzBuzz(30);
		for(String str:list){
			System.out.println(str);
		}
		
	}

	public List<String> fizzBuzz(int n) {
		List<String> fizzbuzzList = new ArrayList<String>();

		for (int i = 1; i <= n; i++) {
			if (i % 15 == 0) {
				fizzbuzzList.add("FizzBuzz");
			} else if (i % 3 == 0) {
				fizzbuzzList.add("Fizz");
			} else if (i % 5 == 0) {
				fizzbuzzList.add("Buzz");
			} else {
				fizzbuzzList.add("" + i);
			}
		}

		return fizzbuzzList;
	}

}

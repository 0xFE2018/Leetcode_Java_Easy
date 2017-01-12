package Easy;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

	public static void main(String... args) {
		RansomNote obj= new RansomNote();
		System.out.println(obj.canConstruct("aa", "ab"));
	}

	public boolean canConstruct(String ransomNote, String magazine) {
       Map<Character, Integer> map= new HashMap<Character, Integer>();
       
       for(char c: magazine.toCharArray()){
    	   if(!map.containsKey(c)){
    		   map.put(c, 1);
    	   }else{
    		   map.put(c,map.get(c)+1);
    	   }
       }
       
       for(char c: ransomNote.toCharArray()){
    	      if(!map.containsKey(c)){
    	    	  return false;
    	      }else{
    	    	 int count=map.get(c);
    	    	 if(count-1<0){
    	    		 return false;
    	    	 }else{
    	    		 map.put(c, count-1);
    	    	 }
    	      }
       }
       
       return true;
	}

}

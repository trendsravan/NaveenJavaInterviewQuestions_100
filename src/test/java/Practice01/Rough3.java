package Practice01;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Rough3 {
	public static void main(String[] args) {	
		
		String[] s = {"A" , "B" , "C" , "B", "cc", "cc"};
		
		Map<String,Integer> duplicates = new HashMap<>();
		for(int i=0; i<s.length; i++) {
			if(duplicates.containsKey(s[i])) {
				duplicates.put(s[i], duplicates.get(s[i])+1);
			}else
				duplicates.put(s[i], 1);
		}
		
		//retrive data-		
		Set<Entry<String , Integer>> data = duplicates.entrySet();
		for(Map.Entry<String, Integer> dup: data) {
			if(dup.getValue()>1) {
				System.out.println(dup.getKey());
			}
		}
		
			
	}
}
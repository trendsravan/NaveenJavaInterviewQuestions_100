package Practice01;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Rough01 { 
	public static void main(String[] args) {
		String s = "A grocery store (AE), groceryicatessens.";
		String r = s.replaceAll("[^aeiouAEIOU", "").toLowerCase();
		System.out.println(r);
		Map<Character, Integer> charCount = new HashMap<>();
		for (int i = 0; i <= r.length() - 1; i++) {
			char ch = r.charAt(i);
			if (charCount.containsKey(ch)) {
				charCount.put(ch, charCount.get(ch) + 1);
			} else {
				charCount.put(ch, 1);
			}
		}
		Set<Entry<Character, Integer>> PrintCount = charCount.entrySet();
		for (Map.Entry<Character, Integer> ovelscount : PrintCount) {
			System.out.println(ovelscount.getKey() + " : " + ovelscount.getValue());
		}

	}
}

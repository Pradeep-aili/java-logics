package java_logics.string_programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String str = "swhisis";
		HashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		int count = 0;
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				count++;
				if(count==1) {
				System.out.println("First Non-Repeating Character : " + entry.getKey());
				}
				if(count==2) {
					System.out.println("Second Non-Repeating Character : " + entry.getKey());
				}
			}
		}
		
		
	}
}

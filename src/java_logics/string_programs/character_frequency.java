package java_logics.string_programs;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class character_frequency {

	public static void main(String[] args) {
		String str = "aabbbccd";   // ans -> a2b3c2d1
		HashMap<Character, Integer> map = new LinkedHashMap<>();
		for(char s:str.toCharArray())
		{
			map.put(s, map.getOrDefault(s, 0)+1);
		}
		
		System.out.println("The result is : ");
		map.forEach((key, value) -> {
			System.out.print(key+""+value);
		});
	}
}

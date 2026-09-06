package java_logics.string_programs;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FrequencyCharacter {

	public static void main(String[] args) {
		String str = "abbbcddehfuf";
		HashMap<Character, Integer> map = new LinkedHashMap<>();
		for(char s:str.toCharArray())
		{
			map.put(s, map.getOrDefault(s, 0)+1);
		}
		
		System.out.println("The Frequency of character is : ");
		map.forEach((key, value) -> {
			System.out.println(key+" -> "+value);
		});
	}
}

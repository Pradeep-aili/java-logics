package java_logics.string_programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstRepeatingCharacter {

	public static void main(String[] args) {		
		String str = "swiwi";
		HashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for(char x : str.toCharArray())
		{
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		
		int count=0;	
		for(Map.Entry<Character, Integer> entry : map.entrySet())
		{
			if(entry.getValue()>1)
			{
				count++;
				if(count==1)
				{
					System.out.println("First repeating character : "+entry.getKey());
				}
				if(count==2)
				{
					System.out.println("Second repeating charater "+entry.getKey());
				}
			}
		}
		
	}
}

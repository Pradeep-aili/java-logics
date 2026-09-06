package java_logics.string_programs;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "silent";
		
		if(s1.length() == s2.length())
		{
			char[] ch1=s1.toCharArray();
			char[] ch2=s2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if(Arrays.equals(ch1, ch2))
			{
				System.out.println("Anagram");
			}
			else {
				System.out.println("Not a Anagram");
			}			
		}
		else {
			System.out.println("Not a Anagram");
		}
	}
}

package java_logics.string_programs;

import java.util.Iterator;

public class ToggleCase {

	public static void main(String[] args) {
		String str="MeThOd"; //ans -> mEtHoD
		String res="";
		for (int i = 0; i < str.length() ; i++) {
			char ch=str.charAt(i);
			if(ch >= 'A' && ch <= 'Z')
			{
				res=res+(char)(ch+32);
			}
			else
			{
				res = res+(char)(ch-32);
			}
		}
		System.out.println("The result is : "+res);
	}
}

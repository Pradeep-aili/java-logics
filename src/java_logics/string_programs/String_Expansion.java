package java_logics.string_programs;

public class String_Expansion {

	public static void main(String[] args) {
		String str ="a2b4c5";	// ans → aabbbbccccc
		String res="";
		for(int i=0;i<str.length();i+=2)
		{
			char ch = str.charAt(i);
			int count = str.charAt(i+1)-'0';
			for(int j=0;j<count;j++)
			{
				res = res + ch;
			}
		}
		System.out.println("The result is : "+res);
	}
}

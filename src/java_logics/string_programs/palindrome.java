package java_logics.string_programs;

import java.util.Scanner;

public class palindrome {

	static void isPalindrome(String str)
	{
		int i=0,j=str.length()-1;
		while(i<j)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				System.out.println("Not a palindrome");
				return;
			}
			i++;j--;
		}
		System.out.println("Palindrome");
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = sc.nextLine();
		isPalindrome(str);
	}
}

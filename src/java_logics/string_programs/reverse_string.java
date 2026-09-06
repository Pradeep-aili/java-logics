package java_logics.string_programs;

import java.util.Scanner;

public class reverse_string {

	static String reverse(String str)
	{
		char[] ch=str.toCharArray();
		int i=0,j=ch.length-1;
		while (i<j) {
			char temp = ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;j--;
		}
		return new String(ch);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = sc.nextLine();
		System.out.println("The result is : "+reverse(str));
	}
}

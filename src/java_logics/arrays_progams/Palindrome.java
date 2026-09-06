package java_logics.arrays_progams;

import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {
		int[] arr= {10,20,30,20,10};
		int temp[] = new int[arr.length];
		int j=0;
		for(int i=arr.length-1;i>=0;i--)
		{
			temp[j++]=arr[i];
		}
		
		if(Arrays.equals(arr, temp))
		{
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}
}

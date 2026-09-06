package java_logics.arrays_progams;

import java.util.Arrays;

public class Reverse_Array {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		int temp[] = new int[arr.length];
		int j=0;
		for(int i=arr.length-1;i>=0;i--)
		{
			temp[j++]=arr[i];
		}
		System.out.println(Arrays.toString(temp));
	}
}

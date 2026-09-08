package java_logics.arrays_progams;

import java.util.Iterator;

public class FindMissingNumber {

	public static void main(String[] args) {
		int[] a = {1,2,3,5,6,7,8};
		int n = a[a.length-1];
		int totalSum = n*(n+1)/2;
		int sum=0;
		for(int n1:a)
		{
			sum+=n1;
		}
		int res = totalSum-sum;
		System.out.println("The missing number is : "+res);
	}
}

package java_logics.arrays_progams;

import java.util.Arrays;

public class MoveZerosFirst {

	public static void main(String[] args) {
		int[] arr= {1,0,2,0,3,0,4,0,5};
		int i=0,j=arr.length-1;
		while(i<j)
		{
			if(arr[i]==0)
			{
				i++;
			}else if(arr[j]!=0)
			{
				j--;
			}else {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;j--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}

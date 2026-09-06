package java_logics.arrays_progams;

import java.util.Arrays;

public class Left_Rotation {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		int k = 1;
		k = k % arr.length;
		for (int i = 0; i < k; i++) {
			int first = arr[0];
			for (int j = 0; j < arr.length-1; j++) {
				arr[j]=arr[j+1];
			}
			arr[arr.length-1]=first;
		}
		System.out.println(Arrays.toString(arr));
	}
}

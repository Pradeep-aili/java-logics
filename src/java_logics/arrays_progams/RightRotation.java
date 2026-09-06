package java_logics.arrays_progams;

import java.util.Arrays;

public class RightRotation {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		int k=1;
		k = k % arr.length;
		for (int i = 0; i < k; i++) {
			int last = arr[arr.length-1];
			for (int j = arr.length-1; j >0; j--) {
				arr[j]=arr[j-1];
			}
			arr[0]=last;
		}
		System.out.println(Arrays.toString(arr));
	}
}

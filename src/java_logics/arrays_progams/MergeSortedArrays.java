package java_logics.arrays_progams;

import java.util.Arrays;

public class MergeSortedArrays {

	public static void main(String[] args) {
		int[] a1 = {9,6,0,7,8};
		int[] a2 = {5,2,1,3,4};
		int[] temp = new int[a1.length+a2.length];
		int j=0;
		for (int i = 0; i < a1.length; i++) {
			temp[j++] = a1[i];
		}
		for (int i = 0; i < a2.length; i++) {
			temp[j++] = a2[i];
		}
		Arrays.sort(temp);
		
		System.out.println(Arrays.toString(temp));
	}
}

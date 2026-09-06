package java_logics.arrays_progams;

public class Two_Sum {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40};
		int target = 70;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]+arr[j] == target)
				{
					System.out.println("Element found at index : "+i+" "+j);
					return;
				}
			}
		}
	}
}

package java_logics.arrays_progams;

public class FirstMax {

	public static void main(String[] args) {
		int[] a = {10,40,30,60,80};
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("The first maximum value is : "+max);
	}
}

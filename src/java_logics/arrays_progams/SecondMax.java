package java_logics.arrays_progams;

public class SecondMax {

	public static void main(String[] args) {
		int[] a = {10,20,60,90,70};
		int fmax = Integer.MIN_VALUE;
		int smax = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if(a[i] > fmax)
			{
				smax = fmax;
				fmax = a[i];
			}else if(a[i] > smax && a[i]!=fmax)
			{
				smax = a[i];
			}
		}
		System.out.println("The first max is : "+fmax+" & second maximum is : "+smax);
	}
}

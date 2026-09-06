package java_logics.string_programs;

public class SentenceReverse {

	static String sentenceReverse(String str)
	{
		char[] ch=str.toCharArray();
		int i=0,j=ch.length-1;
		while (i<j) {
			char temp = ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;j--;
		}
		return new String(ch);
	}
	
	public static void main(String[] args) {
		String str = "hi hello how are you";
		String[] s=str.split(" ");
		for(String s1:s)
		{
			System.out.print(sentenceReverse(s1)+" ");
		}
	}
}

package java_logics.string_programs;

public class first_last_word_reverse {

	static String reverse(String str)
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
		String str = "this is java programming";
		String[] s=str.split(" ");
		s[0]=reverse(s[0]);
		s[s.length-1]=reverse(s[s.length-1]);
		for(String res : s)
		{
			System.out.print(res+" ");
		}
	}
}

package java_logics.string_programs;

public class SecondRepeatingCharacter {

	public static void main(String[] args) {
		String str = "madam";
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if(str.charAt(i)==str.charAt(i))
				{
					count++;
					if(count==2)
					{
						System.out.println("The seconf repeating character is : "+str.charAt(i));
						return;
					}
					break;
				}
			}
		}
	}
}

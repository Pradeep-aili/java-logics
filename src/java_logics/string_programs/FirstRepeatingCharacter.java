package java_logics.string_programs;


public class FirstRepeatingCharacter {

	public static void main(String[] args) {
		String str = "level";
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if(str.charAt(i)==str.charAt(i))
				{
					System.out.println("The first repeating character is : "+str.charAt(i));
					return;
				}
			}
		}
	}
}
